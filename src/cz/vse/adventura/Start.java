package cz.vse.adventura;

import cz.vse.adventura.logika.Hra;
import cz.vse.adventura.uiText.TextoveRozhrani;
import cz.vse.adventura.logika.MyRandom;

//TODO
//PREDELAT VYTVORENI HRDINY UVNITR TRIDY ENTITA!!!!!!!!

//UKOLY
//POUZITI DEDICNOSTI
    //TRIDA Hrdina
    //TRIDA Zbran
//POUZITI NAVRHOVYCH VZORU
    //TRIDA eEntita
    //TRIDA MyRandom (2x)

public class Start
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        MyRandom.initialize();
        Hra hra = new Hra();
        TextoveRozhrani ui = new TextoveRozhrani(hra);
        ui.hraj();
    }
}
