package ttv.com.vn.fun.consumer;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LamdaFunction {
	
	/**
	 * using 
	 * @param t
	 */
	public static void callAstrMethod(Supplier<? extends Person> t){
		//get person after process function t.get
		Person p = t.get();
		p.absMethod();
		
	}
	public static void expConsummer(Person value,Consumer<? super Person> consumer){
		//using method process value person
		consumer.accept(value);
	}
	
	//create method using two parameters
	public static void expBiConsumer(String arg1, String args2,BiConsumer<String,String> bi){
		bi.accept(arg1, args2);
	}
	
	public static String expFun(String t, Function<String, String> fuc){
		//execute function fuc with parameter t;
		return fuc.apply(t);
	}
	public static int expUnaryOperator(int t, IntUnaryOperator unary){
		return unary.applyAsInt(t);
		
	}
	
	public static IntUnaryOperator returnFunc (double a){
		return t -> t + (int)a ;
	}
	
	public Function<Person,String> getName( String message){
		Function<Person,String> pf = (person) -> message;
		return pf;
	}
	
	
	public static void main(String... args){
		//callAstrMethod(() -> new Student());
		Person st = new Student();
		//we can using supplier as function . It return st object.
		Supplier< Person> supplier = () ->{
			return st;
		};
		//or we can pass lamda expression to method param
		callAstrMethod(() -> st);
		
		//create a consumer 
		Consumer<? super Person> consumer = (Person t) -> {
			t.absMethod();
		};
		
		Predicate<Person> predicate = t ->  t == null;
	
		
		Function<String, String> fcF = (String t) -> {
			return t.concat("HEELO");
		};
		String strSimple = "AVC";
		//create 
		String fc = expFun("AVC", t -> t.concat("123"));
		  
		
		expConsummer(st,student -> student.absMethod());
		//expConsummer(st, st::absMethod);
		
		int ifc = expUnaryOperator(1,returnFunc(1.3));
		System.out.println(ifc);
		
		
		
		Stream<String> streamSimple = Arrays.stream(new String []{"ABC","CDF"});
		Consumer<String> consumer1 = (String t) -> {
			System.out.println( t);
		};
		streamSimple.forEach(consumer1);
		
		long count = streamSimple.filter(item -> item.startsWith("A")).count();
	}

}
