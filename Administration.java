package by.htp.univer;

import by.htp.univer.model.Student;

public interface Administration {
	
	public static final double PI = 3.14;
	double PI1 = 3.15; //Можно не писать public static final
	
	void enrollStudent(Student student);
	void removeStudent(Student student);

}
