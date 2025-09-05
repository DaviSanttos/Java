package service;

import model.Pessoa;

public class CadastroService {
    private Pessoa pessoa;

    public void cadastrarPessoa(String nome, int idade) {
        this.pessoa = new Pessoa(nome,idade);
    }

    public void mostrarPessoa() {
        this.pessoa.exibirDados();
    }
}