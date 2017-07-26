package ttv.com.vn.stream;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class ForEeachExample {
	String  anpha = "a,b,c,d,e,f,g,h";
	
	//with out java 8
	public void forEeachWithOut8(){
		for (String item : Arrays.asList(anpha.split(","))){
			System.out.println(item);
		}
	}
	public File[] listFileEx(){
		File f = new File(".");
		return f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if(pathname.isDirectory()){
					return true;
				}
				return false;
			}
		});
	}
	
	public File[] listFileWithLamda(){
		File f = new File(".");
		return f.listFiles(file -> file.isDirectory());
	}
	
	
	
	
	
	
	
	public File[] listFileWithFuncReference(){
		return new File(".").listFiles(File::isDirectory);
	}
	
	//with java 8
	public void forEachWith8(){
		//for each using function reference
		Arrays.asList(anpha.split(",")).forEach(System.out::println);
		//for each using filter
		Arrays.asList(anpha.split(",")).forEach(item ->{
			if("c".equals(item)){
				System.out.println("Found : " + item);
			}
		});
		//for each with lamda
		Arrays.asList(anpha.split(",")).forEach(item -> this.print(item));
		
		//with stream and filter
		Arrays.asList(anpha.split(",")).stream()
		 .filter(s -> s.contains("c"))
		 .forEach(this::print);
		
	}
	private void print(String s){
		System.out.println("Print: " + s);
	}
	
	
	public static void main(String... args){
		ForEeachExample ex1 = new ForEeachExample();
		ex1.forEachWith8();
		
	}

}
