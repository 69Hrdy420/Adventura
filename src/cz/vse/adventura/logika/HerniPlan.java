package cz.vse.adventura.logika;


/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2016/2017
 */
public class HerniPlan {
    
    private Prostor aktualniProstor;
    
     /**
     *  Konstruktor který vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví halu.
     */
    public HerniPlan() {
        zalozProstoryHry();

    }
    /**
     *  Vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví domeček.
     */
    private void zalozProstoryHry()
    {
        Prostor vez3 = new Prostor("věž 3","Věž - poslední podlaží. Zlý čaroděj tady drží princeznu");
        Prostor vez2 = new Prostor("věž 2","Věž - 2. podlaží. Zlý čaroděj drží princeznu v nejvyšším patře.");
        Prostor vez1 = new Prostor("věž 1","Věž - 1. podlaží. Zlý čaroděj drží princeznu v nejvyšším patře.");

        vez3.setVychod(vez2);
        vez2.setVychod(vez3);
        vez2.setVychod(vez1);
        vez1.setVychod(vez2);

        Prostor hlubokyLes = new Prostor("hluboký_les","Hluboký les je velmi nebezpečný. Potuluj se zde s opatrností");
        Prostor les = new Prostor("les","V lese můžeš lovit zvěř");

        vez1.setVychod(hlubokyLes);
        hlubokyLes.setVychod(vez1);
        hlubokyLes.setVychod(les);
        les.setVychod(hlubokyLes);

        Prostor vesnice = new Prostor("vesnice","Vítej ve vesnici, můžeš se potulovat kolem nebo vyjít do lesa");
        Prostor kovarna = new Prostor("kovárna","Zde můžeš nakoupit veškeré vybavení");
        Prostor domov = new Prostor("domov","Můžeš se zde vyspat a doplnit tak svojí energii");
        Prostor trznice = new Prostor("tržnice", "Zde můžeš prodávat své věci");

        les.setVychod(vesnice);
        vesnice.setVychod(les);

        vesnice.setVychod(kovarna);
        kovarna.setVychod(vesnice);

        vesnice.setVychod(domov);
        domov.setVychod(vesnice);

        vesnice.setVychod(trznice);
        trznice.setVychod(domov);
                
        aktualniProstor = vesnice;
    }
    
    /**
     *  Metoda vrací odkaz na aktuální prostor, ve ktetém se hráč právě nachází.
     *
     *@return     aktuální prostor
     */
    
    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }
    
    /**
     *  Metoda nastaví aktuální prostor, používá se nejčastěji při přechodu mezi prostory
     *
     *@param  prostor nový aktuální prostor
     */
    public void setAktualniProstor(Prostor prostor) {
       aktualniProstor = prostor;
    }

}
