package view;

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.ProcessaClinica;
import model.Tratamento;

public class TratamentoForm extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel labelCabecalho;
	private JButton btSalvar, btCancelar, btAdd, btDel;
	private JTextField tfNome, tfDescricao;
	private DefaultTableModel dtmTratamentos;
	private JTable tbTratamentos;
	private JScrollPane scroll;
	private String[] linha = new String[2];
	
	private ArrayList<Tratamento> tratamentos;
	private Tratamento tratamento;
	
	TratamentoForm(ArrayList<Tratamento> ts, int indice) {
		// Propriedades da caixa de di�logo
		setTitle("Prontu�rio");
		setBounds(270, 200, 397, 270);
		panel = new JPanel();
		setContentPane(panel);
		setLayout(null);
		
		//Cabe�alho da Caixa de di�logo
		labelCabecalho = new JLabel("Nome:                     Descri��o:");
		labelCabecalho.setBounds(10, 10, 380, 20);
		panel.add(labelCabecalho);
		tfNome = new JTextField();
		tfNome.setBounds(10, 35, 100, 25);
		panel.add(tfNome);
		tfDescricao = new JTextField();
		tfDescricao.setBounds(110, 35, 200, 25);
		panel.add(tfDescricao);
		
		// Tabela de Prontu�rios Habilitada para Altera��o
		dtmTratamentos = new DefaultTableModel();
		dtmTratamentos.addColumn("Nome");
		dtmTratamentos.addColumn("Descri��o");
		for (Tratamento t: ts) {
			linha[0] = t.getNome();
			linha[1] = t.getDescricao();
			dtmTratamentos.addRow(linha);
		}
		tbTratamentos = new JTable(dtmTratamentos);
		scroll = new JScrollPane(tbTratamentos);
		scroll.setBounds(10, 60, 359, 100);
		panel.add(scroll);
		
		// Bot�o Add Tratamentos
		btAdd = new JButton("Add");
		btAdd.setBounds(310, 35, 59, 25);
		panel.add(btAdd);
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				linha[0] = tfNome.getText();
				tfNome.setText("");
				linha[1] = tfDescricao.getText();
				tfDescricao.setText("");
				dtmTratamentos.addRow(linha);
			}
		});
		
		// Bot�o Deletar
		btDel = new JButton("Del");
		btDel.setBounds(69, 190, 59, 30);
		panel.add(btDel);
		btDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tbTratamentos.getSelectedRow() >= 0) {
					dtmTratamentos.removeRow(tbTratamentos.getSelectedRow());
				} else {
					JOptionPane.showMessageDialog(null, "Selecione uma linha");
				}
			}
		});
		
		// Bot�o Cancelar
		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(128, 190, 100, 30);
		panel.add(btCancelar);
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		// Bot�o Salvar renova o prontu�rio para um paciente da lista
		btSalvar = new JButton("Salvar");
		btSalvar.setBounds(228, 190, 100, 30);
		panel.add(btSalvar);
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tratamentos = new ArrayList<>();
				for (int i = 0; i < dtmTratamentos.getRowCount(); i++) {
					tratamento = new Tratamento();
					tratamento.setIdPaciente(indice+1);
					tratamento.setNome(dtmTratamentos.getValueAt(i, 0).toString());
					tratamento.setDescricao(dtmTratamentos.getValueAt(i, 1).toString());
					tratamentos.add(tratamento);
				}
				ProcessaClinica.getPacientes().get(indice).setProntuario(tratamentos);
				dispose();
			}
		});
	}
}
