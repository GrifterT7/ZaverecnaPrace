/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.jednoduchaverzezaverecnyprojekt;

import java.util.ArrayList;

/**
 *
 * @author Grifter
 */
public class Databaze {
    private ArrayList<Pojistenec> pojistenci;
    
    public Databaze(){
        pojistenci = new ArrayList<>();
    }
    
    public void pridejPojistence(String jmeno, String prijmeni, int vek , int mobil){
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, mobil));
    }
    public void najdiPojistence(String jmeno, String prijmeni) {
    ArrayList<Pojistenec> nalezene = new ArrayList<>();
    for (Pojistenec p : pojistenci) {
        if (p.getJmeno().toLowerCase().trim().equals(jmeno.toLowerCase().trim())&&p.getPrijmeni().toLowerCase().trim().equals(prijmeni.toLowerCase().trim())) {
            nalezene.add(p);
        }
    }
    
        System.out.println("Jméno | Přijmení | Věk | Telefonní číslo");
    for(Pojistenec z: nalezene){
            System.out.println(z);
        }
        
    
    }
    
    public void vypisPojistence(){
        System.out.println("Jméno | Přijmení | Věk | Telefonní číslo");
        for(Pojistenec p: pojistenci){
            System.out.println(p);
        }
        
    }
    
}
