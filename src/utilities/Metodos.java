package utilities;

import java.util.ArrayList;
import java.util.Scanner;

import models.Funcionario;

public class Metodos {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static Scanner leitura = new Scanner(System.in);

	// Metodo para mostrar o menu na classe Main
	public static void mostrarMenu() {
		System.out.println("""
				---------------------------------------------

						Escolha uma Opção

				---------------------------------------------
					1 - Registrar um novo empregado
					2 - Listar os empregados registrados
					3 - Criar uma nova tarefa
					4 - Listas todas as tarefas ativas
					5 - Editar uma tarefa existente
					6 - Excluir uma tarefa
					0 - Sair do programa

				---------------------------------------------
				""");
	}

	// Metodo para cadastrar um novo funcionario
	public static void registrarFuncionario() {

		System.out.print("\nDigite o nome do funcionário: ");
		String nomeFuncionario = leitura.nextLine();
		System.out.print("Digite o cargo desse funcionário: ");
		String cargoFuncionario = leitura.nextLine();
		Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cargoFuncionario);
		funcionarios.add(novoFuncionario);
		System.out.println("Funcionário registrado com sucesso");

	}

	// Metodo para listar os empregados registrados
	public static void listarFuncionarios() {

		if (funcionarios.isEmpty()) {

			System.out.print(
					"\nNão foi encontrado nenhum funcinário cadastrado. Deseja cadastrar um novo funcionário? (S/N): ");
			String escolha = leitura.nextLine();
			if (escolha.equalsIgnoreCase("s")) {
				registrarFuncionario();
			} else {
				System.out.println("Retornando para o menu. ");
			}

		} else {
			System.out.println("Funcionários registrados: ");
			for (Funcionario listaFuncionarios: funcionarios) {
				System.out.println("Nome do funcionário: "+listaFuncionarios.getNomeFuncionario()+ ", Cargo: "+listaFuncionarios.getCargoFuncionario());
								
			}
		}

	}
}
