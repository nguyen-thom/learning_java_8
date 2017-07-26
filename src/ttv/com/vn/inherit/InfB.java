package ttv.com.vn.inherit;

public interface InfB {
	/**
	 * do something in interface B
	 */
	default public void doSomething(){
		System.out.println("Interface B do something ");
	}
	
	public String name = "interface A";
}
