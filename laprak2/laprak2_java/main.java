package laprak2_java;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Mahasiswa> Hlist = new ArrayList<>();
        List<SivitasAkademik> Slist = new ArrayList<>();

        SivitasAkademik sivitasAkademik = new SivitasAkademik();
        Mahasiswa temp = new Mahasiswa();

        temp.setnik(1);
        temp.setNama("ardyn");
        temp.setKelamin("L");
        temp.setNim(201);
        temp.setFakultas("FPMIPA");
        temp.setProdi("Ilkom");

        sivitasAkademik.setUniv("UPI");
        sivitasAkademik.setEmail("ardyn@upi.edu");

        Hlist.add(temp);
        Slist.add(sivitasAkademik);

        Mahasiswa temp2 = new Mahasiswa();
        SivitasAkademik sivitasAkademik2 = new SivitasAkademik();
        temp2.setnik(2);
        temp2.setNama("yusuf");
        temp2.setKelamin("L");
        temp2.setNim(202);
        temp2.setFakultas("FPMIPA");
        temp2.setProdi("Ilkom");

        sivitasAkademik2.setUniv("UPI");
        sivitasAkademik2.setEmail("yusuf@upi.edu");

        Hlist.add(temp2);
        Slist.add(sivitasAkademik2);

        Mahasiswa temp3 = new Mahasiswa();
        SivitasAkademik sivitasAkademik3 = new SivitasAkademik();
        temp3.setnik(3);
        temp3.setNama("faiz");
        temp3.setKelamin("L");
        temp3.setNim(203);
        temp3.setFakultas("FPMIPA");
        temp3.setProdi("Ilkom");

        sivitasAkademik3.setUniv("UPI");
        sivitasAkademik3.setEmail("faiz@upi.edu");

        Hlist.add(temp3);
        Slist.add(sivitasAkademik3);

        Mahasiswa temp4 = new Mahasiswa();
        SivitasAkademik sivitasAkademik4 = new SivitasAkademik();
        temp4.setnik(4);
        temp4.setNama("ayes");
        temp4.setKelamin("L");
        temp4.setNim(204);
        temp4.setFakultas("FPMIPA");
        temp4.setProdi("Ilkom");

        sivitasAkademik4.setUniv("UPI");
        sivitasAkademik4.setEmail("ayes@upi.edu");

        Hlist.add(temp4);
        Slist.add(sivitasAkademik4);

        System.out.println("Berikut isi dari list Mahasiswa: ");
        for (Mahasiswa mahasiswa : Hlist) {
            System.out.println(mahasiswa.getNama() + " " + mahasiswa.getNim() + " " +
                    mahasiswa.getFakultas() + " " + mahasiswa.getProdi() + " ");
        }

        System.out.println("Berikut isi dari list Sivitas: ");
        for (SivitasAkademik sivitas : Slist) {
            System.out.println(sivitas.getUniv() + " " + sivitas.getEmail());
        }

        System.out.println();

    }

}
