package com.perumal.test;
import java.io.File;

import junit.framework.*;

public class ThingTester extends TestCase
{
	public ThingTester (String name) 
	{
		super (name);
	}
	
	public static void main(String[] args) 
	{
		junit.textui.TestRunner.run(ThingTester.class);
	}

	public void testGetName() throws Exception 
	{
	    File myFile = new File("D:\test.txt");
	    assertEquals("test.txt", myFile.getName());
	}
}