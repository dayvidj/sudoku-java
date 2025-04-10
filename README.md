# Jogo Sudoku
Este projeto implementa um jogo de Sudoku em Java, utilizando Programação Orientada a Objetos (POO). 

### 📖 Descrição do Projeto
O Jogo foi desenvolvido para funcionar no terminal, oferecendo uma experiência interativa para o usuário. 
O programa permite que o jogador inicialize o tabuleiro com números fixos (fornecidos via linha de comando ou inseridos no código) 
e interaja com o tabuleiro conforme as regras do Sudoku.

### 🛠 Estrutura do Código
O projeto está dividido em várias classes para manter o código organizado e fácil de manter:

- **JogoSudoku**: Gerencia a interação com o jogador e o fluxo principal do jogo.

- **Tabuleiro**: Manipula os dados do tabuleiro, como números fixos e inseridos pelo jogador.

- **Util**: Fornece métodos utilitários para validação de números e verificação de conflitos.

- **Main**: Contém o ponto de entrada do programa e exibe o menu ao usuário.

### 📋 Funcionalidades Principais
1. __Iniciar um novo jogo__: Exibe o tabuleiro inicial com os números fixos.

2. __Colocar um novo número__: Permite ao jogador inserir um número em uma posição específica, desde que a posição esteja vazia.

3. __Remover um número__: Remove um número inserido pelo jogador (números fixos não podem ser removidos).

4. __Verificar tabuleiro__: Exibe o estado atual do tabuleiro.

5. __Verificar status do jogo__: Verifica se o jogo está completo, incompleto ou contém erros.

6. __Limpar números__: Remove todos os números inseridos pelo jogador, mantendo os números fixos.

7. __Finalizar o jogo__: Checa se o tabuleiro foi completado corretamente e finaliza o jogo.

### 🧩 Exemplo de Uso

Ao executar o programa, o menu será exibido. O jogador pode interagir digitando as opções e seguindo as instruções, como:

- Digitar a opção 1 para iniciar um novo jogo. Isso exibirá o tabuleiro inicial com os números fixos configurados.
```
Menu Sudoku:
1. Iniciar um novo jogo
2. Colocar um novo número
3. Remover um número
4. Verificar jogo
5. Verificar status do jogo
6. Limpar
7. Finalizar o jogo
8. Sair
Escolha uma opção: 1
Tabuleiro inicial:
5 3 0 0 7 0 0 0 0 
6 0 0 1 9 5 0 0 0 
0 9 8 0 0 0 0 6 0 
8 0 0 0 6 0 0 0 3 
4 0 0 8 0 3 0 0 1 
7 0 0 0 2 0 0 0 6 
0 6 0 0 0 0 2 8 0 
0 0 0 4 1 9 0 0 5 
0 0 0 0 8 0 0 7 9
```

- Escolher a opção 2 para inserir um número. O jogo solicitará os seguintes dados:

```
Digite o número a ser colocado (1-9): 4
Digite o índice horizontal (0-8): 2
Digite o índice vertical (0-8): 3
```

