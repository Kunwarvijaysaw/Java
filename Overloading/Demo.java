package Overloading;

public class Demo {

	public static int add(int a ,int b) {
		return a+b;
	}
	public static int add(int a ,int b , int c) {
		return a+b+c;
	}
	public static int add(){
	return 0;
	}
	public static void main (String args[]) {
		int h = 22;
		int u = 76;
		int m = 44;
		
		int c = add(h,u,m);
		System.out.println(c);
	}

}