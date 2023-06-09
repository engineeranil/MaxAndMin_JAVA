import java.util.Scanner;

public class MaxAndMinDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIR SAYI GIRINIZ ");
        int sayi = sc.nextInt();
        int maxNumber = 0;
        int[] list = new int[]{4, 10, 17, 33, 13, 77};
        maxNumber = list[2];
        for (int i = 0; i < list.length; i++) {
            if (maxNumber < list[i]) {
                maxNumber = list[i];
            }
        }
        System.out.println("MAX SAYI : " + maxNumber);
        System.out.println("--------------------------");
        for (int i = 0; i <= list.length; i++) {
            if (sayi < list[i]) {
                for (int j = sayi; sayi < maxNumber; sayi++) {
                    if (sayi == list[i]) {
                        System.out.println("EN YAKIN SAYI = " + sayi);
                    }


                }
                break;
            }


        }
    }
}