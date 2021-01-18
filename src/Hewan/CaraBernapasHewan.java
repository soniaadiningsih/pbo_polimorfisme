/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author sonia adiningsih
 */
public class CaraBernapasHewan {
    
    public static void main(String[] args){
        Hewan HEWAN = new Hewan();
        Ikan IKAN = new Ikan();
        Kucing KUCING = new Kucing();
        Kupukupu KUPUKUPU = new Kupukupu();
        
        HEWAN.bernapas();
        
        HEWAN = IKAN;
        HEWAN.bernapas();
        
        HEWAN = KUCING;
        HEWAN.bernapas();
        
        HEWAN = KUPUKUPU;
        HEWAN.bernapas();
    }
    
}
