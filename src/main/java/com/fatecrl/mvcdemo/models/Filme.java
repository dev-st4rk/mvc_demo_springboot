package com.fatecrl.mvcdemo.models;

public class Filme {

    private String nome;
    private String descricao;
    private String data_lancamento;

    Filme(){}

    public Filme(String nome, String descricao, String data_lancamento){
        this.nome=nome;
        this.descricao=descricao;
        this.data_lancamento=data_lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getdata_lancamento() {
        return data_lancamento;
    }

    public void setdata_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}
