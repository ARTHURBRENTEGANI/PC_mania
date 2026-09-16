package br.inatel.cdg.pcmania.model;

public class SistemaOperacional {

    // declara os atributos nome e tipo do so, sensod privado podendo ser acessado
    // apenas pela classe SistemaOperacional 
    private String nome;
    private int tipo;


    // construtor que cria um objeto com  nome e tipo e atribui aos atributos
    // as varaiveis nome e tipo 
    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // declara o metodo que retona o nome do so
    public String getNome() {
        return nome;
    }

    // declara o metodo que delcara o tipo do so 
    public int getTipo() {
        return tipo;
    }
}