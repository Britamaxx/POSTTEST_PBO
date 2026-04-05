# Sistem Manajemen Koleksi Batu Akik

**Muhammad Britama Putra Jaya** 

**NIM : 2409106047** 

**Informatika B 2024 - Universitas Mulawarman**

---

## Deskripsi Program
Program **Sistem Manajemen Koleksi Batu Akik** adalah aplikasi berbasis Java Console yang dikembangkan menggunakan **IntelliJ IDEA**. Program ini dirancang untuk mengelola database koleksi batu menggunakan struktur data **ArrayList**, dengan fokus pada penerapan prinsip Pemrograman Berorientasi Objek (PBO) yang lebih kompleks.

Aplikasi ini mendukung operasi **CRUD (Create, Read, Update, Delete)** dan telah dikembangkan dari tahap *Encapsulation* menuju tahap **Inheritance** (Pewarisan) sesuai dengan kurikulum Modul 4 Praktikum PBO.

---

## Konsep OOP yang Diterapkan

### 1. Inheritance (Pewarisan)
Program ini menerapkan **Hierarchical Inheritance**, di mana satu *Superclass* diwarisi oleh dua *Subclass* yang memiliki karakteristik berbeda namun tetap dalam basis yang sama.
* **Superclass: `BatuAkik`** – Menyimpan atribut umum (Nama, Asal, Harga).
* **Subclass: `BatuMulia`** – Menambahkan atribut spesifik `skalaMohs` untuk mengukur kekerasan batu.
* **Subclass: `BatuFosil`** – Menambahkan atribut spesifik `usiaFosil` untuk menyimpan estimasi umur fosil.

### 2. Encapsulation
Seluruh atribut dalam class dibuat menggunakan access modifier `private` atau `protected`. Akses dan perubahan data dilakukan secara aman melalui method **Getter dan Setter**.

---

## Struktur Class
| Class | Peran | Atribut Utama |
| :--- | :--- | :--- |
| **BatuAkik** | Superclass (Parent) | `nama`, `asal`, `harga` |
| **BatuMulia** | Subclass (Child) | `skalaMohs` |
| **BatuFosil** | Subclass (Child) | `usiaFosil` |
| **Main** | Driver Class | Logika CRUD & Menu Utama |

---

## Contoh Tampilan Output
```text
=== Sistem Manajemen Batu Akik ===
1. Tambah Batu
2. Lihat Koleksi
3. Perbarui Batu
4. Hapus Batu
0. Keluar

Nama  : Blue Sapphire
Asal  : Sri Lanka
Harga : Rp 5000000
Jenis : Batu Mulia
Skala Mohs : 9.0
-------------------------
```

---