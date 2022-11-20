import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Kaç Kilometre Gideceksiniz: ");
        double km= klavye.nextDouble();
        if (km<0)
            System.err.println("Hatalı Girdiniz.");
        else
        System.out.print("Yaşınızı Girin: ");
        int yas= klavye.nextInt();
        if (yas<0)
            System.err.println("Hatalı Girdiniz.");
        else
        System.out.print("Yolculuk Tipiniz: ");
        int tip= klavye.nextInt();
        if (tip!=1 && tip!=2)
            System.err.println("Hatalı Girdiniz.");


        double tutar=km*0.10;
        if (tip==1) {
            System.out.println("Bilet Fiyatınız: " + tutar);
        }
        else {
            System.out.println("Gidiş-Dönüş Bilet Fiyatınız: " +tutar*2);
        }



        double yasIndirimi=0;
        if (yas<12)
            yasIndirimi=tutar/2;
        else if (yas>=12 && yas<24)
            yasIndirimi=tutar-(tutar/10);
        else if (yas>=65)
            yasIndirimi=tutar-(tutar*3/10);
        else {
            yasIndirimi = yasIndirimi;
        }

        double indirimliBilet=0;
        if (tip==2){
            indirimliBilet=yasIndirimi-(yasIndirimi*0.20);
            indirimliBilet=indirimliBilet*2;
            System.out.println("İndirimli(gidis-donus) Bilet Fiyatınız: " + indirimliBilet);
        }



} }