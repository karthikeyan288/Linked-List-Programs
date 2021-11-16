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

	public void print() {
		Node temp = head;
		System.out.println("Linked list :");

		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
	}
}
