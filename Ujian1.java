import java.util.Scanner;
public class Ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama  = M. Eric Chaniago");
        System.out.println("NIM   = 12250311088");
        System.out.println("Kelas = Semester 1'(A)'");
        
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();
        
        int[][] matriks1 = new int[baris][kolom];
        
        System.out.println("Masukkan elemen-elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }
        
        int[][] matriks2 = new int[baris][kolom];
        
        System.out.println("Masukkan elemen-elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }
        
        int[][] hasil = new int[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        
        
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
