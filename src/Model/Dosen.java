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
abstract class Dosen extends Staff {
    
    private String departemen;
    private ArrayList<MatkulAjar> listMataKuliahAjar = new ArrayList<>();
    
    
    public Dosen(String departemen, int NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
        setListMataKuliahAjar(listMataKuliahAjar);
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMataKuliahAjar() {
        return listMataKuliahAjar;
    }

    public void setListMataKuliahAjar(ArrayList<MatkulAjar> listMataKuliahAjar) {
        this.listMataKuliahAjar = listMataKuliahAjar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen=" + departemen + "\nlistMataKuliahAjar=" + listMataKuliahAjar ;
    }
    
    
}
