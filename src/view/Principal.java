package view;

import model.GerenciadorTarefas;
import javax.swing.*;

public class Principal {
    private GerenciadorTarefas gerenciador;

    public Principal() {
        gerenciador = new GerenciadorTarefas();
        mostrarMenu();
    }

    public void mostrarMenu() {
        JFrame frame = new JFrame("Menu de Tarefas");
        String[] opcoes = {"Cadastrar Tarefa", "Listar Tarefas", "Editar Tarefa", "Sair"};
        int escolha = JOptionPane.showOptionDialog(frame, "Escolha uma opção", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                new TelaCadastro(gerenciador);
                break;
            case 1:
                new TelaListagem(gerenciador);
                break;
            case 2:
                new TelaEdicao(gerenciador);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                mostrarMenu();
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}
