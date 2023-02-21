<?php
require('Human.php');

$sivitasAkademikList = array(
    new SivitasAkademik("John Doe", 123456789, "Male", 1234567, "Computer Science", "Engineering", "University of XYZ", "john.doe@xyz.edu"),
    new SivitasAkademik("Jane Smith", 987654321, "Female", 7654321, "Electrical Engineering", "Engineering", "University of ABC", "jane.smith@abc.edu")
);

echo "<table border = 2>\n";
echo "<thead>\n";
echo "<tr><th>Full Name</th><th>NIK</th><th>Gender</th><th>NIM</th><th>Program Studi</th><th>Fakultas</th><th>Universitas</th><th>Email</th></tr>\n";
echo "</thead>\n";
echo "<tbody>\n";
foreach ($sivitasAkademikList as $sivitasAkademik) {
    echo "<tr>\n";
    echo "<td>" . $sivitasAkademik->getNama() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getNik() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getKelamin() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getNim() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getProdi() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getFakultas() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getUniv() . "</td>\n";
    echo "<td>" . $sivitasAkademik->getEmail() . "</td>\n";
    echo "</tr>\n";
}
echo "</tbody>\n";
echo "</table>\n";
