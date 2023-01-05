import java.util.Scanner;

public class dasdad {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] matriksA;
    int[][] matriksB;
    int[][] hasil;

    System.out.print("Masukkan jumlah baris matriks A: ");
    int barisA = input.nextInt();
    System.out.print("Masukkan jumlah kolom matriks A: ");
    int kolomA = input.nextInt();

    matriksA = new int[barisA][kolomA];

    System.out.println("Masukkan elemen-elemen matriks A:");
    for (int i = 0; i < barisA; i++) {
      for (int j = 0; j < kolomA; j++) {
        matriksA[i][j] = input.nextInt();
      }
    }

    System.out.print("Masukkan jumlah baris matriks B: ");
    int barisB = input.nextInt();
    System.out.print("Masukkan jumlah kolom matriks B: ");
    int kolomB = input.nextInt();

    matriksB = new int[barisB][kolomB];

    System.out.println("Masukkan elemen-elemen matriks B:");
    for (int i = 0; i < barisB; i++) {
      for (int j = 0; j < kolomB; j++) {
        matriksB[i][j] = input.nextInt();
      }
    }

    if (kolomA != barisB) {
      System.out.println("Matriks tidak dapat dikalikan satu sama lain.");
    } else {
      hasil = new int[barisA][kolomB];

      // Melakukan perkalian matriks
      for (int i = 0; i < barisA; i++) {
        for (int j = 0; j < kolomB; j++) {
          for (int k = 0; k < kolomA; k++) {
            hasil[i][j] += matriksA[i][k] * matriksB[k][j];
          }
        }
      }

      // Menampilkan hasil perkalian matriks
      for (int i = 0; i < barisA; i++) {
        for (int j = 0; j < kolomB; j++) {
          System.out.print(hasil[i][j] + " ");
        }
        System.out.println();
      }
    }

    input.close();
  }
}
