import java.util.Scanner;

        public class Main{
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double acilis, tutar,ucret,km,ToplamUcret;
                System.out.print("Gidilen Yol/KM :");
                km= input.nextDouble();
                acilis=10;
                ucret=2.2;
                System.out.println("KM başı ücret :"+ucret+"TL");
                tutar=acilis+(ucret*km);
                // açılış ücreti 10 TL, 20 TLnin altındaki tutarlar için ödenecek toplam ücret minimum 20TLdir.
                ToplamUcret = tutar<=20 ? 20  : tutar ;
                System.out.println("Toplam Ücret: "+ ToplamUcret +"TL");


            }


        }

