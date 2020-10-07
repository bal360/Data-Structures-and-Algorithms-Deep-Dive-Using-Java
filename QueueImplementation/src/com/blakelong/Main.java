package com.blakelong;

public class Main {

    public static void main(String[] args) {

        // ArrayQueue queue = new ArrayQueue(5);
        //
        // queue.add(new Employee("Blake", "Long", 123));
        // queue.add(new Employee("Wes", "Long", 232));
        // queue.remove();
        // queue.add(new Employee("John", "Long", 6767));
        // queue.remove();
        // queue.add(new Employee("Susan", "Studebaker", 9878));
        // queue.remove();
        // queue.add(new Employee("Bayasa", "Bat-Itgel", 234));
        // queue.remove();
        // queue.add(new Employee("Bayasa", "Bat-Itgel", 234));


        // ******** CircularQueue **************

        CircularQueue queue = new CircularQueue(5);

        queue.add(new Employee("Blake", "Long", 123));
        queue.add(new Employee("Wes", "Long", 232));
        // queue.remove();
        queue.add(new Employee("John", "Long", 6767));
        // queue.remove();
        queue.add(new Employee("Susan", "Studebaker", 9878));
        // queue.remove();
        queue.add(new Employee("Bayasa", "Bat-Itgel", 234));
        // queue.remove();
        // queue.add(new Employee("Bayasa", "Bat-Itgel", 234));
        // // queue.remove();
        // queue.add(new Employee("Bayasa", "Bat-Itgel", 234));



    }
}
