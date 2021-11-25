duplicate.java
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
    int i,n,key,a[];
    Scanner input= new Scanner(System.in);
    n=input.nextInt();
    a=new int[n];
    System.out.println("enter elements:");
    for (i=0;i<n;i++)
    a[i]=input.nextInt();
    System.out.println("enter key:");
    key =input.nextInt();
for (i=0;i<n;i++)
{
    if(a[i]==key)
{
    System.out.println("index"+i);
    break;
}}
if(i==n)

    System.out.println("not found");

    

}}