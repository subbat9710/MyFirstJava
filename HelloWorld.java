// Here I'm defining a new class (Blueprint) named HelloWorld
// public tells Java that this should be available to all other classess
// classess ate blue prints used to design objects that conatin atteibutes(variables) and methods (functions)
//HelloWorld is just what you named your program. That allows you to reference it later
// { is the opening brace that surrounds the code used by HelloWorld

public static HelloWorld
 {
 	//public allows other classes to use this function
 	//static means that only a class can call for this function to execute
 	//void states that this function doesn't return any values after it is done executing
 	//main is required in every Java program. This function is always executed first
 	//Every main function must accept an array of string objects
 	//class variables must start with static if you want to access them with any other methods in the class

 	static String randomString = "String to Print";

 	//Constant variables are defined with the word final

 	static final double PINUM = 3.1415929;

 	public static void main(String[] args)
 	{
   
    // System.out is an object that outputs information
 	// println is a function that prints to the screen what ever you provide between braces
 	// "Hello World" is a string of characters. String must be surrounded with quotes
 	// Every statements ends withh a semicolon ;

 	System.out.println("Hello World");

 	// Variables names are case sensitive. Age is not the same as age.
 	// Variables must begain with a letter and contain numbers, _, or $
 	// You must declare all variables before you ca use them with a data type
 	/* You can use any variable name except for *abstract continus for new switch assert default goto package synchronized
 	                                *boolean do if private this break double implements protected throw 
                                    *bytes else import public throws case enum instance of return transient
                                    *catch extends int short try char final interface static void
                                    *class finally long strict fp voliate const float native super while */

 	// This is a declaration statement
 	// integerOne is a local variable to the main function. It can only be accessed in main

 	            int integerOne = 22;

 	            int integerTwo = integerOne + 1; // This is an expression statement. White space has no meaning in java, aside from variables and keywords

 	            integerTwo = integerOne
 	                        + 3;

 	            System.out.println(integerTwo);
 	}
 }













