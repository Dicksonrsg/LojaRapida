package br.senac.rn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import br.senac.rn.dao.PersistDB;
import javax.persistence.Column;

@Entity
public class Cliente implements PersistDB {

    @Id
    @GeneratedValue
    @Column(name = "cli_id")
    private int id;
    @Column(name = "cli_nome")
    private String nome;
    @Column(name = "cli_email")
    private String email;
    @Column(name = "cli_cpf")
    private String cpf;
    @Column(name = "cli_senha")
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
