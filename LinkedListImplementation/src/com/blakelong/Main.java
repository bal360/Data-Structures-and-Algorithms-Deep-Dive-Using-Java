package com.blakelong;

public class Main {

    public static void main(String[] args) {

    	Employee blake = new Employee("Blake", "Long", 123);
	    Employee wes = new Employee("Wes", "Long", 456);
	    Employee john = new Employee("John", "Long", 789);
	    Employee susan = new Employee("Susan", "Studebaker", 101);

		EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

		System.out.println(list.isEmpty());

	    list.addToFront(blake);
	    list.addToFront(wes);
	    list.addToFront(john);
	    list.addToFront(susan);

		System.out.println(list.getSize());

	    list.printList();

	    list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
    }
}
