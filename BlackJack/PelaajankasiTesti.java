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
public class PelaajankasiTesti  {
    public static void main(String[] args) {
            
        
        PelaajanKasi Testi = new PelaajanKasi();
        
        Korttipakka pakka = new Korttipakka();
        
        
      //  System.out.println("Sekoittaa pakan");
      //  pakka.Sekoita();
        
        System.out.println("Tulostaa pakan");
        System.out.println(pakka);
        
        System.out.println("Lisää käteen kortin");
        Testi.otaKortti(pakka.JaaKortti());
        
        System.out.println("Lisää käteen kortin");
        Testi.otaKortti(pakka.JaaKortti());
        
        
        /*System.out.println("Lisää käteen kortin");
        Testi.JaaKortti(); */
     
     /*   System.out.println("Lisää käteen kortin");
        Testi.otaKortti(); */
       
        System.out.println("Tulostaa käden");
        Testi.Tulosta();    
        
        System.out.println("Katsoo summan");
        Testi.selvitaSumma();
    
        System.out.println("Katsoo onko blackjack");
        Testi.selvitaBlackJack();
    }
}
