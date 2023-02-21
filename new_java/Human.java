package new_java;

class Human {
    protected String nama;
    protected long nik;
    protected String kelamin;

    public Human() {
        this.nama = "";
        this.nik = 0;
        this.kelamin = "-";
    }

    public Human(String nama, long nik, String kelamin) {
        this.nama = nama;
        this.nik = nik;
        this.kelamin = kelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getNik() {
        return this.nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }

    public String getKelamin() {
        return this.kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
}

class Mahasiswa extends Human {
    private long nim;
    private String prodi;
    private String fakultas;

    public Mahasiswa() {
        this.nim = 0;
        this.prodi = "-";
        this.fakultas = "-";
    }

    public Mahasiswa(String nama, long nik, String kelamin, long nim, String prodi, String fakultas) {
        super(nama, nik, kelamin);
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public long getNim() {
        return this.nim;
    }

    public void setNim(long nim) {
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

class SivitasAkademik extends Mahasiswa {
    private String asalUniv;
    private String email;

    public SivitasAkademik() {
        this.asalUniv = "-";
        this.email = "-";
    }

    public SivitasAkademik(String nama, long nik, String kelamin, long nim, String prodi, String fakultas,
            String asalUniv, String email) {
        super(nama, nik, kelamin, nim, prodi, fakultas);
        this.asalUniv = asalUniv;
        this.email = email;
    }

    public String getAsalUniv() {
        return this.asalUniv;
    }

    public void setAsalUniv(String asalUniv) {
        this.asalUniv = asalUniv;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
