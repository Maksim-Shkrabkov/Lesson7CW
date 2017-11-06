package by.htp.univer.runner;

import by.htp.univer.Administration;
import by.htp.univer.Dekanat;
import by.htp.univer.ITacademyCourse;
import by.htp.univer.model.Student;

public class Main {
	
	
	public static final double PI = 3.14;

	public static void main(String[] args) {
		
		
		//Dekanat staff = new Dekanat();
		
		
		//Интерфейсная ссылка Interace link. Только для классов, которые реализуют интерфейс
		Administration staff = new Dekanat();
		//staff = new ITacademyCourse();
		
//		Student st1 = new Student();
//		Student st2 = new Student();
//
//        staff.enrollStudent(st1);
//        staff.removeStudent(st2);
		
		checkGroup(staff);
	

	}

	
	public static void checkGroup(Administration staff) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		
		staff.enrollStudent(st1);
		staff.removeStudent(st2);
		
	}
	
}
