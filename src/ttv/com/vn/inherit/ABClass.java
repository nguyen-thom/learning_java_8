package ttv.com.vn.inherit;


/**
 * when you define a method same name in two super interface<BR>
 * then ABClass will happen error when don't override method.
 * @author nguyen.thom
 *
 */
public class ABClass implements InfA,InfB{
	
	public void doSomething(){
		System.out.println("ABClass Printing...");
		System.out.println("NAME :" );
	}
	
	/**
	 * we can using supper interface
	 */
	//public void doSomething(){
	//	InfA.super.doSomething();
	//}

}
