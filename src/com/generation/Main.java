package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* Arreglo multilinea
        String universidades[];
        universidades = new String[5];*/

        //Arreglo declarado en una linea
        //String universidades [] = new String[5];


       /* universidades[0] = "IPN";
        universidades[1] = "UNAM";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "TESCO";*/


       /* String universidades [] = new String[]{"IPN","UNAM","UAM"," UADM", "TESCO"};

        for (String universidad : universidades){
            System.out.println(universidad);
        }
        */
        Set<String> frutas = new HashSet(4);
        //Caracteristicas principales set
        // No puede contener elementos duplicados

        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melón");
        frutas.add("Mandarina");
        frutas.add("Mango");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("------------------------");

        Set<String> frutas2 = new TreeSet<>();
        // Es mas lento que el HashSet
        // Ordena los elementos

        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melón");
        frutas2.add("Mandarina");
        frutas2.add("Mango");

        for (String fruta : frutas2) {
            System.out.println(fruta);
        }
        System.out.println("------------------------");

        Set<String> frutas3 = new LinkedHashSet<>();
        // Almacena valores en orden de insersion

        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melón");
        frutas3.add("Mandarina");
        frutas3.add("Mango");

        for (String fruta : frutas3) {
            System.out.println(fruta);
        }

        System.out.println("--------ArrayList----------------");

        List<String> frutas4 = new ArrayList<>();

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melón");
        frutas4.add("Mandarina");
        frutas4.add("Mango");

        for (String fruta : frutas4) {
            System.out.println(fruta);
        }

        System.out.println(frutas4.get(4));
        int indice = frutas4.indexOf("Mango");

        System.out.println(frutas4.get(indice));

        System.out.println("--------LinkedList----------------");

        List<String> frutas5 = new LinkedList<>();

        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melón");
        frutas5.add("Mandarina");
        frutas5.add("Mango");

        for (String fruta : frutas5) {
            System.out.println(fruta);
        }



    Map<Integer, String> universidades = new HashMap<Integer, String>();
    // Asocia claves con valores
    // No puede tener claves repetidas
    // Solo puede tener un valor asociado a la clave
    universidades.put(1,"IPN");
    universidades.put(2,"UNAM");
    universidades.put(3,"UAEM");
    universidades.put(4,"UAM");
    universidades.put(5,"TESCO");


    for(
    Map.Entry<Integer, String> universidad :universidades.entrySet())

    {
        System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
    }
        System.out.println(universidades.get(3));
}
}