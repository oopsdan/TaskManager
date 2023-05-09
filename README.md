# Task Manager App

This is a simple console-based task manager app written in Java. It allows users to manage their tasks by adding, removing, completing, viewing, and editing tasks.

## Table of Contents
* [Installation](#installation)
* [Usage](#usage)
* [Examples](#examples)
* [Contributing](#contributing)
* [License](#license)

## Installation
1. Clone the repository: 
   ```
   git clone https://github.com/oopsdan/taskmanager.git
   ```
2. Compile the code:
   ```
   javac taskmanager/*.java
   ```
3. Run the app:
   ```
   java taskmanager.TaskManagerApp
   ```

## Usage
When you run the app, you will see the main menu with the following options:
```
===================================
|           Task Manager          |
===================================
| Options:                        |
|        1. Add task              |
|        2. Remove task           |
|        3. Complete task         |
|        4. View tasks            |
|        5. Get task suggestion   |
|        6. Edit task             |
|        7. Help                  |
|        8. Exit                  |
===================================
```

To select an option, enter the corresponding number and press Enter. The app will prompt you for additional information if needed.

### Adding a task
To add a task, select option 1 from the main menu. Enter the name and description of the task when prompted.

### Removing a task
To remove a task, select option 2 from the main menu. Enter the name of the task when prompted.

### Completing a task
To mark a task as completed, select option 3 from the main menu. Enter the name of the task when prompted.

### Viewing tasks
To view a list of all tasks, select option 4 from the main menu.

### Getting a task suggestion
To get a suggestion for a new task, select option 5 from the main menu.

### Editing a task
To edit a task, select option 6 from the main menu. Enter the name of the task when prompted, then enter the new name and description of the task.

### Help
To display the help menu, select option 7 from the main menu.

### Exiting the app
To exit the app, select option 8 from the main menu.

## Examples
Adding a task:
```
Enter task name:
Do laundry
Enter task description:
Wash clothes and fold them
Task added! You're doing great!
```

Viewing tasks:
```
Here are your current tasks:
Task name: Do laundry
Task description: Wash clothes and fold them
Task is not completed
```

Marking a task as completed:
```
Enter task name:
Do laundry
Task completed! Congratulations!
Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill
```

Removing a task:
```
Enter task name:
Do laundry
Task removed! Keep up the good work!
```

## Contributing

This program was created as a learning exercise and is not intended for production use. However, if you would like to contribute to the project, feel free to submit a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more information.
