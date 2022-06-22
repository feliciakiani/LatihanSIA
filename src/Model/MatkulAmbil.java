/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Felicia
 */
public class MatkulAmbil {
    
    MataKuliah mataKuliahWajib = new MataKuliah();
    MatkulPilihan mataKuliahPilihan = new MatkulPilihan();
    ArrayList<Presensi> listPresensi = new ArrayList<>();
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah mataKuliahWajib, ArrayList<Presensi> listPresensi, int n1, int n2, int n3) {
        setListPresensi(listPresensi);
        setMataKuliahWajib(mataKuliahWajib);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3; 
    }
    
    public MatkulAmbil(MatkulPilihan mataKuliahPilihan, ArrayList<Presensi> listPresensi, int n1, int n2, int n3) {
        setListPresensi(listPresensi);
        setMataKuliahPilihan(mataKuliahPilihan);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3; 
    }

    public MatkulAmbil() {
    }
    
    public MataKuliah getMataKuliahWajib() {
        return mataKuliahWajib;
    }

    public void setMataKuliahWajib(MataKuliah mataKuliahWajib) {
        this.mataKuliahWajib = mataKuliahWajib;
    }
    
    public MatkulPilihan getMataKuliahPilihan() {
        return mataKuliahPilihan;
    }

    public void setMataKuliahPilihan(MatkulPilihan mataKuliahPilihan) {
        this.mataKuliahPilihan = mataKuliahPilihan;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "\nMatkulAmbil: " + mataKuliahPilihan.toString() + mataKuliahWajib.toString() + "\nlistPresensi=" + listPresensi + "\nN1=" + n1 + "\nN2=" + n2 + "\nN3=" + n3;
    }
    
}
