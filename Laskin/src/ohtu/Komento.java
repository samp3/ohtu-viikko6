/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author sampe
 */
public abstract class Komento {

    private int vanha;
    private Sovelluslogiikka sovellus;
    private JTextField syotekentta;
    private JTextField tuloskentta;

    public Komento(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta, int vanhaTuloskentta) {
        this.vanha = vanhaTuloskentta;
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }

    abstract void suorita();

    public void peru() {
        sovellus.set(vanha);
    }
}
