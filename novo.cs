using System;
using System.Collections.Generic;

class Program
{
    static List<Produto> produtos = new List<Produto>();

    static void Main()
    {
        while (true)
        {
            Console.WriteLine("1. Adicionar Produto");
            Console.WriteLine("2. Listar Produtos");
            Console.WriteLine("3. Sair");

            string opcao = Console.ReadLine();

            switch (opcao)
            {
                case "1":
                    AdicionarProduto();
                    break;
                case "2":
                    ListarProdutos();
                    break;
                case "3":
                    Environment.Exit(0);
                    break;
                default:
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    static void AdicionarProduto()
    {
        Console.WriteLine("Digite o nome do produto:");
        string nome = Console.ReadLine();

        Console.WriteLine("Digite o preço do produto:");
        double preco = Convert.ToDouble(Console.ReadLine());

        Produto novoProduto = new Produto(nome, preco);
        produtos.Add(novoProduto);

        Console.WriteLine("Produto adicionado com sucesso!");
    }

    static void ListarProdutos()
    {
        Console.WriteLine("Lista de Produtos:");

        foreach (var produto in produtos)
        {
            Console.WriteLine($"Nome: {produto.Nome}, Preço: {produto.Preco:C}");
        }
    }
}

class Produto
{
    public string Nome { get; set; }
    public double Preco { get; set; }

    public Produto(string nome, double preco)
    {
        Nome = nome;
        Preco = preco;
    }
}