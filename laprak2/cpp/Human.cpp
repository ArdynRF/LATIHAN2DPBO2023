#include <iostream>
#include <list>
#include <string>
using namespace std;

class Human
{
protected:
    string nama;
    long int nik;
    string Kelamin;

public:
    Human()
    {
        this->nama = "";
        this->nik = 0;
        this->Kelamin = "-";
    }

    Human(string nama, long int nik, string Kelamin)
    {
        this->nama = nama;
        this->nik = nik;
        this->Kelamin = Kelamin;
    }

    string getNama() const
    {
        return this->nama;
    }

    void setNama(string nama)
    {
        this->nama = nama;
    }

    int getNik() const
    {
        return this->nik;
    }

    void setNik(long int nik)
    {
        this->nik = nik;
    }

    string getKelamin() const
    {
        return this->Kelamin;
    }

    void setKelamin(string Kelamin)
    {
        this->Kelamin = Kelamin;
    }

    ~Human()
    {
        // cout << "Destroying Human object" << endl;
    }
};

class Mahasiswa : public Human
{
private:
    long int nim;
    string prodi;
    string fakultas;

public:
    Mahasiswa()
    {
        this->nim = 0;
        this->prodi = "-";
        this->fakultas = "-";
    }

    Mahasiswa(string nama, long int nik, string Kelamin, long int nim, string prodi, string fakultas)
        : Human(nama, nik, Kelamin)
    {
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    int getNim() const
    {
        return this->nim;
    }

    void setNim(long int nim)
    {
        this->nim = nim;
    }

    string getProdi() const
    {
        return this->prodi;
    }

    void setProdi(string prodi)
    {
        this->prodi = prodi;
    }

    string getFakultas() const
    {
        return this->fakultas;
    }

    void setFakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }

    ~Mahasiswa()
    {
        // cout << "Destroying Mahasiswa object" << endl;
    }
};

class SivitasAkademik : public Mahasiswa
{
private:
    string asal_univ;
    string email;

public:
    SivitasAkademik()
    {
        this->asal_univ = "-";
        this->email = "-";
    }

    SivitasAkademik(string nama, long int nik, string Kelamin, long int nim, string prodi, string fakultas, string asal_univ, string email)
        : Mahasiswa(nama, nik, Kelamin, nim, prodi, fakultas)
    {
        this->asal_univ = asal_univ;
        this->email = email;
    }

    string getUniv() const
    {
        return this->asal_univ;
    }

    void setUniv(string univ)
    {
        this->asal_univ = univ;
    }

    string getEmail() const
    {
        return this->email;
    }

    void setEmail(string email)
    {
        this->email = email;
    }

    ~SivitasAkademik()
    {
        // cout << "Destroying SivitasAkademik object" << endl;
    }
};