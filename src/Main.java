import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Gerekli değişkenlerimizi ve scanner sınıfımızı tanımladık
        int matematik,fizik, kimya, turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik) /6.0;
        String sonuc = (ortalama)>60 ? "Sınıfı Geçti ":"Sınıfta Kaldı ";

        System.out.println("Ortalama : "+ortalama);
    }
}