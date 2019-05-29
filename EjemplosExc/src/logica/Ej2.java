/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Ej2 {

    public void error() {

        Object a[] = new String[10];
        

        try {
            a[1].toString();
            System.out.println(a[4]);
        } catch (NullPointerException e) {
            System.out.println("Los espacios de los arreglos están nulos");
        }

    }
}
