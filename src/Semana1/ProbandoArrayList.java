/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class ProbandoArrayList {
    public static void main(String[] args) {
       ArrayList<String> lista= new ArrayList<>();
       lista.add("Carlos");
       lista.add("Jose");
       lista.add("Alejandro");
       //for each
        System.out.println("1");
       for(String cad:lista)
            System.out.println("-"+cad);
       int size =lista.size();
      //for normal
        System.out.println("2");
      for(int p=0;p<size; p++){
           System.out.println("-"+lista.get(p));
       }
      //agregar en una posicion especifico
      lista.add(2,"Kevin");
      
        System.out.println("3");
      //moviendo los valores 
      lista.set(0, "nombres");
              for(String cad:lista)
            System.out.println("-"+cad);
       //remover valores
       lista.remove(1);
        System.out.println("4");
       for(String cad:lista)
            System.out.println("-"+cad);
       
       //buscar
       //SOLO FUNCIONA CON VALORES PRIMITIVOS O CLASES QUE HAN MODIFICADO SU FUNCION EQUALS.
       //HAIL OBJECT!!!
       if (lista.contains("Alejandro"))
            System.out.println("Si tiene guardado Alejandro");

       
    }
}
