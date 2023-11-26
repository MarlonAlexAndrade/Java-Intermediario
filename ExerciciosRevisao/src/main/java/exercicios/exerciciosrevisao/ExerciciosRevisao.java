/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package exercicios.exerciciosrevisao;

import javax.swing.JOptionPane;

/**
 *
 * @author 72782
 */
public class ExerciciosRevisao {

    public static void main(String[] args) {
        int categoriaFilmes = 0;
        int qtFilmes = 0;
        int qtDias = 0;
        String txt = "";
        double valor = 5;
        String codigoDesconto = "";

        txt = "Categorias: \n 1 - Terror \n 2- Comedia \n 3 - Animação";

        categoriaFilmes = Integer.parseInt(JOptionPane.showInputDialog(txt));

        if (categoriaFilmes == 1) {
            qtFilmes = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Filmes"));

        } else if (categoriaFilmes == 2) {
            qtFilmes = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Filmes"));
        } else if (categoriaFilmes == 3) {
            qtFilmes = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Filmes"));
        }

        if (qtFilmes == 1) {
            qtDias = 3;
        } else if (qtFilmes == 2) {
            qtDias = 7;
        } else if (qtFilmes == 3) {
            qtDias = 15;
        }

        valor = valor * qtFilmes;

        codigoDesconto = JOptionPane.showInputDialog("Você possui codigo de desconto \n 1 - Sim \n 2 - Não");

        if (codigoDesconto.equalsIgnoreCase("1")) {
            codigoDesconto = JOptionPane.showInputDialog("Digite o codigo");

            if (codigoDesconto.equalsIgnoreCase("01101")) {
                valor = valor * 0.95;
            } else if (codigoDesconto.equalsIgnoreCase("00110")) {
                valor = valor * 0.85;
            } else if (codigoDesconto.equalsIgnoreCase("00111")) {
                valor = valor * 0.75;
            }
        }
        
        
        JOptionPane.showMessageDialog(null, "Alugou a categoria: "+categoriaFilmes+" \n Quantidade de Dias: "+qtDias+" \n Valor: "+valor);

    }
}
