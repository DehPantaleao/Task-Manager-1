package utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import models.Funcionario;
import models.Tarefas;

public class Metodos {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static ArrayList<Tarefas> tarefas = new ArrayList<>();
	private static Scanner leitura = new Scanner(System.in);

	public static void mostrarMenu() {
		System.out.println("""
				                ______________________________________________
				                |			 Escolha uma Opção			     |
				                ______________________________________________
				                |											 |
				                |	1 - Registrar um novo empregado			 |
				                |	2 - Listar os empregados registrados	 |
				                |	3 - Criar uma nova tarefa				 |
				                |	4 - Listas todas as tarefas ativas		 |
				                |	5 - Editar uma tarefa existente			 |
				                |	6 - Excluir uma tarefa					 |
				                |	0 - Sair do programa					 |
				                |											 |
				                ______________________________________________
				                |        Escolha uma opção listada           |
				                |    (Digite e pressione o botão Enter):     |
				                ______________________________________________
				""");
	}

<<<<<<< HEAD
	public static void registrarFuncionario() {
		System.out.println("=====================================================");
		System.out.print("\nDigite o nome do funcionário: ");
		String nomeFuncionario = leitura.nextLine();
		System.out.print("Digite o cargo desse funcionário: ");
		String cargoFuncionario = leitura.nextLine();
		Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cargoFuncionario);
		funcionarios.add(novoFuncionario);
		System.out.println("Funcionário registrado com sucesso\n");
		System.out.println("=====================================================\n");
	}
=======
    public static void mostrarMenu() {
        System.out.println("""
                ==============================================
                =              Escolha uma Opção             =
                ==============================================
                =                                            =
                =   1 - Registrar um novo funcionário        =
                =   2 - Listar os funcionário registrados    =
                =   3 - Criar uma nova tarefa                =
                =   4 - Listas todas as tarefas ativas       =
                =   5 - Editar uma tarefa existente          =
                =   6 - Excluir uma tarefa                   =
                =   0 - Sair do programa                     =
                =                                            =
                ==============================================
                =        Escolha uma opção listada           =
                =    (Digite e pressione o botão Enter):     =
                ==============================================
                                """);
    }
>>>>>>> vinicius

	public static void listarFuncionarios() {

<<<<<<< HEAD
		if (funcionarios.isEmpty()) {
			System.out.println("=====================================================");
			System.out.print(
					"\nNão foi encontrado nenhum funcinário cadastrado. Deseja cadastrar um novo funcionário? (S/N): ");
			String escolha = leitura.nextLine();
			if (escolha.equalsIgnoreCase("s")) {
				registrarFuncionario();
			} else {
				System.out.println("Retornando para o menu. ");
				System.out.println("=====================================================\n");
			}
=======
    public static void registrarFuncionario() {
        System.out.print("\nDigite o nome do funcionário: ");
        String nomeFuncionario = leitura.nextLine();
        System.out.print("Digite o cargo desse funcionário: ");
        String cargoFuncionario = leitura.nextLine();
        Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cargoFuncionario);
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário registrado com sucesso\n");
    }
>>>>>>> vinicius

		} else {
			System.out.println("=====================================================");
			System.out.println("\nFuncionários registrados: ");
			for (Funcionario listaFuncionarios : funcionarios) {
				System.out.println("Nome do funcionário: " + listaFuncionarios.getNomeFuncionario() + ", Cargo: "
						+ listaFuncionarios.getCargoFuncionario());
			}
			System.out.println("\n=====================================================");
		}

	}

