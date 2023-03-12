
import ContaCorrente.ContaCorrente;


public class TestadoraContaCorrente {
	public static void main (String[] args) {
		
		ContaCorrente cc = new ContaCorrente("Ricardo",28);
		cc.depositar(100_000);
		cc.sacar(500);
		cc.depositar(25_000);
		
	}

}
