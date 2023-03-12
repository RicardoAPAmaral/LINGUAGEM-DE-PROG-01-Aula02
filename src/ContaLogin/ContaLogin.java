
package ContaLogin;

/**
 *
 * @author Ricardo
 */
public class ContaLogin {

    private String nome;
    private String senha;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha, int usuario) {
        if (usuario==13){
        this.senha = senha;
    }
    else{
        System.out.println("ACESSO NEGADO!");
    }
}
	}

   
