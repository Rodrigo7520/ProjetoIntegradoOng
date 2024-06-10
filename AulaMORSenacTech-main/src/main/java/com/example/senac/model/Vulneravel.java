package com.example.senac.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;


@Entity
@Table(name = "Vulneravel")
public class Vulneravel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vulneravel_id")
    private int id;


    private String nome;
    private Date dataNascimento;

    @JoinColumn(name= "nome", referencedColumnName = "endereco")
    @OneToMany(cascade={CascadeType.PERSIST})
    private String endereco;

    @Column(name= "Motivo Cadastro", nullable = false)
    private int motivoCadastro;
    
    @Column(name="cep", nullable = true)
    private String cep;


    public Vulneravel (){

    }

    public Vulneravel(int id, String nome, Date dataNascimento, String endereco, int motivoCadastro, String cep) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.motivoCadastro = motivoCadastro;
        this.cep = cep;
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
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getMotivoCadastro() {
        return motivoCadastro;
    }
    public void setMotivoCadastro(int motivoCadastro) {
        this.motivoCadastro = motivoCadastro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String string) {
        this.cep = string;
    }


    @Override
    public String toString() {
        return "Vulneravel [id=" + id + ", nome=" + nome + ", Data de Nascimento=" +dataNascimento + ", endereco=" + endereco + ", cep=" + cep +"]";
    }

    public void setMotivoCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMotivoCadastro'");
    }

    public void setCpe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCpe'");
    }



}
   
      


