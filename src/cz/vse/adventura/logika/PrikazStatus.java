package cz.vse.adventura.logika;

/**
 *  Třída PrikazNapoveda implementuje pro hru příkaz napoveda.
 *  Tato třída je součástí jednoduché textové hry.
 *
 *@author     Jarmila Pavlickova, Luboš Pavlíček
 *@version    pro školní rok 2016/2017
 *
 */
class PrikazStatus implements IPrikaz {

    private static final String NAZEV = "Status";
    private Hrdina hrdina;
    public PrikazStatus(Hrdina hrdina) {
        this.hrdina = hrdina;
    }
    @Override
    public String provedPrikaz(String... parametry)
    {
        return "Energie: " + hrdina.get_energie() + "\n" +
                "Penize: " + hrdina.get_penize() + "\n";
    }

    /**
     *  Metoda vrací název příkazu (slovo které používá hráč pro jeho vyvolání)
     *
     *  @ return nazev prikazu
     */
    @Override
    public String getNazev() {
        return NAZEV;
    }

}
