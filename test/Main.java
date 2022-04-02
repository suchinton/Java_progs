public class A  
{  
	//craeting a private constructor   
	private A()  
	{  }  
	void display()  
	{  
		System.out.println("Private Constructor");  
	}  
}  
private class Test  
{  
	public static void main(String args[])  
	{  
		//compile time error  
		A obj = new A();   
	}  
}  