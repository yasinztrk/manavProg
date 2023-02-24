import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg1,kg2,kg3,kg4,kg5,armutkg=2.14,elmakg=3.67,domkg=1.11,muzkg=0.95,patlıkg=5.00;
        Scanner input= new Scanner(System.in);
        double armut,elma,muz,dom,pat;




        System.out.print("Armut Kaç Kilo ? :");
        kg1=input.nextDouble();
        armut=armutkg*kg1;

        System.out.print("Elma Kaç Kilo ? :");
        kg2=input.nextDouble();
        elma=elmakg*kg2;

        System.out.print("Domates Kaç Kilo ? :");
        kg3=input.nextDouble();
        dom=domkg*kg3;

        System.out.print("Muz Kaç Kilo ? :");
        kg4=input.nextDouble();
        muz=muzkg*kg4;

        System.out.print("Patlıcan Kaç Kilo ? :");
        kg5=input.nextDouble();
        pat=patlıkg*kg5;

        double toplam=(armut+elma+dom+muz+pat);
        System.out.print("Toplam Fiyat :"+toplam);



    }
}