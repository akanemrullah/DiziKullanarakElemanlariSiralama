import java.util.Scanner; // Kullanicidan veri alabilmek icin kutuphanemiz projeseye dahil edildi.
import java.util.Arrays; // Arrayler ile alakali java fonksiyonlarini kullanabilmemiz adina kutuphanemiz projeseye dahil edildi.

public class Main {

    // Main blokta tanimlayip boyunu belirttigimiz dizimize for dongusu yardimiyla degerler atiyoruz.
    static void addValue(int[] list, int size) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + ". elemani gir: ");
            list[i] = input.nextInt();
        }
    }

    // Arrays kutuphanesi fonksiyonuyla kolayca siralayabiliyoruz.
    static void sort(int[] list) {
        Arrays.sort(list);
    }

    // Boyutu belirlenip metotlar yardimiyla degerler atanan ve bu degerleri siralanan dizimizi dogrudan bastiriyoruz
    static void print(int[] list, int size) {

        System.out.println("Diziye eklenen sayilar siralandi.");

        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". Sayi: " + list[i]);
        }
    }


    public static void main(String[] args) {

        // Gerekli degiskenler atandi.
        int[] list;
        int size;

        // Kullanicidan veri alabilmek adina Scanner sinifi projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Dizinin boyutu alinip size degiskenine atandi.
        System.out.print("Dizinin boyutunu gir: ");
        size = input.nextInt();
        list = new int[size];

        // Yukarida tanimlanip boyutu atanan dizimiz icin sirasiyla diziye deger ekleyen, siralayan ve bastiran metotlar cagirildi.
        addValue(list, size);
        sort(list);
        print(list, size);
    }
}