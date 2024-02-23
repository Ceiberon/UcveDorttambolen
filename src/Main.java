import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k ;  // Kullanıcı Tarafından girilen değer
        int sum = 0, count = 0 ; // Döngüdeki sayılara toplama
        Scanner ipn = new Scanner(System.in);

        System.out.println("Sayınızı giriniz : ");
        k = ipn.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {


                System.out.println(i);    // BÖLÜNEN SAYILARI YAZDIRAN KOD 12,24 OUTPUT

                sum += i; // Her uygun sayıyı toplama ekle
                count++; // Her uygun sayı için sayaç artır
            }

        }
        if (count > 0) {
double average = (double) sum / count; // Ortalama hesapla
            System.out.println("Sayıların Ortalaması: " + average);
        } else {
                System.out.println("Girilen aralıkta 3 ve 4'e tam bölünebilen sayı yok.");
        }
                }
    }


