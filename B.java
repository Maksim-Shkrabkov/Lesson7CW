package by.htp.univer.test;

public class B extends A implements SomeInterface, SomeIntefceTwo{
	
	private String filed2;
	
	@Override
	public void doSmth() {
		// TODO Auto-generated method stub
		
	}
	
	public B(String filed2, String filed1) {
		super(filed1);
		this.filed2 = filed2;
	}
	
	public B() {
		
	}
	
}
