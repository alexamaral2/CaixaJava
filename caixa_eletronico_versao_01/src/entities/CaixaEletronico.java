package entities;

public class CaixaEletronico {

	private int notas100;
	private int notas50;
	private int notas20;
	private int notas10;
	private int notas5;
	private int notas2;

	public CaixaEletronico() {
	}

	public CaixaEletronico(int notas100, int notas50, int notas20, int notas10, int notas5, int notas2) {
		adicionarNota100(notas100);
		adicionarNota50(notas50);
		adicionarNota20(notas20);
		adicionarNota10(notas10);
		adicionarNota5(notas5);
		adicionarNota2(notas2);
	}

	public int getNotas100() {
		return notas100;
	}

	public int getNotas50() {
		return notas50;
	}

	public int getNotas20() {
		return notas20;
	}

	public int getNotas10() {
		return notas10;
	}

	public int getNotas5() {
		return notas5;
	}

	public int getNotas2() {
		return notas2;
	}

	@Override
	public String toString() {
		return "Notas de 100: " + notas100 + "\n" + "Notas de 50: " + notas50 + "\n" + "Notas de 20: " + notas20 + "\n"
				+ "Notas de 10: " + notas10 + "\n" + "Notas de 5: " + notas5 + "\n" + "Notas de 2: " + notas2 + "\n"
				+ "Saldo Total: R$ " + consultarSaldo();
	}

	public void adicionarNota100(int quantidade) {
		this.notas100 += quantidade;
	}

	public void adicionarNota50(int quantidade) {
		this.notas50 += quantidade;
	}

	public void adicionarNota20(int quantidade) {
		this.notas20 += quantidade;
	}

	public void adicionarNota10(int quantidade) {
		this.notas10 += quantidade;
	}

	public void adicionarNota5(int quantidade) {
		this.notas5 += quantidade;
	}

	public void adicionarNota2(int quantidade) {
		this.notas2 += quantidade;
	}

	public double consultarSaldo() {
		return (double) this.notas100 * 100 + this.notas50 * 50 + this.notas20 * 20 + this.notas10 * 10
				+ this.notas5 * 5 + this.notas2 * 2;
	}

	public void sacar(double valorSaque) {
		if (valorSaque <= 0 || valorSaque > consultarSaldo()) {
			System.out.println("Não foi possível sacar!");
			return;
		}

		int qtdNotas100 = 0, qtdNotas50 = 0, qtdNotas20 = 0, qtdNotas10 = 0, qtdNotas5 = 0, qtdNotas2 = 0;

		while (valorSaque >= 100 && this.notas100 > 0) {
			qtdNotas100++;
			valorSaque -= 100;
		}
		while (valorSaque >= 50 && this.notas50 > 0) {
			qtdNotas50++;
			valorSaque -= 50;
		}
		while (valorSaque >= 20 && this.notas20 > 0) {
			qtdNotas20++;
			valorSaque -= 20;
		}
		while (valorSaque >= 10 && this.notas10 > 0) {
			qtdNotas10++;
			valorSaque -= 10;
		}
		while (valorSaque >= 5 && this.notas5 > 0) {
			qtdNotas5++;
			valorSaque -= 5;
		}
		while (valorSaque >= 2 && this.notas2 > 0) {
			qtdNotas2++;
			valorSaque -= 2;
		}

		if (valorSaque > 0) {
			System.out.println("Não foi possível realizar o saque exato com as notas disponíveis.");
		} else {
			this.notas100 -= qtdNotas100;
			this.notas50 -= qtdNotas50;
			this.notas20 -= qtdNotas20;
			this.notas10 -= qtdNotas10;
			this.notas5 -= qtdNotas5;
			this.notas2 -= qtdNotas2;
			System.out.println("Saque realizado com sucesso!");
		}
	}

}
