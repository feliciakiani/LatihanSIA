/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author Felicia
 */
public class Initialize {
    
    String nama, alamat, TTL, telp, jurusan, judulTesis, judulDisertasi;
    int nim, nik;
    String departemen;
    int salary, honorPerSKS;
    
    MataKuliah matkul1, matkul2, matkul3, matkul4;
    Presensi presensi1, presensi2, presensi3;
    ArrayList<Presensi> listPresensi1, listPresensi2, listPresensi3, listPresensi4;
    MatkulAmbil matkulAmbilWajib1, matkulAmbilWajib2, matkulAmbilWajib3, matkulAmbilPilihan;
    MatkulPilihan matkulPilihan1, matkulPilihan2, matkulPilihan3;
    ArrayList<MatkulAmbil> listMataKuliahMagister1, listMataKuliahMagister2, listMataKuliahMagister3, listMataKuliahMagister4 ;
    
    PresensiStaff presensiStaff1, presensiStaff2, presensiStaff3, presensiStaff4;
    ArrayList<PresensiStaff> listPresensiStaff, listPresensiStaff1, listPresensiStaff2, listPresensiStaff3, listPresensiStaff4, listPresensiStaff5, listPresensiStaff6;
    MatkulAjar matkulAjar1, matkulAjar2, matkulAjar3, matkulAjar4, matkulAjar5, matkulAjar6;
    ArrayList<MatkulAjar> listMataKuliahAjar;
    
    ArrayList<MahasiswaSarjana> listMhsSarjana = new ArrayList<>();
    ArrayList<MahasiswaMagister> listMhsMagister = new ArrayList<>();
    ArrayList<MahasiswaDoktor> listMhsDoktor = new ArrayList<>();
    ArrayList<DosenTetap> listDosenTetap = new ArrayList<>();
    ArrayList<DosenHonorer> listDosenHonorer = new ArrayList<>();
    ArrayList<Karyawan> listKaryawan = new ArrayList<>();

    Initialize() {
        initArrListMhsSarjana();
        initArrListMhsMagister();
        initArrListMhsDoktor();
        initArrListDosenTetap();
        initArrListDosenHonorer();
        initArrListKaryawan();
    }
    
    private void initArrListMhsSarjana() {

        matkul1 = new MataKuliah("IF-101", 4, "Algoritma dan Pemrograman");
        matkul2 = new MataKuliah("KU-101", 2, "PPKN");
        matkul3 = new MataKuliah("IF-102", 2, "Desaign Web");

        matkulPilihan1 = new MatkulPilihan(15, "IF-103", 2, "Probstat");
        matkulPilihan2 = new MatkulPilihan(10, "KU-102", 2, "Bhs. Ind");
        matkulPilihan3 = new MatkulPilihan(7, "IF-104", 3, "Strategi Algoritmik");

        ArrayList<Presensi> tempPresensi;
        ArrayList<MatkulAmbil> tempListMataKuliah;

        // MAHASISWA 1
        nama = "Anton";
        alamat = "Jalan A";
        TTL = "Bdg, 1 Jan 1999";
        nim = 101;
        telp = "081319521";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // ambil algo - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 70, 80, 85));

        // ambil ppkn - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 90, 70, 61));

        // ambil webdes - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 92, 74, 88));

        // ambil probstat - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 50, 82, 79));

        listMhsSarjana.add(new MahasiswaSarjana(nama, nim, jurusan, alamat, TTL, telp, tempListMataKuliah));

        // MAHASISWA 2
        nama = "Budi";
        alamat = "Jalan B";
        TTL = "Bdg, 5 Juni 1999";
        nim = 102;
        telp = "081048621";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // ambil algo - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 90, 55, 74));

        // ambil ppkn - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 79, 74, 80));

        // ambil webdes - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 78, 81, 50));

        // ambil stragol - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan3, tempPresensi, 46, 81, 63));

        listMhsSarjana.add(new MahasiswaSarjana(nama, nim, jurusan, alamat, TTL, telp, tempListMataKuliah));

        // MAHASISWA 3
        nama = "Cemara";
        alamat = "Jalan C";
        TTL = "Bdg, 9 Feb 1999";
        nim = 103;
        telp = "0846512";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // ambil algo - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 50, 47, 64));

        // ambil ppkn - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 80, 77, 64));

        // ambil webdes - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 59, 74, 78));

        // ambil probstat - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 67, 86, 55));

        listMhsSarjana.add(new MahasiswaSarjana(nama, nim, jurusan, alamat, TTL, telp, tempListMataKuliah));

        // MAHASISWA 4
        nama = "Delimah";
        alamat = "Jalan D";
        TTL = "Bdg, 19 Aug 1999";
        nim = 104;
        telp = "0817953542";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // ambil algo - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 90, 80, 88));

        // ambil ppkn - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 60, 48, 61));

        // ambil webdes - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 92, 57, 81));

        // ambil probstat - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 51, 74, 79));

        listMhsSarjana.add(new MahasiswaSarjana(nama, nim, jurusan, alamat, TTL, telp, tempListMataKuliah));

        // MAHASISWA 5
        nama = "Eka";
        alamat = "Jalan E";
        TTL = "Bdg, 26 Des 1999";
        nim = 105;
        telp = "081645131";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // ambil algo - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 97, 80, 85));

        // ambil ppkn - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 49, 70, 71));

        // ambil webdes - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 82, 71, 82));

        // ambil indo - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan2, tempPresensi, 50, 82, 59));

        listMhsSarjana.add(new MahasiswaSarjana(nama, nim, jurusan, alamat, TTL, telp, tempListMataKuliah));

    }

