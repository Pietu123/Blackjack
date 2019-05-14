     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author s1900013
 */
public class Korttipakka {
    
    //Luo arraylistin
    ArrayList<Kortti> pakka = new ArrayList<>();
  
            
    //Luo korttipakan
    public Korttipakka() {

       // int i;
       // for (i = 0; i < 4; i++) {

            for (int arvo = 2; arvo <= 14; arvo++) {
                pakka.add(new Kortti(arvo, " Hertta"));

            }
            for (int arvo = 2; arvo <= 14; arvo++) {
                pakka.add(new Kortti(arvo, " Ruutu"));

            }
            for (int arvo = 2; arvo <= 14; arvo++) {
                pakka.add(new Kortti(arvo, " Pata"));

            }
            for (int arvo = 2; arvo <= 14; arvo++) {
                pakka.add(new Kortti(arvo, " Risti"));

            }
        
          /*pakka.add(0, new Kortti(2," Risti"));
            pakka.add(0, new Kortti(2, " Ruutu"));
            pakka.add(0, new Kortti(2," Risti"));
            pakka.add(0, new Kortti(2, " Ruutu")); */
    } 
    
    //metodit

    public void Tulosta() {
        System.out.println(pakka);
    }

    public void Sekoita(){
        Collections.shuffle(pakka);
     //   System.out.println(Kortti);
    }
    
    public Kortti JaaKortti(){
        Kortti pelaajankortti;
        pelaajankortti = pakka.get(0);
        pakka.remove(0);
        return pelaajankortti;
        
    }
    public void Pelaajankortti(){
        System.out.println(this.JaaKortti());
    }

}
      
  







//  Collections.shuffle(pakka);}                   
//    System.out.println("Sekoituksen jälkeen"+pakka); 
/* public Korttipakka(ArrayList pakka) {
              
 */
