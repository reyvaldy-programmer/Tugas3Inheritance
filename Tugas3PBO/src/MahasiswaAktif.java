public class MahasiswaAktif extends Mahasiswa {

    String semester;
    double ipk;

    void tampilDataTambahan() {
        System.out.println("Semester: " + semester);
        System.out.println("IPK: " + ipk);
    }

    String statusMahasiswa() {
        if(ipk >= 3.0){
            return "Mahasiswa Berprestasi";
        } else {
            return "Mahasiswa Aktif";
        }
    }
}