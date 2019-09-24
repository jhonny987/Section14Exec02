package entities;

public class PessoaJuridica extends Pessoa{

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}	
	
	@Override
	public double imposto() {
		if (getNumeroFuncionarios() > 10) {
			return getRendaAnual() * 14.0 / 100.0;
		} else {
			return getRendaAnual() * 16.0 / 100.0;
		}
	};
	
}
