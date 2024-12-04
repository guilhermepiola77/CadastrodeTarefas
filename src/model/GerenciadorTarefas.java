package model;

import java.io.*;
import java.util.*;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;
    private final String caminhoArquivo = "tarefas.txt";

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
        carregarTarefas();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        salvarTarefas();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    private void carregarTarefas() {
        File file = new File(caminhoArquivo);
        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 5) {
                    tarefas.add(new Tarefa(dados[0], dados[1], dados[2], dados[3], dados[4]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvarTarefas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Tarefa tarefa : tarefas) {
                writer.write(tarefa.getNome() + "," + tarefa.getDescricao() + "," +
                        tarefa.getDataEntrega() + "," + tarefa.getResponsavel() + "," +
                        tarefa.getPrioridade());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
