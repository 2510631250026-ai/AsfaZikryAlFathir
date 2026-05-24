```java
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String kategori;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    String grade;
    boolean aktif;

    public Mahasiswa(String nim, String nama, String kategori, double tugas, double uts, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.kategori = kategori;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.aktif = true;
        hitungNilaiAkhir();
        tentukanGrade();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tentukanGrade() {
        if (nilaiAkhir >= 85) grade = "A";
        else if (nilaiAkhir >= 75) grade = "B";
        else if (nilaiAkhir >= 65) grade = "C";
        else if (nilaiAkhir >= 50) grade = "D";
        else grade = "E";
    }

    public void tampilkanData() {
        System.out.printf("| %-10s | %-20s | %-18s | %-6.1f | %-6.1f | %-6.1f | %-6.1f | %-5s | %-8s |%n",
                nim, nama, kategori, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir, grade,
                (aktif ? "Aktif" : "Dihapus"));
    }
}

public class sistemmanajemennilaimahasiswa {
    static Scanner input = new Scanner(System.in);
    static Mahasiswa[] data = new Mahasiswa[100];
    static int jumlahData = 0;

    public static void main(String[] args) {
        inisialisasiData();

        int pilihan;
        do {
            menu();
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tambahData(); break;
                case 2: tampilkanData(); break;
                case 3: editData(); break;
                case 4: hapusData(); break;
                case 5: cariNama(); break;
                case 6: bubbleSortNIM(); break;
                case 7: binarySearchNIM(); break;
                case 8: selectionSortNama(); break;
                case 9: cariKategori(); break;
                case 10: statistikData(); break;
                case 11: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 11);
    }

    static void inisialisasiData() {
        data[jumlahData++] = new Mahasiswa("2026001", "Ahmad Fauzan", "Informatika", 85, 80, 90);
        data[jumlahData++] = new Mahasiswa("2026002", "Budi Santoso", "Sistem Informasi", 78, 75, 80);
        data[jumlahData++] = new Mahasiswa("2026003", "Citra Lestari", "Teknik Komputer", 88, 84, 89);
        data[jumlahData++] = new Mahasiswa("2026004", "Dewi Anggraini", "Informatika", 92, 90, 95);
        data[jumlahData++] = new Mahasiswa("2026005", "Eko Prasetyo", "Sistem Informasi", 70, 72, 68);
        data[jumlahData++] = new Mahasiswa("2026006", "Fitri Handayani", "Teknik Komputer", 83, 79, 85);
        data[jumlahData++] = new Mahasiswa("2026007", "Galih Ramadhan", "Informatika", 76, 74, 78);
        data[jumlahData++] = new Mahasiswa("2026008", "Hani Nurhaliza", "Sistem Informasi", 90, 88, 92);
        data[jumlahData++] = new Mahasiswa("2026009", "Indra Kurniawan", "Teknik Komputer", 65, 68, 70);
        data[jumlahData++] = new Mahasiswa("2026010", "Joko Susilo", "Informatika", 80, 82, 79);
        data[jumlahData++] = new Mahasiswa("2026011", "Kartika Sari", "Sistem Informasi", 87, 85, 88);
        data[jumlahData++] = new Mahasiswa("2026012", "Lukman Hakim", "Teknik Komputer", 75, 70, 72);
        data[jumlahData++] = new Mahasiswa("2026013", "Maya Putri", "Informatika", 95, 94, 96);
        data[jumlahData++] = new Mahasiswa("2026014", "Nanda Saputra", "Sistem Informasi", 68, 66, 70);
        data[jumlahData++] = new Mahasiswa("2026015", "Oki Setiawan", "Teknik Komputer", 82, 80, 84);
        data[jumlahData++] = new Mahasiswa("2026016", "Putri Ayunda", "Informatika", 89, 87, 90);
        data[jumlahData++] = new Mahasiswa("2026017", "Qori Aulia", "Sistem Informasi", 77, 79, 75);
        data[jumlahData++] = new Mahasiswa("2026018", "Rizky Maulana", "Teknik Komputer", 91, 89, 93);
        data[jumlahData++] = new Mahasiswa("2026019", "Salsa Billa", "Informatika", 73, 70, 75);
        data[jumlahData++] = new Mahasiswa("2026020", "Teguh Firmansyah", "Sistem Informasi", 84, 83, 85);
        data[jumlahData++] = new Mahasiswa("2026021", "Umi Kalsum", "Teknik Komputer", 88, 86, 89);
        data[jumlahData++] = new Mahasiswa("2026022", "Vina Oktavia", "Informatika", 79, 78, 80);
        data[jumlahData++] = new Mahasiswa("2026023", "Wahyu Hidayat", "Sistem Informasi", 69, 72, 70);
        data[jumlahData++] = new Mahasiswa("2026024", "Xavier Pratama", "Teknik Komputer", 93, 91, 94);
        data[jumlahData++] = new Mahasiswa("2026025", "Yuni Marlina", "Informatika", 81, 80, 82);
        data[jumlahData++] = new Mahasiswa("2026026", "Zaki Mubarak", "Sistem Informasi", 74, 76, 73);
        data[jumlahData++] = new Mahasiswa("2026027", "Anisa Rahma", "Teknik Komputer", 86, 88, 87);
        data[jumlahData++] = new Mahasiswa("2026028", "Bagas Aditya", "Informatika", 67, 65, 69);
        data[jumlahData++] = new Mahasiswa("2026029", "Cindy Permata", "Sistem Informasi", 90, 92, 91);
        data[jumlahData++] = new Mahasiswa("2026030", "Dimas Saputra", "Teknik Komputer", 78, 77, 79);
    }

    static void menu() {
        System.out.println("\n===== SISTEM MANAJEMEN NILAI MAHASISWA =====");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Semua Data");
        System.out.println("3. Edit Data berdasarkan NIM");
        System.out.println("4. Hapus Data (Soft Delete)");
        System.out.println("5. Cari berdasarkan Nama (Linear Search)");
        System.out.println("6. Urutkan berdasarkan NIM (Bubble Sort)");
        System.out.println("7. Cari berdasarkan NIM (Binary Search)");
        System.out.println("8. Urutkan berdasarkan Nama (Selection Sort)");
        System.out.println("9. Cari berdasarkan Kategori");
        System.out.println("10. Statistik Data");
        System.out.println("11. Keluar");
    }

    static void tambahData() {
        if (jumlahData >= data.length) {
            System.out.println("Data penuh!");
            return;
        }

        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Kategori/Jurusan: ");
        String kategori = input.nextLine();
        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas = input.nextDouble();
        input.nextLine();

        data[jumlahData++] = new Mahasiswa(nim, nama, kategori, tugas, uts, uas);
        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilkanData() {
        System.out.println("========================================================================================================================");
        System.out.printf("| %-10s | %-20s | %-18s | %-6s | %-6s | %-6s | %-6s | %-5s | %-8s |%n",
                "NIM", "Nama", "Kategori", "Tugas", "UTS", "UAS", "Akhir", "Grade", "Status");
        System.out.println("========================================================================================================================");
        for (int i = 0; i < jumlahData; i++) {
            if (data[i] != null) data[i].tampilkanData();
        }
        System.out.println("========================================================================================================================");
    }

    static void editData() {
        System.out.print("Masukkan NIM yang ingin diedit: ");
        String nim = input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (data[i] != null && data[i].nim.equals(nim) && data[i].aktif) {
                System.out.print("Nama baru: ");
                data[i].nama = input.nextLine();
                System.out.print("Kategori baru: ");
                data[i].kategori = input.nextLine();
                System.out.print("Nilai Tugas baru: ");
                data[i].nilaiTugas = input.nextDouble();
                System.out.print("Nilai UTS baru: ");
                data[i].nilaiUTS = input.nextDouble();
                System.out.print("Nilai UAS baru: ");
                data[i].nilaiUAS = input.nextDouble();
                input.nextLine();

                data[i].hitungNilaiAkhir();
                data[i].tentukanGrade();
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void hapusData() {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nim = input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (data[i] != null && data[i].nim.equals(nim)) {
                data[i].aktif = false;
                System.out.println("Data berhasil dihapus (soft delete).");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void cariNama() {
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (data[i] != null && data[i].aktif && data[i].nama.equalsIgnoreCase(nama)) {
                if (!ditemukan) {
                    System.out.println("Data ditemukan:");
                }
                data[i].tampilkanData();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void bubbleSortNIM() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (data[j] != null && data[j + 1] != null && data[j].nim.compareTo(data[j + 1].nim) > 0) {
                    Mahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan NIM.");
    }

    static void binarySearchNIM() {
        bubbleSortNIM();
        System.out.print("Masukkan NIM yang dicari: ");
        String nim = input.nextLine();

        int kiri = 0, kanan = jumlahData - 1;
        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            int hasil = data[tengah].nim.compareTo(nim);

            if (hasil == 0 && data[tengah].aktif) {
                System.out.println("Data ditemukan:");
                data[tengah].tampilkanData();
                return;
            } else if (hasil < 0) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void selectionSortNama() {
        for (int i = 0; i < jumlahData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jumlahData; j++) {
                if (data[j] != null && data[min] != null && data[j].nama.compareToIgnoreCase(data[min].nama) < 0) {
                    min = j;
                }
            }
            Mahasiswa temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
        System.out.println("Data berhasil diurutkan berdasarkan Nama.");
    }

    static void cariKategori() {
        System.out.print("Masukkan kategori/jurusan: ");
        String kategori = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (data[i] != null && data[i].aktif && data[i].kategori.equalsIgnoreCase(kategori)) {
                data[i].tampilkanData();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void statistikData() {
        int aktif = 0;
        for (int i = 0; i < jumlahData; i++) {
            if (data[i] != null && data[i].aktif) {
                aktif++;
            }
        }

        System.out.println("===== Statistik Data =====");
        System.out.println("Total Data      : " + jumlahData);
        System.out.println("Data Aktif      : " + aktif);
        System.out.println("Data Terhapus   : " + (jumlahData - aktif));
    }
}
```
