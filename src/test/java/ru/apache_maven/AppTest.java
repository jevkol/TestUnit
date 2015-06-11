package ru.apache_maven;
import org.junit.Test;
import java.lang.*;
import org.junit.*;
import static junit.framework.Assert.*;
import java.util.*;
// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;


public class AppTest {
	
	
	@Test(expected = MyExeption1.class)
          public void demo1Test() throws MyExeption1 {
             
                
                      Demo1.demo1(3,2);
                      // fail("Test for sum 3and 2  should have thrown a MyExeption1");
          }
    @Test( timeout = 10 )
	public void plusTest(){
	    Random r = new Random();
		int j = r.nextInt(99000);
		
		Demo2 plus = new Demo2();
		for (int i = 0; i < j; i++){
		  
		  int n = Demo2.plus(3,5);
	      assertEquals(8,n);
	    }
	}
}
    