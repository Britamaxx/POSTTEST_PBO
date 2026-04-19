# Sistem Manajemen Koleksi Batu Akik (Abstract & Interface)

**Muhammad Britama Putra Jaya** 

**NIM : 2409106047** 

**Informatika B1 2024 - Universitas Mulawarman**

---

## Deskripsi Program
Program ini adalah aplikasi manajemen database koleksi batu akik berbasis Java. Pada versi terbaru ini, program telah ditingkatkan dari konsep *Polymorphism* murni menjadi struktur yang lebih solid dengan menerapkan **Abstract Class** dan **Interface** sesuai standar Pemrograman Berorientasi Objek (PBO).

---

## Konsep OOP yang Diterapkan

### 1. Abstract Class & Method
* **Superclass: `BatuAkik`** – Diubah menjadi **Abstract Class** untuk mencegah instansiasi objek secara langsung.
* **Abstract Method**: Method `tampilkanInfo(boolean ringkas)` didefinisikan sebagai abstract, mewajibkan setiap subclass memiliki implementasi tampilannya sendiri.

### 2. Interface
* **Interface: `OperasiData`** – Digunakan sebagai kontrak standar untuk operasi data pada program.
* **Method Interface**: Mengimplementasikan `validasiData()` untuk pengecekan data dan `getKategori()` untuk identifikasi jenis batu secara dinamis.

### 3. Inheritance & Polymorphism
* **Inheritance**: Tetap menggunakan `BatuMulia` dan `BatuFosil` sebagai subclass dari `BatuAkik`.
* **Polymorphism**:
    * **Dynamic Binding**: Objek subclass dipanggil melalui referensi abstract class `BatuAkik`.
    * **Overloading**: Method `hapus()` tetap mendukung penghapusan berdasarkan nama atau indeks.

### 4. Encapsulation
* Menggunakan akses modifier `protected` dan `private` dengan validasi ketat pada setter untuk menjaga integritas data (misal: harga tidak boleh negatif).

---

## Struktur Class & Interface
| Komponen | Peran | Penerapan |
| :--- | :--- | :--- |
| **OperasiData** | **Interface** | Kontrak method `validasiData` & `getKategori` |
| **BatuAkik** | **Abstract Class** | Implementasi Interface & Base Class |
| **BatuMulia** | Subclass | Implementasi spesifik atribut `skalaMohs` |
| **BatuFosil** | Subclass | Implementasi spesifik atribut `usiaFosil` |
| **Main** | Driver Class | Pengelolaan ArrayList dan logic CRUD |

---

## Fitur Utama
1. **Tambah Batu**: Input data disertai validasi otomatis melalui interface.
2. **Lihat Koleksi**: Menampilkan data secara detail/ringkas beserta kategori otomatis.
3. **Perbarui Batu**: Update data berbasis pencarian nama.
4. **Hapus Batu**: Fleksibilitas hapus via Nama atau Nomor Urut (Overloading).

---

## Contoh Tampilan Output

### 1. Tambah Data (Implementasi Interface `validasiData`)
```text
=== Sistem Manajemen Batu Akik (Abstract & Interface) ===
1. Tambah Batu
Pilih: 1

--- Tambah Data ---
Jenis (1. Mulia / 2. Fosil): 1
Nama Batu: Safir Biru
Asal Batu: Sri Lanka
Harga: 15000000
Skala Mohs: 9.0

Memvalidasi data batu: Safir Biru...
Berhasil disimpan sebagai kategori: Permata Berharga
```

### 2. Lihat Koleksi Detail (Implementasi Abstract Method)
```text
3. Lihat Koleksi (Detail)

--- Detail Koleksi ---
1. Nama : Safir Biru
Asal : Sri Lanka
Harga : Rp15000000
Jenis : Batu Mulia
Skala Mohs : 9.0
Kategori: Permata Berharga
-------------------------
```

### 3. Hapus Data (Implementasi Method Overloading)
```text
5. Hapus Batu
Pilih: 5

--- Koleksi Ringkas ---
1. [Mulia] Safir Biru (9.0 Mohs) - Rp15000000

Hapus dengan: 1. Nama | 2. Nomor
Pilih: 2
Masukkan nomor: 1
Data 'Safir Biru' berhasil dihapus.
```