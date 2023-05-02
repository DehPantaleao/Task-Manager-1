package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import utilities.Metodos;
import models.Funcionario;

public class Programa extends Metodos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                        _______                 _        __  __                                              
                      |__   __|               | |      |  \\/  |                                             
                          | |      __ _   ___  | | __   | \\  / |   __ _   _ __     __ _    __ _    ___   _ __
                          | |     / _` | / __| | |/ /   | |\\/| |  / _` | | '_ \\   / _` |  / _` |  / _ \\ | '__|
                          | |    | (_| | \\__ \\ |   <    | |  | | | (_| | | | | | | (_| | | (_| | |  __/ | |  
                          |_|     \\__,_| |___/ |_|\\_\\   |_|  |_|  \\__,_| |_| |_|  \\__,_|  \\__, |  \\___| |_|  
                                                                                           __/ |             
                                                                                          |___/              
                """);

        int op = -1;

        do {
            mostrarMenu();
            System.out.print("\t\t\t\t\t\t\t\tESCOLHA: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    registrarFuncionario();
                    break;

                case 2:
                    listarFuncionarios();
                    break;

                case 3:
                    criarTarefas();
                    break;

                case 4:
                    listarTarefas();
                    break;

                case 5:
                    editarTarefas();
                    break;

                case 6:
                    // Excluir uma tarefa
                    break;

                case 0:
                    System.out.println("""
                            \nSaindo do programa...
                            Obrigado por utilizar!
                            """);
                    break;

                default:
                    System.out.println("Opção invalida! Por favor tente novamente.");
                    break;
            }

        } while (op != 0);

        sc.close();
    }

}
