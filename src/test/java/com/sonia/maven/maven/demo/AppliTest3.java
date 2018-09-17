package com.sonia.maven.maven.demo;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppliTest3 extends TestCase {
	
	public AppliTest3( String testName )
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
    	Appli3 ob=new Appli3();
    	String r= ob.data();
        Assert.assertEquals("Now I can run Jankins to run Maven Script on Git every commit", r);
    }

}
