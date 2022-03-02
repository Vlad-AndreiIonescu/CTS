package ro.ase.cts.gr1085.lab01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        System.out.println("testati ceva: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = bufferedReader.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}