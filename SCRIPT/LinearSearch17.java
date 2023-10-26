package SCRIPT;

import java.util.Scanner;

public class LinearSearch17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Elemen Array : ");
        int length = input.nextInt();
        int[] arrayInt = new int[length];
        int key;
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukan Nilai Elemen Ke-" + (i + 1) + " : ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukan Nilai yang Dicari : ");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil == -1) {
            System.out.println("Key Tidak Ditemukan!");
        } else {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        }
    }
}
