package br.com.caelum.java7;

public class E_PreciseRethrow {

    public static void main(String[] args) {  
         
        //mostra a compilacao com Java6
        try {
            throw new RuntimeException("nao foi");
        } catch(Exception e) {
            throw e;//throws RuntimeException Not Exception
        }
    }


}