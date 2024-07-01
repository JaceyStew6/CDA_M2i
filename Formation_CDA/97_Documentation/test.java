@Controller
public class StudentController {
    private final StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/formulaire")
    public String formAddStudent(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/formulaire")
    public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
        if(result.hasErrors()){
            return "form";
        } else {
            if (student.getId() != null) {
                studentService.updateStudent(student.getId(), student);
            } else {
                studentService.createStudent(student);
            }
        }
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String showAllStudents(@RequestParam(name="search", required = false) String search, Model model) {
        if(search == null) {
            model.addAttribute("students", studentService.getAllStudents());
        } else {
            model.addAttribute("students", studentService.searchStudents(search));
        }
       return "list";
    }

    @GetMapping("/student/{id}")
    public String showStudent(@PathVariable("id") Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "detail";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/update")
    public String formUpdate(@RequestParam("studentId") Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "form";
    }
}
