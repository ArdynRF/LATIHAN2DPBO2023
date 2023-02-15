package laprak2_java;

// class sivitas akademik ini bukan merupakan child dari Human dikarenakan sivitas akademik tidak berhubungan dengan Human
class SivitasAkademik extends Mahasiswa {
    // atribut atribut 
    private String asal_univ;
    private String email;

    // constructors
    public SivitasAkademik() {
        this.asal_univ = "-";
        this.email = "-";
    }

    public SivitasAkademik(String univ, String email) {
        this.asal_univ = univ;
        this.email = email;
    }

    // fungsi set dan get
    public String getUniv() {
        return this.asal_univ;
    }

    public void setUniv(String univ) {
        this.asal_univ = univ;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
