import java.util.*;
import java.lang.*;
import java.io.*;

class levenshtein
{
public static void main (String[] args) throws java.lang.Exception
{
    int factor=0,m1=0,m2=0,m3=0,grey=0;
    Scanner sc=new Scanner (System.in);
    String str1=sc.nextLine();      /*Accepting two
    String str2=sc.nextLine();        strings*/
    int m=str1.length();            /*Calculating lengths
    int n=str2.length();              of two strings*/
    int min[][]=new int[m+1][n+1];  //Matrix of dimensions (m+1)*(n+1)
for(int i=0;i<=m;i++)       
{
    min[i][0]=i;
}
for(int j=0;j<=n;j++)
{
    min[0][j]=j;
}
for (int i=1;i<=m;i++)
{
    for (int j=1;j<=n;j++)
    {
if (str1.charAt(i-1) == str2.charAt(j-1))
{
factor=0;
}
else
{
factor=1;
}
m1=min[i-1][j]+1;
m2=min[i][j-1]+1;
m3=min[i-1][j-1]+factor;
int minimum=Math.min(m1,m2);
minimum=Math.min(minimum,m3);
 
min[i][j]=minimum;
}
}
int min_op=min[m][n];
System.out.println(min_op);
}
}
