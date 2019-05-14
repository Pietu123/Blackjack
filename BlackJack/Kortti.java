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
public class Kortti {
    private int arvo;
    private String maa;
 
    //konstruktori
public Kortti(int arvo, String maa){
    this.arvo = arvo;
    this.maa = maa;
            
}   

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    public int getArvo() {
        return arvo;
    }

    public String getMaa() {
        return maa;
    }
    
public String toString() {
        return ""+this.arvo+""+this.maa;
}

}   