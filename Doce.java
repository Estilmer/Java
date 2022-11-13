
package clase3;

import java.util.Scanner;

public class Doce {

    public static void main(String[] args){
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        
        int dia = sp.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sp.nextInt();
        System.out.println("Ingrese el año");
        int año = sp.nextInt();
        
        if(año>=1980 && año<=2030){
            if(mes>=1 && mes<=12){
                if(mes == 2){
                  if(dia>=1 && dia<=28){
                          
                    System.out.println("La fecha ingresada es: "+ dia+ "/" +mes+"/"+año);  
                  }else{
                      System.out.println("Dia no valido");
                      
                  }
                }else{
                    if(dia>=1 && dia<=30){
                    System.out.println("La fecha ingresada es: "+ dia+ "/" +mes+"/"+año);//27/7/2020
                }else{
                      System.out.println("Dia no valido");
                    }
                }
        }else {
            System.out.println("Mes no valido");
        }
        }else {
            System.out.println("Año no valido");
        }
    }
}
