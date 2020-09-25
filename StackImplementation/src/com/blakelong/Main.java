package com.blakelong;

public class Main {

    public static void main(String[] args) {

    	LinkedListStack stack = new LinkedListStack();

	    stack.push(new Employee("Blake", "Long", 123));
	    stack.push(new Employee("Wes", "Long", 232));
	    stack.push(new Employee("John", "Long", 6767));
	    stack.push(new Employee("Susan", "Studebaker", 9878));
	    stack.push(new Employee("Bayasa", "Bat-Itgel", 234));

	    System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());

		stack.printStack();
    }
}
