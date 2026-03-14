# Sistem Manajemen Koleksi Batu Akik (Encapsulation)

Muhammad Britama Putra Jaya  
NIM : 2409106047  
B1 24

---

## Deskripsi Program

Program **Sistem Manajemen Koleksi Batu Akik** merupakan aplikasi berbasis **Java Console** yang dibuat menggunakan **IntelliJ IDEA**. Program ini digunakan untuk mengelola data koleksi batu akik dengan memanfaatkan struktur data **ArrayList**.

Aplikasi ini menerapkan konsep **CRUD (Create, Read, Update, Delete)** serta menerapkan konsep **Encapsulation** dalam pemrograman berorientasi objek. Data yang disimpan merupakan informasi mengenai batu akik seperti **nama batu, asal batu, dan harga batu**.

Program berjalan secara **berulang menggunakan perulangan (loop)** hingga pengguna memilih menu **Exit** untuk keluar dari program.

---

## Konsep Pemrograman yang Digunakan

Program ini menerapkan beberapa konsep penting dalam **Object Oriented Programming (OOP)** yaitu:

### 1. Encapsulation

Encapsulation merupakan teknik untuk **menyembunyikan data (atribut)** di dalam class dengan cara membuat atribut menjadi **private**, sehingga tidak dapat diakses langsung dari luar class.

Akses terhadap atribut dilakukan melalui **method Getter dan Setter** yang memiliki access modifier **public**.

Dengan adanya setter, program juga dapat melakukan **validasi data**, misalnya memastikan harga tidak bernilai negatif.

### 2. Access Modifier

Program ini menerapkan **semua jenis access modifier** yaitu:

| Access Modifier | Penerapan                                 |
| --------------- | ----------------------------------------- |
| `private`       | atribut nama, asal, harga                 |
| `public`        | constructor, getter, setter, method utama |
| `protected`     | method untuk menampilkan kategori batu    |
| `default`       | atribut jenis batu                        |

Penggunaan access modifier bertujuan untuk mengatur **tingkat visibilitas dan keamanan data**.

---

## Struktur Program

Program terdiri dari dua class utama yaitu:

### 1. Class BatuAkik

Class ini digunakan sebagai **class data (model)** yang merepresentasikan objek batu akik.

Atribut yang dimiliki:

| Atribut | Tipe Data | Access Modifier | Keterangan       |
| ------- | --------- | --------------- | ---------------- |
| nama    | String    | private         | Nama batu akik   |
| asal    | String    | private         | Daerah asal batu |
| harga   | int       | private         | Harga batu       |
| jenis   | String    | default         | Jenis batu       |

Class ini juga memiliki:

* Constructor
* Getter dan Setter
* Method protected untuk menampilkan kategori batu berdasarkan harga

---

### 2. Class Main

Class ini merupakan **class utama (driver class)** yang berisi:

* Menu program
* Perulangan program
* Method CRUD
* ArrayList sebagai penyimpanan data

Program menggunakan:

```java
ArrayList<BatuAkik> daftarBatu;
```

ArrayList berfungsi untuk menyimpan seluruh objek **BatuAkik** yang dimasukkan oleh pengguna.

---

## Menu Program

Program memiliki beberapa menu utama:

| Menu | Fungsi                             |
| ---- | ---------------------------------- |
| 1    | Menambahkan data batu akik         |
| 2    | Menampilkan seluruh data batu akik |
| 3    | Memperbarui data batu akik         |
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

Data kemudian disimpan dalam bentuk objek **BatuAkik** melalui setter.

---

### 2. Read (Menampilkan Data)

Menu ini digunakan untuk menampilkan seluruh data batu akik yang tersimpan dalam ArrayList.

Program akan menampilkan:

* Nama Batu
* Asal Batu
* Harga Batu
* Kategori Batu

Jika data kosong maka program akan menampilkan pesan bahwa data belum tersedia.

---

### 3. Update (Mengubah Data)

Menu ini digunakan untuk memperbarui data batu akik yang sudah ada.

Pengguna diminta memasukkan **nama batu yang ingin diubah**, kemudian program akan mengganti data lama dengan data baru menggunakan setter.

---

### 4. Delete (Menghapus Data)

Menu ini digunakan untuk menghapus data batu akik dari ArrayList.

Pengguna diminta memasukkan **nama batu yang ingin dihapus**, kemudian program akan mencari dan menghapus objek tersebut dari ArrayList.

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
2. Lihat Batu
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
Kategori  : Standard
```

---