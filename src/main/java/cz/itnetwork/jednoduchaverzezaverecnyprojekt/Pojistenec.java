/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.jednoduchaverzezaverecnyprojekt;

/**
 *
 * @author Grifter
 */
public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int mobil;
    
    public Pojistenec(String jmeno, String prijmeni, int vek, int mobil){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.mobil = mobil;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @return the mobil
     */
    public int getMobil() {
        return mobil;
    }
    
    @Override
    public String toString(){
        
        return jmeno+" "+prijmeni+" "+vek+" "+mobil;
        
    }
}
