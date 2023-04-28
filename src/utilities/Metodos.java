package utilities;

import java.util.ArrayList;
import java.util.Scanner;

import models.Funcionario;

public class Metodos {

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
		Scanner registro = new Scanner(System.in);
		final ArrayList<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("\nDigite o nome do funcionário: ");
		String nomeFuncionario = registro.nextLine();
		System.out.print("Digite o cargo desse funcionário: ");
		String cargoFuncionario = registro.nextLine();
		Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cargoFuncionario);
		funcionarios.add(novoFuncionario);
		System.out.println("Funcionário registrado com sucesso");
		
		registro.close();
	}

}
