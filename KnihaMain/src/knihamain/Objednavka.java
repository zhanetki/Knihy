/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihamain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 38067
 */
public class Objednavka {
    private ArrayList<Kniha> knihy;
    private Adresa adresa;

    // Další atributy dle uvážení mohou být přidány do této třídy

    // Parametrický konstruktor
    public Objednavka(Adresa adresa) {
        this.adresa = adresa;
        this.knihy = new ArrayList<>();
    }

    // Metoda pro přidání knihy do objednávky
    public void přidejKnihu(Kniha kniha) {
        knihy.add(kniha);
    }

    // Metoda pro výpis objednávky (adresy a seznamu knih)
    public void vypišObjednávku() {
        System.out.println("Adresa: " + adresa);
        System.out.println("Seznam knih:");
        for (Kniha kniha : knihy) {
            System.out.println(kniha);
        }
    }
    public double celkováHmotnost() {
        double celkováHmotnost = 0;
        for (Kniha kniha : knihy) {
            celkováHmotnost += kniha.getHmotnost();
        }
        return celkováHmotnost;
    }
    public void vypišKnihyOdAutora(String autor) {
        System.out.println("Knihy od autora " + autor + ":");
        for (Kniha kniha : knihy) {
            if (kniha.getAutor().equals(autor)) {
                System.out.println(kniha);
            }
        }
    }
    
    public void vypišKnihyPodleŽánruDelšíNež(String žánr, int početStránek) {
        System.out.println("Knihy žánru " + žánr + " delší než " + početStránek + " stran:");
        for (Kniha kniha : knihy) {
            if (kniha.getŽánr().equals(žánr) && kniha.getPočetStran() > početStránek) {
                System.out.println(kniha);
            }
        }
    }
    
    public int početBalíků(int maxHmotnostBalíku) {
        double celkováHmotnost = celkováHmotnost();
        int početBalíků = (int) Math.ceil(celkováHmotnost / maxHmotnostBalíku);

        System.out.println("Objednávka bude rozdělena na " + početBalíků + " balíků:");

        for (int i = 0; i < početBalíků; i++) {
            double hmotnostBalíku = Math.min(maxHmotnostBalíku, celkováHmotnost);
            ArrayList<Kniha> knihyVBalíku = new ArrayList<>();

            for (Kniha kniha : knihy) {
                if (kniha.getHmotnost() <= hmotnostBalíku) {
                    knihyVBalíku.add(kniha);
                }
            }

            System.out.println("Balík " + (i + 1) + ":");
            for (Kniha kniha : knihyVBalíku) {
                System.out.println(kniha);
            }

            celkováHmotnost -= hmotnostBalíku;
        }

        return početBalíků;
    }
    
    
    public void uložObjednávkuDoSouboru(String soubor) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(soubor))) {
            // Nejdříve zapisujeme adresu
            writer.write("Adresa: " + adresa + "\n");
            // Poté seznam knih
            writer.write("Seznam knih:\n");
            for (Kniha kniha : knihy) {
                writer.write(kniha.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
