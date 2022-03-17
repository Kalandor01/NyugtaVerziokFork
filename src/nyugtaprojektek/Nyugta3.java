package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3
{
    public static void csillagok() {
        System.out.println("********************");
    }
    public static void duplaVonal() {
        System.out.println("====================");
    }
    public static void szaggatottVonal() {
        System.out.println("--------------------");
    }
    
    public static void tetelek_kiir(int[] tetelek, String penznem)
    {
        for (int x = 0; x < tetelek.length; x++)
        {
            String tetel_num = "Tétel " + (x+1);
            System.out.printf("%10s: %5d %s\n", tetel_num, tetelek[x], penznem);
        }
    }

    public static void main(String[] args) {
        final String HUF = "Ft";
        int[] tetelek = new int[] {350, 90, 1320};
        
        csillagok();
        System.out.printf("%14s\n", "Nyugta 3");
        csillagok();
        tetelek_kiir(tetelek, HUF);
        duplaVonal();
        int osszesen = 0;
        for (int tetel : tetelek) {
            osszesen += tetel;
        }
        //System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        szaggatottVonal();
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        duplaVonal();
        
        int fizetendo = osszesen + szervizDij;
        //System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        //HUF = "\u20ac";//EZ NEM JÓ!!!!
        final String eur = "\u20ac";
        //System.out.printf("            %f %s\n", euro, eur);
        
        /* 7.2 7 szélesen 2 tizedessel,a max: 1234.99
        *  a %10s  egy "" -t ír ki, ezzel tolom beljebb
        */
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        szaggatottVonal();
        
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        
        csillagok();
        System.out.println("        CÉG");
        csillagok();
    }

}
