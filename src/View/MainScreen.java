/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import Model.Konstanta;
import Controller.*;

/**
 *
 * @author Felicia
 */
public class MainScreen {

    public MainScreen() {
        
        Controller c = new Controller();
        InputVariables i = new View.InputVariables();

        String namaInput;
        int NIMinput;
        String kodeMKinput;
        int NIKinput;

        JOptionPane.showMessageDialog(null, "Selamat datang di Sistem Informasi Akademik ITHB!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
        int menuUtama = 0;
        int menuAdmin = 0;
        int menuMhs = 0;

        while (menuUtama != 3) {
            menuUtama = Integer.parseInt(JOptionPane.showInputDialog(Konstanta.MAIN_MENU_MSG));

            switch (menuUtama) {
                case 1:
                    while (menuAdmin != 8) {
                        menuAdmin = Integer.parseInt(JOptionPane.showInputDialog(Konstanta.ADMIN_MENU_MSG));

                        switch (menuAdmin) {
                            case 1: //Print Data User
                                namaInput = i.inputNama();
                                c.printUserData(namaInput);

                                break;
                            case 2: // Print Nilai Akhir (NA) Mahasiswa
                                NIMinput = i.inputNIM();
                                kodeMKinput = i.inputKodeMK();
                                
                                c.printNilaiAkhir(NIMinput, kodeMKinput);
                                

                                break;
                            case 3:// Print Rata" Nilai Akhir (NR) Seluruh Mhs Per Matkul
                                kodeMKinput = i.inputKodeMK();
                                c.printRataNilaiAkhir(kodeMKinput);

                                break;
                            case 4: // Print Byk Mhs Tdk Lulus Per Matkul
                                kodeMKinput = i.inputKodeMK();
                                c.printJumlahMhsTidakLulus(kodeMKinput);

                                break;
                            case 5: // Print Matkul Ambil dan Presensi Mhs
                                NIMinput = i.inputNIM();
                                c.printMatkulAmbilDanPresensiMhs(NIMinput);

                                break;
                            case 6: // Print Total Jam Mengajar Dosen
                                NIKinput = i.inputNIK();
                                c.printTotalJamMengajarDosen(NIKinput);

                                break;
                            case 7: // Print Gaji Staff
                                NIKinput = i.inputNIK();
                                c.printGajiStaff(NIKinput);

                                break;
                            case 8: // Back to Main Menu
                                JOptionPane.showMessageDialog(null, "Back to Main Menu!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Wrong Input!");
                                break;
                        }
                    }
                    menuAdmin = 0;
                    break;

                case 2:
                    while(menuMhs != 3 ){
                        menuMhs = Integer.parseInt(JOptionPane.showInputDialog(Konstanta.MAHASISWA_MENU_MSG));
                        
                        switch(menuMhs){
                            case 1: //Print Nilai Akhir (NA) Mahasiswa
                                NIMinput = i.inputNIK();
                                kodeMKinput = i.inputKodeMK();
                                
                                c.printNilaiAkhir(NIMinput, kodeMKinput);
                                
                                break;
                            case 2: //Print Matkul Ambil dan Presensi Mahasiswa
                                NIMinput = i.inputNIM();
                                c.printMatkulAmbilDanPresensiMhs(NIMinput);
                                
                                
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Back to Main Menu!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Wrong Input!");
                                break;
                        }
                    }
                    menuMhs = 0;
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Terima kasih sudah menggunakan SIA ITHB! \nExit Program SIA ITHB!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                    break;
            }

        }

    }

}
