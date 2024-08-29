//built-in : c deki kütüphaneler.

import DortIslem.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        String isim = data.nextLine();
        System.out.println("Merhaba "+isim);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(5,6));
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}