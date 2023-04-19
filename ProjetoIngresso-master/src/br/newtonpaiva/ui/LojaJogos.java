package br.newtonpaiva.ui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import br.newtonpaiva.dominio.Cliente;
import br.newtonpaiva.dominio.Ingresso;
import br.newtonpaiva.dominio.Pedido;

public class LojaJogos {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome(JOptionPane.showInputDialog(null, "Informe o nome do cliente", "Nome do cliente", JOptionPane.QUESTION_MESSAGE));

            Ingresso ingresso = new Ingresso();

            int temp;
            temp = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe o nome do jogo: \n1-Atlético x Cruzeiro\n2-Flamengo x Palmeiras", "Jogos", JOptionPane.QUESTION_MESSAGE)));

            switch(temp){
                case 1:
                    ingresso.setNomeJogo("Atlético x Cruzeiro");
                    break;
                case 2:
                    ingresso.setNomeJogo("Flamengo x Palmeiras");
                    break;
                default:
                    throw new Exception();
            }

            ingresso.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do ingresso", "Valor ingresso", JOptionPane.QUESTION_MESSAGE)));

            Pedido pedido = new Pedido();

            Double valorTotal;
            valorTotal = pedido.calcValor(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ingressos desejados para esse jogo:", "Quantidade de ingressos", JOptionPane.QUESTION_MESSAGE)), ingresso);

            JOptionPane.showMessageDialog(null, "Pedido feito para " + cliente.getNome() + "\n" + pedido.getIngressos().size() + " ingressos: " + ingresso.getNomeJogo() + "\n" + "Valor: " + "R$" + valorTotal, "Finalização do pedido", temp);

        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
