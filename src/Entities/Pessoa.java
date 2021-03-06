package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pessoa extends AbstractEntity{
    private String nome;
    private String telefone;
    private String celular;
    private String nacionalidade;
    private String cpf;
    private String rg;
    private String email;
    private String login;
    private String senha;
    private ArrayList<Sexo> sexos = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(Long id, LocalDateTime cadastro, LocalDateTime atualizado, LocalDateTime excluido, String nome, String telefone, String celular, String nacionalidade, String cpf, String rg, String email, String login, String senha, ArrayList<Sexo> sexos) {
        super(id, cadastro, atualizado, excluido);
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.sexos = sexos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Sexo> getSexos() {
        return sexos;
    }

    public void setSexos(ArrayList<Sexo> sexos) {
        this.sexos = sexos;
    }
}
