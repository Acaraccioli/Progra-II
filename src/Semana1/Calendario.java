/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author mac
 */
public class Calendario {
    public static void main(String[] args) {
        Calendar hoy= Calendar.getInstance();
        System.out.println("hoy:"+hoy.getTime());
        
        Calendar monique= Calendar.getInstance();
                monique.set(1995, Calendar.OCTOBER, 24);
                System.out.println("Fecha:"+monique.getTime());
                //comparacion         
                if(monique.before(hoy))
                    System.out.println("True");
                if(monique.after(hoy))
                    System.out.println("False");
                if(monique.getTimeInMillis() <=hoy.getTimeInMillis())
                    System.out.println("Nacio Antes-_-'");
                
                //valores individuales
                System.out.println("Dia del Año :"+monique.get(Calendar.DAY_OF_YEAR));
                
                //suma o resta 
                hoy.add(Calendar.YEAR, 1);
                hoy.add(Calendar.MONTH, -8);
                //hace10.add(Calendar.Year,10);
                //if (monique.before(hace10))
                String dia =monique.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ITALY);
             
                String diaespanol =monique.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("es"));

                
    }
}
