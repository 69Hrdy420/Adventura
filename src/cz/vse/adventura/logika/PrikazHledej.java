package cz.vse.adventura.logika;

public class PrikazHledej implements IPrikaz
{
    private static final String NAZEV = "hledej";
    private Prostor prostor;
    public PrikazHledej(Prostor prostor)
    {
        this.prostor = prostor;
    }
    @Override
    public String provedPrikaz(String... parametry)
    {
        Entita entita = prostor.get_entita();
        if (entita != null)
            return "";

        Vec vec = prostor.get_vec();
        return "";
    }
    @Override
    public String getNazev() {
        return NAZEV;
    }
}
