/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.jednoduchaverzezaverecnyprojekt;
import java.util.Scanner;

/**
 *
 * @author Grifter
 */
public class Menu {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    Databaze databaze;

    public Menu() {
        this.databaze = new Databaze();
    }
    
    
    public void vypisUvodniObrazovku(){
        
        
        System.out.println("---------------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat pojištěného");
        System.out.println("2 - Vyhledat pojištěného");
        System.out.println("3 - Vypsat všechny pojištěné");
        System.out.println("4 - Konec");        
        
       
    }

    /**
     *
     */
    public void pridej(){
                System.out.println();
                System.out.println("Zadejte jméno pojištěného");
                String jmeno = sc.nextLine().trim();
                System.out.println("Zadejte příjmení pojištěného");
                String prijmeni = sc.nextLine().trim();
                System.out.println("Zadejte věk pojištěného");
                int vek = 0;
                String kontrolaVeku = "";
                while(!"ok".equals(kontrolaVeku)){
                try{    
                
                int a = Integer.parseInt(sc.nextLine());
                vek = a;
                kontrolaVeku = "ok";
                }catch(NumberFormatException ex){
                    System.out.println("Zadaná hodnota není číslo nebo celé číslo, zadejte prosím celé číslo.");
                }
                }
                System.out.println("Zadejte telefonní číslo pojištěného");
                String kontrolaMobilu ="";
                int mobil = 0;
                while(!"ok".equals(kontrolaMobilu)){
                try{
                int b = Integer.parseInt(sc.nextLine());
                mobil = b;
                kontrolaMobilu = "ok";
                }catch(NumberFormatException ex){
                    System.out.println("Zadaná hodnota není číslo nebo celé číslo, zadejte prosím celé číslo.");
                }
                }
                databaze.pridejPojistence(jmeno, prijmeni, vek, mobil);
                System.out.println("Data byla uložena. Klávesou enter se vrátíte do menu.");
                String pokracovat = sc.nextLine();
                
        
    }
    public void najdi(){
                System.out.println();
                System.out.println("Zadejte jméno pojištěného");
                String jmenoHledaneho = sc.nextLine().trim();
                System.out.println("Zadejte příjmení pojištěného");
                String prijmeniHledaneho = sc.nextLine().trim();
                databaze.najdiPojistence(jmenoHledaneho, prijmeniHledaneho);
                System.out.println("Klávesou enter se vrátíte do menu.");
                String pokracovat = sc.nextLine();
    }
    public void vypis(){
        databaze.vypisPojistence();
        System.out.println("Klávesou enter se vrátíte do menu.");
        String pokracovat = sc.nextLine();
    }
        
    
}   

