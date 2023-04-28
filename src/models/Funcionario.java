package models;

public class Funcionario {

	private String nomeFuncionario;
	private String cargoFuncionario;

	public Funcionario(String nomeFuncionario, String cargoFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
		this.cargoFuncionario = cargoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

}