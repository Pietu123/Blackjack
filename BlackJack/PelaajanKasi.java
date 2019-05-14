/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author s1900013
 */
public class PelaajanKasi extends Korttipakka {

    //luodaan arraylist
    ArrayList<Kortti> kortit = new ArrayList<>();

    //konstruktori
    public PelaajanKasi() {
    }

    //metodeja
    public void otaKortti(Kortti kortti) {
        kortit.add(kortti);

    }

    public void Tulosta() {
        System.out.println(kortit);
    }

    public int selvitaSumma() {
        int summa = 0;
        for (int i = 0; i < kortit.size(); i++) {
            // summa = summa + this.kortit.get(i).getArvo();

            if (this.kortit.get(i).getArvo() >= 2 && this.kortit.get(i).getArvo() <= 10) {
                summa = summa + this.kortit.get(i).getArvo();

            } else if (this.kortit.get(i).getArvo() >= 11 && this.kortit.get(i).getArvo() <= 13) {
                summa = summa + 10;

            } else if (this.kortit.get(i).getArvo() == 14) {
                summa = summa + 11;

            }
        }

        if (kortit.size() == 2 && summa > 21) {
            summa = summa - 10;

        }
        
        return summa;

    }

    public boolean selvitaBlackJack() {
        if (kortit.size() == 2 && selvitaSumma() == 21) {
            return true;
        } else {
            return false;
        }
    }
}
