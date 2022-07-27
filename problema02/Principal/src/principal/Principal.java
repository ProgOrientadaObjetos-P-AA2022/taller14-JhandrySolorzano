/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


public class Principal {

    
    public static void main(String[] args) {
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataCalificaciones().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataCalificaciones().get(i));
        }
    }
    
}
