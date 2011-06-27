package br.com.caelum.java7;

public class A_SwitchComString {

    public static void main(String[] args) {

        //pre java7 
        String s = "b";
        if(s.equals("a")) {
           System.out.println("a");
        } else if(s.equals("b")){
            System.out.println("b");
        }
        
        
        //java7 switch com string
        String s2 = "b";
        switch(s2){  
            case "a" : System.out.println("a");
            case "b" : System.out.println("b");
        }
        
    }
}