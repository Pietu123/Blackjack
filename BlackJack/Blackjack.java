/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.Scanner;

/**
 *
 * @author s1900013
 */
public class Blackjack extends Korttipakka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Korttipakka pakka = new Korttipakka();

        pakka.Sekoita();

        pakka.Tulosta();

        PelaajanKasi PelaajanKasi = new PelaajanKasi();

        PelaajanKasi EmannanKasi = new PelaajanKasi();

        System.out.println("Jaetaan pelaajalle  kaksi korttia");
        PelaajanKasi.otaKortti(pakka.JaaKortti());
        PelaajanKasi.otaKortti(pakka.JaaKortti());

        System.out.println("Pelaajan käsi:");
        PelaajanKasi.Tulosta();
        System.out.println("Pelaajan käden summa:");
        System.out.println(PelaajanKasi.selvitaSumma());
        String syote = "e";

        if (PelaajanKasi.selvitaBlackJack()) {
            System.out.println("Blackjack!");

        } else if (PelaajanKasi.selvitaSumma() < 21) {
            
            while (true) {
                System.out.println("Haluatko lisäkortin k/e?");
                syote = lukija.nextLine();
                if (syote.equals("k")) {
                    System.out.println("Jaetaan lisäkortti");
                    PelaajanKasi.otaKortti(pakka.JaaKortti());
                    PelaajanKasi.Tulosta();
                    System.out.println("Pelaajan käden summa:");
                    System.out.println(PelaajanKasi.selvitaSumma());

                    if (PelaajanKasi.selvitaSumma() > 21) {
                        //  PelaajanKasi.Tulosta();
                        System.out.println("Hävisit pelin");
                        break;

                    } else if (PelaajanKasi.selvitaSumma() == 21) {
                        System.out.println("Sait 21");
                        break;
                    }
                    // emännän peli alkaa jos painaa e
                }
                if (syote.equals("e")) {
                    System.out.println("Korttiesi summa on: ");
                    System.out.println(PelaajanKasi.selvitaSumma());
                    break;

                }

            }

        }
        if (PelaajanKasi.selvitaSumma() <= 21) {
            System.out.println("Emännän peli alkaa");
            System.out.println("Emännälle jaetaan kaksi korttia:");
            EmannanKasi.otaKortti(pakka.JaaKortti());
            EmannanKasi.otaKortti(pakka.JaaKortti());
            System.out.println("Emännän käsi");
            EmannanKasi.Tulosta();
            System.out.println("Emännän käden summa:");
            System.out.println(EmannanKasi.selvitaSumma());

            if (EmannanKasi.selvitaBlackJack()) {
                System.out.println("Blackjack, Emäntä voitti!");

            }
            //Lisätään kortteja kunnes jakajan summa saavuttaa 15 ta yli
            while (true) {
                if (EmannanKasi.selvitaSumma() < 15) {
                    System.out.println("Emäntä ottaa lisäkortin:");
                    EmannanKasi.otaKortti(pakka.JaaKortti());
                    EmannanKasi.Tulosta();
                    System.out.println("Emännän käden summa:");
                    System.out.println(EmannanKasi.selvitaSumma());

                }
                if (EmannanKasi.selvitaSumma() >= 15) {
                    break;
                }

            }

        }

        if (EmannanKasi.selvitaSumma() > PelaajanKasi.selvitaSumma() && EmannanKasi.selvitaSumma() <= 21) {
            System.out.println("Emäntä voitti pelin!");

        } else if (PelaajanKasi.selvitaSumma() > EmannanKasi.selvitaSumma() && PelaajanKasi.selvitaSumma() <= 21) {
            System.out.println("Voitit pelin!");

        } else if (PelaajanKasi.selvitaSumma() == EmannanKasi.selvitaSumma()) {
            System.out.println("Tasapeli");

        } else if (PelaajanKasi.selvitaSumma() < EmannanKasi.selvitaSumma() && EmannanKasi.selvitaSumma() > 21) {
            System.out.println("Voitit pelin!");

        }

    }

}
