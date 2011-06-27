package br.com.caelum.java7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class D_MultiCatch {

    public static void main(String[] args) {
              
        //Java7 MultiCatch - refactore
        try (InputStream is =  new FileInputStream("teste.txt")){
            //is.read();
        }catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            
        }
        
    }


}