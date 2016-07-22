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
public class ExcepcionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros =new ArrayList <>();
        numeros.add(8);
        ArrayList<Character> charact =new ArrayList <>();
        charact.add('H');
        
        //mi clase
        
        ArrayList <Alumno> als= new ArrayList<>();
        als.add(new Alumno ("Frances"));
        als.add(new Alumno ("Kevin"));
        als.add(new Alumno ("Brayan"));
        als.add(new Alumno ("Llamilet"));
        
     
        
        //Agreguen un nuevo alumno en la posicion 1
       als.add(1, new Alumno ("Alicia"));
        //Hagan una busqueda propia para ver si esta alumna Alicia
      for(Alumno x:als){
          if(x.getNombre().equals("Alicia"))
              System.out.println("Si esta Alicia");
      }
        //mod aluno pos 3
        als.get(3).setNombre("Xiomi");
        System.out.println("Hola");
        //buenas
        System.out.println("Adios");
        
    }
}
