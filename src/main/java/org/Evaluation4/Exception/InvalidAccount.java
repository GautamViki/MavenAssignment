package org.Evaluation4.Exception;

public class InvalidAccount extends Exception{
    public InvalidAccount(){

    }
    public InvalidAccount(String message){
        super(message);
    }
}
