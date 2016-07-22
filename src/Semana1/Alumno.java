/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

/**
 *
 * @author mac
 */
public class Alumno {
    private String nombre;
    //constructor
    public Alumno(String nombre){
        this.nombre=nombre;}
    //funcion
    public String getNombre(){
        return nombre;
        
    }
    public void print(){
        System.out.println(nombre);
    }
        public void setNombre (String n){
          nombre=n;
        }
       
    }

