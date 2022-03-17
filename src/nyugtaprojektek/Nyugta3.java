package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3
{
    public static void kiir_line(String jel) {
        for (int x = 0; x < 20; x++) {
            System.out.print(jel);
        }
        System.out.println();
    }

    
    public static void tetelek_kiir(int[] tetelek, String penznem)
    {
        for (int x = 0; x < tetelek.length; x++)
        {
            String tetel_num = "Tétel " + (x+1);
            System.out.printf("%10s: %5d %s\n", tetel_num, tetelek[x], penznem);
        }
    }
    
    public static void keltezes()
    {
        final String rovidVonal = "_______";
        final String rovidVonalValaszto = "      ";
        System.out.println();
        System.out.println(rovidVonal + rovidVonalValaszto + rovidVonal);
        System.out.println(" Dátum" + rovidVonalValaszto + "   Név");
        kiir_line("*");
        System.out.printf("%11s\n", "CÉG");
        kiir_line("*");
    }

    public static void main(String[] args) {
        //változók
        final String HUF = "Ft";
        final String eur = "\u20ac";
        int szervizDijMertek = 10;
        int[] tetelek = new int[] {350, 90, 1320};
        //header
        kiir_line("*");
        System.out.printf("%14s\n", "Nyugta 3");
        kiir_line("*");
        tetelek_kiir(tetelek, HUF);
        //összesen
        kiir_line("=");
        int osszesen = 0;
        for (int tetel : tetelek) {
            osszesen += tetel;
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        kiir_line("-");
        //szervízdíj
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        kiir_line("=");
        //fizetendő
        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        System.out.printf("%10s%7.2f %s\n","", euro, eur);
        kiir_line("-");
        keltezes();
    }

}
