#include <iostream>
#include <iomanip>
#include "Human.cpp"

using namespace std;

void printData(list<SivitasAkademik> &sivitasList)
{
    cout << setw(20) << left << "Nama"
         << setw(15) << left << "NIK"
         << setw(20) << left << "Jenis Kelamin"
         << setw(15) << left << "NIM"
         << setw(20) << left << "Prodi"
         << setw(20) << left << "Fakultas"
         << setw(25) << left << "Asal Univ"
         << setw(25) << left << "Email" << endl;

    for (const auto &sivitas : sivitasList)
    {
        cout << setw(20) << left << sivitas.getNama()
             << setw(15) << left << sivitas.getNik()
             << setw(20) << left << sivitas.getKelamin()
             << setw(15) << left << sivitas.getNim()
             << setw(20) << left << sivitas.getProdi()
             << setw(20) << left << sivitas.getFakultas()
             << setw(25) << left << sivitas.getUniv()
             << setw(25) << left << sivitas.getEmail() << endl;
    }
}

int main(int argc, char const *argv[])
{
    string name, fakultas, prodi, kelamin, univ, email;
    long int nik, nim;

    cout << "Masukkan berapa banyak orang mahasiswa : ";

    int n;
    cin >> n;

    list<SivitasAkademik> Slist;

    for (int i = 0; i < n; i++)
    {
        SivitasAkademik temp;

        cout << "Orang ke-" << i + 1 << endl;
        cout << "Name: ";
        cin >> name;
        cout << "NIK: ";
        cin >> nik;
        cout << "Gender: ";
        cin >> kelamin;
        cout << "NIM: ";
        cin >> nim;
        cout << "Major: ";
        cin >> prodi;
        cout << "Faculty: ";
        cin >> fakultas;
        cout << "University: ";
        cin >> univ;
        cout << "Email: ";
        cin >> email;
        cout << endl;

        temp.setNama(name);
        temp.setNik(nik);
        temp.setKelamin(kelamin);
        temp.setNim(nim);
        temp.setProdi(prodi);
        temp.setFakultas(fakultas);
        temp.setUniv(univ);
        temp.setEmail(email);

        Slist.push_back(temp);
    }

    printData(Slist);

    return 0;
}
