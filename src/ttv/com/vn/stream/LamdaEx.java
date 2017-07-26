package ttv.com.vn.stream;

public class LamdaEx {
	
	public void lamdaFunInf(){
		
	}
	public void webEx(){
		WedClass wclass = new WedClass();
		
		// take care nhan dau vao la mot interface co mot method abstract
		// roi dung param trong method do nhu mot dau vao cho lamda
		String s1 = "abc";
		wclass.takeCare(s -> {
			System.out.println(s);
			return s.concat(",");
		});
		
		wclass.takeCare(s -> s.concat(","));
		
		//we can using function reference
		//wclass.takeCare(this::print);
	}
	
	private void print(String s){
		System.out.println("Print: " + s);
	}
	
	public void webExWithoutLamda(){
		WedClass wclass = new WedClass();
		wclass.takeCare(new StudioInterface() {
			@Override
			public String takeImage(String s) {
				System.out.println(s);
				return s.concat(",");
			}
		});
	}
	
	public static void main(String... args){
		
	}

}
