package br.inatel.cdg.pcmania.model;

public class HardwareBasico {

    // declaração dos atributos do haradware do pc que e privado
    // podendo ser usado apenas por esta classe  
    private String nome;
    private int capacidade;

    
    // construtor de um objeto que recebe um nome e uma capacidade e atribui ele ao atributo nome e capacidade
    public HardwareBasico(String nome, int capacidade) 
    {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // declara metodo que retorna o nome 
    public String getNome() {
        return nome;
    }

    // declara o metodo que retorna a capacidade 
    public int getCapacidade() {
        return capacidade;
    }
}