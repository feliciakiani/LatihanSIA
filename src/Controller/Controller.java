/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Interface;
import javax.swing.JOptionPane;

/**
 *
 * @author Felicia
 */
public class Controller {

    Initialize init = new Initialize();

    public void printUserData(String _nama) {
        String kode = init.getArrListMhsSarjana().get(0).getListMataKuliahSarjana().get(0).getMataKuliahWajib().getKode();
        System.out.println("kode : " + kode);
        System.out.println("");

        String namaOrg = init.getArrListMhsSarjana().get(0).getNama();
        System.out.println("nama org : " + namaOrg);
        System.out.println("");

        String str = init.getArrListMhsSarjana().get(0).toString();
        System.out.println("sarjana : " + str);
        System.out.println("");

        str = init.getArrListMhsMagister().get(0).getListMataKuliahMagister().toString();
        System.out.println("magister : " + str);
        System.out.println("");

        str = init.getArrListMhsDoktor().get(0).toString();
        System.out.println("doktor : " + str);
        System.out.println("");

        str = init.getArrListDosenHonorer().get(0).toString();
        System.out.println("dosen honorer : " + str);
        System.out.println("");

        str = init.getArrListDosenTetap().toString();
        System.out.println("dosen tetap : " + str);
        System.out.println("");

        str = init.getKaryawan().get(0).toString();
        System.out.println("karyawan : " + str);
        System.out.println("");
        
        System.out.println("");
        System.out.println("");
        System.out.println(init.getArrListMhsSarjana().get(0).getListMataKuliahSarjana().size());

        System.out.println("");
        System.out.println("");
        
        
    }

    public void printNilaiAkhir(int _nim, String _kodeMK) {
        boolean foundSarjana = false;
        boolean foundMagister = false;
        boolean foundDoktor = false;
        boolean foundMatkul = false;
        for (int j = 0; j < init.getArrListMhsSarjana().size(); j++) {
            if (_nim == init.getArrListMhsSarjana().get(j).getNIM()) {
                foundSarjana = true;
                for (int i = 0; i < init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().size(); i++) {
                    if (_kodeMK.equals(init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahWajib().getKode()) 
                            || _kodeMK.equals(init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahPilihan().getKode())) {
                        foundMatkul = true;

                        float nilai = (float) init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN1();
                        nilai += (float) init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN2();
                        nilai += (float) init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN3();
                        nilai = nilai / 3;

                        JOptionPane.showMessageDialog(null, "Nilai Rata-Rata dari Mahasiswa " + _nim + ", pada kode mata kuliah " + _kodeMK + " = " + nilai);
                        return;
                    }
                }
            }
        }
        for (int j = 0; j < init.getArrListMhsMagister().size(); j++) {
            if (_nim == init.getArrListMhsMagister().get(j).getNIM()) {
                foundMagister = true;
                for (int i = 0; i < init.getArrListMhsMagister().get(j).getListMataKuliahMagister().size(); i++) {
                    if (_kodeMK.equals(init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahWajib().getKode()) 
                            || _kodeMK.equals(init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahPilihan().getKode())) {
                        foundMatkul = true;

                        float nilai = (float) init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN1();
                        nilai += (float) init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN2();
                        nilai += (float) init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN3();
                        nilai = nilai / 3;

                        JOptionPane.showMessageDialog(null, "Nilai Rata-Rata dari Mahasiswa " + _nim + ", pada kode mata kuliah " + _kodeMK + " = " + nilai);
                        return;
                    }
                }
            }
        }
        for (int j = 0; j < init.getArrListMhsDoktor().size(); j++) {
            if (_nim == init.getArrListMhsDoktor().get(j).getNIM()) {
                foundDoktor = true;
                foundMatkul = true;

                float nilai = init.getArrListMhsDoktor().get(j).getNilaiSidang1();
                nilai += init.getArrListMhsDoktor().get(j).getNilaiSidang2();
                nilai += init.getArrListMhsDoktor().get(j).getNilaiSidang3();
                nilai = nilai / 3;
                JOptionPane.showMessageDialog(null, "Nilai Rata-Rata dari Mahasiswa " + _nim + ", pada kode mata kuliah " + _kodeMK + " = " + nilai);
                return;
            }
        }

        if (!foundSarjana && !foundMagister && !foundDoktor) {
            JOptionPane.showMessageDialog(null, "NIM yang dimasukkan salah!");
        } else if (!foundMatkul) {
            JOptionPane.showMessageDialog(null, "Kode Mata Kuliah yang dimasukkan salah!");
        }

    }

