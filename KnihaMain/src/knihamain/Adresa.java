/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihamain;

/**
 *
 * @author 38067
 */
public class Adresa {
    private String jméno;
    private String uliceČíslo;
    private String město;
    private String PSČ;

    // Parametrický konstruktor
    public Adresa(String jméno, String uliceČíslo, String město, String PSČ) {
        this.jméno = jméno;
        this.uliceČíslo = uliceČíslo;
        this.město = město;
        this.PSČ = PSČ;
    }
}
