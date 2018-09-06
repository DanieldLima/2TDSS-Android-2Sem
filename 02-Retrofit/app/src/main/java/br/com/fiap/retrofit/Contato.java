package br.com.fiap.retrofit;

import java.io.Serializable;

public class Contato implements Serializable {

    private String nome;

    private String relefone;

    private String status;

    private String imagem;

    public Contato() {
    }

    public Contato(String nome, String relefone, String status, String imagem) {
        this.nome = nome;
        this.relefone = relefone;
        this.status = status;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRelefone() {
        return relefone;
    }

    public void setRelefone(String relefone) {
        this.relefone = relefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
