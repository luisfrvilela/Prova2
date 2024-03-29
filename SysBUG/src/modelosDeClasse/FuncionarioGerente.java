package modelosDeClasse;

public class FuncionarioGerente extends FuncionarioComum{


	private int senhaDeAcessoInterno;
	private int numeroDeFuncionariosGerenciados;
	
	public FuncionarioGerente(String nome, String telefone, String endereco,
			int cargaHorariaSemanal, Double salario, int anoDeContratacao) {
		super(nome, telefone, endereco, cargaHorariaSemanal, salario, anoDeContratacao);
	}
	
	public boolean autenticacao(int senhaDeAcessoInterno){
		if(this.senhaDeAcessoInterno == senhaDeAcessoInterno){
			System.out.println("Acesso Permitido!");
			return true;
		}
		else{
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public int getSenhaDeAcessoInterno() {
		return senhaDeAcessoInterno;
	}

	public void setSenhaDeAcessoInterno(int senhaDeAcessoInterno) {
		this.senhaDeAcessoInterno = senhaDeAcessoInterno;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	
}
