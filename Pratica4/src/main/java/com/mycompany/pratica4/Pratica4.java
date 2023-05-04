/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica4;
import javax.swing.JOptionPane;
/**
 *
 * @author Ana
 */
public class Pratica4 {

    public static void main(String[] args) {
    double nota;
    double salario;
    String sexo;
    int idade;
    
    do {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota (entre 0 e 10):"));
       if (nota < 0 || nota > 10){
            JOptionPane.showMessageDialog(null,"Valor inválido. Digite novamente ");
       }
    } while (nota < 0 || nota > 10);
        JOptionPane.showMessageDialog(null, "valor válido");
    
    
        do {
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário (maior que 0):"));
        } while (salario <= 0);
        
        do {
            sexo = JOptionPane.showInputDialog("Digite o sexo (m ou f):").toLowerCase();
        } while (!sexo.equals("m") && !sexo.equals("f"));
        
        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (entre 0 e 150):"));
        } while (idade < 0 || idade > 150);
        
        JOptionPane.showMessageDialog(null, "Dados válidos: nota = " + nota + ", salário = " + salario + ", sexo = " + sexo + ", idade = " + idade);
    }
}