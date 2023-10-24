package SCRIPT;

import java.util.Scanner;

public class TugasArray17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Banyak Nilai : ");
        int length = input.nextInt();

        int[] nilai = new int[length];
        int jumlah = 0, temp = 0;
        double rataRata;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan Nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            jumlah += nilai[i];
        }

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 1; j < nilai.length - i; j++) {
                // Ascending Sorting
                if (nilai[j - 1] > nilai[j]) {
                    temp = nilai[j - 1];
                    nilai[j - 1] = nilai[j];
                    nilai[j] = temp;
                }
            }
        }

        System.out.println("Nilai Tertinggi : " + nilai[length - 1]);
        System.out.println("Nilai Terendah : " + nilai[0]);
        rataRata = jumlah / nilai.length;
        System.out.println("Rata-Rata Nilai : " + rataRata);

    }
}
