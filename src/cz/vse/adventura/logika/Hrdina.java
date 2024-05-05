package cz.vse.adventura.logika;

import java.util.List;

//Tato část kódu je součástí domácího úkolu: použití dedicnosti
public class Hrdina extends Entita
{
    public Hrdina()
    {
        super("Hrdina", 1);
    }
    private int energie = 100, penize = 0;
    private List<Vec> veci;
    public void spi()
    {
        energie = 100;
    }
    public boolean utrat(int mnozstvi)
    {
        if (penize < mnozstvi) {
            System.out.println(STR."Nemas dost energie.\nEnergie: \{penize}\nPotrebujes: \{mnozstvi}");
            return false;
        }        penize -= mnozstvi;
        return true;
    }
    public void ziskej_penize(int mnozstvi)
    {
        penize += mnozstvi;
    }
    public boolean spotrebuj_energii(int mnozstvi)
    {
        if (energie < mnozstvi) {
            System.out.println(STR."Nemas dost energie.\nEnergie: \{energie}\nPotrebujes: \{mnozstvi}");
            return false;
        }        energie -= mnozstvi;
        return true;
    }
    public void prohod_zbrane()
    {
        Vec temp = soucasna_zbran;
        soucasna_zbran = nahradni_zbran;
        nahradni_zbran = temp;
    }
    public Vec get_zbran()
    {
        return soucasna_zbran;
    }
    public int get_energie()
    {
        return energie;
    }
    public int get_penize()
    {
        return penize;
    }
    private Vec soucasna_zbran, nahradni_zbran;
}
