// Record untuk data mahasiswa
record Mahasiswa(String nama, String nim) {}

 class DataMahasiswa {
    public static void main(String[] args) {
        System.out.println("=== DATA MAHASISWA ===\n");

        // 1. BUAT DATA MAHASISWA
        Mahasiswa mhs1 = new Mahasiswa ("Budi Santoso", "SI2023001");
        Mahasiswa mhs2 = new Mahasiswa("Ani Wijaya", "SI2023002");
        Mahasiswa mhs3 = new Mahasiswa("Jajang Sutarso", "SI22025001");
        Mahasiswa mhs4 = new Mahasiswa("Aji Cahyono", "SI22025001");

        // 2. AKSES DATA MAHASISWA
        System.out.println("Data Mahasiswa 1:");
        System.out.println("Nama: " + mhs1.nama());
        System.out.println("NIM : " + mhs1.nim());

        // 3. TAMPILKAN SEMUA DATA
        System.out.println("\n=== DAFTAR MAHASISWA ===");
        Mahasiswa[] daftarMhs = {mhs1, mhs2, mhs3, mhs4};

        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println((i+1) + ". " + daftarMhs[i].nama() +
            " - " + daftarMhs[i].nim());
        }

        // 4. CARI MAHASISWA BERDASARKAN NIM
        System.out.println("\n=== CARI MAHASISWA ===");
        String nimDicari = "SI2023002";

        for (Mahasiswa mhs : daftarMhs) {
            if (mhs.nim().equals(nimDicari)) {
                System.out.println("Ditemukan: " + mhs.nama());
            }
        }

    }
}