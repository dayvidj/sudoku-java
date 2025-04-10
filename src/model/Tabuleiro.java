package model;

import util.Util;

public class Tabuleiro {

	private int[][] tabuleiro;
	private int[][] fixos;

	public Tabuleiro() {
		tabuleiro = new int[9][9];
		fixos = new int[9][9];
	}

	public void inicializarTabuleiro(String[] args) {
		for (String arg : args) {
			try {
				String[] partes = arg.split(",");
				int linha = Integer.parseInt(partes[0]);
				int coluna = Integer.parseInt(partes[1]);
				int numero = Integer.parseInt(partes[2]);

				if (linha >= 0 && linha < 9 && coluna >= 0 && coluna < 9 && Util.validarNumero(numero)) {
					tabuleiro[linha][coluna] = numero;
					fixos[linha][coluna] = numero;
				} else {
					System.out.println("Argumento inválido: " + arg);
				}
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao processar argumento: " + arg);
			}
		}
	}

	public boolean colocarNumero(int linha, int coluna, int numero) {
		if (!validarPosicao(linha, coluna) || fixos[linha][coluna] != 0 || tabuleiro[linha][coluna] != 0
				|| !Util.validarNumero(numero)) {
			return false;
		}
		tabuleiro[linha][coluna] = numero;
		return true;
	}

	public boolean removerNumero(int linha, int coluna) {
		if (!validarPosicao(linha, coluna) || fixos[linha][coluna] != 0) {
			return false;
		}
		tabuleiro[linha][coluna] = 0;
		return true;
	}

	public void visualizarTabuleiro() {
		for (int[] linha : tabuleiro) {
			for (int numero : linha) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
	}

	public void verificarStatus() {
		if (estaCompleto() && !temErros()) {
			System.out.println("Jogo completo e correto!");
		} else if (temErros()) {
			System.out.println("O jogo contém erros. Verifique números repetidos em linhas, colunas ou sub-grades.");
		} else {
			System.out.println("O jogo está incompleto.");
		}
	}

	public boolean estaCompleto() {
		for (int[] linha : tabuleiro) {
			for (int numero : linha) {
				if (numero == 0)
					return false;
			}
		}
		return true;
	}

	public boolean temErros() {
		return Util.verificarConflitos(tabuleiro);
	}

	public void limparTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (fixos[i][j] == 0) {
					tabuleiro[i][j] = 0;
				}
			}
		}
	}

	private boolean validarPosicao(int linha, int coluna) {
		return linha >= 0 && linha < 9 && coluna >= 0 && coluna < 9;
	}
}
