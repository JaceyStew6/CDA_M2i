const express = require("express");
const taskController = require("../controllers/taskController");

const router = express.Router();

router.get("/:id", taskController.getAllTasks);
router.post("/create/:id", taskController.createTask);
router.put("/update/:id/:2", taskController.updateTaskById);
router.delete("/delete/:id", taskController.deleteTaskById);

module.exports = router;