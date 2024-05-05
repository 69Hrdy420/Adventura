package cz.vse.adventura.logika;

import java.util.List;
import java.util.ArrayList;
public class Entita
{
    private static final List<Entita> entity = new ArrayList<>();
    protected int level;
    public final String jmeno;
    private Vec loot;
    protected Entita(String jmeno, int level)
    {
        this.jmeno = jmeno;
        this.level = level;
        vytvorEntitu("hrdina", 1, null);//toto je spatne, predelat!!!!!
        vytvorEntitu("divoké prase", 1, null);
        vytvorEntitu("vlk", 2, null);
        vytvorEntitu("medvěd", 3, null);
        vytvorEntitu("loupežníci", 4, null);
        vytvorEntitu("rytíři", 5, null);
        vytvorEntitu("drak", 6, null);
        vytvorEntitu("čaroděj", 7, null);
    }
    public static Entita get(eEntita entita)
    {
        return entity.get(entita.ordinal());
    }
    private static void vytvorEntitu(String jmeno, int level, Vec vec)
    {
        Entita novaEntita = new Entita(jmeno, level);
        entity.add(novaEntita);
    }
    public String uvod()
    {
        return STR."Potkal jsi \{jmeno} úrovně \{level}.\n";
    }
    public Vec getLoot()
    {
        return loot;
    }
}
