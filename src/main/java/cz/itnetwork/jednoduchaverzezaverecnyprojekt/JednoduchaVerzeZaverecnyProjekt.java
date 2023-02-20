/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.jednoduchaverzezaverecnyprojekt;

import java.util.Scanner;

/**
 *
 * @author Grifter
 */
public class JednoduchaVerzeZaverecnyProjekt {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in, "Windows-1250");
    Menu menu = new Menu();
    String volba = "";
    // hlavní cyklus
    while (!volba.equals("4")) {
        
        menu.vypisUvodniObrazovku();
        volba = sc.nextLine();
        // reakce na volbu
        switch (volba) {
            case "1":
                menu.pridej();
                break;
            case "2":
                menu.najdi();
                break;
            case "3":
                menu.vypis();
                break;
            case "4":
                System.out.println("Libovolnou klávesou ukončíte program...");
                break;
            default:
                System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                break;
        }
    }
    }
}
