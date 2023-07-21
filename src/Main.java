import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

import db.ProdutoDb;
import sistema.Produtos;

public class Main {

    static ProdutoDb produtosdb = new ProdutoDb();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("-- PEDIDO DE VENDAS --");


        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");

            System.out.print("Qual operação você deseja realizar: ");
            option = scanner.nextInt();

            process(option);

        } while (option != 0);


    }

    public static void process(int option) throws Exception {
        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Qual a descrição do novo produto: ");
                String descricao = scanner.nextLine();

                System.out.print("Qual a ID do novo produto: ");
                int id = scanner.nextInt();

                System.out.print("Qual o preço do produto: ");
                double preco = scanner.nextDouble();

                System.out.print("Qual a data de validade do produto: ");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produtos newProduct = new Produtos(id, descricao, preco, dataValidade);

                produtosdb.addNovoProduto(newProduct);

                break;
            }

            case 2: {
                List<Produtos> listaDeProdutos = produtosdb.getProdutosList();

                for(Produtos produtos : listaDeProdutos) {
                    System.out.println("--- ID: " + produtos.getId());
                    System.out.println("--- Descrição: " + produtos.getDescricao());
                    System.out.println("--- Preço: " + produtos.getPreco());
                    System.out.println("--- Validade: " + produtos.getDataValidade());
                    System.out.println("----------------------------------------");
                }

                break;
            }
        }
    }
}