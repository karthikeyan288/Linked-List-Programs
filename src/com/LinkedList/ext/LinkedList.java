package com.LinkedList.ext;

import org.w3c.dom.Node;

public class LinkedList {

	private Node head;

	public class Node {

		int data;
		Node next;
	}

	public void add(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = null;

		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}

	}

	public void push(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = head;
		head = newnode;
	}

	public void insert(int position, int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = null;

		if (position < 1) {
			System.out.println("invalied data");
			return;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}

	public void popFirst() {
		head = head.next;
	}

	public void poplast() {
		if (head == null) {
			System.out.println("The liskedlist is empty ");
		}
		if (head.next == null) {
			Node temp = head;
			head = null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		int value = temp.next.data;
		temp.next = null;
	}
	
	public boolean Search(int data) {
		if(head==null) {
			System.out.println("The list is empty");
		}
		Node temp = head;
		boolean isfound = false;
		while(temp != null) {
			if (temp.data==data) {
				isfound=true;
				break;
			}
		    temp=temp.next;
		}
		return isfound;
	}	
		
	public void print() {
		Node temp = head;
		System.out.println("Linked list :");
    head =head.next;
	}

 public void print() {
		Node temp = head;
		System.out.println("Linked list :");

    while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
    }
   
      while (temp != null) {
      System.out.print(temp.data + " ->");
		  temp = temp.next;
		}
 }
}



