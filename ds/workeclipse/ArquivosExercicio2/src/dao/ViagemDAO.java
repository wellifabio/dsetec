package dao;

/* DAO (Objeto de acesso a Dados) */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Viagem;

public class ViagemDAO {

	// Atributos
	private BufferedReader br; // Espa�o (ponteiro) de mem�ria para ler um arquivo
	private BufferedWriter bw; // Espa�o (ponteiro) de mem�ria para gravar um arquivo
	private String filein = ".\\arquivos\\entrada2.txt";// Aponta para o endere�o do arquivo de entrada
	private String fileout = ".\\arquivos\\saida2.txt";// Aponta para o endere�o do arquivo de saida
	private Viagem viagem; // Um modelo para cada Linha
	private String[] cols; // Vetor para as colunas

	// M�todos
	public ArrayList<Viagem> openFileIn() {
		ArrayList<Viagem> viagens = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(filein));
			// Abre o arquivo para leitura
			String line = br.readLine(); // L� a primeira linha
			while (line != null) { // Repete lendo todas as outras linhas
				cols = line.split(";");
				viagem = new Viagem();
				viagem.setOrigem(cols[0]);
				viagem.setDistancia(Integer.parseInt(cols[1]));
				viagem.setDestino(cols[2]);
				viagem.setVelocidade(Integer.parseInt(cols[3]));
				viagens.add(viagem);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo " + e);
		}
		return viagens;
	}

	public boolean saveFileOut(ArrayList<Viagem> viagens) {
		boolean retorno = false;
		try {
			bw = new BufferedWriter(new FileWriter(fileout));
			for (Viagem v : viagens) { // La�o que percorre uma lista
				bw.write(v.toTXT()); // Grava linha por linha
			}
			bw.close(); // Fecha o arquivo de grava��o
			retorno = true;
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo "+e);
		}
		return retorno;
	}

}
