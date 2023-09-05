package a;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
	 
		LinkedList<Aluno> alunos = new LinkedList<Aluno>();

		//ler o arquivo e popular a lista
		Util.lerArquivoPopularLista(alunos);

		Util.exibirLista(alunos);   

	}

}
