package laprak2_java;

class Human {
    private String nama;
    private int nik;
    private String Kelamin;

    public Human() {
        this.nama = "";
        this.nik = 0;
        this.Kelamin = "-";
    }

    public Human(String nama, int nik, String Kelamin) {
        this.nama = nama;
        this.nik = nik;
        this.Kelamin = Kelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getnik() {
        return this.nik;
    }

    public void setnik(int nik) {
        this.nik = nik;
    }

    public String getKelamin() {
        return this.Kelamin;
    }

    public void setKelamin(String Kelamin) {
        this.Kelamin = Kelamin;
    }

}

class Mahasiswa extends Human {
    private int nim;
    private String prodi;
    private String fakultas;

    public Mahasiswa() {
        this.nim = 0;
        this.prodi = "-";
        this.fakultas = "-";
    }

    public Mahasiswa(int nim, String prodi, String fakultas) {
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public int getNim() {
        return this.nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
