<?php
class Human {
    protected $nama;
    protected $nik;
    protected $Kelamin;

    public function __construct($nama = "", $nik = 0, $Kelamin = "-") {
        $this->nama = $nama;
        $this->nik = $nik;
        $this->Kelamin = $Kelamin;
    }

    public function getNama() {
        return $this->nama;
    }

    public function setNama($nama) {
        $this->nama = $nama;
    }

    public function getNik() {
        return $this->nik;
    }

    public function setNik($nik) {
        $this->nik = $nik;
    }

    public function getKelamin() {
        return $this->Kelamin;
    }

    public function setKelamin($Kelamin) {
        $this->Kelamin = $Kelamin;
    }

    public function __destruct() {
        // echo "Destroying Human object<br>";
    }
}

class Mahasiswa extends Human {
    private $nim;
    private $prodi;
    private $fakultas;

    public function __construct($nama = "", $nik = 0, $Kelamin = "-", $nim = 0, $prodi = "-", $fakultas = "-") {
        parent::__construct($nama, $nik, $Kelamin);
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    public function getNim() {
        return $this->nim;
    }

    public function setNim($nim) {
        $this->nim = $nim;
    }

    public function getProdi() {
        return $this->prodi;
    }

    public function setProdi($prodi) {
        $this->prodi = $prodi;
    }

    public function getFakultas() {
        return $this->fakultas;
    }

    public function setFakultas($fakultas) {
        $this->fakultas = $fakultas;
    }

    public function __destruct() {
        // echo "Destroying Mahasiswa object<br>";
    }
}

class SivitasAkademik extends Mahasiswa {
    private $asal_univ;
    private $email;

    public function __construct($nama = "", $nik = 0, $Kelamin = "-", $nim = 0, $prodi = "-", $fakultas = "-", $asal_univ = "-", $email = "-") {
        parent::__construct($nama, $nik, $Kelamin, $nim, $prodi, $fakultas);
        $this->asal_univ = $asal_univ;
        $this->email = $email;
    }

    public function getUniv() {
        return $this->asal_univ;
    }

    public function setUniv($univ) {
        $this->asal_univ = $univ;
    }

    public function getEmail() {
        return $this->email;
    }

    public function setEmail($email) {
        $this->email = $email;
    }

    public function __destruct() {
        // echo "Destroying SivitasAkademik object<br>";
    }
}
