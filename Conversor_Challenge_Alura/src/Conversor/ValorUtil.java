package Conversor;

public class ValorUtil {
private double valor, resultado;


public void setValor(double valor) {
	this.valor = valor;
	setResultado(this.valor);
}

public double getResultado() {
	return resultado;
}

public void setResultado(double resultado) {
	this.resultado=(double) Math.round(this.valor  * 100d) / 100;
	
}

}
