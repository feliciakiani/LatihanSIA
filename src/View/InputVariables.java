/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Felicia
 */
class InputVariables {
    String inputNama(){
        return JOptionPane.showInputDialog("Input Nama User : ");
    }
    
    int inputNIK(){
        return Integer.parseInt(JOptionPane.showInputDialog("Input NIK Anda : \n(Clue: 001-003)"));
    }
    
    int inputNIM(){
        return Integer.parseInt(JOptionPane.showInputDialog("Input NIM Anda : \n(Clue: 101-105; 201-204; 301-302)"));
    }
    
    String inputKodeMK() {
        return JOptionPane.showInputDialog("Input Kode Mata Kuliah: \n(Clue: IF-101, IF-102, IF-103, IF-104, IF-201, IF-202, IF-203, IF-204, KU-101, KU-102, KU-201, KU-202)");
    }
    
    
}
