package funciones;

import java.util.Scanner;

public class NameFunction
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.nextLine();
        printNameCharacters( name );
        printNameLength( name );
        printName(name);
        console.close();
    }

    private static void printNameLength( String name )
    {
        double nameLength = name.length();
        System.out.println(nameLength);
    }

    private static void printNameCharacters( String name )
    {
    	for (int contador=0;contador<name.length();contador++) {
			System.out.println(name.charAt(contador));
		}

    }
    
    private static void printName( String name )
    {
    	System.out.println("Your name is: " + name);
    }


}
