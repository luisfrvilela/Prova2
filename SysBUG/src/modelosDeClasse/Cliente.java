package modelosDeClasse;

public class Cliente extends Pessoa{

	
	private String numeroDaConta;
	private String senhaDoBanco;
	
	public Cliente(String nome, String telefone, String endereco) {
		super(nome, telefone, endereco);
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getSenhaDoBanco() {
		return senhaDoBanco;
	}

	public void setSenhaDoBanco(String senhaDoBanco) {
		this.senhaDoBanco = senhaDoBanco;
	}
	
}
