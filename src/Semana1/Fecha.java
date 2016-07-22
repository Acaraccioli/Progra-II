/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Date;

/**
 *
 * @author mac
 */
public class Fecha {
    public static void main(String[] args) {
        Date hoy = new Date();
        //fecha actual
        System.out.println("Hoy:"+hoy+"En Mili"+hoy.getTime());
 
        //segundos
        Date antes = new Date(1);
        System.out.println("Milli 1:"+antes);
    }
    
}
