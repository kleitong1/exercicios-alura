/* Getters e Setters facilitam a orienta��o a objetos devido ao encapsulamento, ou seja, 
N�o ser� mais possivel acessar o atributo diretamente, dando possibilidades para criar barreiras
para que n�o haja erros de inser��o.

-- 
A implementa��o interna pode ser modificada sem afetar nenhum c�digo fora da pr�pria classe.

*/
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(2223, 23232);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println("Saldo em conta " + conta.getNumero());
		
		Cliente kleiton = new Cliente();
		// conta.titular = kleiton;
		
		kleiton.setNome("Kleiton Gomes de Amarante");
		
		conta.setTitular(kleiton);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfiss�o("Programador");
		// a mesma coisa s� que em duas linhas: 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfiss�o("programador");
		
		System.out.println(titularDaConta); // Ele ir� escrever o endere�o de memoria do objeto da referencia do objeto do tipo Conta.
		System.out.println(kleiton);
		System.out.println(conta.getTitular());
	}
}
