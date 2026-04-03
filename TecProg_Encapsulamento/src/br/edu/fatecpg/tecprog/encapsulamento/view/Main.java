package br.edu.fatecpg.tecprog.encapsulamento.view;
import br.edu.fatecpg.tecprog.encapsulamento.model.*;
import java.util.*;
public class Main {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\n===== MENU PRINCIPAL =====");
	            System.out.println("1 - Carro");
	            System.out.println("2 - Conta Bancária");
	            System.out.println("3 - Produto");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = sc.nextInt();
	            sc.nextLine(); // limpa buffer

	            switch (opcao) {
	                case 1 -> menuCarro(sc);
	                case 2 -> menuContaBancaria(sc);
	                case 3 -> menuProduto(sc);
	                case 0 -> System.out.println("Encerrando...");
	                default -> System.out.println("Opção inválida!");
	            }

	        } while (opcao != 0);

	        sc.close();
	    }

	    // ─── CARRO ────────────────────────────────────────────────
	    static void menuCarro(Scanner sc) {
	        Carro carro = new Carro();
	        int opcao;

	        do {
	            System.out.println("\n--- CARRO ---");
	            System.out.println("1 - Cadastrar carro");
	            System.out.println("2 - Calcular enchimento do tanque");
	            System.out.println("3 - Exibir dados");
	            System.out.println("0 - Voltar");
	            System.out.print("Opção: ");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {
	                case 1 -> {
	                    System.out.print("Marca: ");
	                    carro.setMarca(sc.nextLine());
	                    System.out.print("Modelo: ");
	                    carro.setModelo(sc.nextLine());
	                    System.out.print("Ano: ");
	                    carro.setAno(sc.nextInt());
	                    System.out.print("Capacidade do tanque (L): ");
	                    carro.setCapacidadeTanque(sc.nextDouble());
	                    sc.nextLine();
	                    System.out.println("Carro cadastrado!");
	                }
	                case 2 -> {
	                    System.out.print("Preço do combustível (R$/L): ");
	                    double preco = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.printf("Custo total: R$ %.2f%n",
	                            carro.calcularEnchimento(preco));
	                }
	                case 3 -> System.out.printf(
	                        "Carro: %s %s (%d) | Tanque: %.1f L%n",
	                        carro.getMarca(), carro.getModelo(),
	                        carro.getAno(), carro.getCapacidadeTanque());
	                case 0 -> System.out.println("Voltando...");
	                default -> System.out.println("Opção inválida!");
	            }

	        } while (opcao != 0);
	    }

	    // ─── CONTA BANCÁRIA ───────────────────────────────────────
	    static void menuContaBancaria(Scanner sc) {
	        System.out.print("Nome do titular: ");
	        ContaBancaria conta = new ContaBancaria(sc.nextLine());
	        int opcao;

	        do {
	            System.out.println("\n--- CONTA BANCÁRIA ---");
	            System.out.println("1 - Depositar");
	            System.out.println("2 - Sacar");
	            System.out.println("3 - Ver saldo");
	            System.out.println("0 - Voltar");
	            System.out.print("Opção: ");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {
	                case 1 -> {
	                    System.out.print("Valor para depositar: R$ ");
	                    conta.depositar(sc.nextDouble());
	                    sc.nextLine();
	                }
	                case 2 -> {
	                    System.out.print("Valor para sacar: R$ ");
	                    conta.sacar(sc.nextDouble());
	                    sc.nextLine();
	                }
	                case 3 -> System.out.printf("Saldo de %s: R$ %.2f%n",
	                        conta.getTitular(), conta.getSaldo());
	                case 0 -> System.out.println("Voltando...");
	                default -> System.out.println("Opção inválida!");
	            }

	        } while (opcao != 0);
	    }

	    // ─── PRODUTO ──────────────────────────────────────────────
	    static void menuProduto(Scanner sc) {
	        Produto produto = new Produto();
	        int opcao;

	        do {
	            System.out.println("\n--- PRODUTO ---");
	            System.out.println("1 - Cadastrar produto");
	            System.out.println("2 - Alterar preço");
	            System.out.println("3 - Alterar estoque");
	            System.out.println("4 - Exibir dados");
	            System.out.println("0 - Voltar");
	            System.out.print("Opção: ");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {
	                case 1 -> {
	                    System.out.print("Nome: ");
	                    produto.setNome(sc.nextLine());
	                    System.out.print("Preço: R$ ");
	                    produto.setPreco(sc.nextDouble());
	                    System.out.print("Quantidade em estoque: ");
	                    produto.setQuantidadeEstoque(sc.nextInt());
	                    sc.nextLine();
	                    System.out.println("Produto cadastrado!");
	                }
	                case 2 -> {
	                    System.out.print("Novo preço: R$ ");
	                    produto.setPreco(sc.nextDouble());
	                    sc.nextLine();
	                }
	                case 3 -> {
	                    System.out.print("Nova quantidade: ");
	                    produto.setQuantidadeEstoque(sc.nextInt());
	                    sc.nextLine();
	                }
	                case 4 -> System.out.printf(
	                        "Produto: %s | Preço: R$ %.2f | Estoque: %d un%n",
	                        produto.getNome(), produto.getPreco(),
	                        produto.getQuantidadeEstoque());
	                case 0 -> System.out.println("Voltando...");
	                default -> System.out.println("Opção inválida!");
	            }

	        } while (opcao != 0);
	    }
}
