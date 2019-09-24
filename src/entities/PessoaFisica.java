package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}	
	
	@Override
	public double imposto() {
		if (getRendaAnual() <= 20000.00) {
			return getRendaAnual() * 15.0 / 100.0;
		} else if (gastosSaude > 0){
			return (getRendaAnual() * 25.0 / 100.0) - gastosSaude / 2.0;
		} else {
			return (getRendaAnual() * 25.0 / 100.0);
		}
	};
	
}
