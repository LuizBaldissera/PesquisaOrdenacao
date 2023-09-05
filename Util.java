package a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Util {
    public static void exibirLista(LinkedList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void lerArquivoPopularLista(LinkedList<Aluno> alunos) {
        String nomeArquivo = "Nomes.txt";
        
        BufferedReader leitor;
        String linha;
        String[] vetorLinha;
        
        try {
            leitor = new BufferedReader(new FileReader(nomeArquivo));
            nomeArquivo = leitor.readLine();

            while ((linha = leitor.readLine()) != null) {
                vetorLinha = linha.split(";");
                String nome = vetorLinha[0];
                int idade = Integer.parseInt(vetorLinha[1].trim()); // Usar trim para remover espaços
                alunos.add(new Aluno(nome, idade));
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Arquivo inexistente ou problema de leitura.. Digite novamente\n");
            lerArquivoPopularLista(alunos);
        }
    }
}