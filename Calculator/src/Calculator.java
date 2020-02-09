import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=null;
		Calculate ca=new Calculate();
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter choice\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			int c=ca.Add(a,b);
			System.out.println("Addition of two  numbers:"+c);
			break;
		case 2:
			int d=ca.sub(a,b);
			System.out.println("Subtraction of two  numbers:"+d);
			break;
		case 3:
			int e=ca.mul(a,b);
			System.out.println("Multiplication of two  numbers:"+e);
			break;
		case 4:
			float f=ca.div(a,b);
			System.out.println("Division of two  numbers:"+f);
			break;
		default:
			System.out.println("Enter correct choice");
		}
	}

}
