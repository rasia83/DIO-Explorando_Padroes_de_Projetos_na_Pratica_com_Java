package dio.gof.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}

	public Robo(Comportamento comportamento) {
		super();
		this.comportamento = comportamento;
	}
	public Robo() {
		super();
		this.comportamento = new ComportamentoNormal();
	}

	
}
