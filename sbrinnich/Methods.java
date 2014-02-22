package sbrinnich;

public class Methods {

	public static void singleOutput(){
		System.out.println("Hello World!");
	}
	
	public static void nOutputs(int n){
		for(int i = 0; i < n; i++){
			System.out.println("Hello World!");
		}
	}
	
	public static void singleOutput(String txt){
		System.out.println(txt);
	}
	
	public static void nOutputs(int n, String txt){
		for(int i = 0; i < n; i++){
			System.out.println(txt);
		}
	}
	
}
