/* Getters e Setters facilitam a orientação a objetos devido ao encapsulamento, ou seja, 
Não será mais possivel acessar o atributo diretamente, dando possibilidades para criar barreiras
para que não haja erros de inserção.

-- 
A implementação interna pode ser modificada sem afetar nenhum código fora da própria classe.

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
		
		conta.getTitular().setProfissão("Programador");
		// a mesma coisa só que em duas linhas: 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissão("programador");
		
		System.out.println(titularDaConta); // Ele irá escrever o endereço de memoria do objeto da referencia do objeto do tipo Conta.
		System.out.println(kleiton);
		System.out.println(conta.getTitular());
	}
}
