package cz.vse.adventura.logika;

//Tato část kódu je součástí domácího úkolu: použití dedicnosti
public class Zbran extends Vec
{
    public final int level;
    private boolean ranged;
    public Zbran(boolean jeNaDalku, int level, String nazev, int hodnota)
    {
        super(nazev, hodnota);
        this.level = level;
        this.ranged = jeNaDalku;
    }
    public boolean jeNaDalku()
    {
        return ranged;
    }
}
