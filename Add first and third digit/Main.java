import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n/100;
      int y=n%10;
      int sum=x+y;
      System.out.println(sum);
	}
}