    private void initArrListMhsMagister(){
        
        matkul1 = new MataKuliah("IF-201", 4, "Struktur Data");
        matkul2 = new MataKuliah("KU-201", 2, "Agama");
        matkul3 = new MataKuliah("IF-202", 2, "Web Programming");
        
        matkulPilihan1 = new MatkulPilihan(10, "IF-203", 2, "Kalkulus");
        matkulPilihan2 = new MatkulPilihan(10, "KU-202", 2, "Bhs. Ing");
        matkulPilihan3 = new MatkulPilihan(6, "IF-204", 3, "Sistem Informasi");
        
        
        ArrayList<Presensi> tempPresensi;
        ArrayList<MatkulAmbil> tempListMataKuliah;
        
        
        // MAHASISWA 1
        nama = "Ananda";
        alamat = "Jalan A";
        TTL = "Bdg, 7 Jan 1996";
        nim = 201;
        telp = "0818764213";
        jurusan = "Informatika";
        judulTesis = "A -> B";
        
        tempListMataKuliah = new ArrayList<>();
        
        // ambil sdat - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 70, 80, 88));
        
        // ambil agama - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 90, 70, 61));
        
        // ambil webprog - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 92, 74, 88));
        
        // ambil si - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan3, tempPresensi, 50, 82, 79));
        
        listMhsMagister.add(new MahasiswaMagister(nama, nim, jurusan, alamat, TTL, telp, judulTesis, tempListMataKuliah));
        
        
        
        // MAHASISWA 2
        nama = "Bunga";
        alamat = "Jalan B";
        TTL = "Bdg, 15 Mar 1996";
        nim = 201;
        telp = "081794213";
        jurusan = "Informatika";
        judulTesis = "B -> C";
        
        tempListMataKuliah = new ArrayList<>();
        
        // ambil sdat - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 50, 80, 85));
        
        // ambil agama - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 48, 60, 71));
        
        // ambil webprog - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 50, 74, 89));
        
        // ambil ing - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan2, tempPresensi, 80, 42, 59));
        
        listMhsMagister.add(new MahasiswaMagister(nama, nim, jurusan, alamat, TTL, telp, judulTesis, tempListMataKuliah));
        
        
        // MAHASISWA 3
        nama = "Chad";
        alamat = "Jalan C";
        TTL = "Bdg, 24 Sept 1996";
        nim = 203;
        telp = "081465132";
        jurusan = "Informatika";
        judulTesis = "C -> D";
        
        tempListMataKuliah = new ArrayList<>();
        
        // ambil sdat - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 80, 80, 77));
        
        // ambil agama - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 90, 45, 67));
        
        // ambil webprog - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 48, 74, 78));
        
        // ambil kalk - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 51, 72, 49));
        
        listMhsMagister.add(new MahasiswaMagister(nama, nim, jurusan, alamat, TTL, telp, judulTesis, tempListMataKuliah));
        
        
        // MAHASISWA 4
        nama = "Diana";
        alamat = "Jalan D";
        TTL = "Bdg, 7 Juli 1996";
        nim = 204;
        telp = "081174210";
        jurusan = "Informatika";
        judulTesis = "D -> E";
        
        tempListMataKuliah = new ArrayList<>();
        
        // ambil sdat - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 0));
        tempListMataKuliah.add(new MatkulAmbil(matkul1, tempPresensi, 67, 81, 85));
        
        // ambil agama - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul2, tempPresensi, 90, 88, 61));
        
        // ambil webprog - wajib
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 1));
        tempPresensi.add(new Presensi("2 Juni 2022", 1));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkul3, tempPresensi, 51, 40, 49));
        
        // ambil si - pilihan
        tempPresensi = new ArrayList<>();
        tempPresensi.add(new Presensi("1 Juni 2022", 0));
        tempPresensi.add(new Presensi("2 Juni 2022", 0));
        tempPresensi.add(new Presensi("3 Juni 2022", 1));
        tempListMataKuliah.add(new MatkulAmbil(matkulPilihan1, tempPresensi, 40, 52, 79));
        
        listMhsMagister.add(new MahasiswaMagister(nama, nim, jurusan, alamat, TTL, telp, judulTesis, tempListMataKuliah));
        
    }
    
    private void initArrListMhsDoktor() {
        // MAHASISWA 1
        nama = "Amina";
        alamat = "Jalan A";
        TTL = "Bdg, 10 Apr 1990";
        nim = 301;
        telp = "081675134";
        jurusan = "Informatika";
        judulDisertasi = "AA -> BB";
        
        listMhsDoktor.add(new MahasiswaDoktor(nama, nim, jurusan, alamat, TTL, telp, judulDisertasi, 80, 90, 82));
        
        
        // MAHASISWA 2
        nama = "Bob";
        alamat = "Jalan B";
        TTL = "Bdg, 8 Nov 1990";
        nim = 302;
        telp = "0817946513";
        jurusan = "Informatika";
        judulDisertasi = "BB -> CC";
        
        listMhsDoktor.add(new MahasiswaDoktor(nama, nim, jurusan, alamat, TTL, telp, judulDisertasi, 75, 88, 79));
    }
    
    public void initArrListDosenTetap() {
        
        ArrayList<PresensiStaff> tempPresensiStaff;
        ArrayList<MatkulAjar> tempListMataKuliahAjar;
        
        matkul1 = new MataKuliah("IF-101", 4, "Algoritma dan Pemrograman");
        matkul2 = new MataKuliah("KU-101", 2, "PPKN");
        
        nama = "Zach";
        alamat = "Jalan Z";
        TTL = "Bdg, 1 Nov 1964";
        nik = 001;
        telp = "081419764651";
        departemen = "Informatika";
        salary = 1500000;
        
        tempListMataKuliahAjar = new ArrayList<>();
        
        // algo
        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Juni 2020", 1, "09.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Juni 2020", 0, "11.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Juni 2020", 1, "13.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul1, tempPresensiStaff));
        
        // ppkn
        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Juni 2020", 1, "14.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Juni 2020", 0, "17.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Juni 2020", 1, "09.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul2, tempPresensiStaff));
        
        listDosenTetap.add(new DosenTetap(nama, nik, alamat, TTL, telp, salary, departemen, tempListMataKuliahAjar));
    }
    
    public void initArrListDosenHonorer() {
        
        ArrayList<PresensiStaff> tempPresensiStaff;
        ArrayList<MatkulAjar> tempListMataKuliahAjar;
        
        matkul1 = new MataKuliah("IF-201", 4, "Struktur Data");
        matkul2 = new MataKuliah("KU-201", 2, "Agama");
        
        nama = "Yeri";
        alamat = "Jalan Y";
        TTL = "Bdg, 12 Okt 1960";
        nik = 002;
        telp = "0819754631";
        departemen = "Informatika";
        honorPerSKS = 1000000;
        
        tempListMataKuliahAjar = new ArrayList<>();
        
        // sdat
        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Juni 2020", 1, "09.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Juni 2020", 0, "11.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Juni 2020", 1, "13.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul1, tempPresensiStaff));
        
        // agama
        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Juni 2020", 1, "14.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Juni 2020", 1, "17.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Juni 2020", 1, "09.00"));
        tempListMataKuliahAjar.add(new MatkulAjar(matkul2, tempPresensiStaff));
        
        listDosenHonorer.add(new DosenHonorer(nama, nik, alamat, TTL, telp, honorPerSKS, departemen, tempListMataKuliahAjar));
    }
    
    public void initArrListKaryawan(){
        
        ArrayList<PresensiStaff> tempPresensiStaff;
        
        nama = "Xander";
        alamat = "Jalan X";
        TTL = "Bdg, 5 Nov 1962";
        nik = 003;
        telp = "0819462345";
        salary = 1000000;
        
        tempPresensiStaff = new ArrayList<>();
        tempPresensiStaff.add(new PresensiStaff("1 Juni 2020", 0, "14.00"));
        tempPresensiStaff.add(new PresensiStaff("2 Juni 2020", 1, "17.00"));
        tempPresensiStaff.add(new PresensiStaff("3 Juni 2020", 1, "09.00"));
        
        listKaryawan.add(new Karyawan(nama, nik, alamat, TTL, telp, salary, tempPresensiStaff));
    }
    
    public ArrayList<MahasiswaSarjana> getArrListMhsSarjana() {
        return listMhsSarjana;
    }
    
    public ArrayList<MahasiswaMagister> getArrListMhsMagister(){
        return listMhsMagister;
    }
    
    public ArrayList<MahasiswaDoktor> getArrListMhsDoktor() {
        return listMhsDoktor;
    }
    
    public ArrayList<DosenTetap> getArrListDosenTetap(){
        return listDosenTetap;
    }
    
    public ArrayList<DosenHonorer> getArrListDosenHonorer(){
        return listDosenHonorer;
    }
    
    public ArrayList<Karyawan> getArrListKaryawan() {
        return listKaryawan;
    }
}
