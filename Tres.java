
package clase3;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args){
        
        Scanner sp = new Scanner (System.in);
        int num1, num2, num3;
        
        System.out.println("Ingrese el primer numero");
        num1 = sp.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sp.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = sp.nextInt();
        
        if(num1>num2 && num2>num3){
            System.out.println(num1 + ", "+num2+ ", "+num3);
            
        }else if(num1>num3 && num3>num2){
            System.out.println(num1 + ", "+num3+ ", "+num2);
            
            }else if(num2>num1 && num1>num3){
            System.out.println(num2 + ", "+num1+ ", "+num3);
            
            }else if(num2>num3 && num3>num1){
            System.out.println(num2 + ", "+num3+ ", "+num1);
            
            }else if(num3>num1 && num1>num2){
            System.out.println(num3 + ", "+num1+ ", "+num2);
            
            }else if(num3>num2 && num2>num1){
            System.out.println(num3 + ", "+num2+ ", "+num1);
        }
        
    }
}
