
package clase3;


        class JOptionPane {


    private static void showMessageDialog(Object object, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static String showInputDialog(String ingrese_un_numero_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        public JOptionPane() {
        
   int num1,num2,num3;

   num1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));
   num2 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));
   num3 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));

    if((num1 > num2)  && (num2 > num3)){
       JOptionPane.showMessageDialog(null, "Orden: " + num1 + " - " + num2 + " - " + num3);

      }else if((num1 > num3) &&  (num3 > num2)){
         JOptionPane.showMessageDialog(null, "Orden: " + num1 + " - " + num3 + " - " + num2);

      }else if((num2 > num1) &&  (num1 > num3)){
         JOptionPane.showMessageDialog(null, "Orden: " + num2 + " - " + num1 + " - " + num3);

      }else if((num2 > num3) &&  (num3 > num1)){
         JOptionPane.showMessageDialog(null, "Orden: " + num2 + " - " + num3 + " - " + num1);

      }else if((num3 > num1) &&  (num1 > num2)){
         JOptionPane.showMessageDialog(null, "Orden: " + num3 + " - " + num1 + " - " + num2);

      }else{
         JOptionPane.showMessageDialog(null, "Orden: " + num3 + " - " + num2 + " - " + num1);
              
             }
          }

    
    }

    

          
