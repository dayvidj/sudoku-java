package model;

import java.util.Scanner;

public class JogoSudoku {

	private Tabuleiro tabuleiro;
	private boolean jogoIniciado;

	public JogoSudoku(String[] args) {
		tabuleiro = new Tabuleiro();
		tabuleiro.inicializarTabuleiro(args);
		jogoIniciado = false;
	}

	public void iniciarNovoJogo() {
		jogoIniciado = true;
		tabuleiro.visualizarTabuleiro();
	}

	public void colocarNumero(Scanner scanner) {
		System.out.print("Digite o número a ser colocado (1-9): ");
		int numero = scanner.nextInt();
		System.out.print("Digite o índice horizontal (0-8): ");
		int linha = scanner.nextInt();
		System.out.print("Digite o índice vertical (0-8): ");
		int coluna = scanner.nextInt();

		if (!jogoIniciado) {
			exibirMensagemJogoNaoIniciado();
		} else if (!tabuleiro.colocarNumero(linha, coluna, numero)) {
			System.out.println(
					"Não foi possível colocar o número. Verifique se a posição está preenchida ou se é um número fixo.");
		}
	}

	public void removerNumero(Scanner scanner) {
		System.out.print("Digite o índice horizontal (0-8): ");
		int linha = scanner.nextInt();
		System.out.print("Digite o índice vertical (0-8): ");
		int coluna = scanner.nextInt();

		if (!jogoIniciado) {
			exibirMensagemJogoNaoIniciado();
		} else if (!tabuleiro.removerNumero(linha, coluna)) {
			System.out.println("Não foi possível remover o número. Verifique se é um número fixo.");
		}
	}

	public void visualizarTabuleiro() {
		tabuleiro.visualizarTabuleiro();
	}

	public void verificarStatus() {
		if (!jogoIniciado) {
			exibirMensagemJogoNaoIniciado();
		} else {
			tabuleiro.verificarStatus();
		}
	}

	public void limparNumeros() {
		tabuleiro.limparTabuleiro();
		System.out.println(
				"Os números informados pelo jogador foram removidos. Os números fixos permanecem no tabuleiro.");
	}

	public void finalizarJogo() {
		if (tabuleiro.estaCompleto() && !tabuleiro.temErros()) {
			System.out.println("Parabéns! Você completou o jogo com sucesso.");
		} else {
			System.out.println("O jogo ainda não está completo ou contém erros. Continue jogando!");
		}
	}

	private void exibirMensagemJogoNaoIniciado() {
		System.out
				.println("O jogo ainda não foi iniciado. Por favor, inicie um novo jogo antes de realizar esta ação.");
	}
}
