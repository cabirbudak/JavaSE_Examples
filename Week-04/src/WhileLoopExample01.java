import java.util.Random;

public class WhileLoopExample01 {
    public static void main(String[] args) {
        int zar1,zar2,deneme=1;
        Random random = new Random();
        int sayac = 0;
        while(true){
            zar1=random.nextInt(6)+1; // +1 Yapmasaydım 0-5 arasında random değer üretecekti.
            zar2=random.nextInt(6)+1;
            sayac++;
            if(zar1==6 && zar2==6){
                System.out.println("--------Bilgisayar "+deneme+" deneme yaparak zarları 6-6 atmayı başardı.");
                break; // Döngüyü kırmak için ekledik.
            }
            {
                System.out.println(deneme+".Deneme -> Atılan İlk Zar: "+ zar1 +"\tAtılan İkinci Zar: "+zar2);
            }
            deneme++;
        }
    }
}