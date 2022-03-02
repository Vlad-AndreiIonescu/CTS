package ro.ase.cts.gr1085.lab01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

class LowerCaseException  extends  Exception{
    public String getMessage(){
        return "Au fost introduse doar litere mici";
    }
}

class UpperCaseException extends Exception{
    public String getMessage(){
        return "Au fost introduse doar litere mari";
    }
}


public class Main {
    public static void main(String[] args){
        System.out.println("Tastati cu litere mari si mici: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = bufferedReader.readLine();
            //System.out.println(text);

            //daca toate literele sunt mici(lowercase)- LowerCaseException
            if(text.toLowerCase(Locale.ROOT).equals(text)) throw new LowerCaseException();
            if(text.toUpperCase(Locale.ROOT).equals(text)) throw new UpperCaseException();
            //daca toate literele sunt mari(uppercase)- UpperCaseException



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}