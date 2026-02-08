// Array to store tasks
let tasks = [];

// Function to add a task
function addTask(taskText) {
  let task = { text: taskText, done: false };
  tasks.push(task);
}

// Function to mark task as done
function toggleTask(index) {
  tasks[index].done = !tasks[index].done;
}

// Function to delete a task
function deleteTask(index) {
  tasks.splice(index, 1);
}

// Function to display tasks
function displayTasks() {
  console.log("To-Do List:");
  for (let i = 0; i < tasks.length; i++) {
    let status = tasks[i].done ? "✔️" : "❌";
    console.log(i + ": " + tasks[i].text + " " + status);
  }
}

// Example usage
addTask("Study JavaScript");
addTask("Practice Arrays");
displayTasks();

toggleTask(0);
displayTasks();

deleteTask(1);
displayTasks();
