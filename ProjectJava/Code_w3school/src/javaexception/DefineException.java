package javaexception;

public class DefineException extends Exception{
    DefineException(String str){
        super(str);
    }
    DefineException(String str, Throwable cause){
        super(str, cause);
    }
}

