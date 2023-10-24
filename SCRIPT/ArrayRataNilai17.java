package SCRIPT;

import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int length = input.nextInt();

        int[] nilaiMhs = new int[length];
        double total = 0, totalTidakLulus = 0;
        double rata2, rataTidakLulus;
        int counter = 0, counter2 = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                counter++;
                total += nilaiMhs[i];
            } else {
                totalTidakLulus += nilaiMhs[i];
                counter2++;
            }
        }

        System.out.println("Jumlah Mahasiswa yang Lulus Adalah : " + counter);
        rata2 = total / counter;
        System.out.println("Rata-Rata Nilai Lulus = " + rata2);
        rataTidakLulus = totalTidakLulus / counter2;
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}