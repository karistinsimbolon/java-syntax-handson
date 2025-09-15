package Task1;

public class NamingConvention {
    public static void main(String[] args) {
        String namaLengkapMahasiswa = "Ksristin Simbolon";
        String nimMahasiswa = "2482003";
        double ipkMahasiswa = 3.77;
        boolean statusAktifKuliah = true;
        String alamatMahasiswa= "Universitas Advent Infonesia";
        int jumlahSks = 22;

        // Tampilkan semua Data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Lengkap :" + namaLengkapMahasiswa);
        System.out.println("NIM          :" + nimMahasiswa);
        System.out.println("IPK          :" + ipkMahasiswa);
        System.out.println("status Kuliah:" + (statusAktifKuliah ? "Aktif":"Tidak Aktif"));
        System.out.println("Jumlah SKS   :" + jumlahSks);

    }
}

