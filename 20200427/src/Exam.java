import java.util.Scanner;

public class Exam {
	public static String arr="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//142p 문제 1.
		calculator();
		
		//142p 문제2
		abs();
		
		//145p 문제1.
		System.out.println("**************문제 3**************");
		System.out.println("반지름을 입력하세요");
		double radius = sc.nextDouble();
		System.out.println("원의 넓이 = "+widthCircle(radius));
		System.out.println("원의 둘레 = "+Circumference(radius));
		
		//146p 문제2
		System.out.println("**************문제 4**************");
		for(int i=1;i<=100;i++) {
			if(primeNumber(i)==true) {
				System.out.println(i);
			}
			
		}
		//154p 문제 1
		System.out.println("**************문제 5**************");
		System.out.println("2의 3승 = "+power(3));
		System.out.println("2의 5승 = "+power(5));
		
		System.out.println("**************문제 6**************");
		binary(8);
		char[] reverse = arr.toCharArray();
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.print(reverse[i]);
		}
	}

	public static void calculator() {
		System.out.println("**************문제 1**************");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println(num1+"+"+num2+" = "+(num1+num2));
		System.out.println(num1+"-"+num2+" = "+(num1-num2));
		System.out.println(num1+"*"+num2+" = "+(num1*num2));
		System.out.println(num1+"/"+num2+" = "+(num1/num2));
		System.out.println(num1+"%"+num2+" = "+(num1%num2));
	}
	
	public static void abs() {
		System.out.println("**************문제 2**************");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		if(num1<num2) {
			System.out.println("|"+num1+"-"+num2+"| = "+(num2-num1));
		}
		else {
			System.out.println(num1+"-"+num2+" = "+(num1-num2));
		}
	}
	public static double widthCircle(double radius) {
		return 3.14159265359 * radius * radius;
	}
	
	public static double Circumference(double radius) {
		return 2*3.14159265359*radius;
	}
	public static boolean primeNumber(int num) {
		boolean boo=true;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				if(num!=i) {
					boo= false;
					break;
				}
			}
		}
		return boo;
	}
	public static int power(int n) {
		if(n==0) {
			return 1;
		}
		return 2*power(n-1);
	}

	public static int binary(int num) {
		if(num<1) {
			return 0;
		}
		int print=num%2;
		int returnValue = num/2; 
		arr = arr+print;
		return binary(num/2);
	}
}
