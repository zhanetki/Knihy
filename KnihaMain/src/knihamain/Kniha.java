/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihamain;

/**
 *
 * @author 38067
 */
public class Kniha {
    private String název;
    private String autor;
    private int početStran;
    private String žánr;
    private int hmotnost;

    // Parametrický konstruktor
    public Kniha(String název, String autor, int početStran, String žánr, int hmotnost) {
        this.název = název;
        this.autor = autor;
        this.početStran = početStran;
        this.žánr = žánr;
        this.hmotnost = hmotnost;
    }
// Gettery
    public String getNázev() {
        return název;
    }

    public String getAutor() {
        return autor;
    }

    public int getPočetStran() {
        return početStran;
    }

    public String getŽánr() {
        return žánr;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    // Přetížený toString()
    @Override
    public String toString() {
        return "Kniha{" +
                "název='" + název + '\'' +
                ", autor='" + autor + '\'' +
                ", početStran=" + početStran +
                ", žánr='" + žánr + '\'' +
                ", hmotnost=" + hmotnost +
                '}';
    }
    
}
