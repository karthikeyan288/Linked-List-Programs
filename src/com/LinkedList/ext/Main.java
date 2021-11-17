package com.LinkedList.ext;

public class Main {
	
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(56);
		list.add(70);
		list.insert(1, 30);

		list.poplast();
    list.popFirst();

    list.print();
  }


}


