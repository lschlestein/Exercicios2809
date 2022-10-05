package heranca.ex3;
/*
 * Uma empresa está cadastrando seus funcionários em sua base de dados. Sabendo que Funcionario é uma Pessoa, 
 * e que pessoas possuem (nome, idade e telefone), e que seus funcionários são divididos por (setor, cargo e função).
 *  Crie uma classe executável, e cadastre 3 funcionários, preferencialmente solicitando as informações via console ao
 *   usuário. Após esse cadastro, exiba esses funcionários na tela. A classe Funcionario deve herdar as 
 *   características da classe Pessoa.
 * */
public class Funcionario extends Pessoa{
	protected static String setor;
	protected static String cargo;
	protected static String funcao;
	
	protected static void exibirInformacoes() {
		System.out.println("Nome: "+nome+" idade: "+idade+" telefone: "+telefone);
		System.out.println("Setor: "+setor+" cargo: "+cargo+" função: "+funcao);
	}
	

}
