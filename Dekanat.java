package by.htp.univer;

import by.htp.univer.model.Student;

public class Dekanat implements Administration {

	@Override
	public void enrollStudent(Student student) {
		System.out.println("Student was enrolled");
		
	}

	@Override
	public void removeStudent(Student student) {
		System.out.println("Student was removed");		
	}

}
