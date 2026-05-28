SISTEM MANAJEMEN NILAI MAHASISWA
============================================================
Deskripsi Program
------------------------------------------------------------
Program ini merupakan aplikasi berbasis Java Console untuk 
mengelola data nilai mahasiswa menggunakan struktur data 
Array of Objects (Array of Records).

Program mendukung fitur CRUD, Searching, Sorting, Statistik,
Soft Delete, Restore Data, serta Penyimpanan dan Pembacaan
data menggunakan file teks.

============================================================
Fitur Program
------------------------------------------------------------
1. Tambah Data Mahasiswa
2. Tampilkan Semua Data
3. Edit Data Mahasiswa
4. Hapus Data (Soft Delete)
5. Cari Data berdasarkan Nama (Linear Search)
6. Urutkan Data berdasarkan NIM (Bubble Sort)
7. Cari Data berdasarkan NIM (Binary Search)
8. Urutkan Data berdasarkan Nama (Selection Sort)
9. Cari Data berdasarkan Kategori/Jurusan
10. Statistik Data
11. Tampilkan Data Terhapus
12. Restore Data
13. Simpan dan Load Data dari File TXT

============================================================
Struktur Data
------------------------------------------------------------
Class Mahasiswa memiliki atribut:

- nim
- nama
- kategori
- nilaiTugas
- nilaiUTS
- nilaiUAS
- nilaiAkhir
- grade
- aktif

Data mahasiswa disimpan dalam:
Mahasiswa[] data = new Mahasiswa[100];

============================================================
Algoritma yang Digunakan
------------------------------------------------------------

1. Linear Search
   Digunakan untuk:
   - pencarian nama
   - pencarian kategori

2. Binary Search
   Digunakan untuk:
   - pencarian NIM
   Syarat:
   - data harus diurutkan terlebih dahulu

3. Bubble Sort
   Digunakan untuk:
   - mengurutkan data berdasarkan NIM

4. Selection Sort
   Digunakan untuk:
   - mengurutkan data berdasarkan Nama

============================================================
Cara Menjalankan Program
------------------------------------------------------------

1. Pastikan Java sudah terinstall.

2. Compile program:
   javac SistemManajemenNilaiMahasiswa.java

3. Jalankan program:
   java SistemManajemenNilaiMahasiswa

============================================================

File yang Digunakan
------------------------------------------------------------

1. SistemManajemenNilaiMahasiswa.java
   Source code utama program

2. data_mahasiswa.txt
   File penyimpanan data mahasiswa

3. README.txt
   Penjelasan program dan instruksi penggunaan

============================================================
Cara Kerja Penyimpanan Data
------------------------------------------------------------
- Program menggunakan file teks:
  data_mahasiswa.txt

- Data akan otomatis disimpan ketika:
  - tambah data
  - edit data
  - hapus data
  - restore data

- Saat program dijalankan:
  - program akan membaca file
  - jika file belum ada:
    program otomatis mengisi 30 data awal

============================================================
Konsep Soft Delete
------------------------------------------------------------
Data yang dihapus tidak benar-benar hilang.

Program hanya mengubah status:
aktif = false

Keuntungan:
- data dapat direstore kembali
- riwayat data tetap tersimpan

============================================================
Validasi Input
------------------------------------------------------------
Program memiliki validasi:
- input menu harus angka
- nilai harus 0 - 100
- input teks tidak boleh kosong
- NIM tidak boleh duplikat

============================================================
Author
------------------------------------------------------------
Nama Kelompok : Kelompok 2
Anggota :
1. Asfa Zikry Al Fathir 
2. Fairuz Nailah Muazarah
3. Refaya Nindya Secondita

Github:
https://github.com/2510631250026-ai/Sistem-Manajemen-Nilai-Mahasiswa/blob/main/SistemManajemenNilaiMahasiswa

============================================================
Terima Kasih
============================================================
