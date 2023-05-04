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
                ==============================================
                =             Escolha uma Opção              =
                ==============================================
                =                                            =
                =    1 - Registrar um novo empregado         =
                =    2 - Listar os empregados registrados    =
                =    3 - Criar uma nova tarefa               =
                =    4 - Listas todas as tarefas ativas      =
                =    5 - Editar uma tarefa existente         =
                =    6 - Excluir uma tarefa                  =
                =    0 - Sair do programa                    =
                =                                            =
                ==============================================
                =         Escolha uma opção listada          =
                =     (Digite e pressione o botão Enter):    =
                ==============================================
                """);
    }

    public static void registrarFuncionario() {
        System.out.print("\nDigite o nome do funcionário: ");
        String nomeFuncionario = leitura.nextLine();
        System.out.print("Digite o cargo desse funcionário: ");
        String cargoFuncionario = leitura.nextLine();
        Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cargoFuncionario);
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário registrado com sucesso\n");
    }

    public static void listarFuncionarios() {

        if (funcionarios.isEmpty()) {
            System.out.print("\nNão foi encontrado nenhum funcionário cadastrado. Deseja cadastrar um novo funcionário? (S/N): ");
            String escolha = leitura.nextLine();
            if (escolha.equalsIgnoreCase("s")) {
                registrarFuncionario();
            } else {
                System.out.println("Retornando para o menu.\n");
            }

        } else {
            System.out.println("\nFuncionários registrados: ");
            for (Funcionario listaFuncionarios : funcionarios) {
                System.out.println("Nome do funcionário: " + listaFuncionarios.getNomeFuncionario() + ", Cargo: "
                        + listaFuncionarios.getCargoFuncionario());
            }
        }
        System.out.println("\n");
    }

    public static void criarTarefas() {
        System.out.print("\nDigite o nome da tarefa a ser criada: ");
        String nomeTarefa = leitura.nextLine();
        System.out.print("Digite o nome do funcionário atribuido a esta tarefa: ");
        String funcionarioAtribuido = leitura.nextLine();

        Funcionario funcionarioExiste = null;

        for (Funcionario func : funcionarios) {
            if (func.getNomeFuncionario().equalsIgnoreCase(funcionarioAtribuido)) {
                funcionarioExiste = func;
                break;
            }
        }

        if (funcionarioExiste == null) {
            System.out.print("\nFuncionario não encontrado, deseja cadastrar um novo funcionário? (S/N): ");
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

        LocalDate dataTarefaCriada = LocalDate.now();
        Tarefas novaTarefa = new Tarefas(nomeTarefa, funcionarioAtribuido, descricaoTarefa, dataTarefaCriada);

        tarefas.add(novaTarefa);

        System.out.println("Tarefa criada com sucesso!\n");
    }

    public static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas registradas.\n");
        } else {
            System.out.println("\nTarefas ativas:");
            for (Tarefas listarTarefas : tarefas) {
                System.out.println("Nome da tarefa: " + listarTarefas.getNomeTarefa() + ", Funcionario atribuido: "
                        + (listarTarefas.getFuncionarioAtribuido() == null ? "Nenhum funcionário atribuído"
                        : listarTarefas.getFuncionarioAtribuido())
                        + ", descrição: " + listarTarefas.getDescricaoTarefa() + ", data de criação: "
                        + listarTarefas.getDataTarefaCriada());
            }
            System.out.println("\n");
        }
    }

    public static void editarTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("\nNão há tarefas criadas para editar!\n");
            return;
        }

        System.out.print("\nDigite o nome da tarefa a ser editada: ");
        String nomeTarefa = leitura.nextLine();

        Tarefas tarefasParaEditar = null;

        for (Tarefas tarefas1 : tarefas) {
            if (tarefas1.getNomeTarefa().equalsIgnoreCase(nomeTarefa)) {
                tarefasParaEditar = tarefas1;
                break;
            }
        }

        if (tarefasParaEditar == null) {
            System.out.println("\nTarefa não encontrada!");
            System.out.print("Deseja criar uma nova tarefa? (S/N): ");
            String escolha = leitura.nextLine();

            if (escolha.equalsIgnoreCase("s")) {
                criarTarefas();
            } else {
                System.out.println("\nRetornando para o menu...\n");
            }
        } else {
            System.out.println("Tarefa encontrada!\n");

            System.out.println("""
                    O que deseja editar?

                    1 - Renomear a tarefa
                    2 - Alterar funcionario atribuido
                    3 - Alterar a descricao
                    0 - Voltar ao menu
                    """);

            System.out.print("ESCOLHA: ");
            int escolha = leitura.nextInt();
            leitura.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite um novo nome para a tarefa: ");
                    String novoNome = leitura.nextLine();
                    tarefasParaEditar.setNomeTarefa(novoNome);
                    System.out.println("Nome da tarefa alterado com sucesso!\n");
                    break;

                case 2:
                    System.out.print("\nDigite o nome do novo funcionario a ser atribuido para a tarefa: ");
                    String novoFuncionario = leitura.nextLine();

                    Funcionario funcionarioExiste = null;

                    for (Funcionario func : funcionarios) {
                        if (func.getNomeFuncionario().equals(novoFuncionario)) {
                            funcionarioExiste = func;
                            break;
                        }
                    }

                    if (funcionarioExiste == null) {
                        System.out.print("Funcionario nao encontrado! Deseja cadastrar um novo funcionario? (S/N): ");
                        String escolhaCadastrar = leitura.nextLine();
                        if (escolhaCadastrar.equalsIgnoreCase("s")) {
                            registrarFuncionario();
                            funcionarioExiste = funcionarios.get(funcionarios.size() - 1);
                        } else {
                            System.out.println("\nA edicao da tarefa foi cancelada!\n");
                            return;
                        }
                    }

                    tarefasParaEditar.setFuncionarioAtribuido(funcionarioExiste);
                    System.out.println("Novo funcionario atribuido a tarefa com sucesso!\n");
                    break;

                case 3:
                    System.out.println("\nDigite uma nova descricao para a tarefa: ");
                    String novaDescricao = leitura.nextLine();
                    tarefasParaEditar.setDescricaoTarefa(novaDescricao);
                    System.out.println("Descricao da tarefa editada com sucesso!\n");
                    break;

                case 0:
                    System.out.println("\nFechando a edicao! Retornando para o menu...\n");
                    break;

                default:
                    System.out.println("\nOpcao invalida! Tente novamente...\n");
                    break;

            }

        }
    }

    public static void excluirTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("\nNão há tarefas para serem excluídas!\n");
            return;
        }

        System.out.print("\nExcluindo uma tarefa! Insira o nome da tarefa que deseja excluir: ");
        String nomeTarefaDeletar = leitura.nextLine();

        Tarefas tarefaExcluir = null;

        for (Tarefas tarefa : tarefas) {
            if (tarefa.getNomeTarefa().equalsIgnoreCase(nomeTarefaDeletar)) {
                tarefaExcluir = tarefa;
                break;
            }
        }

        if (tarefaExcluir == null) {
            System.out.print("Tarefa não Encontrada! Deseja criar uma nova tarefa? (S/N): ");
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
                System.out.println("A tarefa foi excluída com sucesso.\n");
            } else {
                System.out.println("Exclusão cancelada! Retornando ao menu...\n");
            }
        }

    }
}