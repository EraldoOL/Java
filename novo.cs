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

using System;
using System.Collections.Generic;

class Program
{
    static List<Produto> produtos = new List<Produto>();
    static List<Categoria> categorias = new List<Categoria>();

    static void Main()
    {
        while (true)
        {
            Console.WriteLine("1. Adicionar Produto");
            Console.WriteLine("2. Listar Produtos");
            Console.WriteLine("3. Remover Produto");
            Console.WriteLine("4. Adicionar Categoria");
            Console.WriteLine("5. Listar Categorias");
            Console.WriteLine("6. Sair");

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
                    RemoverProduto();
                    break;
                case "4":
                    AdicionarCategoria();
                    break;
                case "5":
                    ListarCategorias();
                    break;
                case "6":
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

        Console.WriteLine("Digite a quantidade em estoque:");
        int quantidade = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Selecione a categoria do produto:");
        ListarCategorias();
        int categoriaSelecionada = Convert.ToInt32(Console.ReadLine());

        Produto novoProduto = new Produto(nome, preco, quantidade, categorias[categoriaSelecionada - 1]);
        produtos.Add(novoProduto);

        Console.WriteLine("Produto adicionado com sucesso!");
    }

    static void ListarProdutos()
    {
        Console.WriteLine("Lista de Produtos:");

        foreach (var produto in produtos)
        {
            Console.WriteLine($"Nome: {produto.Nome}, Preço: {produto.Preco:C}, Quantidade: {produto.Quantidade}, Categoria: {produto.Categoria.Nome}");
        }
    }

    static void RemoverProduto()
    {
        Console.WriteLine("Digite o nome do produto que deseja remover:");
        string nomeProduto = Console.ReadLine();

        Produto produtoRemover = produtos.Find(p => p.Nome.Equals(nomeProduto, StringComparison.OrdinalIgnoreCase));

        if (produtoRemover != null)
        {
            produtos.Remove(produtoRemover);
            Console.WriteLine("Produto removido com sucesso!");
        }
        else
        {
            Console.WriteLine("Produto não encontrado.");
        }
    }

    static void AdicionarCategoria()
    {
        Console.WriteLine("Digite o nome da categoria:");
        string nomeCategoria = Console.ReadLine();

        Categoria novaCategoria = new Categoria(nomeCategoria);
        categorias.Add(novaCategoria);

        Console.WriteLine("Categoria adicionada com sucesso!");
    }

    static void ListarCategorias()
    {
        Console.WriteLine("Lista de Categorias:");

        for (int i = 0; i < categorias.Count; i++)
        {
            Console.WriteLine($"{i + 1}. {categorias[i].Nome}");
        }
    }
}

class Produto
{
    public string Nome { get; set; }
    public double Preco { get; set; }
    public int Quantidade { get; set; }
    public Categoria Categoria { get; set; }

    public Produto(string nome, double preco, int quantidade, Categoria categoria)
    {
        Nome = nome;
        Preco = preco;
        Quantidade = quantidade;
        Categoria = categoria;
    }
}

class Categoria
{
    public string Nome { get; set; }

    public Categoria(string nome)
    {
        Nome = nome;
    }
}