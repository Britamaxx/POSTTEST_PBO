import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        ArrayList<BatuAkik> DaftarBatu = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Koleksi Batu Akik ===");
            System.out.println("1. Tambah Batu");
            System.out.println("2. Lihat Batu");
            System.out.println("3. Perbarui Batu");
            System.out.println("4. Hapus Batu");
            System.out.println("0. Exit");
            System.out.println("Masukkan Pilihan:");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1 -> Tambah(DaftarBatu, input);
                case 2 -> Lihat(DaftarBatu);
                case 3 -> Perbarui(DaftarBatu, input);
                case 4 -> Hapus(DaftarBatu, input);
            }
        } while (pilihan != 0);
        System.out.println("Terimakasih.");
    }

    static void Tambah(ArrayList<BatuAkik> DaftarBatu, Scanner input){
        String nama;
        String asal;
        int harga;

        System.out.println("Masukkan nama batu:");
        nama = input.nextLine();
        System.out.println("Masukkan asal batu:");
        asal = input.nextLine();
        System.out.println("Masukkan harga batu:");
        harga = input.nextInt();
        input.nextLine();

        BatuAkik batu = new BatuAkik(nama, asal ,harga);
        DaftarBatu.add(batu);
        System.out.println("Data berhasil ditambahkan.");
    }

    static void Lihat(ArrayList<BatuAkik> DaftarBatu){
        if (DaftarBatu.isEmpty()){
            System.out.println("Batu tidak ada.");
        } else {
            for (BatuAkik batu : DaftarBatu){
                System.out.println("\nNama Batu : " + batu.nama);
                System.out.println("Asal Batu : " + batu.asal);
                System.out.println("Harga Batu : Rp " + batu.harga);
            }
        }
    }

    static void Perbarui(ArrayList<BatuAkik> DaftarBatu, Scanner input){
        if (DaftarBatu.isEmpty()){
            System.out.println("Batu tidak ada.");
            return;
        }
        Lihat(DaftarBatu);
        System.out.println("\nMasukkan nama batu yang ingin diperbarui : ");
        String cari = input.nextLine();
        boolean ditemukan = false;

        for (BatuAkik batu : DaftarBatu){
            if (batu.nama.equalsIgnoreCase(cari)){
                System.out.println("Nama baru : ");
                batu.nama = input.nextLine();
                System.out.println("Asal baru : ");
                batu.asal = input.nextLine();
                System.out.println("Harga baru : Rp ");
                batu.harga = input.nextInt();
                input.nextLine();

                System.out.println("Data berhasil diperbarui.");

                ditemukan = true;
                break;
            }
        }
        if (!ditemukan){
            System.out.println("Batu tidak ditemukan.");
        }
    }

    static void Hapus(ArrayList<BatuAkik> DaftarBatu, Scanner input){
        if (DaftarBatu.isEmpty()) {
            System.out.println("Batu tidak ada.");
            return;
        }
        Lihat(DaftarBatu);
        System.out.println("Masukkan nama batu yang ingin dihapus : ");
        String cari = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < DaftarBatu.size(); i++){
            if (DaftarBatu.get(i).nama.equalsIgnoreCase(cari)){
                DaftarBatu.remove(i);
                System.out.println("Data berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan){
            System.out.println("Batu tidak ditemukan.");
        }
    }
}