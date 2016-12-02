package edu.orangecoastcollege.sbadajoz.ic25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
Badajoz, Seve
CS A170
December 2, 2016

IC25
 */
public class TaskList {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String name, duedate, deadline;
		int priority;
		ArrayList<Task> taskList = new ArrayList<>();
		File data = new File("TaskList.dat");

		System.out.println("Previously saved Tasks from binary file:");
		if (!data.exists())
			System.out.println("[None, please enter new Tasks]");
		else {
			try {
				ObjectInputStream input = new ObjectInputStream(
						new FileInputStream(data));

				Task[] arr = (Task[]) input.readObject();
				for (Task task : arr) {
					taskList.add(task);
					System.out.println(task);
				}
			} catch (ClassNotFoundException e) {
					System.out.println("Wrong data type");
				
			} catch (IOException e) {
				System.out.println("File not found.");
			}
		}

		while (true) {
			System.out.println(
					"\nPlease enter task name (or \"quit\" to exit): ");
			name = userInput.nextLine();
			if (name.equalsIgnoreCase("quit"))
				break;
			System.out.println("Please enter due date (in form MM/DD/YYYY): ");
			duedate = userInput.nextLine();
			System.out.println("Please enter deadline (0:00 PM/AM): ");
			deadline = userInput.nextLine();
			System.out.println("Please enter priority: ");
			priority = userInput.nextInt();
			userInput.nextLine();

			taskList.add(new Task(name, duedate, deadline, priority));
		}

		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(new FileOutputStream(data));
			output.writeObject(taskList.toArray(new Task[taskList.size()]));
		} catch (IOException e) {
			System.out.println("File not found.");
		}

	}
}