    public void printRataNilaiAkhir(String _kodeMK) {
        String msg = "Nilai Akhir Rata-Rata dengan Kode : " + _kodeMK;
        boolean foundSarjana = false;
        boolean foundMagister = false;

        for (int j = 0; j < init.getArrListMhsSarjana().size(); j++) {
            for (int i = 0; i < init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().size(); i++) {
                if (_kodeMK.equals(init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahWajib().getKode()) 
                            || _kodeMK.equals(init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahPilihan().getKode())) {
                    foundSarjana = true;

                    float nilai = (float) init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN1();
                    nilai += (float) init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN2();
                    nilai += (float) init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN3();
                    nilai = nilai / 3;

                    msg += "\nMahasiswa " + init.getArrListMhsSarjana().get(j).getNama() + " = " + nilai;
                }
            }
        }

        if (foundSarjana) {
            JOptionPane.showMessageDialog(null, msg);
            return;
        }

        for (int j = 0; j < init.getArrListMhsMagister().size(); j++) {
            for (int i = 0; i < init.getArrListMhsMagister().get(j).getListMataKuliahMagister().size(); i++) {
                if (_kodeMK.equals(init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahWajib().getKode()) 
                            || _kodeMK.equals(init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahPilihan().getKode())) {
                    foundMagister = true;

                    float nilai = (float) init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN1();
                    nilai += (float) init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN2();
                    nilai += (float) init.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN3();
                    nilai = nilai / 3;

                    msg += "\nMahasiswa " + init.getArrListMhsMagister().get(j).getNama() + " = " + nilai;
                }
            }
        }

        if (foundMagister) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            JOptionPane.showMessageDialog(null, "Kode Mata Kuliah yang dimasukkan salah!");
        }
    }

    public void printJumlahMhsTidakLulus(String _kodeMK) {
        int total = 0;
        boolean foundKode = false;

    }

    public void printMatkulAmbilDanPresensiMhs(int _nim) {
        String msg = "Mahasiswa NIM : " + _nim + ", Nama = ";
        boolean foundSarjana = false;
        boolean foundMagister = false;

        for (int j = 0; j < init.getArrListMhsSarjana().size(); j++) {
            if (_nim == init.getArrListMhsSarjana().get(j).getNIM()) {
                foundSarjana = true;
                msg += init.getArrListMhsSarjana().get(j).getNama() + " :\n";
                for (int i = 0; i < init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().size(); i++) {
                    msg += init.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().toString();
                }
            }
        }
        if (foundSarjana) {
            JOptionPane.showMessageDialog(null, msg);
            return;
        }

        for (int j = 0; j < init.getArrListMhsMagister().size(); j++) {
            if (_nim == init.getArrListMhsMagister().get(j).getNIM()) {
                foundMagister = true;
                msg += init.getArrListMhsMagister().get(j).getNama() + " :\n";
                for (int i = 0; i < init.getArrListMhsMagister().get(j).getListMataKuliahMagister().size(); i++) {
                    msg += init.getArrListMhsMagister().get(j).getListMataKuliahMagister().toString();
                }
            }
        }
        if (foundMagister) {
            JOptionPane.showMessageDialog(null, msg);
        } else if (!foundSarjana && !foundMagister) {
            JOptionPane.showMessageDialog(null, "NIM yang dimasukkan salah!");
        }
    }

    public void printTotalJamMengajarDosen(int _nik) {
        // asumsi : tiap kelas = 2jam
        int total = 0;
        String msg = "Dosen NIK : " + _nik + ", Nama = ";
        boolean foundTetap = false;
        boolean foundHonorer = false;
        for (int i = 0; i < init.getArrListDosenTetap().size(); i++) {
            if (_nik == init.getArrListDosenTetap().get(i).getNIK()) {
                msg += init.getArrListDosenTetap().get(i).getNama();
                foundTetap = true;
                for (int j = 0; j < init.getArrListDosenTetap().get(i).getListMataKuliahAjar().size(); j++) {
                    for (int k = 0; k < init.getArrListDosenTetap().get(i).getListMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (init.getArrListDosenTetap().get(i).getListMataKuliahAjar().get(j).getListPresensiStaff().get(k).getStatus() == Interface.HADIR) {
                            total += 2;
                        }
                    }
                }
            }
        }
        if (foundTetap) {
            JOptionPane.showMessageDialog(null, msg + " sebagai dosen tetap mengajar dengan total " + total + " jam");
            return;
        }

        for (int i = 0; i < init.getArrListDosenHonorer().size(); i++) {
            if (_nik == init.getArrListDosenHonorer().get(i).getNIK()) {
                msg += init.getArrListDosenHonorer().get(i).getNama();
                foundTetap = true;
                for (int j = 0; j < init.getArrListDosenHonorer().get(i).getListMataKuliahAjar().size(); j++) {
                    for (int k = 0; k < init.getArrListDosenHonorer().get(i).getListMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (init.getArrListDosenHonorer().get(i).getListMataKuliahAjar().get(j).getListPresensiStaff().get(k).getStatus() == Interface.HADIR) {
                            total += 2;
                        }
                    }
                }
            }
        }
        if (foundHonorer) {
            JOptionPane.showMessageDialog(null, msg + " sebagai dosen honorer mengajar dengan total " + total + " jam");
        } else if (!foundTetap && !foundHonorer) {
            JOptionPane.showMessageDialog(null, "NIK yang dimasukkan salah!");
        }
    }

    public void printGajiStaff(int _nik) {
        boolean foundKaryawan = false;
        boolean foundDosenTetap = false;
        boolean foundDosenHonorer = false;
        String msg = "Karyawan " + _nik + " ";
        float gaji = 0;
        int presensi = 0;
        for (int i = 0; i < init.getKaryawan().size(); i++) {
            if (_nik == (init.getKaryawan().get(i).getNIK())) {
                foundKaryawan = true;
                for (int j = 0; j < init.getKaryawan().get(i).getListPresensiStaff().size(); j++) {
                    if (init.getKaryawan().get(i).getListPresensiStaff().get(j).getStatus() == Interface.HADIR) {
                        presensi++;
                    }
                }
                gaji = presensi / 22 * init.getKaryawan().get(i).getSalary();
            }
        }

        if (foundKaryawan) {

            JOptionPane.showMessageDialog(null, msg + " memiliki gaji sebesar Rp" + gaji);
            return;
        }

        for (int i = 0; i < init.getArrListDosenTetap().size(); i++) {
            if (_nik == (init.getKaryawan().get(i).getNIK())) {
                foundDosenTetap = true;
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < init.getArrListDosenTetap().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (init.getArrListDosenTetap().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().get(j).getStatus() == Interface.HADIR) {
                            presensi++;
                        }
                    }
                }
                gaji = presensi / 22 * init.getArrListDosenTetap().get(i).getSalary();
            }
        }

        if (foundKaryawan) {
            JOptionPane.showMessageDialog(null, msg + " memiliki gaji sebesar Rp" + gaji);
            return;
        }

        for (int i = 0; i < init.getKaryawan().size(); i++) {
            if (_nik == init.getKaryawan().get(i).getNIK()) {
                foundKaryawan = true;
                for (int j = 0; j < init.getKaryawan().get(i).getListPresensiStaff().size(); j++) {
                    if (init.getKaryawan().get(i).getListPresensiStaff().get(j).getStatus() == Interface.HADIR) {
                        presensi++;
                    }
                }
                gaji = presensi / 22 * init.getKaryawan().get(i).getSalary();
            }
        }

        if (foundKaryawan) {
            JOptionPane.showMessageDialog(null, msg + " memiliki gaji sebesar Rp" + gaji);
            return;
        }

    }

}
