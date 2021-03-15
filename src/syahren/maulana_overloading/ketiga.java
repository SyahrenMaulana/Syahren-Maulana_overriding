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
public class ketiga {
    public void hitung(int panjang, int lebar){
        System.out.println("Keliling Persegi Panjang: "+(4*panjang*lebar));
        
    }
    public void hitung(int sisi){
        System.out.println("Keliling Persegi : "+(4*sisi));
    }
}
