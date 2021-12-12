package com.company;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 7, 9, 0};
        int aranacak = 3;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                varMi = true;
               System.out.println("sayı var");
            }   else {
                System.out.println("sayı yok");
                break;
            }
          }
        }
    }