<<<<<<< HEAD
	public static void criarTarefas() {
		System.out.println("Criando uma nova tarefa: ");
		System.out.print("Digite o nome da tarefa: ");
		String nomeTarefa = leitura.nextLine();
		System.out.println("Digite o nome do funcionário atribuido a esta tarefa: ");
		String funcionarioAtribuido = leitura.nextLine();

		Funcionario funcionarioExiste = null;

		for (Funcionario func : funcionarios) {
			if (func.getNomeFuncionario().equalsIgnoreCase(funcionarioAtribuido)) {
				funcionarioExiste = func;
				break;
			}
		}

		if (funcionarioExiste == null) {
			System.out.println("Funcionario não encontrado, deseja cadastrar um novo funcionário? (S/N)");
			String escolha = leitura.nextLine();
			if (escolha.equalsIgnoreCase("s")) {
				registrarFuncionario();
			} else {
				System.out.println("A criação da tarefa foi cancelada!");
				return;
			}
		}
		System.out.println("Descreva a tarefa atribuida: ");
		String descricaoTarefa = leitura.nextLine();
=======
        if (funcionarios.isEmpty()) {
            System.out.print(
                    "\nNão foi encontrado nenhum funcinário cadastrado. Deseja cadastrar um novo funcionário? (S/N): ");
            String escolha = leitura.nextLine();
            if (escolha.equalsIgnoreCase("s")) {
                registrarFuncionario();
            } else {
                System.out.println("Retornando para o menu...\n");
            }

        } else {
            System.out.println("\nFuncionários registrados: \n");
            for (Funcionario listaFuncionarios : funcionarios) {
                System.out.println("Nome do funcionário: " + listaFuncionarios.getNomeFuncionario() + ", Cargo: "
                        + listaFuncionarios.getCargoFuncionario());
            }
        }
        System.out.println("\n");
    }

    public static void criarTarefas() {
        System.out.print("\nDigite o nome da tarefa: ");
        String nomeTarefa = leitura.nextLine();
        System.out.print("Digite o nome do funcionário atribuido a esta tarefa: ");
        String funcionarioAtribuido = leitura.nextLine();
>>>>>>> vinicius

		LocalDate dataTarefaCriada = LocalDate.now();
		Tarefas novaTarefa = new Tarefas(nomeTarefa, funcionarioAtribuido, descricaoTarefa, dataTarefaCriada);

		tarefas.add(novaTarefa);

<<<<<<< HEAD
		System.out.println("Tarefa criada com sucesso!");
	}
=======
        if (funcionarioExiste == null) {
            System.out.print("Funcionario não encontrado, deseja cadastrar um novo funcionário? (S/N): ");
            String escolha = leitura.nextLine();
            if (escolha.equalsIgnoreCase("s")) {
                registrarFuncionario();
            } else {
                System.out.println("A criação da tarefa foi cancelada!\n");
                return;
            }
        }
        System.out.print("Descreva a tarefa atribuida: ");
        String descricaoTarefa = leitura.nextLine();
>>>>>>> vinicius

	public static void listarTarefas() {
		if (tarefas.isEmpty()) {
			System.out.println("=====================================================");
			System.out.println("Não há tarefas registradas.");
			System.out.println("=====================================================");
		} else {
			System.out.println("=====================================================");
			System.out.println("Tarefas ativas:");
			for (Tarefas listarTarefas : tarefas) {
				System.out.println("Nome da tarefa: " + listarTarefas.getNomeTarefa() + ", Funcionario atribuido: "
						+ (listarTarefas.getFuncionarioAtribuido() == null ? "Nenhum funcionário atribuído"
								: listarTarefas.getFuncionarioAtribuido())
						+ ", descrição: " + listarTarefas.getDescricaoTarefa() + ", data de criação: "
						+ listarTarefas.getDataTarefaCriada());
			}
			System.out.println("=====================================================");
		}
	}

	public static void editarTarefas() {

<<<<<<< HEAD
		if (tarefas.isEmpty()) {
			System.out.println("Não há tarefas criadas para editar!");
			return;
		}

		System.out.println("Editando uma tarefa: ");
		System.out.println("Digite o nome da tarefa a ser editada: ");
		String nomeTarefa = leitura.nextLine();
=======
        System.out.println("Tarefa criada com sucesso!\n");
    }

    public static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("\nNão há tarefas registradas.");
            System.out.println("Retornando para o menu...\n");
        } else {
            System.out.println("\nTarefas ativas:\n");
            for (Tarefas listarTarefas : tarefas) {
                System.out.println("Nome da tarefa: " + listarTarefas.getNomeTarefa() + ", Funcionario atribuido: "
                        + (listarTarefas.getFuncionarioAtribuido() == null ? "Nenhum funcionário atribuído" : listarTarefas.getFuncionarioAtribuido()) + ", descrição: "
                        + listarTarefas.getDescricaoTarefa() + ", data de criação: "
                        + listarTarefas.getDataTarefaCriada());
            }
            System.out.println("\n");
        }
    }
