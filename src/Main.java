import java.util.Scanner;

import sistema.Produtos;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a descrição do novo produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Qual a ID do novo produto: ");
        int id = scanner.nextInt();

        Produtos newProduct = new Produtos(id, descricao);
        /* newProduct.setId(id);
         newProduct.setDescricao(description); */

        System.out.println("Produto Criado com Sucesso!");
        System.out.println("ID: " + newProduct.getId());
        System.out.println("Descrição: " + newProduct.getDescricao());

        }
    }