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
public class MatkulAjar{
    
    MataKuliah mataKuliahAjar = new MataKuliah();
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatkulAjar(MataKuliah mataKuliahAjar, ArrayList<PresensiStaff> listPresensiStaff ) {
        setMataKuliahAjar(mataKuliahAjar);
        setListPresensiStaff(listPresensiStaff);
    }
    
    

    public MataKuliah getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(MataKuliah mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }

    
    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar:" + mataKuliahAjar.toString() + "\nlistPresensiStaff=" + listPresensiStaff + '}';
    }
    
    
}
