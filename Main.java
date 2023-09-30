import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        int[] angka = new int[5];

        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input nilai ke dalam array
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Output nilai yang dimasukkan
        System.out.print("Nilai yang dimasukkan: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Penggunaan if
        if (angka[0] > angka[1]) {
            System.out.println("Angka pertama lebih besar dari angka kedua.");
        } else {
            System.out.println("Angka kedua lebih besar dari angka pertama.");
        }

        // Penggunaan while
        int n = 0;
        while (n < 5) {
            System.out.println("Iterasi ke-" + (n + 1));
            n++;
        }

        // Penggunaan do while
        int m = 0;
        do {
            System.out.println("Iterasi ke-" + (m + 1));
            m++;
        } while (m < 5);

        // Menutup scanner
        input.close();
    }
}
