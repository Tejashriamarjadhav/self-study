package com.simlilern.cal;

public class calculator {

	
	public int add(int x,int y)
	{
		return x+y;
		}
	
	public int sub(int x,int y)
	{
		return x-y;
		}
	public int mul(int x,int y)
	{
		return x*y;
		}
	
	public float div(int x,int y)
	{
		return x/y;
		}
public float percentage(int x,int y)
	{
return (x*100)/y;
		
	}
public double sqroot(int x,int y)
{
	return Math.sqrt(x);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;
		int y=3;
calculator cal=new calculator();
System.out.println("Addition = " +cal.add(x,y));
System.out.println("Substraction =" +cal.sub(x,y));
System.out .println ("Multiflication =" +cal.mul(x, y));
System.out.println ("Division ="+ cal.div(x, y));
System.out .println ("Percentage =" +cal.percentage(x, y));
System.out.println ("Sqroot =" +cal.sqroot(x, y));



	}

}
