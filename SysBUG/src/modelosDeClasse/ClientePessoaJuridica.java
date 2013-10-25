package modelosDeClasse;

public class ClientePessoaJuridica extends Cliente {

	private String cnpj;
	private String razaoSocial;
	
	public ClientePessoaJuridica(String nome, String telefone, String endereco, String cnpj) {
		super(nome, telefone, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
}
