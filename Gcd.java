import java.io.*;
import java.util.*;
public class Gcd
 {
  public static void main(String args[])
  {
   Gcd g=new Gcd();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int r=sc.nextInt();
   int []a=new int[n];
    int b[]=new int[2];
   for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   for(int j=0;j<r;j++)
     {
       for(int k=0;k<2;k++)
        {
          b[k]=sc.nextInt();
         }
         int t=g.call(a,b);
         if(t==1)
         {
            int sol=g.find(b);
          System.out.println(sol); 
          
          }
     }
   
  }
 public int call(int a1[],int b1[])
{   
int res=0;
   while(p<2)
   {
      for(int i1=0;i1<a1.length;i1++)
      {
       if(b1[p]==a1[i1])
        {
          count++; 
         }
       }
     if(count==0)
     {
       p+=10;// to make the outer while condition false
       res=0;
      }
      if(count==2)
      {
       res=1;
       }   
       p++;

   }
  public int find(int b1[])
  {
      for(int k1=0;k1<2;k1++)
       {
           if(b1[k1]==0)
          { 
           return 0;
          }
         else if(b1[k1]==1)
         {
          return 1;
          }
        }

    for(int i3=2;i3<b1[0]&&i3<b1[1];i3++)
      {
         if(b1[0]%i==0&&b1[1]%i==0)
           {
              return i;
            }
       }
  }
}