>>>>>>> vinicius

		Tarefas tarefasParaEditar = null;

<<<<<<< HEAD
		for (Tarefas tarefas1 : tarefas) {
			if (tarefas1.getNomeTarefa().equalsIgnoreCase(nomeTarefa)) {
				tarefasParaEditar = tarefas1;
				break;
			}
		}

		if (tarefasParaEditar == null) {
			System.out.println("Tarefa não encontrada!");
			System.out.println("Deseja criar uma nova tarefa? (S/N)");
			String escolha = leitura.nextLine();
=======
        if (tarefas.isEmpty()) {
            System.out.println("\nNão há tarefas criadas para editar!\n");
            return;
        }

        System.out.println("\nDigite o nome da tarefa a ser editada: ");
        String nomeTarefa = leitura.nextLine();
>>>>>>> vinicius

			if (escolha.equalsIgnoreCase("s")) {
				criarTarefas();
			} else {
				System.out.println("Retornando para o menu...");
			}
		} else {
			System.out.println("Tarefa encontrada!");
			System.out.println(tarefasParaEditar);

			System.out.println("""
					O que deseja editar?

<<<<<<< HEAD
					1 - Renomear a tarefa
					2 - Alterar funcionario atribuido
					3 - Alterar a descricao
					0 - Voltar ao menu
					""");

			int escolha = leitura.nextInt();
			leitura.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("Digite um novo nome para a tarefa: " + tarefasParaEditar);
				String novoNome = leitura.nextLine();
				tarefasParaEditar.setNomeTarefa(novoNome);
				System.out.println("Tarefa editada com sucesso");
				break;

			case 2:
				System.out.println("Digite o nome do novo funcionario a ser atribuido para a tarefa: ");
				String novoFuncionario = leitura.nextLine();

				Funcionario funcionarioExiste = null;

				for (Funcionario func : funcionarios) {
					if (func.getNomeFuncionario().equals(novoFuncionario)) {
						funcionarioExiste = func;
						break;
					}
				}
=======
        if (tarefasParaEditar == null) {
            System.out.println("\nTarefa não encontrada!");
            System.out.println("Deseja criar uma nova tarefa? (S/N): ");
            String escolha = leitura.nextLine();

            if (escolha.equalsIgnoreCase("s")) {
                criarTarefas();
            } else {
                System.out.println("\nRetornando para o menu...\n");
            }
        } else {
            System.out.println("\nTarefa encontrada!\n");

            System.out.println("""
                    O que deseja editar?
                                       
                    1 - Renomear a tarefa
                    2 - Alterar funcionario atribuído
                    3 - Alterar a descrição
                    0 - Cancelar alteração (Voltar para o menu)
                    """);

            System.out.print("\nESCOLHA: ");
            int escolha = leitura.nextInt();
            leitura.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite um novo nome para a tarefa " + tarefasParaEditar + ": ");
                    String novoNome = leitura.nextLine();
                    tarefasParaEditar.setNomeTarefa(novoNome);
                    System.out.println("\nTarefa editada com sucesso\n");
                    break;

                case 2:
                    System.out.print("\nDigite o nome do novo funcionario a ser atribuido para a tarefa: ");
                    String novoFuncionario = leitura.nextLine();
>>>>>>> vinicius

				if (funcionarioExiste == null) {
					System.out.println("Funcionario nao encontrado! Deseja cadastrar um novo funcionario? (S/N): ");
					String escolhaCadastrar = leitura.nextLine();
					if (escolhaCadastrar.equalsIgnoreCase("s")) {
						registrarFuncionario();
						funcionarioExiste = funcionarios.get(funcionarios.size() - 1);
					} else {
						System.out.println("A edicao da tarefa foi cancelada! ");
						return;
					}
				}

				tarefasParaEditar.setFuncionarioAtribuido(funcionarioExiste);
				System.out.println("Novo funcionario atribuido com sucesso!");
				break;

<<<<<<< HEAD
			case 3:
				System.out.println("Digite uma nova descricao a tarefa: ");
				String novaDescricao = leitura.nextLine();
				tarefasParaEditar.setDescricaoTarefa(novaDescricao);
				System.out.println("Descricao da tarefa editada com sucesso!");
				break;

			case 0:
				System.out.println("Fechando a edicao! Retornando para o menu...");
				break;

			default:
				System.out.println("Opcao invalida! Tente novamente...");
				break;

			}

		}
	}
