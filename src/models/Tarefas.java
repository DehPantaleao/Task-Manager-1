package models;

import java.time.LocalDate;

public class Tarefas {

	private String nomeTarefa;
	private String funcionarioAtribuido;
	private String descricaoTarefa;
	private LocalDate dataTarefaCriada;

	public Tarefas(String nomeTarefa, String funcionarioAtribuido, String descricaoTarefa,
				   LocalDate dataTarefaCriada) {
		this.nomeTarefa = nomeTarefa;
		this.funcionarioAtribuido = funcionarioAtribuido;
		this.descricaoTarefa = descricaoTarefa;
		this.dataTarefaCriada = dataTarefaCriada;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getFuncionarioAtribuido() {
		return funcionarioAtribuido;
	}

	public void setFuncionarioAtribuido(Funcionario funcionarioAtribuido) {
		this.funcionarioAtribuido = String.valueOf(funcionarioAtribuido);
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

	public LocalDate getDataTarefaCriada() {
		return dataTarefaCriada;
	}

	public void setDataTarefaCriada(LocalDate dataTarefaCriada) {
		this.dataTarefaCriada = dataTarefaCriada;
	}


}
