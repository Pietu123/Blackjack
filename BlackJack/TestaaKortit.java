        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

/**
 *
 * @author s1900013
 */
public class TestaaKortit {
    public static void main(String[] args) {
        Korttipakka Testi = new Korttipakka();
        
        System.out.println("Tulostaa pakan:");
        Testi.Tulosta();
        
        System.out.println("Sekoittaa pakan:");
        Testi.Sekoita();
        
        System.out.println("Tulostaa pakan:");
        Testi.Tulosta();
           
        System.out.println("Jakaa kortin:");
        Testi.Pelaajankortti();
    
        
    }
}
