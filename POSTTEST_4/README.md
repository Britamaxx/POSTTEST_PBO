# Sistem Manajemen Koleksi Batu Akik (Polymorphism)

**Muhammad Britama Putra Jaya**

**NIM : 2409106047** 

**Informatika B1 2024 - Universitas Mulawarman**

---

## Deskripsi Program
Program **Sistem Manajemen Koleksi Batu Akik** adalah aplikasi berbasis Java Console yang dikembangkan menggunakan **IntelliJ IDEA**. Program ini dirancang untuk mengelola database koleksi batu menggunakan struktur data **ArrayList**, dengan fokus pada penerapan prinsip Pemrograman Berorientasi Objek (PBO).

Aplikasi ini telah dikembangkan dari tahap *Inheritance* menuju tahap **Polymorphism** sesuai dengan kurikulum Modul 5 Praktikum PBO. Program mampu menangani objek secara dinamis dan menyediakan berbagai cara interaksi melalui teknik *overloading* dan *overriding*.

---

## Konsep OOP yang Diterapkan

### 1. Inheritance
Menerapkan **Hierarchical Inheritance** dengan struktur:
* **Superclass: `BatuAkik`** – Atribut umum (Nama, Asal, Harga).
* **Subclass: `BatuMulia`** – Atribut spesifik `skalaMohs`.
* **Subclass: `BatuFosil`** – Atribut spesifik `usiaFosil`.

### 2. Polymorphism
Program ini menerapkan dua jenis polymorphism untuk meningkatkan fleksibilitas kode:
* **Method Overriding**: Method `tampilkanInfo()` di kelas induk didefinisikan ulang secara spesifik di kelas `BatuMulia` dan `BatuFosil` untuk menampilkan identitas unik masing-masing kategori.
* **Method Overloading**:
    * Method `tampilkanInfo(boolean ringkas)`: Memberikan pilihan tampilan detail atau ringkas dalam satu baris.
    * Method `hapus(String nama)` vs `hapus(int index)`: Memberikan fleksibilitas kepada pengguna untuk menghapus data berdasarkan nama batu atau nomor urut dalam daftar.

### 3. Encapsulation
Akses data tetap dijaga ketat menggunakan modifier `private`/`protected` dengan validasi pada method **Setter** (misalnya, harga tidak boleh negatif dan nama tidak boleh kosong).

---

## Struktur Class
| Class | Peran | Penerapan Polimorfisme        |
| :--- | :--- |:------------------------------|
| **BatuAkik** | Superclass (Parent) | Original Method & Overloading |
| **BatuMulia** | Subclass (Child) | Overriding `tampilkanInfo()`  |
| **BatuFosil** | Subclass (Child) | Overriding `tampilkanInfo()`  |
| **Main** | Driver Class | Overloading `hapus()`         |

---

## Fitur Utama
1. **Tambah Batu**: Input data dinamis berdasarkan jenis (Mulia/Fosil).
2. **Lihat Koleksi**: Dua mode tampilan (Detail Koleksi & Ringkasan Satu Baris).
3. **Perbarui Batu**: Mengubah data batu yang sudah ada berdasarkan pencarian nama.
4. **Hapus Batu**: Mendukung penghapusan via **Nama** atau **Nomor Urut** (Overloading).

---

## Contoh Tampilan Output (Mode Ringkas)
```text
=== Sistem Manajemen Batu Akik ===
2. Lihat Koleksi (Ringkas)

--- Koleksi Ringkas ---
1. [Mulia] Blue Sapphire (9.0 Mohs) - Rp 15000000
2. [Fosil] Kayu Purba (Usia: 20 Juta Tahun) - Rp 750000
```