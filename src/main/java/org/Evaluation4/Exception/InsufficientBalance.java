package org.Evaluation4.Exception;

public class InsufficientBalance extends Exception{
    public InsufficientBalance(){

    }
    public InsufficientBalance(String message){
        super(message);
    }
}
