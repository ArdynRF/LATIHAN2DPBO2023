package new_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void printData(List<SivitasAkademik> sivitasList) {
        System.out.printf("%-20s%-15s%-20s%-15s%-20s%-20s%-25s%-25s\n", "Nama", "NIK", "Jenis Kelamin",
                "NIM", "Prodi", "Fakultas", "Asal Univ", "Email");

        for (SivitasAkademik sivitas : sivitasList) {
            System.out.printf("%-20s%-15d%-20s%-15d%-20s%-20s%-25s%-25s\n", sivitas.getNama(), sivitas.getNik(),
                    sivitas.getKelamin(), sivitas.getNim(), sivitas.getProdi(), sivitas.getFakultas(),
                    sivitas.getAsalUniv(),
                    sivitas.getEmail());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berapa banyak orang mahasiswa : ");

        int n = scanner.nextInt();

        List<SivitasAkademik> sList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            SivitasAkademik temp = new SivitasAkademik();

            System.out.println("Orang ke-" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("NIK: ");
            long nik = scanner.nextLong();
            System.out.print("Gender: ");
            String kelamin = scanner.next();
            System.out.print("NIM: ");
            long nim = scanner.nextLong();
            System.out.print("Major: ");
            String prodi = scanner.next();
            System.out.print("Faculty: ");
            String fakultas = scanner.next();
            System.out.print("University: ");
            String univ = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.println();

            temp.setNama(name);
            temp.setNik(nik);
            temp.setKelamin(kelamin);
            temp.setNim(nim);
            temp.setProdi(prodi);
            temp.setFakultas(fakultas);
            temp.setAsalUniv(univ);
            temp.setEmail(email);

            sList.add(temp);
        }

        printData(sList);
    }
}