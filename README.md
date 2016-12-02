# IC25_TaskList

In this assignment, we will be creating a Task List to keep track of things we need to do, a due date, deadline time and priority (1 = high, 2 = medium, 3 = low).  For example, one Task might be "Ace CS 170 Final Exam", "12/16/2016", "1:40PM", 1.

We are going to create a new class named Task  with the following requirements:

![xml](https://github.com/S33V/IC25_TaskList/images/task.png "Task")

We're going to add serialization to the Task class, so that it can be persisted (written) to a binary file, acting like a task list.  We need to customize the Task class to make it Serializable, then use a ObjectOutputStream to write the task list to disk.

Please make your Task class serializable, then create a TaskListDemo with a main( ) method that creates 3 tasks and writes them to a binary file named "TaskList.dat".  We will then add Java code that reads a binary file (of Task objects) into our program and displays each object to the console.  More details to be provided in class.

**Here is a sample transaction with the user (first time the code is run):**
```
Previously saved Tasks from binary file:
[None, please enter new Tasks]

Please enter task name (or "quit" to exit): Ace CS 170 Final Exam
Please enter due date (in form MM/DD/YYYY): 12/16/2016
Please enter deadline  : 1:40 PM
Please enter priority : 1
```
**After 1 Task has been saved (second time the code is run):**
```
Previously saved Tasks from binary file:
Task [name=Ace CS 170 Final Exam, dueDate=12/16/2016, deadline=1:40 PM, priority=High]

Please enter task name (or "quit" to exit): quit
```
