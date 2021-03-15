/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syahren.maulana_overloading;

/**
 *
 * @author Syahren Maulana
 */
public class SyahrenMaulana_overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kedua evos = new kedua();
        evos.hitung(10, 21);
        evos.hitung(12);
        System.out.println("");
        ketiga onic = new ketiga();
        onic.hitung(12, 9);
        onic.hitung(12);
    }
    
}
