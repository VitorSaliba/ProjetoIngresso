package br.newtonpaiva.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    private double valorTotal = 0d;

    public double calcValor(int quantidade, Ingresso ingresso){
        for(int i = 0; i < quantidade; i++){
            ingressos.add(ingresso);
        }
        for (Ingresso temp : ingressos){
            valorTotal += temp.getValor();
        }

        return valorTotal;
    }

    private Cliente cliente;
    private List<Ingresso> ingressos = new ArrayList<Ingresso>();
}
