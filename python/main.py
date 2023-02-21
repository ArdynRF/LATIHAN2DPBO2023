from typing import List
from Human import SivitasAkademik


def printData(sivitasList: List[SivitasAkademik]) -> None:
    print('{:<20}{:<15}{:<20}{:<15}{:<20}{:<20}{:<25}{:<25}'.format(
        "Nama", "NIK", "Jenis Kelamin", "NIM", "Prodi", "Fakultas", "Asal Univ", "Email"))

    for sivitas in sivitasList:
        print('{:<20}{:<15}{:<20}{:<15}{:<20}{:<20}{:<25}{:<25}'.format(
            sivitas.get_nama(), sivitas.get_nik(), sivitas.get_kelamin(), sivitas.get_nim(),
            sivitas.get_prodi(), sivitas.get_fakultas(), sivitas.get_univ(), sivitas.get_email()))


if __name__ == '__main__':
    sivitasList = []

    n = int(input("Masukkan berapa banyak orang mahasiswa: "))

    for i in range(n):
        print(f"Orang ke-{i+1}")
        name = input("Name: ")
        nik = int(input("NIK: "))
        kelamin = input("Gender: ")
        nim = int(input("NIM: "))
        prodi = input("Major: ")
        fakultas = input("Faculty: ")
        univ = input("University: ")
        email = input("Email: ")
        print()

        sivitas = SivitasAkademik()
        sivitas.set_nama(name)
        sivitas.set_nik(nik)
        sivitas.set_kelamin(kelamin)
        sivitas.set_nim(nim)
        sivitas.set_prodi(prodi)
        sivitas.set_fakultas(fakultas)
        sivitas.set_univ(univ)
        sivitas.set_email(email)

        sivitasList.append(sivitas)

    printData(sivitasList)
