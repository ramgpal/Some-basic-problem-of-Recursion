import java.util.*;
public class Main
{
    //1. To print Factorial of A given number
    
     public static int Factorial(int n) {
    if(n==1 || n==0) {
        return 1;
    }
     else
     return n*Factorial(n-1);
}

    //2.To print sum of first n natural nos
    
    public static int CalcSum(int n) {
    if(n==1) {
        return 1;
    }
     else
     return n+CalcSum(n-1);
}
 
 //3. To print Nth Fibonacci number
  
  public static int Fibonacci(int n) {
    if(n==1 || n==0) {
        return 1;
    }
     else
     return Fibonacci(n-1)+Fibonacci(n-2);
}

//Function calling

	public static void main(String[] args) { 
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    System.out.println(Factorial(n));
	System.out.println(CalcSum(n));
	System.out.println(Fibonacci(n));
	}
}
