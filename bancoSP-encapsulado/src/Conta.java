class Conta { // atributos da conta são suas especificacoes (caracteristicas):
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total; // variavel global aos objetos.

	// Construtor -- Rotina de inicialização
	public Conta(int agencia, int numero) {
		if(agencia < 0 || numero < 0) {
			System.out.println("Agencia ou numeros menores do que zero. ");
			return;
		}
		
		
		this.agencia = agencia;
		this.numero = numero;
		
	
		
		Conta.total++;
		this.saldo = 100;
		
		System.out.println("O total de contas é " + total);
		System.out.println("to aqui ó " + this.agencia);
		
		
		// System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	
	/*
	 * "this" chama o saldo que é uma caracteristica de Conta. Ou seja, verbalizando
	 * a linha de código fica assim: Saldo atual é > Saldo atual + o double valor
	 * temporário que será recebido no metodo 'depositaDinero'.
	 */
	
	public void depositaDinero(double valor) {
		this.saldo += valor;

	}

	/* não existe método dentro de método. */
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositaDinero(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		
		return this.saldo;
	}

	public int getNumero() {
		// retorna numero
		return this.numero;
	}

	public void setNumero(int numero) {
		// (this. = numero dessa conta) recebe o numero que foi passado como argumento
		// em (int numero)
		
		// atribui numero
		
		if(numero <= 0) {
			
			System.out.println("Não é possivel incluir um valor menor do que zero ");
			return;
		
		
	} this.numero = numero;
	
		}
		

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
	
		if(agencia <= 0) {
			
			System.out.println("Não é possivel incluir um valor menor do que zero ");
			return;
			
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
	//	System.out.println(this.saldo); // não existe this em static porque o Static conversa com a classe
		return Conta.total;
	}
}
