package br.inatel.cdg.pcmania.model;

public class Computador {

    // declara os atributos do computador marca e preco 
    private String marca;
    private float preco;

    // declara um array que guarda objetos da classe hardware basico 
    private HardwareBasico[] hardwareBasico;
    // cria uma refrencia ao objeto da classe SistemaOperacional
    private SistemaOperacional sistemaOperacional;
    // cria uma refrencia ao objeto da classe MemoriaUSB
    private MemoriaUSB memoriaUSB;

    // construot que controe o computador completo colocando cada atributo cada variavaeis
    // de cada classe. Por isso a classe computador faz referncia a outras classes   

    public Computador(String marca,
                      float preco,
                      HardwareBasico[] hardwareBasico,
                      SistemaOperacional sistemaOperacional,
                      MemoriaUSB memoriaUSB) {

        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = hardwareBasico;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaUSB = memoriaUSB;
    }


    // declara o metodo que retorna o preço do computador
    public float getPreco() {
        return preco;
    }

    // cria um metodo que exibe todas as informações dos outros metodos que contem
    // informações sobre outros compoentes do computador   
    public void exibirInformacoes() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        System.out.println("Hardware:");

    
    // for que percorre o array hardwarebasico 
    for (int i = 0; i < hardwareBasico.length; i++) {

        
        HardwareBasico hardware = hardwareBasico[i];
        // usa gettre pr aobter o nome do array 
        String nome = hardware.getNome();
        // usa o getter pra oegar a capaciadde4 do array 
        int capacidade = hardware.getCapacidade();
        // mostra asninfromações dio harware 
        System.out.println(nome + " - " + capacidade);
    }

    // mostra as infromações do so         
    System.out.println(
                "SO: " +
                sistemaOperacional.getNome() +
                " " +
                sistemaOperacional.getTipo() +
                " bits"
        );
    // mostra as infromações da memoria 
        System.out.println(
                "Memória Extra: " +
                memoriaUSB.getNome() +
                " " +
                memoriaUSB.getCapacidade() +
                "GB"
        );
    }
}