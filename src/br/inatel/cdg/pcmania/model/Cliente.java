package br.inatel.cdg.pcmania.model;

public class Cliente {

    private String nome;
    private String cpf;

    private Computador[] computadores;

    private int quantidade;

    public Cliente(String nome,
                   String cpf,
                   int capacidade) {

        this.nome = nome;
        this.cpf = cpf;

        computadores = new Computador[capacidade];

        quantidade = 0;
    }

    public void adicionarComputador(Computador computador) {

        if (quantidade < computadores.length) {

            computadores[quantidade] = computador;

            quantidade++;
        }
    }

    public float calcularTotalCompra() {

        float total = 0;

        for (int i = 0; i < quantidade; i++) {

            total += computadores[i].getPreco();
        }

        return total;
    }

    public Computador[] getComputadores() {

        Computador[] retorno =
                new Computador[quantidade];

        for (int i = 0; i < quantidade; i++) {

            retorno[i] = computadores[i];
        }

        return retorno;
    }

    public void mostrarCompras() {

        System.out.println("\nCliente: " + nome);
        System.out.println("CPF: " + cpf);

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nPC " + (i + 1));

            computadores[i].exibirInformacoes();
        }

        System.out.println(
                "\nTotal: R$ " +
                calcularTotalCompra()
        );
    }
}