package model;

public class Tarefa {
    private String nome;
    private String descricao;
    private String dataEntrega;
    private String responsavel;
    private String prioridade;

    public Tarefa(String nome, String descricao, String dataEntrega, String responsavel, String prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getPrioridade() {
        return prioridade;
    }
}
