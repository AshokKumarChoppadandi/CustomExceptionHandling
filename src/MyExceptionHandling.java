import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cloudwick.custom.exceptionhandling.InvalidInputFormatException;

/**
 * Created by cloudwick on 10/7/16.
 * This is the Custom Exception Handling Program,
 * where it asks the user input from the Command Line and Checks the Input to have only the Alphabets,
 * if not throws the Exception of type InvalidInputFormatException.
 * Even if the input is Empty it throws the same Exception
 * This has two Implementations :
 * 1. BY creating the new Exception of Type InvalidInputFormatException Class
 *  throw new InvalidInputFormatException(in);  --- Line 47
 * 2. With the use of the Class instance(Object) of InvalidInputFormatException Class.
 *  throw exception;    --- Line 41
 *  This requires to add the "throws InvalidInputFormatException" to the main method.
 */
public class MyExceptionHandling {
    public static void main(String[] args) throws IOException,
            /*Second Way*/InvalidInputFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        * Second Way
        * */
        InvalidInputFormatException exception = new InvalidInputFormatException();
        //Starting of while loop
        while(true){
            System.out.println("Please Enter your Response ...!!!");
            String in = br.readLine();
            // Start of try block
            try {
                if(in.equalsIgnoreCase("exit")) {
                    break;
                } else if(in.equalsIgnoreCase("")) {
                    /*
                    * Second Way.
                    * Throughing the object of InvalidInputFormatException
                    */
                    throw exception;
                } else if(!in.matches("^[a-zA-Z]+")) {
                    /*
                    * First Way.
                    * Creating a new Exception of type InvalidInputFormatException
                    */
                    throw new InvalidInputFormatException(in);
                } else {
                    System.out.println("You have given the Correct Response...!!!");
                }
            } /* End of try block */
            /* Start of catch block*/
            catch (InvalidInputFormatException ex) {
                ex.printStackTrace();
            }
            /* End of catch block*/
            /* Start of finally block*/
            finally {
                /*
                * This Statement executes either exception or not.
                * */
                System.out.println("Finally Block Executed...!!!");
            }
            /* End of finally block*/
        }
        // End of While loop
        System.out.println("End of the Program");
    }
}