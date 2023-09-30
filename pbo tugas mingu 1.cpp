#include <iostream>

int main() {
    // Deklarasi variabel
    int angka[5];

    // Input nilai ke dalam array
    for (int i = 0; i < 5; i++) {
        std::cout << "Masukkan angka ke-" << i + 1 << ": ";
        std::cin >> angka[i];
    }

    // Output nilai yang dimasukkan
    std::cout << "Nilai yang dimasukkan: ";
    for (int i = 0; i < 5; i++) {
        std::cout << angka[i] << " ";
    }
    std::cout << std::endl;

    // Penggunaan if
    if (angka[0] > angka[1]) {
        std::cout << "Angka pertama lebih besar dari angka kedua." << std::endl;
    } else {
        std::cout << "Angka kedua lebih besar dari angka pertama." << std::endl;
    }

    // Penggunaan while
    int n = 0;
    while (n < 5) {
        std::cout << "Iterasi ke-" << n + 1 << std::endl;
        n++;
    }

    // Penggunaan do while
    int m = 0;
    do {
        std::cout << "Iterasi ke-" << m + 1 << std::endl;
        m++;
    } while (m < 5);

    return 0;
}

