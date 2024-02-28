import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scanner sınıfını projemize dahil ettik


public class Main {
    public static void main(String[] args) {
        int satir, i, as, yAralik, bosluk, y2;

        Scanner input = new Scanner(System.in);

        System.out.println("Yıldız Satır Adeti: ");
        satir = input.nextInt();

        //Elmaın sol satırlarındaki boşlukları oluşturuyoruz
        for (i = 1; i <= satir; i++) {
            for (as = satir; as > i; as--)//bu for döngümüz ekran çıktısının sol tarafındaki boşlukları ayarlıyor.
            {
                System.out.print(" ");
            }

            //burada elmasın üst kısmını  oluşturuyoruz
            for (yAralik = 1; yAralik <= i; yAralik++)//bu for döngümüzde ise yıldız şeklimizi çıkartıyor ve yıldızların arasındaki boşluğu ayarlıyor
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Burada elmasın alt kısmını oluşturuyoruz
        for (as = 1; as <= satir; as++) {
            for (bosluk = 1; bosluk <= as; bosluk++)
            {
                System.out.print(" ");
            }
            for (y2 = satir; y2 > as; y2--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}