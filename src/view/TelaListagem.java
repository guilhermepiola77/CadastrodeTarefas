package view;

import model.GerenciadorTarefas;
import model.Tarefa;
import javax.swing.*;
import java.awt.*;

public class TelaListagem {
    public TelaListagem(GerenciadorTarefas gerenciador) {
        JFrame frame = new JFrame("Listagem de Tarefas");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(gerenciador.getTarefas().size() + 1, 1));

        for (Tarefa tarefa : gerenciador.getTarefas()) {
            frame.add(new JLabel(tarefa.getNome() + " - " + tarefa.getDescricao()));
        }

        JButton voltarButton = new JButton("Voltar");
        frame.add(voltarButton);

        voltarButton.addActionListener(e -> {
            frame.dispose();
            new Principal();
        });

        frame.setVisible(true);
    }
}
