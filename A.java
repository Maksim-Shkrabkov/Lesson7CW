package by.htp.univer.test;

public class A implements SomeIntefceTwo {
	
	private String aq;
	public static int x = 3;
	public int y = 5;
	
//	{���������� ����. ����������� ��� �������� �������, �� �� ������������}
	
	{
		
		System.out.println("Hello World");
	}
	
//	static {} ����������� ����
	
	static {
		System.out.println("Static block A: " + x);
		x = 2;
		System.out.println("x after: " + x);
	}
	
	
	public A(String a) {
		this.aq=a;
	}
	
	public A() {
		
	}

}
