public class Mahasiswa {

    int id;
    String nama;
    String jurusan;
    int umur;
    String alamat;

    // Constructor 1
    public Mahasiswa() {
        System.out.println("Constructor tanpa parameter");
    }

    // Constructor 2
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Constructor 3
    public Mahasiswa(int id, String nama, String jurusan, int umur, String alamat) {
        this.id = id;
        this.nama = nama;
        this.jurusan = jurusan;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method tanpa nilai balik
    void create() {
        System.out.println("SQL CREATE:");
        System.out.println("INSERT INTO mahasiswa VALUES ("+id+", '"+nama+"', '"+jurusan+"', "+umur+", '"+alamat+"');");
    }

    void read() {
        System.out.println("SQL READ:");
        System.out.println("SELECT * FROM mahasiswa;");
    }

    void update() {
        System.out.println("SQL UPDATE:");
        System.out.println("UPDATE mahasiswa SET nama='"+nama+"', jurusan='"+jurusan+"', umur="+umur+", alamat='"+alamat+"' WHERE id="+id+";");
    }

    void delete() {
        System.out.println("SQL DELETE:");
        System.out.println("DELETE FROM mahasiswa WHERE id="+id+";");
    }

    // Method dengan nilai balik
    String tampilNama() {
        return "Nama Mahasiswa: " + nama;
    }
}