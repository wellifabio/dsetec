package model;

import java.util.ArrayList;

public class Paciente extends Pessoa {

	// Atributos
	private String tipo;
	private ArrayList<Tratamento> prontuario = new ArrayList<>();
	// Esta lista acima existe porque um paciente pode fazer v�rios tratamentos
	// Assim recebe o nome de prontu�rio
	// Este � um relacionamento de Associa��o entre Paciente e Tratamento

	// M�todos Construtores
	public Paciente() {
	}

	public Paciente(int id, String nome, String nascimento, String telefone, String dataCadastro, String tipo) {
		super(id, nome, nascimento, telefone, dataCadastro);
		this.tipo = tipo;
	}

	// M�todos GETs && SETs
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Tratamento> getProntuario() {
		return prontuario;
	}

	public void setProntuario(ArrayList<Tratamento> prontuario) {
		this.prontuario = prontuario;
	}

	public String getCSV() {
		return super.getId() + ";" + super.getNome() + ";" + super.getNascimento() + ";" + super.getTelefone() + ";"
				+ super.getDataCadastro() + ";" + this.tipo + "\r\n";
	}
}
