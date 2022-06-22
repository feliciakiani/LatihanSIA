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
public class DosenHonorer extends Dosen {
    
    ArrayList<MatkulAjar> mataKuliahAjar = new ArrayList<MatkulAjar>();
    private int honorPerSKS;

    public DosenHonorer(String nama, int NIK, String alamat, String TTL, String telepon, int honorPerSKS, String departemen, ArrayList<MatkulAjar> mataKuliahAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
        setMataKuliahAjar(mataKuliahAjar);
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public ArrayList<MatkulAjar> getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(ArrayList<MatkulAjar> mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\nDosen Honorer : \n" + "Honor Per SKS=" + honorPerSKS;
    }
    
    
    
}
