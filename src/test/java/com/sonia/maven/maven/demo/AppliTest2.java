package com.sonia.maven.maven.demo;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppliTest2 extends TestCase {
	
	public AppliTest2( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Appli2 ob1 = new Appli2();
    	String r =ob1.demo();
    	Assert.assertEquals("Finally on Git",r);
        
    }

}
