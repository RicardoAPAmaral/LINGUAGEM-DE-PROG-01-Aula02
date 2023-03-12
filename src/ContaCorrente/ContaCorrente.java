/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaCorrente;


public class ContaCorrente {
	private String titular;
	private int conta;
	private double saldo;
	
		
	
	
	public ContaCorrente(String titular, int conta) {
		this.titular = titular;
		this.conta = conta;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public double verificarSaldo() {
		return saldo;
	}
	 public void depositar(double valor) {
		 this.saldo+=valor;
		 System.out.println("Seu novo saldo e:" +this.saldo);
		 
	 }
	 
	 public void sacar(double valor) {
		 if(this.saldo>=valor) {
			 this.saldo-=valor;
			 System.out.println("Seu novo saldo apos o saque e:" +this.saldo);
		 }else {System.out.println("Sem saldo suficiente.");
	 }
	
	
	 }
}

