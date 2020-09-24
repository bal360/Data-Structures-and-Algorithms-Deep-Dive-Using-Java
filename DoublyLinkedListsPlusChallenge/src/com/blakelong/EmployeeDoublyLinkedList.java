package com.blakelong;

import javax.security.auth.callback.TextInputCallback;
import java.util.zip.GZIPOutputStream;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        // should the list be empty head will be null so it's fine
        // to setNext to head here. field naming is a bit misleading here though
        node.setNext(head);

        // if list is empty
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);

        return removedNode;

    }

    // ******* my implementation of the addBefore method *****

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {
        EmployeeNode newEmpl = new EmployeeNode(newEmployee);
        EmployeeNode temp = head;

        while (temp != null) {
            if (temp.getEmployee().equals(existingEmployee)) {
                newEmpl.setPrevious(temp.getPrevious());
                newEmpl.setNext(temp);
                temp.setPrevious(newEmpl);
                if (head == temp) {
                    head = newEmpl;
                } else {
                    newEmpl.getPrevious().setNext(newEmpl);
                }
                size++;
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
