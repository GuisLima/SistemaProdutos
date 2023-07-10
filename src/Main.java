import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import sistema.Produtos;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("-- PEDIDO DE VENDAS --");


        do {
            System.out.println("1 - Cadastrar produto");
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
                System.out.println("Produto Criado com Sucesso!");
                System.out.println("ID: " + newProduct.getId());
                System.out.println("Descrição: " + newProduct.getDescricao());
                System.out.println("Preço: " + newProduct.getPreco());
                System.out.println("Data de validade: " + newProduct.getDataValidade());
                System.out.println("--------------------------------");
            }
        }
    }
}