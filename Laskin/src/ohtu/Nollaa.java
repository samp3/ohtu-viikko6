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
public class Nollaa extends Komento {
    private Sovelluslogiikka sovellus;
    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus,tuloskentta,syotekentta,0);
        this.sovellus = sovellus;
    }
    
    

    @Override
    public void suorita() {
    this.sovellus.nollaa();
    }

    


    
}
