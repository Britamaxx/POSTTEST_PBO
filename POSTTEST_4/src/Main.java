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
                System.out.println("2. Lihat Koleksi (Ringkas)");
                System.out.println("3. Lihat Koleksi (Detail)");
                System.out.println("4. Perbarui Batu");
                System.out.println("5. Hapus Batu");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 -> tambah();
                    case 2 -> lihat(true);
                    case 3 -> lihat(false);
                    case 4 -> perbarui();
                    case 5 -> menuHapus();
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
            System.out.println("Error: Input data tidak sesuai tipe!");
            input.nextLine();
        }
    }

    public static void lihat(boolean ringkas) {
        if (daftarBatu.isEmpty()) {
            System.out.println("\n>>> BELUM ADA DATA BATU <<<");
            return;
        }
        System.out.println(ringkas ? "\n--- Koleksi Ringkas ---" : "\n--- Detail Koleksi ---");
        for (int i = 0; i < daftarBatu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarBatu.get(i).tampilkanInfo(ringkas);
            if(!ringkas) System.out.println("-------------------------");
        }
    }

    public static void perbarui() {
        if (daftarBatu.isEmpty()) {
            System.out.println("\n>>> TIDAK ADA DATA UNTUK DIPERBARUI <<<");
            return;
        }
        lihat(true);
        System.out.print("Nama batu yang akan diubah: ");
        String cari = input.nextLine();

        for (BatuAkik b : daftarBatu) {
            if (b.getNama().equalsIgnoreCase(cari)) {
                try {
                    System.out.print("Nama Baru: "); b.setNama(input.nextLine());
                    System.out.print("Asal Baru: "); b.setAsal(input.nextLine());
                    System.out.print("Harga Baru: ");
                    int h = input.nextInt(); input.nextLine();
                    b.setHarga(h);

                    if (b instanceof BatuMulia) {
                        System.out.print("Skala Mohs Baru: ");
                        ((BatuMulia) b).setSkalaMohs(input.nextDouble()); input.nextLine();
                    } else if (b instanceof BatuFosil) {
                        System.out.print("Usia Baru: ");
                        ((BatuFosil) b).setUsiaFosil(input.nextLine());
                    }
                    System.out.println("Update berhasil.");
                } catch (Exception e) {
                    System.out.println("Gagal update!");
                    input.nextLine();
                }
                return;
            }
        }
        System.out.println("Nama tidak ditemukan.");
    }

    public static void hapus(String nama) {
        boolean removed = daftarBatu.removeIf(b -> b.getNama().equalsIgnoreCase(nama));
        if (removed) System.out.println("Data '" + nama + "' berhasil dihapus.");
        else System.out.println("Data tidak ditemukan.");
    }

    public static void hapus(int index) {
        if (index >= 0 && index < daftarBatu.size()) {
            BatuAkik b = daftarBatu.remove(index);
            System.out.println("Data '" + b.getNama() + "' berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public static void menuHapus() {
        if (daftarBatu.isEmpty()) {
            System.out.println("\n>>> TIDAK ADA DATA UNTUK DIHAPUS <<<");
            return;
        }

        lihat(true);
        System.out.println("Hapus dengan: 1. Nama | 2. Nomor");
        System.out.print("Pilih: ");

        try {
            int pil = input.nextInt(); input.nextLine();
            if (pil == 1) {
                System.out.print("Masukkan nama: ");
                hapus(input.nextLine());
            } else if (pil == 2) {
                System.out.print("Masukkan nomor: ");
                hapus(input.nextInt() - 1);
                input.nextLine();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Masukkan angka yang valid!");
            input.nextLine();
        }
    }
}