
import java.util.Scanner;


public class Dia1 {
    public static void main(String[] args) {
    String letra[]= {"A","B","C","D","E"};
    Scanner sc= new Scanner(System.in);
    char repetir='s';
    int encontrada=0;
    do{
    String abuscar=sc.next();
    for(String buscar : letra){
        if (buscar.equalsIgnoreCase(abuscar)){
            System.out.println("Se Encontro!");
           encontrada++;
            break;}
    }
        System.out.println("Ingrese s para repetir");
        repetir=sc.next().charAt(0);
    }while(repetir=='s');    
   
        System.out.println("Encontradas: "+encontrada);
    }
}


