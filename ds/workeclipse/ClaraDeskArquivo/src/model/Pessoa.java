package model;

//Classe Abstrata, n�o poderemos instanci�-la diretamente, somente por heran�a
public abstract class Pessoa {

	// Atributos
	private int id;
	private String nome, nascimento, dataCadastro, telefone;

	// Construtor vazio
	public Pessoa() {
	}
	
	// Construtor com todos os campos
	public Pessoa(int id, String nome, String nascimento, String telefone, String dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.dataCadastro = dataCadastro;
		this.telefone = telefone;
	}

	// M�todos GETs && SETs
	public int getId() {
		return id;
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
