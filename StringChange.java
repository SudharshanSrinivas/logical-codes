import java.io.*;
import java.util.*;
import java.lang.*;
public class StringChange
{
static int count;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,s1;
s=sc.next();
s1=sc.next();
int ind[]=new int[5];
char a[]=s.toCharArray();
char a1[]=s1.toCharArray();
for(int i=0;i<s.length();i++)
 {
 for(int j=0;j<s1.length();j++)
  {
   if(a[i]==a[j])
      {
         ind[p++]=j; 
break;
}
else if(a[i]!=a[j]&&j==s.length())
{
      count++;
}
}
for(i=0;i<s.length();i++)
 {
    count=count+i-ind[0];
 }
System.out.println("no of insertion,updation,deletion"+count);
}
}  
