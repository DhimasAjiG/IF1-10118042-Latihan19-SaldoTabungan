/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Saldo Tabungan Dengan bunga 15%
 */
public class IF110118042Latihan19SaldoTabungan {
    public static void main(String[] args) {
        double bunga;
        double saldo = 2500000;
        
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        rupiah.setDecimalFormatSymbols(formatRp);
            for(int i = 1;i<=6;i++){
                bunga =  0.15 * saldo ;
                saldo = bunga + saldo;
                System.out.printf("Saldo di bulan ke- " + i +  " %s%n",rupiah.format(saldo) );
            }
    }
}
