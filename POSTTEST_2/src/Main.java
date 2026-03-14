import java.util.*;

public class Main {
    static ArrayList<BatuAkik> daftarBatu = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Koleksi Batu Akik ===");
            System.out.println("1. Tambah Batu");
            System.out.println("2. Lihat Batu");
            System.out.println("3. Perbarui Batu");
            System.out.println("4. Hapus Batu");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1 -> tambah();
                case 2 -> lihat();
                case 3 -> perbarui();
                case 4 -> hapus();
            }
        } while (pilihan != 0);
        System.out.println("Terimakasih.");
    }

    public static void tambah(){
        System.out.print("Masukkan nama batu : ");
        String nama = input.nextLine();
        System.out.print("Masukkan asal batu : ");
        String asal = input.nextLine();
        System.out.print("Masukkan harga batu : Rp ");
        int harga = input.nextInt();
        input.nextLine();

        BatuAkik batu = new BatuAkik();
        batu.setNama(nama);
        batu.setAsal(asal);
        batu.setHarga(harga);
        daftarBatu.add(batu);
        System.out.println("Data berhasil ditambahkan.");
    }

    public static void lihat(){
        if (daftarBatu.isEmpty()){
            System.out.println("Data batu kosong.");
            return;
        }
        for (BatuAkik batu : daftarBatu){
            System.out.println("\nNama : " + batu.getNama());
            System.out.println("Asal : " + batu.getAsal());
            System.out.println("Harga : Rp " + batu.getHarga());
            batu.tampilkanKategori();
        }
    }

    public static void perbarui(){
        lihat();
        System.out.print("\nMasukkan nama batu yang ingin diperbarui : ");
        String cari = input.nextLine();

        for (BatuAkik batu : daftarBatu){
            if (batu.getNama().equalsIgnoreCase(cari)){
                System.out.print("Nama baru : ");
                batu.setNama(input.nextLine());
                System.out.print("Asal baru : ");
                batu.setAsal(input.nextLine());
                System.out.print("Harga baru : Rp ");
                batu.setHarga(input.nextInt());
                input.nextLine();
                System.out.println("Data berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Batu tidak ditemukan.");
    }

    public static void hapus(){
        lihat();
        System.out.print("\nMasukkan nama batu yang ingin dihapus : ");
        String cari = input.nextLine();

        Iterator<BatuAkik> it = daftarBatu.iterator();

        while (it.hasNext()){
            BatuAkik batu = it.next();

            if (batu.getNama().equalsIgnoreCase(cari)){
                it.remove();
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }
        System.out.println("Batu tidak ditemukan.");
    }
}