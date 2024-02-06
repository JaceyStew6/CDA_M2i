const { Student } = require("../config/db");

//Récupérer et afficher tous les étudiants
exports.getAllStudents = async (req, res) => {
    try {
        const students = await Student.findAll();
        res.json(students);
    } catch (error) {
        res
            .status(500)
            .json({ message: "Erreur lors de la récupération des étudiants" });
    }
};

//Récupérer un étudiant par son id
exports.getStudentById = async (req, res) => {
    try {
        const students = await Student.findOne({ where: { id: req.params.id } });
        res.json(students);
    } catch (error) {
        res
            .status(500)
            .json({ message: "Erreur lors de la récupération des étudiants" });
    }
};

//Mettre à jour les informations d'un étudiant
exports.updateStudentById = async (req, res) => {
    try {
        await Student.update({lastname, firstname} = req.body, { where: { id: req.params.id }});
        const students = await Student.findOne({where: { id: req.params.id }}); //permet de récupérer les infos complètes du profil modifié
        res.json(students);
    } catch (error) {
        res
            .status(500)
            .json({ message: "Erreur lors de la modification de l'étudiants" });
    }
};


//Supprimer un étudiant par id
exports.deleteStudentById = async (req, res) => {
    try {
        const students = await Student.destroy({ where: { id: req.params.id } });
        res.status(201).json({message: "Etudiant supprimé"});
        // res.json(students);
    } catch (error) {
        res
            .status(500)
            .json({ message: "Erreur lors de la récupération des étudiants" });
    }
};

//Créer un étudiant
exports.createStudent = async (req, res) => {
    try {
        const { lastname, firstname } = req.body;
        const newStudent = await Student.create({ lastname, firstname });
        res.status(201).json(newStudent);
    } catch (error) {
        res.status(500).json({ message: "Erreur lors de l'ajout de l'étudiant" });
    }
};