package com.company;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 7, 9, 0};
        int aranacak = 3;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
             mesajVer(aranacak);}
        else{
            System.out.println("sayı yok"+ aranacak);

        }

    }
    public static void mesajVer(int aranacak){
        System.out.println("sayı var" + aranacak);
    }
}
