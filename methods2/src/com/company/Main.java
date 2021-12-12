package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi=toplam(5,2);
        System.out.println(sayi);
        int toplam=topla2(2,4,5,6,7,8,10,10);
        System.out.println(toplam);
    }

    public static  void  ekle(){
    System.out.println("eklendi");

    }
    public static  void  sil(){
        System.out.println("silindi");

    }
    public static  void  güncelle(){
        System.out.println("güncellendi");

    }
    public static int toplam(int say1, int say2){
        return say1+say2;
    }

    public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }return toplam;
       }

}
