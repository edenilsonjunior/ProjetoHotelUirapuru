package model.pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe que representa uma pessoa.
 */
public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private LocalDate dataNascimento;
    private String login;
    private String senha;

    /**
     * Construtor da classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param endereco O endereço da pessoa.
     * @param cidade A cidade da pessoa.
     * @param estado O estado da pessoa.
     * @param telefone O número de telefone da pessoa.
     * @param dataNascimento A data de nascimento da pessoa.
     */
    public Pessoa(String nome, String endereco, String cidade, String estado, String telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.login = nome;
        this.senha = nome + "123";
    }

    /**
     * Construtor da classe Pessoa.
     * Cria admin
     *
     * @param nome O nome da pessoa.
     */
    public Pessoa(String nome) {
        this.nome = nome;
        this.login = nome;
        this.senha = nome + "123";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {

        if (dataNascimento == null) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Método abstrato para obter a descrição da entidade.
     *
     * @return Uma string contendo a descrição da entidade.
     */
    public abstract String getDescricao();
}
