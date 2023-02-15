# LATIHAN2DPBO2023
### Saya Ardyn Rezky Fahreza NIM 2103551 mengerjakan Latihan 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance  pada kelas - kelas tersebut:
  o Mahasiswa: NIM, nama, jenis_kelamin, fakultas, prodi
  o Human: NIK, nama, jenis_kelamin
  o SivitasAkademik: asal_universitas, email_edu

## Desain Program
Program didesain menjadi dua class:
* **Human**
* **Mahasiswa**
* **SivitasAkademik**

Pada class `Human` terdapat tiga atribut:
* **nama**               -> merupakan nama human, tipe data `string`
* **nik**                -> merupakan NIK human, bertipe data `int`
* **jenis_kelamin**      -> merupakan jenis kelamin human, bertipe data `string`

Lalu pada class 'Mahasiswa', merupakan pewarisan dari class 'Human'
pada class 'Mahasiswa' terdapat tiga atribut:
* **nim**               -> merupakan nim mahasiswa, tipe data `int`
* **fakultas**          -> merupakan fakultas mahasiswa, tipe data `string`
* **prodi**             -> merupakan program studi mahasiswa, tipe data `string`

Tiap atribut memiliki setter dan getternya masing-masing yang berada pada class `Mahasiswa`.

Kemudian pada class 'SivitasAkademik' bukanlah dari pewarisan dari class 'Human' karena class 'SivitasAkademik' tidak berhubungan dengan class 'Human'
pada class 'SivitasAkademik' memiliki dua atribut:
* **asal_universitas**   -> merupakan asal universitas mahasiswa, tipe data `string`
* **email**              -> merupakan email mahasiswa, tipe data `string`

