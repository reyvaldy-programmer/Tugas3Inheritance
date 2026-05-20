public class MainApp {

    public static void main(String[] args) {

        // Object constructor 1
        Mahasiswa m1 = new Mahasiswa();
        m1.read();

        System.out.println("----------------");

        // Object constructor 2
        Mahasiswa m2 = new Mahasiswa(1, "Rey");
        m2.read();

        System.out.println("----------------");

        // Object constructor 3
        Mahasiswa m3 = new Mahasiswa(2, "Valdy", "Informatika", 20, "Banjar Baru");

        m3.create();
        m3.read();
        m3.update();
        m3.delete();

        System.out.println(m3.tampilNama());

        System.out.println("----------------");

        // Object class turunan
        MahasiswaAktif m4 = new MahasiswaAktif();
        m4.id = 3;
        m4.nama = "Reyvaldy";
        m4.jurusan = "Sistem Informasi";
        m4.umur = 21;
        m4.alamat = "Kalimantan Selatan";
        m4.semester = "4";
        m4.ipk = 3.5;

        m4.create();
        m4.tampilDataTambahan();
        System.out.println(m4.statusMahasiswa());
    }
}