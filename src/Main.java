
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

      // kdv();

      //  taksimetre();

       // boykiloendeks();

       // manav();

        // ortsinif();

        // sinifgecme();
       // havasicakligi();

        // login();
        // biletfiyati();

        // listedeciftbul();
        // hesapmakinesi();
    }
    public static void kdv(){

        Double tutar;
        double kdv;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Tutarınızı giriniz: ");
        tutar = girdi.nextDouble();

        kdv = (tutar * 18) / 100;
        Double tutarson = tutar + kdv;

        System.out.println("KDVli tutar:" +tutarson);
        System.out.println("KDV miktarı:" + kdv);




    }

    public static void sinifgecme(){

        Scanner input = new Scanner(System.in);

        int turkce, mat, fizik, kimya, biyoloji, tarih, muzik;


        System.out.println("Lütfen türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.println("Lütfen mat notunuzu giriniz:");
        mat = input.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.println("Lütfen biyoloji notunuzu giriniz:");
        biyoloji = input.nextInt();

        System.out.println("Lütfen tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.println("Lütfen muzik notunuzu giriniz:");
        muzik = input.nextInt();

        System.out.println("Lütfen fizik notunuzu giriniz:");
        fizik = input.nextInt();

        Integer ort = (turkce + kimya + mat + biyoloji + tarih + muzik + fizik) / 7;

        if (ort>85){

            System.out.println("Ortalamanız: "+ort+" ve 5 ile geçtiniz.");
        }

        else if(ort >= 65 && ort <= 84){

            System.out.println("Ortalamanız: "+ort+" ve 4 ile geçtiniz.");
        }

        else if(ort >= 50 && ort <= 64){

            System.out.println("Ortalamanız: "+ort+" ve 3 ile geçtiniz.");
        }

        else if(ort >= 35 && ort <= 49){

            System.out.println("Ortalamanız: "+ort+" ve 2 ile kaldınız.");


         }
        else
        {
            System.out.println("Ortalamanız: "+ort+" ve 1 ile kaldınız.");
        }


    }
    public static void taksimetre(){

        int km;
        int acilis = 10;
        double hesap= 2.20;
        double tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Girilecek KM miktarını giriniz: ");
        km = input.nextInt();


        tutar = (km*hesap) + acilis;

        if (tutar<20){
            tutar=20;

        }


        System.out.print("Hesaplama:"+tutar);



    }


    public static void boykiloendeks(){
         double boy;
         double kilo;
         double endeks;

         Scanner girdi = new Scanner(System.in);


         System.out.print("Lütfen boyunuzu giriniz: ");
         boy = girdi.nextDouble();

         boy = boy / 100;

         System.out.print("Lütfen kilonuzu giriniz: ");
         kilo = girdi.nextDouble();

         endeks = kilo / (boy * boy);

        System.out.print("Kilo endeksiniz:" + endeks);


        if(endeks >= 80){
            System.out.print("Obezsiniz.");


        } else if (endeks >= 50 && endeks <= 79) {
            System.out.print("Normal kilodasınız.");
        }

        else if (endeks >= 20 && endeks <= 49){
            System.out.print("Zayıfsınız");
        }
        else{
            System.out.print("Yoksunuz.");
        }

    }


    public static void manav(){

        int muz, kivi, cilek, erik, ayva;

        int toplam;

        int tutar;

        Scanner kilo = new Scanner(System.in);

        System.out.print("Muz kaç kilo?: ");
        muz = kilo.nextInt();

        int muztutar = muz * 5;

        System.out.print("Kivi kaç kilo?: ");
        kivi = kilo.nextInt();

        int kivitutar = muz * 8;

        System.out.print("Cilek kaç kilo?: ");
        cilek = kilo.nextInt();

        int cilektutar = muz * 9;

        System.out.print("Erik kaç kilo?: ");
        erik = kilo.nextInt();

        int eriktutar = muz * 2;

        System.out.print("Ayva kaç kilo?: ");
        ayva = kilo.nextInt();

        int ayvatutar = muz * 11;

        toplam = muz + kivi + cilek + erik + ayva;

        tutar = muztutar + kivitutar + eriktutar + cilektutar + ayvatutar;

        System.out.println("Toplam kilo:" + toplam);

        System.out.println("Toplam tutar:" + tutar );

    }


    public static void hesapmakinesi(){

        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;
        int sonuc;

        System.out.println("Birinci sayiyi giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2= input.nextInt();

        System.out.println("Ne işlem yapmak istersin?: 1-Topla, 2-Çıkar, 3-Böl, 4-Çarp");
        int islem = input.nextInt();

        switch (islem){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuc: " +sonuc);
                break;

            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuc: " +sonuc);
                break;

            case 3:
                sonuc = sayi1 / sayi2;
                System.out.println("Sonuc: " +sonuc);
                break;

            case 4:
                 sonuc = sayi1 * sayi2;
                System.out.println("Sonuc: " +sonuc);
                break;


        }



    }


    public static void login(){

        Scanner input1 = new Scanner(System.in);

        String username, password;


        while (true) {
            System.out.print("Lütfen kullanıcı adını gir: ");
            username = input1.nextLine();

            System.out.print("Lütfen şifrenizi giriniz: ");
            password = input1.nextLine();

            if (username.equals("Ahmet") && password.equals("1234")) {
                System.out.println("Hoş geldin! " + username);
                break;
            } else if (!password.equals("1234")) {
                System.out.println("Kullanıcı adı veya şifre yanlış!");

                    System.out.print("Şifreniz hatalı, yeni şifre giriniz: ");
                    password = input1.nextLine();
                    System.out.println("Şifreniz " + password + " olarak değiştirildi.");

                }
            }

    }

    public static void havasicakligi(){

        Scanner sicaklik = new Scanner(System.in);

        int sicaklikdeger;

        System.out.println("Tahmini sicaklık aralığını giriniz: 1-[-10 - 1] 2-[2 - 10] 3-[11-20] 4-[20 ve üstü] ");
        sicaklikdeger = sicaklik.nextInt();

        switch (sicaklikdeger){
            default:
                System.out.println("Geçerli bir aralık giriniz.");
                break;

            case 1:
                System.out.println("Kayak yapınız.");
                break;


            case 2:
                System.out.println("Yürüyüş yapınız.");
                break;

            case 3:
                System.out.println("Piknik yapınız.");
                break;

            case 4:
                System.out.println("Yüzme yapınız.");
                break;
        }

    }

    public static void listedeciftbul(){
        int ciftadet = 0;
        int tekadet = 0;
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            int ciftyakala = i % 2;
            if (ciftyakala == 0){
                System.out.println(i + " sayi çifttir.");
               ciftadet++;


            }
            else{
                System.out.println(i + " sayi tektir.");
                tekadet++;

            }
        }
        System.out.println("Listedeki çift sayıların miktarı: " + ciftadet);
        System.out.println("Listedeki tek5 sayıların miktarı: " + tekadet);


    }

    public static void biletfiyati(){

        double km;
        int yas;
        int bilettip;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen mesafeyi giriniz: ");
        km = input.nextInt();

       double km1 = km * 0.10;

        System.out.println("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Lütfen bilet tipinizi giriniz: 1- Tek giriş 2- Gidiş geliş");
        bilettip = input.nextInt();

        if(yas<12){
          double km2= (km1 * 50) / 100;
          double km3 = km1 - km2;


            if (bilettip == 2){
                km3 = km3 - ((km3 * 20) / 100);
                System.out.println(km3);
            }
            if (bilettip == 1){
                System.out.println(km3);
            }
            else {
                System.out.println("Hatalı bilet tipi girdiniz!");
            }


        }
        else if(yas > 12 && yas < 65){
            double km2= (km1 * 10) / 100;
            double km3 = km1 - km2;


            if (bilettip == 2){
                km3 = km3 - ((km3 * 20) / 100);
                System.out.println(km3);
            }
            if(bilettip == 1){
                System.out.println(km3);
            }
            else {
                System.out.println("Hatalı bilet tipi girdiniz!");
            }


        }
        else if(yas > 65){
            double km2= (km1 * 30) / 100;
            double km3 = km1 - km2;


            if (bilettip == 2){
              km3 = km3 - ((km3 * 20) / 100);
                System.out.println(km3);
            }
            if (bilettip == 1){
                System.out.println(km3);
            }
            else {
                System.out.println("Hatalı bilet tipi girdiniz!");
            }

        }



    }

    public static void ortsinif(){

           System.out.println("Sisteme hoş geldin.");

        int matnotu, fiziknotu, turkcenotu, muziknotu,tarihnotu,kimyanotu;

        int toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen mat notunuzu giriniz:");
        matnotu = input.nextInt();

        System.out.println("Lütfen fizik notunuzu giriniz:");
        fiziknotu = input.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz:");
        kimyanotu = input.nextInt();


        System.out.println("Lütfen turkce notunuzu giriniz:");
        turkcenotu = input.nextInt();

        System.out.println("Lütfen tarih notunuzu giriniz:");
        tarihnotu = input.nextInt();

        System.out.println("Lütfen muzik notunuzu giriniz:");
        muziknotu = input.nextInt();

        toplam = matnotu + fiziknotu + turkcenotu + muziknotu + tarihnotu + kimyanotu;
        Integer sonuc= toplam / 6;

        System.out.println("Ort:" +sonuc);

        String durum = (sonuc > 60) ? "Sınıfı geçtiniz" : "Sınıfta kaldıniz";
        System.out.println("Durumunuz: " + durum);
    }

}