=======
                    if (funcionarioExiste == null) {
                        System.out.print("\nFuncionario nao encontrado! Deseja cadastrar um novo funcionario? (S/N): ");
                        String escolhaCadastrar = leitura.nextLine();
                        if (escolhaCadastrar.equalsIgnoreCase("s")) {
                            registrarFuncionario();
                            funcionarioExiste = funcionarios.get(funcionarios.size() - 1);
                        } else {
                            System.out.println("\nA edicao da tarefa foi cancelada! \n");
                            return;
                        }
                    }

                    tarefasParaEditar.setFuncionarioAtribuido(funcionarioExiste);
                    System.out.println("\nNovo funcionario atribuido com sucesso!\n");
                    break;

                case 3:
                    System.out.print("\nDigite uma nova descricao a tarefa: ");
                    String novaDescricao = leitura.nextLine();
                    tarefasParaEditar.setDescricaoTarefa(novaDescricao);
                    System.out.println("\nDescricao da tarefa editada com sucesso!\n");
                    break;

                case 0:
                    System.out.println("\nFechando a edicao! Retornando para o menu...\n");
                    break;

                default:
                    System.out.println("\nOpção invalida! Tente novamente.\n");
                    break;
>>>>>>> vinicius

	public static void excluirTarefas() {

		if (tarefas.isEmpty()) {
			System.out.println("Não há tarefas para serem Excluídas!");
			return;
		}

<<<<<<< HEAD
		System.out.println("Excluindo uma tarefa... \nInsira o nome da tarefa que deseja excluir: ");
		String nomeTarefaDeletar = leitura.nextLine();

		Tarefas tarefaExcluir = null;

		for (Tarefas tarefa : tarefas) {
			if (tarefa.getNomeTarefa().equalsIgnoreCase(nomeTarefaDeletar)) {
				tarefaExcluir = tarefa;
				break;
			}
		}

		if (tarefaExcluir == null) {
			System.out.println("Tarefa não Encontrada!\nDeseja criar uma nova tarefa? S/N");
			String escolha = leitura.nextLine();
			if (escolha.equalsIgnoreCase("s")) {
				criarTarefas();
			} else {
				System.out.println("Retornando ao menu...");
			}
		} else {
			System.out.println("Tarefa encontrada.");
			System.out.println("Deseja realmente excluir a tarefa? S/N");
			String confirmacao = leitura.nextLine();

			if (confirmacao.equalsIgnoreCase("s")) {
				tarefas.remove(tarefaExcluir);
				System.out.println("A tarefa foi excluída com sucesso.");
			} else {
				System.out.println("Exclusão cancelada. \nRetornando ao menu...");
			}
		}

	}
=======
    public static void excluirTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("\nNão há tarefas para serem excluídas!\n");
            return;
        }

        System.out.print("\nInsira o nome da tarefa que deseja excluir: ");
        String nomeTarefaDeletar = leitura.nextLine();

        Tarefas tarefaExcluir = null;

        for (Tarefas tarefa : tarefas) {
            if (tarefa.getNomeTarefa().equalsIgnoreCase(nomeTarefaDeletar)) {
                tarefaExcluir = tarefa;
                break;
            }
        }

        if (tarefaExcluir == null) {
            System.out.print("\nTarefa não Encontrada! Deseja criar uma nova tarefa? (S/N): ");
            String escolha = leitura.nextLine();
            if (escolha.equalsIgnoreCase("s")) {
                criarTarefas();
            } else {
                System.out.println("\nRetornando ao menu...\n");
            }
        } else {
            System.out.println("\nTarefa encontrada!");
            System.out.print("Deseja realmente excluir a tarefa? (S/N): ");
            String confirmacao = leitura.nextLine();

            if (confirmacao.equalsIgnoreCase("s")) {
                tarefas.remove(tarefaExcluir);
                System.out.println("\nA tarefa foi excluída com sucesso!\n");
            } else {
                System.out.println("Exclusão cancelada! Retornando ao menu...");
            }
        }
    }
>>>>>>> vinicius
}