import java.util.Scanner;
class Divisible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter n value:");
n=sc.nextInt();
if(n%5 == 0)
{
System.out.println(" n is divisible by 5");
}
else if(n%11 == 0)
{
System.out.println(" n is divisible by 11");
}
else
{
System.out.println(" n is not divisible by both 5 & 11 ");
}
}
}
‎