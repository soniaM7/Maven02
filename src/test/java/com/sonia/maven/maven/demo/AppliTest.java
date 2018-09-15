package com.sonia.maven.maven.demo;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppliTest extends TestCase {
	public AppliTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppliTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Appli ap =new Appli();
    	String r=ap.sample();
    	Assert.assertEquals("simple", r);
        
    }
}
