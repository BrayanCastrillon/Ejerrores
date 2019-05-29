/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosexc;

import java.util.Scanner;
import logica.Ej1;
import logica.Ej2;

/**
 *
 * @author Estudiantes
 */
public class EjemplosExc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("SELECCIONE EL NÚMERO DEL EJEMPLO DE ERROR QUE QUIERA VER.");
         Scanner sc = new Scanner(System.in);
         int opt = sc.nextInt();

        switch (opt) {
            case 1:
                Ej1 ej1 = new Ej1();
                ej1.Suma();
                break;
            case 2:
              Ej2 ej2 = new Ej2();
              ej2.error();
              
        }

    }

}
