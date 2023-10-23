package SCRIPT;

import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan Nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus! ");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus!");
            }
        }
    }
}