import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] myList={25,15,36,24.45,69};
        double total=0;
        double max=myList[0];

        for (double list:myList){

            total=total+list;
            if(max<list){
                max=list;
            }

        }
        System.out.println("Total :"+total);
        System.out.println("Max :"+max);





        /*System.out.println("Sayilari giriniz");

        Scanner scanner=new Scanner(System.in);
        double sayi1=scanner.nextByte();

        double sayi2=scanner.nextByte();
        double sayi3=scanner.nextByte();


        double enBuyuk=sayi1;


        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }else if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
            System.out.println("En Buyuk Deger :"+enBuyuk);

        /*if(sayi1>sayi2&&sayi1>sayi3){
            System.out.println("En Büyük sayi:"+sayi1);
        }else if (sayi2>sayi1&&sayi2>sayi3){
            System.out.println("En Büyük Sayi :"+sayi2);
        }else {
            System.out.println("En Büyük Sayi :"+sayi3);
        }*/

    }
}