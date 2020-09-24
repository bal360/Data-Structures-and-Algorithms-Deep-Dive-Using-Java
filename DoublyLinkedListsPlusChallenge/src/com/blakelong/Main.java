package com.blakelong;

public class Main {

    public static void main(String[] args) {
	    Employee blake = new Employee("Blake", "Long", 123);
	    Employee wes = new Employee("Wes", "Long", 456);
	    Employee john = new Employee("John", "Long", 789);
	    // Employee susan = new Employee("Susan", "Studebaker", 101);

	    EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

	    list.addToFront(blake);
	    list.addToFront(wes);
	    // list.addToFront(john);
	    // list.addToFront(susan);

	    list.printList();
		System.out.println(list.getSize());

		Employee bayasa = new Employee("Bayasa", "Bat-Itgel", 452);
		System.out.println(list.addBefore(bayasa, blake));
	    list.printList();
		System.out.println(list.getSize());

		// list.addToEnd(bayasa);
		// list.printList();
		// System.out.println(list.getSize());
		//
		// list.removeFromFront();
		// list.printList();
		// System.out.println(list.getSize());
		//
		// list.removeFromEnd();
		// list.printList();
		// System.out.println(list.getSize());
    }
}
