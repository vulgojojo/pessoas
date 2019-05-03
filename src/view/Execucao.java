package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
	
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setCpf(987654321);
		pf.setNome("Joao Vitor");
		pf.setEndereco("Rua Sonho Gaucho");
		pf.setBairro("A.E. Carvalho");
		pf.setCidade("São Paulo");
		pf.setEstado("SP");
		pf.setCep(3694900);
		pf.setTelefone(987654321);
		
		System.out.println("Pessoa Fisica.");
		System.out.println("CPF: " + pf.getCpf());
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Endereço: " + pf.getEndereco());
		System.out.println("Bairro: " + pf.getBairro());
		System.out.println("Cidade: " + pf.getCidade());
		System.out.println("Estado: " + pf.getEstado());
		System.out.println("CEP: " + pf.getCep());
		System.out.println("Telefone: " + pf.getTelefone());
		System.out.println("-----------------------------------");
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setCnpj(123456789);
		pj.setRazaoSocial("Etec ZL");
		pj.setEndereco("Rua Sonho Gaucho");
		pj.setBairro("A.E. Carvalho");
		pj.setCidade("São Paulo");
		pj.setEstado("SP");
		pj.setCep(3694900);
		pj.setTelefone(987654321);
		
		System.out.println("Pessoa Juridica.");
		System.out.println("CNPJ: " + pj.getCnpj());
		System.out.println("Nome: " + pj.getRazaoSocial());
		System.out.println("Endereço: " + pj.getEndereco());
		System.out.println("Bairro: " + pj.getBairro());
		System.out.println("Cidade: " + pj.getCidade());
		System.out.println("Estado: " + pj.getEstado());
		System.out.println("CEP: " + pj.getCep());
		System.out.println("Telefone: " + pj.getTelefone());
	}
}
