package value_required_annotation.demo;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
 private String name;
	@Value("${student.hobby}")
 private String hobby;
	@Value("${student.course}")
 private String course;
 
 public void display() {
	 
	 System.out.println("student class running...");
	 System.out.println("name "+name+","+"hobby "+ hobby+ " ,"+"course "+ course);
 }
}
