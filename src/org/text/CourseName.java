package org.text;

public class CourseName {
	public void javaCourse() {
System.out.println("java course is started");
	}
	public void pythonCourse() {
System.out.println("python course is not started");
	}
	public static void main(String[] args) {
		CourseName c = new CourseName();
		c.javaCourse();
		c.pythonCourse();
		System.out.println("hello");
	}
}
