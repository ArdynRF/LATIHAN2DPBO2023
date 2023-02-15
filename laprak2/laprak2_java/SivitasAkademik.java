package laprak2_java;


class SivitasAkademik extends Mahasiswa {
    private String asal_univ;
    private String email;

    public SivitasAkademik() {
        this.asal_univ = "-";
        this.email = "-";
    }

    public SivitasAkademik(String univ, String email) {
        this.asal_univ = univ;
        this.email = email;
    }

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
