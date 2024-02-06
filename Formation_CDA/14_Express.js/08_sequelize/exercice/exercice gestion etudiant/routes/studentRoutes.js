const express = require("express");
const studentController = require("../controllers/studentController");

const router = express.Router();

router.get("/", studentController.getAllStudents);
router.get("/:id", studentController.getStudentById);
router.post("/add", studentController.createStudent);
router.put("/update/:id", studentController.updateStudentById);
router.delete("/delete/:id", studentController.deleteStudentById);

module.exports = router;