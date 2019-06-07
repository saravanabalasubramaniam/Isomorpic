import java.io.*;
import java.util.*;
public class Isomorpic
{  
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String str1=input.nextLine();
	String str2=input.nextLine();
	char ch[]=str1.toCharArray();
	char a=ch[0];
	int count1=1;
	for(int i=1;i<str1.length();i++)
	{
		if(a!=ch[i])
		{
			count1++;
			a=ch[i];
			
		}
	}
	char ch1[]=str2.toCharArray();
	char b=ch1[0];
	int count2=1;
	for(int i=1;i<str2.length();i++)
	{
		if(b!=ch1[i])
		{
			count2++;
			b=ch1[i];
			
		}
	}
	if(count1==count2)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}	
  }
}
