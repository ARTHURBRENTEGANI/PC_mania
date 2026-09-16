
package br.inatel.cdg.pcmania.model;

public class MemoriaUSB {


    // declara os atributos da memoria como o nome e a capcidade 
    // e privado pois so pode ser acessado pela classe MemorialUSB
    private String nome;
    private int capacidade;

    // contrutor que cria um objeto que atribui ao atributo nome e capciadde
    // os valores das varaiveis recebidas 
    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }


    // declara o metodo que mostra o nome da memoria 
    public String getNome() {
        return nome;
    }

    // declara o metodo que mostra a capacidade da memoria 
    public int getCapacidade() {
        return capacidade;
    }
}