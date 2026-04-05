import java.util.*;

public class Main {
    static ArrayList<BatuAkik> daftarBatu = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = -1;
        do {
            try {
                System.out.println("\n=== Sistem Manajemen Batu Akik ===");
                System.out.println("1. Tambah Batu");
                System.out.println("2. Lihat Koleksi");
                System.out.println("3. Perbarui Batu");
                System.out.println("4. Hapus Batu");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 -> tambah();
                    case 2 -> lihat();
                    case 3 -> perbarui();
                    case 4 -> hapus();
                    case 0 -> System.out.println("Program selesai.");
                    default -> System.out.println("Pilihan tidak tersedia.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan angka yang valid!");
                input.nextLine();
            }
        } while (pilihan != 0);
    }

    public static void tambah() {
        try {
            System.out.println("\n--- Tambah Data ---");
            int jenis;
            while (true) {
                System.out.print("Jenis (1. Mulia / 2. Fosil): ");
                jenis = input.nextInt(); input.nextLine();
                if (jenis == 1 || jenis == 2) break;
                System.out.println("Pilihan jenis hanya 1 atau 2!");
            }

            String nama, asal;
            do {
                System.out.print("Nama Batu: "); nama = input.nextLine().trim();
                if (nama.isEmpty()) System.out.println("Nama tidak boleh kosong!");
            } while (nama.isEmpty());

            do {
                System.out.print("Asal Batu: "); asal = input.nextLine().trim();
                if (asal.isEmpty()) System.out.println("Asal tidak boleh kosong!");
            } while (asal.isEmpty());

            int harga;
            while (true) {
                System.out.print("Harga: "); harga = input.nextInt(); input.nextLine();
                if (harga >= 0) break;
                System.out.println("Harga tidak boleh negatif!");
            }

            if (jenis == 1) {
                System.out.print("Skala Mohs: "); double m = input.nextDouble(); input.nextLine();
                daftarBatu.add(new BatuMulia(nama, asal, harga, m));
            } else {
                System.out.print("Estimasi Usia: "); String u = input.nextLine();
                daftarBatu.add(new BatuFosil(nama, asal, harga, u));
            }
            System.out.println("Berhasil disimpan.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input data tidak sesuai tipe (Harga/Mohs harus angka)!");
            input.nextLine();
        }
    }

    public static void lihat() {
        if (daftarBatu.isEmpty()) {
            System.out.println("\n>>> BELUM ADA DATA BATU <<<");
            return;
        }
        System.out.println("\n--- Koleksi Batu Akik ---");
        for (BatuAkik b : daftarBatu) {
            b.tampilkanInfo();
            System.out.println("-------------------------");
        }
    }

    public static void perbarui() {
        if (daftarBatu.isEmpty()) {
            System.out.println("\n>>> TIDAK ADA DATA UNTUK DIPERBARUI <<<");
            return;
        }

        lihat();
        System.out.print("Nama batu yang akan diubah: ");
        String cari = input.nextLine();

        for (BatuAkik b : daftarBatu) {
            if (b.getNama().equalsIgnoreCase(cari)) {
                try {
                    System.out.print("Nama Baru: "); b.setNama(input.nextLine());
                    System.out.print("Asal Baru: "); b.setAsal(input.nextLine());

                    System.out.print("Harga Baru: ");
                    int h = input.nextInt(); input.nextLine();
                    if (h < 0) {
                        System.out.println("Harga negatif tidak disimpan (tetap harga lama).");
                    } else {
                        b.setHarga(h);
                    }

                    if (b instanceof BatuMulia) {
                        System.out.print("Skala Mohs Baru: ");
                        ((BatuMulia) b).setSkalaMohs(input.nextDouble()); input.nextLine();
                    } else if (b instanceof BatuFosil) {
                        System.out.print("Usia Baru: ");
                        ((BatuFosil) b).setUsiaFosil(input.nextLine());
                    }
                    System.out.println("Update berhasil.");
                } catch (InputMismatchException e) {
                    System.out.println("Gagal update: Input angka tidak valid!");
                    input.nextLine();
                }
                return;
            }
        }
        System.out.println("Nama batu tidak ditemukan.");
    }

    public static void hapus() {
        if (daftarBatu.isEmpty()) {
            System.out.println("\n>>> TIDAK ADA DATA UNTUK DIHAPUS <<<");
            return;
        }

        lihat();
        System.out.print("Masukkan nama batu yang ingin dihapus: ");
        String n = input.nextLine();
        boolean removed = daftarBatu.removeIf(b -> b.getNama().equalsIgnoreCase(n));

        if (removed) System.out.println("Data '" + n + "' berhasil dihapus.");
        else System.out.println("Data tidak ditemukan.");
    }
}