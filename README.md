<h1><b>Task Manager - Projeto Java</b></h1>

Este é um código Java que apresenta um menu de opções para gerenciar funcionários e tarefas. O programa permite que o usuário registre funcionários, crie tarefas, edite tarefas e visualize as listas de funcionários e tarefas registradas.

O programa foi desenvolvido com base em um projeto de treinamento e é destinado para fins educacionais.

O código foi escrito em Java, uma linguagem de programação orientada a objetos amplamente utilizada para o desenvolvimento de aplicativos. Foi utilizado o ambiente de desenvolvimento integrado (IDE) Eclipse para escrever e executar o código. O código utiliza classes e métodos personalizados, bem como as classes Scanner, ArrayList e Locale da biblioteca padrão do Java.<br><br>

<h2> Como usar: </h2>

1. Depois de executar a classe Program, o menu a seguir será exibido no console:<br><br>

~~~
______________________________________________
|	        Escolha uma Opção            |
______________________________________________
|				    	     |
|	1 - Registrar um novo funcionário    |
|	2 - Listar os funcionário registrados|
|	3 - Criar uma nova tarefa            |
|	4 - Listas todas as tarefas ativas   |
|	5 - Editar uma tarefa existente	     |
|	6 - Excluir uma tarefa               |
|	0 - Sair do programa                 |
|                                            |
______________________________________________
|        Escolha uma opção listada           |
|    (Digite e pressione o botão Enter):     |
______________________________________________
~~~

<br><br>2. Siga as instruções fornecidas no menu para interagir com o programa.<br><br>

<h3><b>1 - Registrar um novo funcionário</b></h3>

* O método "registrarFuncionario" é responsável por adicionar um novo funcionário à lista de funcionários existente no programa. Ele inicia imprimindo uma mensagem na tela indicando que o usuário deve digitar o nome do funcionário a ser adicionado e o cargo que ele ocupará. Em seguida, ele lê as entradas do usuário usando o objeto "leitura" e armazena essas informações nas variáveis "nomeFuncionario" e "cargoFuncionario", respectivamente.

* Depois disso, ele cria um novo objeto "Funcionario" com base nas informações coletadas e adiciona esse objeto à lista de funcionários "funcionarios", que é uma variável estática da classe "Metodos". Finalmente, o método imprime uma mensagem de confirmação na tela, indicando que o funcionário foi registrado com sucesso.

<br><h3><b>2 - Listar funcionários</b></h3>
* Esse método, chamado listarFuncionarios, tem a finalidade de listar todos os funcionários cadastrados no sistema.

* Primeiro, é verificado se a lista de funcionários está vazia ou não. Se estiver vazia, o programa pergunta se o usuário deseja cadastrar um novo funcionário. Se a resposta for "s" (sim), o método registrarFuncionario é chamado. Caso contrário, a mensagem "Retornando para o menu!" é exibida e o menu principal é mostrado novamente.

* Se a lista de funcionários não estiver vazia, o método percorre a lista utilizando um laço de repetição for e exibe na tela o nome e o cargo de cada funcionário registrado no sistema.

<br><h3><b>3 - Criar uma nova tarefa</b></h3>

* Esse método é responsável por criar uma nova tarefa e adicioná-la à lista de tarefas do programa. O usuário é solicitado a digitar o nome da tarefa, o nome do funcionário atribuído a essa tarefa e uma descrição da tarefa. 

* Em seguida, o programa verifica se o funcionário atribuído já existe na lista de funcionários. Se o funcionário não existe, o programa pergunta se deseja registrar um novo funcionário. Se a resposta for sim, o método registrarFuncionario() é chamado para adicionar o novo funcionário à lista. 

* Se a resposta for não, a criação da tarefa é cancelada e o método é encerrado. Se o funcionário existe, a tarefa é criada com o nome da tarefa, o funcionário atribuído, a descrição da tarefa e a data em que a tarefa foi criada. A nova tarefa é adicionada à lista de tarefas e uma mensagem de confirmação é exibida.

