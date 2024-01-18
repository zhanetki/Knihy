/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package knihamain;


public class KnihaMain {

    public static void main(String[] args) {
       Adresa adresa = new Adresa("Jan Novák", "Hlavní 123", "Praha", "12345");
        Objednavka objednávka = new Objednavka(adresa);

        Kniha kniha1 = new Kniha("Hobit", "J.R.R. Tolkien", 300, "fantasy", 500);
        Kniha kniha2 = new Kniha("Válka s Mloky", "Karel Čapek", 200, "sci-fi", 400);

        objednávka.přidejKnihu(kniha1);
        objednávka.přidejKnihu(kniha2);

        objednávka.vypišObjednávku();
        
        System.out.println("");
        
        objednávka.vypišKnihyOdAutora("Karel Čapek");
        
        objednávka.uložObjednávkuDoSouboru("knihy.csv");
        
        
        
    }
    
}
