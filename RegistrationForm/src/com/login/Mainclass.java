package com.login;

import java.util.*;
public class Mainclass {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Person> persons = new ArrayList<Person>();

	public static void main(String[] args) {

		Mainclass mainClass = new Mainclass();
		while (true) {
			System.out.println("Enter 1 to enter data");
			System.out.println("Enter 2 to view data");
			System.out.println("Enter 3 to delete data");
			System.out.println("Enter 4 to update data");

			String choice = mainClass.scanner.nextLine();
			switch (choice) {
			case "1":
				mainClass.addPerson();
				break;
			case "2":
				mainClass.view();
				break;
			case "3":
				mainClass.deletePerson();
				break;
			case "4":
				mainClass.updatePerson();
				break;
			}
			
			System.out
					.println("Do you want to continue further? " + "Enter N to exit. Enter any other key to continue");
			String continueFurther = mainClass.scanner.nextLine();
			if (continueFurther.equalsIgnoreCase("N")) {
				break;
			}
		}
	}

	public void addPerson() {

		System.out.println("Enter your Fullname");
		String name = scanner.nextLine();
		System.out.println("Enter the course u want to study");
		String course = scanner.nextLine();
		System.out.println("Enter your email");
		String email= scanner.nextLine();
		System.out.println("Enter a Password");
		String password = scanner.nextLine();

		Person person = new Person();
		person.setName(name);
		person.setCourse(course);
		person.setEmail(email);
		person.setPassword(password);

		persons.add(person);
		System.out.println("Signed Up.");
		System.out.println(" You are registered.Check your email for more information. Thank you..!");

	}

	public void view() {
		for (int i = 0; i < persons.size(); i++) {
			Person person = persons.get(i);
			System.out.println(i);
			System.out.println(person.getName());
			System.out.println(person.getCourse());
			System.out.println(person.getEmail());
			System.out.println(person.getPassword());
			System.out.println(".......................");
		}
	}

	public void deletePerson() {
		System.out.println("enter index of person to delete");
		int index = Integer.parseInt(scanner.nextLine());
		persons.remove(index);
		System.out.println("person deleted");
	}
	
	public void updatePerson() {
		view();
		System.out.println("Enter person index to update");
		int index = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter new name");
		String name = scanner.nextLine();
		System.out.println("Enter new course");
		String course = scanner.nextLine();
		System.out.println("Enter new email");
		String email = scanner.nextLine();
		System.out.println("Enter new password");
		String password = scanner.nextLine();
		
		Person p = persons.get(index);
		p.setName(name);
		p.setCourse(course);
		p.setEmail(email);
		p.setPassword(password);
		
		System.out.println("Data are updated");
	}

}