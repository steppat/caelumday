package br.com.caelum.java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B_OperadorDiamond {

    public static void main(String[] args) {

        //pre Java7
        Map<String, Object> mapa = new HashMap<String, Object>();
        List<Map<String,Object>> lista = new ArrayList<Map<String, Object>>();

        
        //Java 7 Diamond <>
        Map<String, Object> mapa2 = new HashMap<>();
        List<Map<String,Object>>  lista2 = new ArrayList<>();
    }


}
