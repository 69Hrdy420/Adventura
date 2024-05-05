package cz.vse.adventura.logika;
import java.util.Random;

//Tato část kódu je součástí domácího úkolu: použití Singleton
//Tato část kódu je součástí domácího úkolu: použití Utility class

public class MyRandom
{
    private static Random random;
    public static void initialize()
    {
        if (random == null)
        {
            random = new Random();
        }
    }
    public static int num(int max)
    {
        return random.nextInt(max + 1);
    }
}
