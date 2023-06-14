/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3capas;

/**
 *
 * @author tonyM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println(calcularEdad(26));
        
        testCalcularEdad();
        
    }
    
   static public int calcularEdad(int edad)
    {
        int result = 2023 - edad;
       return result;
    }
    
   
   static public void testCalcularEdad() {
        System.out.println("calcularEdad");
        int edad = 26;
        int expResult = 1997;
        int result = Main.calcularEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
       if(expResult!=result)
       {
            System.out.println("The test case is a prototype.");
       }else
       {
           System.out.println("Test correcto");
       }
    }
}
