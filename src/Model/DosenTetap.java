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
public class DosenTetap extends Dosen {
    
    private int salary;
    ArrayList<MatkulAjar> mataKuliahAjar = new ArrayList<MatkulAjar>();

    public DosenTetap(String nama, int NIK, String alamat, String TTL, String telepon, int salary, String departemen, ArrayList<MatkulAjar> mataKuliahAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        setMataKuliahAjar(mataKuliahAjar);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<MatkulAjar> getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(ArrayList<MatkulAjar> mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }
    
    

    @Override
    public String toString() {
        return "DosenTetap : \n" + super.toString() + "\nSalary=" + salary;
    }
    
    
    
}
