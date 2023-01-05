import java.util.Scanner;

public class i {
  public static void main(String[] args) {
    // Membuat array bernama bilangan dengan 5 elemen
    int[] bilangan = new int[5];

    // Membuat objek Scanner untuk membaca input dari pengguna
    Scanner input = new Scanner(System.in);

    // Meminta input 5 bilangan dari pengguna
    System.out.print("BILANGAN INDEX KE 0 = ");
    bilangan[0] = input.nextInt();
    System.out.print("BILANGAN INDEX KE 1 = ");
    bilangan[1] = input.nextInt();
    System.out.print("BILANGAN INDEX KE 2 = ");
    bilangan[2] = input.nextInt();
    System.out.print("BILANGAN INDEX KE 3 = ");
    bilangan[3] = input.nextInt();
    System.out.print("BILANGAN INDEX KE 4 = ");
    bilangan[4] = input.nextInt();

    // Menghitung total dari kelima bilangan
    int total = bilangan[0] + bilangan[1] + bilangan[2] + bilangan[3] + bilangan[4];

    // Menampilkan total kelima bilangan
    System.out.println("TOTAL KE 5 BILANGAN ADALAH " + total);
  }
}

