package com.java.practice.string;

public class ToDoListUsingStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer todo = new StringBuffer();
		
		todo.append("1. Buy groceries\n");
		todo.append("2. Finish Homework\n");
		todo.append("3. Call the plumber\n");
		
		System.out.println("To-Do List:");
		System.out.println(todo);
		
		int startIndex = todo.indexOf("2.");
		int endIndex = todo.indexOf("3.");
		
		todo.delete(startIndex, endIndex);
		
		todo.insert(startIndex,  "2. Finish homework - Update\n");
		
		System.out.println("Updated List:");
		System.out.println(todo);
		
		int task3Start = todo.indexOf("3.");
		if(task3Start != -1) {
			todo.delete(task3Start, todo.length());
		}
		
		System.out.println("Final List After Removing Task 3:");
		System.out.println(todo);
	}

}
