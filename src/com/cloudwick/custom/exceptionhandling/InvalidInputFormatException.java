package com.cloudwick.custom.exceptionhandling;

/**
 * Created by cloudwick on 10/7/16.
 */
public class InvalidInputFormatException extends Exception{
    public InvalidInputFormatException(){
        super("InvalidInputFormatException :: Received \"\" (empty) String");
    }

    public InvalidInputFormatException(String str) {
        super("InvalidInputFormatException :: " + str);
    }

    @Override
    public String toString(){
        return super.getMessage();
    }
}
