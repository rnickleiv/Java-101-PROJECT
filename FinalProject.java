package com.robertnickle.finalProject;

import java.util.ArrayList;
import java.util.Scanner;

//I could not Figure out how to do the stretch goal for the final goal, maybe you could email what i was suppose to do there for that.i searched online a lot but no luck.
// Thank you for the extension Darrin i appreciate it.


public class FinalProject {
	static ArrayList<Task> tasks;
	static Scanner sc;
	private static Object completeId;
	
	public static void main(String[] args) {
		
		
		     tasks = new ArrayList<Task>();
	         sc = new Scanner(System.in);
	         
		     tasks.add(new Task("brush your teeth"));
		     tasks.add(new Task("do your homework"));
		     tasks.add(new Task("do your laundry"));
		     tasks.add(new Task("comb your hair"));
		     tasks.add(new Task("Buy some milk"));
		     tasks.add(new Task("Buy some candy"));
		     
		     boolean running = true;
		
	do {
			
			displayMenu();
			int menuChoice = readChoice();
			
	switch(menuChoice) {
			   case 1:
				 System.out.println("What task do you want to add:");
				 String taskName = sc.nextLine();
				 addTask(taskName);
				 break;
			   case 2:
				 listTasks();
				 System.out.println("Item needs to Remove:");
				 int removeId = readChoice();
				 removeTask(removeId);
				 break;
			   case 3:
				 System.out.println("Item is finished:");
				 int completeId = readChoice();
				 completeTask(completeId);
				 break;
			   case 4:
				 listTasks();
				 break;
			case 0:
				running = false;
				break;
				default:
				System.out.println("Bad menu Choice");
			 }
			
			   
		        }while(running);
	}	
	

			public static void displayMenu() {
			System.out.println("$$Task Manager$$");
			System.out.println("1: Add a task");
			System.out.println("2: Remove a task");
			System.out.println("3: Mark a task as complete");
			System.out.println("4: list the tasks");
			System.out.println("0: quit task");
			System.out.println("What would you like to do: ");
		}
			
			public static int readChoice() {
				int result = sc.nextInt();
				sc.nextLine();
				return result;
			}
		    public static void listTasks() {
			System.out.println("--Tasks--");
			for(int i = 0;i < tasks.size(); i++) {
			System.out.println(i+1 + "" + tasks.get(i).toString());
			}
			
			}
		    private static void completeTask(int id) {
				tasks.get(id-1).setComplete(true);
		    }
	
            public static void removeTask(int id) {
	         tasks.remove(id-1);
	         }
            public static void addTask(String name) {
            	tasks.add(new Task(name));
            
            }
            }


