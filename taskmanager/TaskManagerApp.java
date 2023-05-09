package taskmanager;

import java.util.Scanner;

public class TaskManagerApp {
    private static TaskManager taskManager = new TaskManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===================================");
            System.out.println("|           Task Manager          |");
            System.out.println("===================================");
            System.out.println("| Options:                        |");
            System.out.println("|        1. Add task              |");
            System.out.println("|        2. Remove task           |");
            System.out.println("|        3. Complete task         |");
            System.out.println("|        4. View tasks            |");
            System.out.println("|        5. Get task suggestion   |");
            System.out.println("|        6. Edit task             |");
            System.out.println("|        7. Help                  |");
            System.out.println("|        8. Exit                  |");
            System.out.println("===================================");
            System.out.println();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    completeTask();
                    break;
                case 4:
                    viewTasks();
                    break;
                case 5:
                    suggestTask();
                    break;
                case 6:
                    editTask();
                    break;
                case 7:
                    displayHelp();
                    break;
                case 8:
                    System.out.println("Thank you for using Task Manager. Have a productive day!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
        }
    
    }

    private static void addTask() {
        System.out.println("Enter task name:");
        String name = scanner.nextLine();

        System.out.println("Enter task description:");
        String description = scanner.nextLine();

        Task task = new Task(name, description);
        taskManager.addTask(task);

        System.out.println("Task added! You're doing great!");
        System.out.println();
    }

    private static void removeTask() {
        System.out.println("Enter task name:");
        String name = scanner.nextLine();

        for (Task task : taskManager.getTasks()) {
            if (task.getName().equals(name)) {
                taskManager.removeTask(task);
                System.out.println("Task removed! Keep up the good work!");
                System.out.println();
                return;
            }
        }

        System.out.println("Task not found. Maybe you already completed it!");
        System.out.println();
    }

    private static void completeTask() {
        System.out.println("Enter task name:");
        String name = scanner.nextLine();

        for (Task task : taskManager.getTasks()) {
            if (task.getName().equals(name)) {
                taskManager.completeTask(task);
                System.out.println("Task completed! Congratulations!");
                displayMotivationalQuote();
                System.out.println();
                return;
            }
        }

        System.out.println("Task not found. Try completing a different task!");
        System.out.println();
    }

    private static void editTask() {
        System.out.println("Enter task name:");
        String name = scanner.nextLine();

        for (Task task : taskManager.getTasks()) {
            if (task.getName().equals(name)) {
                System.out.println("Enter new task name:");
                String newName = scanner.nextLine();
                System.out.println("Enter new task description:");
                String newDescription = scanner.nextLine();
                task.setName(newName);
                task.setDescription(newDescription);
                System.out.println("Task updated successfully!");
                System.out.println();
                return;
            }
        }

        System.out.println("Task not found. Try editing a different task!");
        System.out.println();
    }

    private static void displayMotivationalQuote() {
        String[] quotes = {"Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill", "Believe you can and you're halfway there. - Theodore Roosevelt", "You are never too old to set another goal or to dream a new dream. - C.S. Lewis", "The only way to do great work is to love what you do. - Steve Jobs", "Don't watch the clock; do what it does. Keep going. - Sam Levenson"};

        int index = (int)(Math.random() * quotes.length);
        System.out.println("Motivational quote: " + quotes[index]);
    }

    private static void viewTasks() {
        System.out.println("Here are your tasks:");
        System.out.println();

        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getName() + " - " + task.getDescription() + " - " + (task.isCompleted() ? "Completed" : "Not completed"));
        }

        System.out.println();
    }

    private static void suggestTask() {
        System.out.println("Here's a task suggestion: " + getRandomTask() + "! Good luck!");
        System.out.println();
    }

    private static String getRandomTask() {
        String[] tasks = {"Call a friend", "Learn a new recipe", "Go for a walk", "Do something creative", "Read a book", "Try a new hobby", "Organize your space", "Volunteer for a cause you care about", "Write a thank-you note", "Take a nap", "Solve a puzzle", "Watch a TED talk", "Listen to a podcast", "Try a new workout", "Practice gratitude", "Do something kind for someone else", "Learn a new skill"};

        int index = (int)(Math.random() * tasks.length);
        return tasks[index];
    }

    private static void displayHelp() {
        System.out.println("Welcome to Task Manager!");
        System.out.println("This program helps you keep track of your tasks.");
        System.out.println("To use Task Manager, follow these steps:");
        System.out.println("1. Choose an option from the main menu.");
        System.out.println("2. Follow the prompts to complete the action.");
        System.out.println("3. Repeat as necessary to manage your tasks.");
        System.out.println("If you need additional help, please contact support.");
    }
}