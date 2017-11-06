package by.htp.univer.test;

public class MainTest {

	public static void main(String[] args) {
		
//		Object obj = new B();
//		B b = new B();
//		A ab = new B();
//		Посмотри
//		SomeInterface sb = new B();
//		SomeIntefceTwo stb = new B();
		
		
//		C c = new C("1", "2");
//		System.out.println(" ");
		
		B b = new B();
		System.out.println(b.x + " " + b.y);
		
		A a = new A();
		System.out.println(a.x + " " + a.y);
		
		a.y = 8;
		a.x = 10;
		System.out.println(a.x + " " + a.y);
		
		A a2 = new A();
		System.out.println(a2.x + " " + a2.y);
		a2.y = 12;
		a2.x = 11;
		System.out.println(a2.x + " " + a2.y);
		
		System.out.println("");
		
//		Static block class a; //статика отработала на extends A
//		Static block class b;
//		Logic block class a;
//		Constructor() class a;
//		Logic block class b;
//		Constructor (int x) class B
//		Constructor class b
		
		
		
		
	}

}
