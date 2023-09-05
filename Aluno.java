package a;

public class Aluno {
	
	public String Nome;
    public int Idade;
    public String Email;

    public Aluno(String nome, int idade)
    {
        Nome = nome;
        Idade = idade;
        this.gerarEmail();
    }
    
    

    public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public int getIdade() {
		return Idade;
	}



	public void setIdade(int idade) {
		Idade = idade;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}


	private void gerarEmail()
    {
		String[] vetorPalavras = Nome.split(" ");
        //[joao, victor]
        if (vetorPalavras.length > 1)
        {
            Email = vetorPalavras[0] + "." + vetorPalavras[1] + "@ufn.edu.br";
        }
        else
        {
            Email = vetorPalavras[0] + "@ufn.edu.br";
        }
    }
    
	 public String toString() {
	        return Nome + " - " + Email;
	    }
}