<br><h3><b>4 - Listar todas as tarefas ativas</b></h3>

* Esse método tem como objetivo listar todas as tarefas ativas registradas no sistema. Ele verifica se a lista de tarefas está vazia e, caso esteja, exibe uma mensagem informando que não há tarefas registradas. Se houver tarefas, ele exibe uma mensagem de cabeçalho e percorre a lista de tarefas ativas exibindo o nome da tarefa, o nome do funcionário atribuído a ela, a descrição da tarefa e a data em que foi criada. Ao final, exibe uma linha de separação.

<br><h3><b>5 - Editar uma tarefa existente</b></h3>

* O método editarTarefas() é responsável por permitir a edição de uma tarefa existente. Primeiramente, ele verifica se há tarefas criadas para editar. Se não houver, a mensagem "Não há tarefas criadas para editar!" é exibida e o método é encerrado. Caso contrário, o usuário é solicitado a digitar o nome da tarefa que deseja editar.

* O método, em seguida, verifica se a tarefa existe na lista de tarefas. Se não existir, uma mensagem é exibida perguntando se o usuário deseja criar uma nova tarefa. Se a resposta for "sim", o método criarTarefas() é chamado, caso contrário, o método é encerrado. Se a tarefa existir, as opções para editar a tarefa são exibidas no console, e o usuário deve selecionar uma opção.

* Se o usuário escolher a opção 1, ele deve digitar um novo nome para a tarefa, que é atribuído à tarefa correspondente. Se o usuário escolher a opção 2, ele deve digitar o nome do novo funcionário atribuído à tarefa. Em seguida, o método verifica se o funcionário existe na lista de funcionários, se não existir, uma mensagem é exibida perguntando se o usuário deseja cadastrar um novo funcionário. Se a resposta for "sim", o método registrarFuncionario() é chamado, caso contrário, o método é encerrado. Se o funcionário existir, ele é atribuído à tarefa correspondente.

* Se o usuário escolher a opção 3, ele deve digitar uma nova descrição para a tarefa, que é atribuída à tarefa correspondente. Se o usuário escolher a opção 0, o método é encerrado e o usuário é retornado ao menu principal. Se o usuário escolher uma opção inválida, uma mensagem é exibida e o usuário é solicitado a tentar novamente.

<br><h3><b>6 - Excluir uma tarefa</b></h3>

* Esse método, chamado "excluirTarefas", é responsável por remover uma tarefa da lista de tarefas criadas. Ele começa verificando se há alguma tarefa criada para excluir, caso contrário, exibe uma mensagem informando que não há tarefas para excluir e retorna. Em seguida, o usuário é solicitado a digitar o nome da tarefa a ser excluída.

* O método então percorre a lista de tarefas para encontrar a tarefa com o nome especificado pelo usuário. Se encontrada, exibe uma mensagem informando que a tarefa foi encontrada e mostra os detalhes da tarefa. Em seguida, o usuário é solicitado a confirmar se deseja realmente excluir a tarefa. Se confirmado, a tarefa é removida da lista de tarefas e uma mensagem é exibida informando que a tarefa foi excluída com sucesso. Se o usuário não confirmar a exclusão, a mensagem informando que a exclusão da tarefa foi cancelada é exibida.

* Caso a tarefa não seja encontrada na lista de tarefas, o método pergunta se o usuário deseja criar uma nova tarefa ou retornar para o menu. Se o usuário optar por criar uma nova tarefa, o método chama o método "criarTarefas", que é responsável por adicionar uma nova tarefa na lista de tarefas criadas. Caso contrário, o método retorna para o menu principal.


<h1><br><b>Equipe: </b></h1>

https://github.com/viniciusvk1<br>
https://github.com/alanismayra<br>
https://github.com/brunoo-lcf<br>
https://github.com/DehPantaleao<br>
https://github.com/slyblur<br>
https://github.com/wmgaspar<br>
