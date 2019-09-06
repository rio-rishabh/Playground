import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int a=x/100;
    int b=((x/10)%10);
    int c=x%10;
    int rev=((c*100)+(b*10)+(a));
    System.out.println(rev);
  }
}