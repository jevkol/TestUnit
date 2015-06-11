package ru.apache_maven;

public class App 
{
    public static void main( String[] args )
    {
        boolean bo = true;
		int a = 3, b = 2;
		
		try{
			 Demo1.demo1(a,b); //if sum=5 exception
			
		} catch (MyExeption1 e){
			System.out.println(e);
			bo = false;
		}
		if(bo) System.out.println("All OK");
		
	}
}
