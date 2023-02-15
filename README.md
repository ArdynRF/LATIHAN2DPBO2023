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

## Alur Program
**Semua program memiliki alur yang sama, hanya saja pada PHP tidak ada inputan dari user (data untuk CRUD dibuat hardcode).**

Pertama program akan menampilkan menu pilihan dan user diminta untuk menginput salah satu dari kelima pilihan dan jika program sudah selesai menjalankan perintah maka proses (inputan untuk pemilihan menu) akan dijalankan berulang sampai user menginput perintah untuk mengakhiiri program. 
Kelima perintahnya yaitu:
* masukkan (1) untuk menjalankan perintah `add`
Jika user menjalankan perintah ini maka program akan meminta user untuk menginputkan serangakian data mahasiswa, yaitu nama, nim, program studi dan fakultas. 
Lalu sebelum diinput ke list, program akan melakukan pengecekan terlebih dahulu terhadap nim yang akan diinput, jika nim sudah tersedia di list maka program akan mengeluarkan error handling dan data tidak akan diinput ke list.
* masukkan (2) untuk menjalankan perintah `update`
Jika user menjalankan perintah ini maka program akan meminta user untuk menginput nim mahasiswa yang datanya akan diubah, jika nim tersedia pada list maka program akan meminta user menginputkan data mahasiswa yang baru (seperti pada perintah `add`) tapi jika nim tidak tersedia maka akan mengeluarkan error handling.
* masukkan (3) untuk menjalankan perintah `delete`
Jika user menjalankan perintah ini maka program akan meminta user untuk menginput nim mahasiswa yang datanya akan dihapus, jika nim tersedia maka data tersebut akan dihapus dari list tapi jika data nim tidak tersedia pada list maka akan mengeluarkan error handling.
* masukkan (4) untuk menjalankan perintah `show`
Jika user menjalankan perintah ini maka program akan meng-print semua data mahasiswa yang ada pada list dalam bentuk tabel sederhana.
* masukkan (5) untuk keluar dari program / mengakhiri program.

## Dokumentasi
Pada program C++

![Screenshot - CPP](https://user-images.githubusercontent.com/100757455/218741007-c48a166d-69b4-4b1d-8e28-e2dee638c94e.png)

Pada program PHP

![Screenshot - PHP](https://user-images.githubusercontent.com/100757455/218741121-b612de8e-c9cb-4260-baa4-9129cb16dbc1.png)
![Screenshot (252)](https://user-images.githubusercontent.com/100757455/218745954-b53de77c-c702-4d54-9353-2c0939ca024c.png)
