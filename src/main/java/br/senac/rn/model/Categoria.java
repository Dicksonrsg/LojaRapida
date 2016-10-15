package br.senac.rn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import br.senac.rn.dao.PersistDB;
import javax.persistence.Column;

@Entity
public class Categoria implements PersistDB {
	
    @Id
    @GeneratedValue
    @Column(name = "cat_id")
    private int id;
    @Column(name = "cat_categoria")
    private String denominacao;
    @Column(name = "cat_descricao")
    private String descricao;

    public Categoria() {}

    public Categoria(int id) {
        super();
        this.id = id;
    }

    public Categoria(int id, String denominacao, String descricao) {
        super();
        this.id = id;
        this.denominacao = denominacao;
        this.descricao = descricao;
    }	

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
