package view;

import model.GerenciadorTarefas;
import model.Tarefa;
import javax.swing.*;
import java.awt.*;

public class TelaEdicao {
    public TelaEdicao(GerenciadorTarefas gerenciador) {
        JFrame frame = new JFrame("Edição de Tarefa");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        JTextField nomeField = new JTextField();
        JTextField descricaoField = new JTextField();
        JTextField dataEntregaField = new JTextField();
        JTextField responsavelField = new JTextField();
        JTextField prioridadeField = new JTextField();

        JButton editarButton = new JButton("Editar");

        frame.add(new JLabel("Nome:"));
        frame.add(nomeField);
        frame.add(new JLabel("Descrição:"));
        frame.add(descricaoField);
        frame.add(new JLabel("Data de Entrega:"));
        frame.add(dataEntregaField);
        frame.add(new JLabel("Responsável:"));
        frame.add(responsavelField);
        frame.add(new JLabel("Prioridade:"));
        frame.add(prioridadeField);
        frame.add(editarButton);

        editarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String descricao = descricaoField.getText();
            String dataEntrega = dataEntregaField.getText();
            String responsavel = responsavelField.getText();
            String prioridade = prioridadeField.getText();

            Tarefa tarefa = new Tarefa(nome, descricao, dataEntrega, responsavel, prioridade);
            gerenciador.adicionarTarefa(tarefa);
            JOptionPane.showMessageDialog(frame, "Tarefa editada com sucesso!");
            frame.dispose();
            new Principal();
        });

        frame.setVisible(true);
    }
}
