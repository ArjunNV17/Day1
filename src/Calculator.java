
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		double num1=sc.nextDouble();
		
		System.out.println("Enter 2nd number:");
		double num2=sc.nextDouble();
		
		double sum=num1+num2;
		double difference=num1-num2;
		double product=num1*num2;
		double quotient=0;
		
		if(num2!=0) {
           quotient=num1/num2;
			}
		else {
			System.out.println("Not divisible by 0");
		}
		
		System.out.println("Addition:"+sum);
		System.out.println("Subtraction:"+difference);
		System.out.println("Multiplication:"+product);
		if(num2!=0) {
		System.out.println("Division:"+quotient);
	}
		
     sc.close();
	}

}
