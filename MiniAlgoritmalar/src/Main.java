import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //SAYİ BULMA
        int[] sayilar={1,2,3,4,5};
        int sayi=4;
        boolean result=false;
        for(int say:sayilar){
            if(say==sayi){
                result=true;
            }
        }
        if (result){
            System.out.println("Sayiniz vardir");
        }else {
            System.out.println("Sayiniz Yoktur");
        }



            //ARKADAŞ SAYİ
        /*
        System.out.println("Lütfen iki Sayi Giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int sayi1Toplami=0;
        int sayi2Toplami=0;
        for (int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                sayi1Toplami+=i;
            }
        }
        for (int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                sayi2Toplami+=j;
            }
        }

        if(sayi1==sayi2Toplami && sayi2==sayi1Toplami){
            System.out.println("Sayiniz Arkadas Sayidir");
        }else {
            System.out.println("Sayiniz Arkadas Sayi Degildir");
        }
        */

        //MUKEMMEL SAYİLAR

        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int toplam=0;
        int sayi=scanner.nextByte();

        for (int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam=toplam+i;
            }
        }
        if(toplam==sayi){
            System.out.println("Sayiniz mukemmel Sayidir");
        }else {
            System.out.println("Sayiniz Mükemmel Değildir");
        }*/


            // KALIN İNCE HARFLER
        /*
        char harf='E';

        switch (harf){
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Kalın Sesli");
            default:
                System.out.println("Ince Sesli");
        }*/




        // ASAL SAYİ

        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int asal=scanner.nextInt();
        boolean kalan = false;
        if(asal<0){
            System.out.println("Sayiniz gecersizdir ");
            return;
        }
        for (int i=2;i<asal;i++){

            if(asal%i==0){
                kalan=true;

            }

        }
        if(kalan){
            System.out.println("sayiniz asal degildir :"+ asal);
        }else {
            System.out.println("sayiniz asaldir :"+asal);
        }*/





    }
}