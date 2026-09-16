package br.inatel.cdg.pcmania.service;
// importa aclasse computador 
import br.inatel.cdg.pcmania.model.Computador;

public class ProcessarPedido {
    // coloca o construtor como privado impedindo que outra classe o acesse 
    private ProcessarPedido() {

    }

    // cria um metodo estatico que chahmaos ele pela classe 
    public static void enviarPedido(
            Computador[] computadores) 
    {

        System.out.println("Pedido enviado...");
    }
}