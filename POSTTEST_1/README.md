# Sistem Manajemen Koleksi Batu Akik

Muhammad Britama Putra Jaya  
NIM : 2409106047  
B1 24

---

## Deskripsi Program

Program **Sistem Manajemen Koleksi Batu Akik** merupakan aplikasi berbasis **Java Console** yang dibuat menggunakan **IntelliJ IDEA**. Program ini digunakan untuk mengelola data koleksi batu akik dengan memanfaatkan struktur data **ArrayList**.

Aplikasi ini menerapkan konsep **CRUD (Create, Read, Update, Delete)** untuk memanipulasi data objek dari sebuah class. Data yang disimpan merupakan informasi mengenai batu akik seperti **nama batu, asal batu, dan harga batu**.

Program berjalan secara **berulang menggunakan perulangan (loop)** hingga pengguna memilih menu **Exit** untuk keluar dari program.

---

## Struktur Program

Program terdiri dari beberapa bagian utama:

### 1. Class BatuAkik

Class ini digunakan sebagai **class data** yang merepresentasikan objek batu akik.

Atribut yang dimiliki:

| Atribut | Tipe Data | Keterangan       |
| ------- | --------- | ---------------- |
| nama    | String    | Nama batu akik   |
| asal    | String    | Daerah asal batu |
| harga   | int       | Harga batu       |

Constructor pada class ini digunakan untuk menginisialisasi nilai atribut ketika objek dibuat.

---

### 2. ArrayList

Program menggunakan:

```java
ArrayList<BatuAkik> DaftarBatu;
```

ArrayList ini berfungsi untuk menyimpan seluruh objek **BatuAkik** yang dimasukkan oleh pengguna.

---

### 3. Menu Program

Program memiliki beberapa menu utama:

| Menu | Fungsi                             |
| ---- |------------------------------------|
| 1    | Menambahkan data batu akik         |
| 2    | Menampilkan seluruh data batu akik |
| 3    | Mengmperbarui data batu akik       |
| 4    | Menghapus data batu akik           |
| 0    | Keluar dari program                |

Menu ditampilkan secara berulang menggunakan **perulangan do-while**.

---

## Implementasi CRUD

### 1. Create (Tambah Data)

Menu ini digunakan untuk menambahkan data batu akik baru ke dalam ArrayList.

Data yang dimasukkan:

* Nama Batu
* Asal Batu
* Harga Batu

Data kemudian disimpan dalam bentuk objek **BatuAkik**.

---

### 2. Read (Menampilkan Data)

Menu ini digunakan untuk menampilkan seluruh data batu akik yang tersimpan dalam ArrayList.

Program akan menampilkan:

* Nama Batu
* Asal Batu
* Harga Batu

Jika data kosong maka program akan menampilkan pesan bahwa data belum tersedia.

---

### 3. Update (Mengubah Data)

Menu ini digunakan untuk memperbarui data batu akik yang sudah ada.

Pengguna diminta memasukkan **nama batu yang ingin diubah**, kemudian data baru akan menggantikan data lama.

---

### 4. Delete (Menghapus Data)

Menu ini digunakan untuk menghapus data batu akik dari ArrayList.

Pengguna diminta memasukkan **nama batu yang ingin dihapus**, kemudian program akan mencari dan menghapus data tersebut.

---

## Alur Program

1. Program dijalankan.
2. Menu utama ditampilkan kepada pengguna.
3. Pengguna memilih menu sesuai kebutuhan.
4. Program menjalankan fungsi sesuai pilihan.
5. Menu akan muncul kembali sampai pengguna memilih **Exit**.

---

## Contoh Tampilan Program

```
=== Sistem Manajemen Koleksi Batu Akik ===
1. Tambah Batu
2. Tampil Batu
3. Perbarui Batu
4. Hapus Batu
0. Exit
Masukkan pilihan :
```

Contoh output data:

```
Nama Batu : Bacan
Asal Batu : Maluku
Harga     : 500000
```

---