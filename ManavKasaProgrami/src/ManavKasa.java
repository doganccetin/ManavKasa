import java.util.Scanner;
public class ManavKasa {
    public static void main (String[]args){

        double armut, elma, domates, muz, patlican;
        double armutFiyat= 2.14, elmaFiyat=3.67, domatesFiyat=1.1, muzFiyat=0.95, patlicanFiyat=5.00, kasaToplam;
        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armut=input.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        elma=input.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        domates=input.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        muz=input.nextDouble();
        System.out.print("Patlican Kaç Kilo? : ");
        patlican=input.nextDouble();

        kasaToplam= (armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat) + (muz*muzFiyat) +  (patlican*patlicanFiyat);
        System.out.println("Toplam Tutar : " + kasaToplam + " Olarak Hesaplanmıştır...");


    }
}
