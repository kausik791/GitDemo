package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		System.out.println("I will execute last1");
		System.out.println("I will execute last2");
		
		//stuff
		
		System.out.println("I will execute last4");
		System.out.println("I will execute last5");
		System.out.println("I will execute last6");
		
		
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("hello1");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
