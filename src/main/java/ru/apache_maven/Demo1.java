package ru.apache_maven;

public class Demo1 {
	public static void demo1(int a, int b) throws MyExeption1 {
			if((a + b) == 5){
			  throw new MyExeption1();
			  
		    } 
	}
}