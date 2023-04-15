package curso_java;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class lesson3 {
    public static void main(String[] args){
        final double taxa_garcon = 0.1; //constante
        double valor_jantar, valor_jantar_total;
        valor_jantar = Double.parseDouble(JOptionPane.showInputDialog(null, "Informar o valor do jantar"));
        valor_jantar_total = valor_jantar + (taxa_garcon * valor_jantar);
        showMessageDialog(null, "O valor do jantar é "+valor_jantar_total);
    }
}
