package Nested;

public class NestedIfExample2 {

	public static void main(String[] args) {
		int age = 20;
		int weight = 80;
		if(age>=18) {
			if(weight>=50) {
				System.out.println("You are Eligible for donate Blood");
			}else {
				System.out.println("You are not Eligible for donate Blood");
			}
		}else {
				System.out.println("Age must be greater than 18");
			}
		}
	}


