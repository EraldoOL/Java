public class Main {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++){
        System.out.println(i);
      }
    }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um nome: ");
    String input = scanner.nextLine();
    System.out.println("Bem vindo: " + input);
    scanner.close();
  }
}

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100);
       System.out.println(arr[i] + "");
      }
    }
  }
  
  public class Main {
  public static void main(String[] args) {
    int n[] = {3,2,7,8,9};
    
    for(int c=0; c<n.length; c++){
      System.out.println(n[c]);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
    for(int c = 0; c < mes.length; c++){
      System.out.println("O mês de " + mes[c] + " tem " + dias[c] + " dias");
    }
  }
}

// .sort deixa em ordem
// .binarySearch ,ele acha onde está 



import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    double v[] = {3.5,2.5,1.5,0.5};
    Arrays.sort(v);
    for(double valor: v) {
      System.out.println(valor +" " );
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int v[] = {3,5,7,9,5};
    for (int vet:v){
      System.out.println(v);
    }
    int p = Arrays.binarySearch(v,1);
    System.out.println(p);
    }
  }
  
  
  import java.util.Arrays
  
  
  public class Main {
  public static void main(String[] args) {
    int v[] = new int[20];
    Arrays.fill(v,3);
    for(int valor:v){
      System.out.println(valor + "");
    }
    
    
    }
  }

package Aula;

public class Aula{
  
  public static class Caneta{
  
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;
  void status(){
    System.out.print("Uma caneta " + this.cor);
  }
  
  void rabiscar(){
    
  }
  
  void tampar(){
    
  }
  
  void destampar(){
    
  }
}

  public static void main(String[] args) {
    
    Caneta c1 = new Caneta();
    c1.cor = "verde";
    c1.ponta = 0.5f;
    c1.tampada = false;
    c1.status();
    
  }
}

public class Aula{
  
  public static class Celular{
    
    String nome;
    String sistema;
    int espaco;
    float tamanho;
    
  }
  
  
  public static void main(String[] args) {
    
    
    Celular celularA = new Celular();
    
    
    celularA.nome = "Iphone 12";
    celularA.tamanho = 6.1f;
    celularA.espaco = 256;
    celularA.sistema = "iOS";
    
    
    Celular celularB = new Celular();
    
    
    celularB.nome = "Galaxy";
    celularB.tamanho = 6.9f;
    celularB.espaco = 256;
    celularB.sistema = "Android";
    
    
    System.out.format("Celular %s com tela %.1f ,com %dgb e SO %s \n", celularA.nome,
    celularA.tamanho, celularA.espaco, celularA.sistema);
    
    
    
    System.out.format("Celular %s com tela %.1f ,com %dgb e SO %s", celularB.nome,
    celularB.tamanho, celularB.espaco, celularB.sistema);
    
  }
}

import java.util.Random;

public class Aula{



public static class Personagem{
  
  
  String nome;
  int nivel;
  int forca;
  
  void mostrarStatus(){
    System.out.format("Personagem: %s (lvl %d) com %d de força ", nome, nivel, forca);
  }
  
  
  
  int calcularDano(){
    Random gerador = new Random();
    int dado20 = 1 + gerador.nextInt(19);
    int dano = forca + dado20;
    return dano;
  }
  
  
  
  void atacar(String alvo, String habilidades){
    int dano = calcularDano();
    
    if(habilidades.length() == 0){
      
      System.out.format("%s atacou %s e causou %d de dano. \n", nome, alvo,
      forca);
      
    } else{
      
      System.out.format("%s usou '%s' contra %s e causou %d de dano. \n", nome,
      habilidades,
      alvo, dano);
    }
    
    
  }
  
  }
  
  public static void main(String[] args) {
    
    Personagem heroi = new Personagem();
    
    heroi.nome = "hercules";
    heroi.nivel = 2;
    heroi.forca = 16;
    
    
    heroi.mostrarStatus();
    heroi.atacar("Hydra", "Golpe duplo");
    
    
  }
  
  
}




public class Filme{
  
  public static class ContaNetflix{
  
  
  private String idiomaP;
  private String resolucaoTela;
  
  public void entrar(){
    buscarP();
    buscarR();
  }
  
  private void buscarP(){
    idiomaP = "PT-br";
  }
  
  private void buscarR(){
    resolucaoTela = "Full HD";
  }
  
  private void assistirFilme(String nomeFilme){
    
    System.out.println("iniIniciando Filme" + nomeFilme);
    System.out.println("Carregando o filme na resolcao " + resolucaoTela);
    carregarAudio();
  }
  
  private void carregarAudio(){
    if(idiomaP == "PT-br" || idiomaP == "EN-US"){
    System.out.println("Carregando o audio " + idiomaP);
  }else{
    System.out.println("Carregando o audio em EN-US");
  }
 }
}
  
  public static void main(String[] args) throws Exception {
    
    ContaNetflix conta = new ContaNetflix();
    conta.entrar();
    conta.assistirFilme("Venom");
  }
}

public class  Classes{
  
  public static class Personagem{
    
    
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;
    
    
    
    
    
    public Personagem(String nome, String classe){
      
      
      this.nome = nome;
      this.classe = classe;
      nivel = 10;
      vida = nivel * 5000;
      if (classe.equals("Guerreiro")){
        forca = nivel * 2;
      }  else {
        forca = nivel * 1;
      }
      
      
    }
    
    
    
    public void mostrarStatus(){
      
      System.out.format(" Nome: %s\n Nivel: %d\n Vida: %d\n Classe: %s\n Forca: %d", nome , nivel, vida, classe, forca);
    }
    
      public String getNome(){
      return nome;
    }
    
    
    
    public void setNome(String nome){
      this.nome = nome;
      
    }
    
    
    public int getNivel(){
      return nivel;
      
    }
    
    
    
    public void setNivel( int nivel){
      this.nivel = nivel;
      
    }
    
    public int getForca(){
      return forca;
      
    }
    
    public void setForca(int forca){
      this.forca = forca;
    }
    
    public int getVida(){
      return vida;
      
    }
    
    public void setVida(int vida){
      this.vida = vida;
    }
    
   }
    
  
  
  public class  Classes{
  
  public static class Personagem{
    
    
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;
    
    
    
    
    
    public Personagem(String nome, String classe){
      
      
      this.nome = nome;
      this.classe = classe;
      nivel = 10;
      vida = nivel * 5000;
      if (classe.equals("Guerreiro")){
        forca = nivel * 2;
      }  else {
        forca = nivel * 1;
      }
      
      
    }
    
    
    
    public void mostrarStatus(){
      
      System.out.format(" Nome: %s\n Nivel: %d\n Vida: %d\n Classe: %s\n Forca: %d", nome , nivel, vida, classe, forca);
    }
    
      public String getNome(){
      return nome;
    }
    
    
    
    public void setNome(String nome){
      this.nome = nome;
      
    }
    
    
    public int getNivel(){
      return nivel;
      
    }
    
    
    
    public void setNivel( int nivel){
      this.nivel = nivel;
      
    }
    
    public int getForca(){
      return forca;
      
    }
    
    public void setForca(int forca){
      this.forca = forca;
    }
    
    public int getVida(){
      return vida;
      
    }
    
    public void setVida(int vida){
      this.vida = vida;
    }
    
   }
    
   public static void main(String[] args) throws Exception {
    
    Personagem guerreiro = new Personagem("Pionne", "Guerreiro");
    guerreiro.mostrarStatus();
    
  }
}


//Contrutor


public class Classes{
  

public static class Pessoa{
  
  private String nome;
  private int idade;
  private float altura;
  
  
  public Pessoa(){
    System.out.println("Uma pessoa acaba de nascer");
    altura = 1.50f;
  }
  
  
  
  
  public String getNome(){
    return nome;
    
  }
  
  public void setNome( String nome){
    this.nome = nome;
  }
  
  
  
  public int getIdade(){
    return idade;
    
  }
  
  public void setIdade( int idade){
    this.idade = idade;
    
  }
  
  
  
  public float getAltura(){
    return altura;
    
  }
  
  public void setAltura( float altura){
    this.altura = altura;
  }
  
 }
 
 public static void main(String[] args) throws Exception {
   
   Pessoa pessoa = new Pessoa();
   pessoa.setNome("joao");
   pessoa.setIdade(47);
   pessoa.setAltura(1.90f);
   
   
   System.out.format("Nome :%s, idade = %d e %.2f", pessoa.getNome(),
   pessoa.getIdade(), pessoa.getAltura());
 }

}



public class App{
  
  
  public static class Circulo implements Fig{
    
    
    
    private int raio;
    
    
    
    
    public Circulo(int raio){
      this.raio = raio;
    }
    
    
    
    public double calcularArea(){
      
      return Math.PI * Math.pow(raio,2);
      
    }
    
    public int gerRaio() {
      return raio;
    }
    
    public void setRaio( int raio){
      this.raio = raio;
    }
  }
  
  
  public static class Quadrado implements Fig{
  
  private int lado;
  
  
  public Quadrado(int lado){
    
    
    this.lado = lado;
  }
  
  public double calcularArea() {
    
    return Math.pow(lado,2);
    
  }
  
  
  public int getLado() {
      return lado;
    }
    
    public void setLado( int lado){
      this.lado = lado;
    }
    
  }
  
  
  public class CalculadorArea{
    
    
    public class somarAreas(Fig figuraA, Fig figuraB){
      
      double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
      return totalArea;
      
    }
    
  }
  
  
  
  
  public interface Fig{
    
  public double calcularArea();
  
}
  
  
  
  public static void main (String[] args) throws Exception{
    
    Circulo circuloP = new Circulo(2);
    Quadrado quadrado = new Quadrado(5);
    
    
    CalculadorArea calculador = new CalculadorArea();
    
    System.out.println(calculador.somarAreas(quadrado, circulo));
    
  }
}



public class App{
  
  public  interface  Jogo{
    
    
      public void fechar();
      public void jogar();
    
    
  }
  
  public static class PingPong implements Jogo{
    
    
    public  void  fechar() {
      
      System.out.println("Slavar o progresso");
      System.out.println("Fechar o jogo");
      
      
    }
    
    
    public  void  jogar() {
      
      System.out.println("cutscene");
      System.out.println("mostrando o menu inicial");
      System.out.println("tocando musica de fundo");
      
    }
    
  }
  
  
  public static class Xadrez implements Jogo{
    
    public void fechar(){
      System.out.println("Fechando o jogo de Xadrez");
    }
    
    public void jogar(){
      
      System.out.println("exibir menu ");
      System.out.println("Exibir video de jogadas no fundo");
      
    }
    
    
  }
  
  
  public static class TiroAoAlvo implements Jogo{
    
    public void fechar(){
      System.out.println("Salvar o progresso");
      System.out.println("Sair da partida");
      System.out.println("Sair do jogo");
    }
    
    public void jogar(){
      
      System.out.println("Carregando jogo ");
      System.out.println("se conectando ao servidor");
      System.out.println("Carregando partida");
      
    }
    
    
  }
  
  
  public static class Videogame{
    
    private boolean estaLigado;
    
    private Jogo jogo;
    
    public void ligar(){
      
      System.out.println("Ligando o videogame...");
      
      this.estaLigado = true;
    }
    
    
    
    public void jogar(Jogo jogo){
      
      if(estaLigado == true) {
      
      System.out.println("Iniciando o jogo...");
      this.jogo = jogo;
      jogo.jogar();
      } else {
        
        System.out.println("Videogame esta fechado");
        
      }
    }
    
    public void fechar(){
      
      if(estaLigado == true) {
      
      System.out.println("Fechando o jogo...");
      boolean temJogo = jogo != null;
      if(temJogo){
        
        jogo.fechar();
        jogo = null;
        
      } else {
        
        System.out.println("Nao tem nenhum jogo rodando");
        
      }
      
      } else {
        
        System.out.println("Videogame esta fechado");
        
      }
      
      System.out.println("Fechando o jogo...");
      boolean temJogo = jogo != null;
      if(temJogo){
        
        jogo.fechar();
        jogo = null;
        
      } else {
        
        System.out.println("Nao tem nenhum jogo rodando");
        
      }
    }
    
  }
  
  
  
  public static void main (String[] args) throws Exception{
    
    
   PingPong pingpong = new PingPong(); 
   Videogame xDev = new Videogame();
   xDev.ligar();
   xDev.jogar(new TiroAoAlvo());
   xDev.fechar();
  }
}


//ARRAYLIST

String[] arrayEstatico = new String[5];
    arrayEstatico[0] = "Goku";
    arrayEstatico[1] = "Maria";
    arrayEstatico[2] = "Pedro";
    arrayEstatico[3] = "Vegeta";
    arrayEstatico[4] = "bobs";
    
   ArrayList<String> arrayDinamico = new ArrayList<String>();
   arrayDinamico.add("Goku");
   arrayDinamico.add("Maria");
   arrayDinamico.add("Pedro");
   arrayDinamico.add("Vegeta");
   arrayDinamico.add("bob");
   
   for (int indice = 0; indice < arrayEstatico.length; indice ++ ){
     System.out.println(arrayEstatico[indice]);
   }
   
   
   System.out.println("Imprimindo");
   
   System.out.println("Remover o Pedro");
   
    arrayDinamico.remove(2);
   
    //arrayDinamico.clear();
   
   for (int indice = 0; indice < arrayDinamico.size(); indice ++ ){
     
     System.out.println(arrayDinamico.get(indice));
     
   }
   
   for (String nome:arrayDinamico) {
     System.out.println(nome);
   }
   
   
   import java.util.ArrayList;

public class App{
  
  public static class Pessoa{
    
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }
    
    public String getNome(){
      return nome;
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    public int getIdade(){
      return idade;
    }
    
    public void setIdade(int nome){
      this.idade = idade;
    }
    
    
  }
  
  public static void main (String[] args) throws Exception{
    
    
    
    // tipo Primitivo  ->   wrapper Class
    //     
    //     int                 Integer
    //     
    //     float               Float
    //     
    //     double              Double
    //     
    //     char                Character
    
    
    ArrayList<String> filmes = new ArrayList<String>();
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(50);
    
    Pessoa joao = new Pessoa("Joao", 20);
    Pessoa maria = new Pessoa("maria", 30);
    Pessoa pedro = new Pessoa("Pedro", 70);
    
    
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    pessoas.add();
    pessoas.add(maria);
    pessoas.add(pedro);
    
    for(Pessoa pessoa : pessoas){
      System.out.println(pessoa.getNome());
    }
   
  }
}

import java.util.ArrayList;
import java.util.Collections;

public class App{
  
  
    
    
  
  public static void main (String[] args) throws Exception{
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    numeros.add(70);
    numeros.add(80);
    numeros.add(50);
    numeros.add(10);
    numeros.add(30);
    numeros.add(-13);
    numeros.add(500);
    
    
    Collections.sort(numeros, Collections.reverseOrder());
    
    for(Integer numero: numeros){
      System.out.println(numero);
    }



  }
}


//Heranca

public class App{
  
  
  public static class Animal{
    
    
    
    
    private String nome;
    
    
    public Animal(String nome){
      this.nome = nome;
    }
    
    
    public void comer(){
      
      System.out.printf("%s comeu\n", nome);
      
    }
    
    public void beber(){
      
      System.out.printf("%s comeu\n", nome);
      
    }
    
    public String getNome(){
      return nome;
    }
    
    public void setNome( String nome){
      this.nome = nome;
    }
    
    
  }
  
  
  public static class Ave extends Animal{
    
    
    public Ave (String nome){
      
      super(nome);
      
    }
    
    public void voar (){
      
      System.out.printf("%s voou\n", getNome());
      
    }
    
  }
  
  public static class Cachorro extends Animal{
    
    private int ossosComidos;
    
    public Cachorro(String nome){
      super(nome);
      
    }
    
    public void latir(){
      
      System.out.printf("%s latiu\n", getNome());
      
    }
    public void lamber(){
      
      System.out.printf("%s lambeu\n", getNome());
      
    }
    
    
    
  }
  
  
  
  public static class Gato extends Animal{
    
    
    
    public Gato(String nome){
      super(nome);
    }
    
    public void miar(){
      
      System.out.printf("%s miou\n", getNome());
    }
    
  }
  
  public static class Dragao extends Ave{
    
    
    
    public Dragao(String nome){
      super(nome);
    }
    
    public void soltarFogo(){
      
      System.out.printf("%s soltou uma bola de fogo\n", getNome());
    }
    
  }
  
  public static class Pombo extends Ave{
    
    private int cartasEnviadas;
    
    public Pombo(String nome){
      super(nome);
      cartasEnviadas = 10;
    }
    
    
    
    public void fazerPru(){
      
      System.out.printf("%s fez Pruuu\n", getNome());
    }
    
    
    public void enviarCarta(){
      
      System.out.printf("%s enviou uma carta\n", getNome());
      cartasEnviadas ++;
    }
    
    public int getCartasEnviadas(){
      return cartasEnviadas;
    }
    
  }
  
    
    
  
  public static void main (String[] args) throws Exception{
    
    Cachorro cachorro = new Cachorro("caramelo");
    cachorro.comer();
    cachorro.latir();
    
    
    Gato gato = new Gato("Bartolomeu");
    gato.miar();
    
    
    Dragao dragao = new Dragao("Dragao de olhos");
    dragao.voar();
    dragao.soltarFogo();
    
    
    Pombo pombinha = new Pombo("cedex");
    pombinha.voar();
    pombinha.enviarCarta();
    pombinha.fazerPru();
  }
}



public class Her{
  
  public static class Serie{
    
    
    private String nome;
    
    private int temporadas;
    
    private int ano;
    
    
    
    public String pegarInformacoes(){
      
      String informacoes = String.format("Nome: %s (%d)- %d temporada", nome,
      ano, temporadas);
      
      return informacoes;
    }
    
    public String toString(){
      
      return
      
    }
    
    
    
    public Serie( String nome , int temporadas, int ano){
      
      this.nome = nome;
      this.temporadas = temporadas;
      this.ano = ano;
      
    }
    
    public String getNome(){
      return nome;
      
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    
    public int getTemporadas(){
      return temporadas;
      
    }
    
    public void setTemporadas(int temporadas){
      this.temporadas = temporadas;
    }
    
    
    public int getAno(){
      return ano;
      
    }
    
    public void setAno(int ano){
      this.ano = ano;
    }
  }
  
  
  public static void  main(String[] args) throws Exception{
    
    Serie serieQualquer = new Serie("the last uf us", 1 ,2023);
    
    //System.out.println(serieQualquer//.pegarInformacoes);
    
    System.out.println(serieQualquer.toString());
  }
}



public class Her{
  
    public static class Personagem{
      
      private String nome;
      private String classe;
      private int nivel;
      
      
      public Personagem(String nome){
        this.nome = nome;
        this.classe = "nenhuma";
        this.nivel = 1;
      }
      
      public String toString(){
        
        String informacoes = String.format("%s, (nivel: %d) - Classe: %s", nome,
        nivel, classe);
        
        return informacoes;
        
      }
      
      
      
      public void atacar(){
        
        System.out.println("O Arqueiro atacou");
        
      }
      
      
      
      public String getNome(){
        return nome;
        
      }
      
      public void setNome( String nome){
        this.nome = nome;
      }
      
      
      public String getClasse(){
        return classe;
        
      }
      
      public void setClasse( String classe){
        this.classe = classe;
      }
      
      
      public int getNivel(){
        return nivel;
        
      }
      
      public void setNivel( int nivel){
        this.nivel = nivel;
      }
    }
    
    public static class Arqueiro extends Personagem{
      
      private String arma;
      
      public Arqueiro(String nome){
        
        super(nome);
        setClasse("Arqueiro");
        this.arma = "Arco longo";
      }
      
      public String toString(){
        
        String InformacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma : %s", arma);
  
        return InformacaoPersonagem + informacaoArqueiro;
        
      }
      
    }
  
  public static void  main(String[] args) throws Exception{
    
    Personagem personagem = new Personagem("Joao");
    System.out.println(personagem);
    
    Arqueiro arqueiro = new Arqueiro("legolas");
    System.out.println(arqueiro);
    
    arqueiro.atacar();
    
  }
}


import java.util.Random;

public class App{
  
  
  public abstract static class Personagem{
  
  
  public abstract void atacar();
  
  protected int sortearNumero(){
    
    Random gerador = new Random();
    int numero = gerador.nextInt(6);
    return numero;
    
    
  }
}
  
  
  public static class Guerreiro extends Personagem{
  
  public void atacar(){
    
    int valorDado = this.sortearNumero();
    System.out.printf("voce tirou um %d no dado\n", valorDado);
    if (valorDado < 3) {
      System.out.println("O Guerreiro errou o atack");
    } else if(valorDado == 6){
      
      System.out.println("o Guerreiro acertou o especial");
      
    } else {
      System.out.println("o Guerreiro acertou");
    }
    
    
  }
  
  
}

  
  
    
  
  public static void main (String[] args) throws Exception{
    
    Guerreiro guerreiro = new Guerreiro();
    guerreiro.atacar();
    
    
  }
}

//POLIMORFISMO



public class App{
  
  public static class Video{
    
    private String nome;
    
    
    public Video(String nome){
      this.nome = nome;
    }
    
    public void play(){
      System.out.println("Play filme");
    }
    
    
    public String getNome(){
      return nome;
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
  }
  
  
  public static class Filme extends Video{
    
    private String audio;
    private String legenda;
    
    public Filme(String nome){
      super(nome);
      this.audio = "portugues";
      this.legenda = "nenhuma";
    }
    
    public void play(){
       System.out.println("Play Filme " + getNome());
      
    }
    
    public void play(String audio){
      
      this.audio = audio;
      
      
      if (audio == "portugues"){
        
        this.legenda = "nenhuma";
        
      } else {
        
        this.legenda = "portugues";
      }
      System.out.println("Play " + toString());
      
    }
    
    public void play(String audio, String legenda){
      
      this.audio = audio;
      this.legenda = legenda;
      
      
      System.out.println("Play " + toString());
      
    }
    
    public String toString(){
      
      String informacao = String.format("Filme %s (audio %s, legenda %s)",
      getNome(), audio, legenda);
      return informacao;
      
    }
    
    public String getAudio(){
      return audio;
    }
    
    public void setAudio(String audio){
      this.audio = audio;
    }
    
    
    public String getLegenda(){
      return legenda;
    }
    
    public void setLegenda(String legenda){
      this.legenda = legenda;
    }
    
    
  }
  
  
  public static class Serie extends Filme{
    
    private int temporadas;
    private int episodiosTemporadas;
    private int episodioAtual;
    private int temporadaAtual;
    
    
    public Serie (String nome, int temporadas, int episodiosTemporadas){
      
      super(nome);
      this.temporadas = temporadas;
      this.episodiosTemporadas = episodiosTemporadas;
      this.temporadaAtual = 1;
      this.episodioAtual = 1;
    }
    
    public String toString(){
      
      
      String informacao = String.format("Serie %s %dx%02d(audio %s, legenda %s)",
      getNome(), 
      temporadaAtual,
      episodioAtual,
      getAudio(),
      getLegenda());
      return informacao;
      
    }
    
    public int getTemporadas(){
      return temporadas;
    }
    
    public void setTemporadas(int temporadas){
      this.temporadas = temporadas;
    }
    
    
    public int getEpisodiosTemporadas(){
      return episodiosTemporadas;
    }
    
    public void setNome(int episodiosTemporadas){
      this.episodiosTemporadas = episodiosTemporadas;
    }
    
    
    public int getEpisodioAtual(){
      return episodioAtual;
    }
    
    public void setEpisodioAtual(int episodioAtual){
      this.episodioAtual = episodioAtual;
    }
    
    
    public int getTemporadaAtual(){
      return temporadaAtual;
    }
    
    public void setTemporadaAtual(int temporadaAtual){
      this.temporadaAtual = temporadaAtual;
    }
  }
  
  
  
    
  
  public static void main (String[] args) throws Exception{
    
    Filme filme = new Filme("lagoa azul");
    filme.play("portugues");
    
    Serie serie = new Serie("the last of us", 2, 10);
    System.out.println(serie);
    
  }
}


//AGREGAÇÃO


import java.util.ArrayList;

public class App{
  
  public static class Telefone{
    
    
    
    private String numeroChip;
    private Contatos contatos;
    
    //ArrayList<Contato> contatos;
    
    
    
    
    public Telefone(String numeroChip){
      
      
      this.numeroChip = numeroChip;
      this.contatos = new Contatos();
     // this.contatos = new ArrayList<Contato//>();
      
      
    }
    
    
    public String getNumeroChip(){
      
      return numeroChip;
    }
    
    public Contatos getContatos(){
      
      return contatos;
      
    }
    
    
    
  }
  
  public static class  Contato{
    
    private String nome;
    
    private String numero;
    
    
    
    public Contato(String nome, String numero){
      
      this.nome = nome;
      this.numero = numero;
      
    }
    
    
    public String getNome(){
      
      return nome;
      
    }
    
    public void setNome(String nome) {
      
      this.nome = nome;
      
    }
    
    
    public String getNumero(){
      
      return numero;
      
    }
    
    public void setNumero(String numero) {
      
      this.numero = numero;
      
    }
    
    public String toString(){
      
      
      String informacao = String.format("Nome: %s\t Numero: %s", nome, numero);
      return informacao;
    }
    
    
  }
  
  public static class Contatos {
    
    private ArrayList<Contato> contatos;
    
    
    
    public Contatos() {
      
      this.contatos = new ArrayList<Contato>();
      
      
    }
    
    public void adicionar (String nome, String numero){
      
      
      Contato novoContato = new Contato(nome, numero);
      contatos.add(novoContato);
    }
    
    
    public void adicionar(Contato novoContato){
      contatos.add(novoContato);
      
      
      
      
    }
    
    public Contatos buscar(String palavra){
      
      String palavraChave = palavra.toLowerCase();
      
      Contatos contatosF = new Contatos();
      
      for(Contato contato : contatos){
        String nomeContato = contato.getNome().toLowerCase();
        if (nomeContato.startsWith(palavraChave)){
          
          contatosF.adicionar(contato);
          
        }
      }
      
      return contatosF;
    }
    
    
    public ArrayList<Contato> getContatos(){
      
      return contatos;
      
    }
    
    public void setContatos(ArrayList<Contato> contatos){
      
      this.contatos = contatos;
      
    }
    
    public String toString(){
      
      
      String informacao = "Contatos:\n";
      for(Contato contato: contatos){
        
        informacao += informacao + contato.toString() + "\n";
        
      }
      return informacao;
    }
    
  }
  
  
  public static class Ligacao{
    
    private String numeroO;
    private String numeroD;
    private String horario;
    
    
    
    
    
    public Ligacao(String numeroO, String numeroD){
      
      this.numeroO = numeroO;
      this.numeroD = numeroD;
      
    }
    
    
    public void ligar(){
      System.out.println("ligando para " + numeroD);
      System.out.println("chamando...");
      System.out.println("Numero ocupado");
      
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss");
      LocalDateTime horarioAgora = LocalDateTime.now();
      horario = formatador.format(horarioAgora);
    }
    
    
    public String getNumeroO(){
      
      return numeroO;
      
    }
    
    
    public String toString(){
      String informacao = String.format("Origem: %s/t Destino: %s/t horario:%s",
      numeroO, numeroD, horario);
      return informacao;
    }
    
    
    public void setNumeroO(String numeroO) {
      
      this.numeroO = numeroO;
      
    }
      
      
    public String getNumeroD(){
      
      return numeroD;
      
    }
    
    public void setNumeroD(String numeroD) {
      
      this.numeroD = numeroD;
    }
  }
  
  
  public static void main(String[] args) throws Exception{
    
    Telefone telefone = new Telefone("4002 8922");
    
    Contato contatoA = new Contato("Lucas", "408917456");
    Contato contatoB = new Contato("Luan", "13344");
    Contato contatoC = new Contato("Maria", "838383");
    Contato contatoD = new Contato("Carlos", "737388");
    
    Contatos telefoneContatos = telefone.getContatos();
    
    telefoneContatos.adicionar(contatoA);
    telefoneContatos.adicionar(contatoB);
    telefoneContatos.adicionar(contatoC);
    telefoneContatos.adicionar(contatoD);
    
    System.out.println(telefoneContatos);
    
    
    System.out.println("contatos filtrados");
    System.out.println(telefoneContatos.buscar("l"));
    
    Ligacao ligacao = new Ligacao("123", "456");
    Ligacao.ligar();
    System.out.println(Ligacao);
  }
  
}

//Static


public class Main{
  
  
  
  public static class Matematica{
    
    
    private static double valorPi = 3.14;
    
    
    public static int somar(int numeroA, int numeroB){
      return numeroA + numeroB;
    }
    
    
    public static double calcularArea( double lado){
      
      return lado * lado;
    }
    
    
    
    
    public static double calcularAreaCirculo(double raio){
      
      double area = valorPi * raio * raio;
      return area;
    }
  }
  
  public static class Jogo{
    
    public void jogar(){
      
      double areaJogador = Matematica.calcularAreaCirculo(4);
      
    }
    
  }
  
  public static double calcularDobroDaAreaCirculo(double raio){
    
    double area = Matematica.calcularAreaCirculo(raio);
    return area;
    
  }
  
  
  public static class Carro{
    
    private String nome;
    private int ano;
    public static int anoCompra = 2023;
    
    public Carro(String nome, int ano){
      this.nome = nome;
      this.ano = ano;
    }
    
    public String getNome(){
      return nome;
      
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    
    public int getAno(){
      return ano;
      
    }
    
    public void setAno(int ano){
      this.ano = ano;
    }
    
  }
  
  
  public static void main(String[] args) throws Exception{
    
    
    Carro ferrari = new Carro("Ferrari", 2023);
    
    Carro fusca = new Carro("Fusca", 1999);
    
    System.out.println(ferrari.getNome());
    System.out.println(ferrari.anoCompra);
    
    
    
    System.out.println(fusca.getNome());
    System.out.println(fusca.anoCompra);
    
    
  }
}




//Constante

public class Main{
  
  
  public static class Login{
    
    //constante tem q ser static
    //nome em snack case
    //final
      
    private static final int TAMANHO_MINIMO = 7;
    
    public void verificarSenha(String senha){
      
      
      
      if (senha.length() >= TAMANHO_MINIMO) {
        
        System.out.println("Senha valida");
      } else {
        
        System.out.println("Senha invalida");
      }
      
    }
  }
  
  
  public static class Cpf{
    
    private static final int INDICE_REGIAO = 8;
    private static final int INDICE_PRIMEIRO = 9;
    private static final int INDICE_SEGUNDO = 10;
    
    
    public void validar(String cpf){
      
      int regiao = cpf.charAt(INDICE_REGIAO);
      int primeiroDigito = cpf.charAt(INDICE_PRIMEIRO);
      int segundoDigito = cpf.charAt(INDICE_SEGUNDO);
    }
  }
  
  public static class Matematica{
    
    private static final double PI = 3.14;
    
    public double calcularAreaCirculo(int raio){
      
      
      double area = PI * raio * raio;
      return area;
      
    }
    
    
  }
  
  public static void main(String[] args) throws Exception{
    
    
    
    
    
  }
}

//TELA NO JAVA


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.awt.event.addActionListener;



public class Tela{



public static void main(String[] args) throws Exception {

    JFrame janela = new JFrame();
    
    JLabel labelUsuario = JLabel("usuario");
    labelUsuario.setBounds(50,50,100,30);
    
    
    JTextField campoU = new JTextField();
    campoU.setBounds(50,80,100,30);
    
    
    
    JButton botao = new JButton("clique aki");
    botao.setBounds(0,0,200,30);
    bitao.addActionListener(new addActionListener(){
      
      public void actionPerformed(ActionEvent e){
        System.out.println("Se inscreva no canal");
      }
      
    })
    
    janela.add(botao);
    janela.add(labelUsuario);
    janela.add(campoU);
    
    janela.setLayout(null);
    
    
    
    
    janela.setBounds(0, 0,400,600);
    
    janela.setDefaltCloserOperation(JFrame.EXIT_ON_CLOSE);
    
    
    janela.setVisible(true);
    
    }
}

//TRY & CATCH


public class App{
  
  
  public static class Matematica{
    
    public void dividir(int numeroA, int numeroB){
      
      System.out.println(numeroA / numeroB);
    }
  }
  
  
  public static void main(String[] args) throws Exception{
    
    //vetor
    
    int[] numeros = new int[] {10,20,30,100};
    int[] peso = new int[] {2,0,4};
    Matematica matematica = new Matematica();
    
    
    
    try {
      
      
      for (int i = 0; i < 4  ; i++ ) {
        int resultado = numeros[i] / peso[i];
        
        matematica.dividir(numeros[i], peso[i]);
        System.out.printf("%d / %d = %d\n", numeros[i], peso[i], resultado);
      }
      
      System.out.println("Numeros: ");
      System.out.println(numeros[5]);
      
      
    } catch(ArithmeticException erro){
      
      System.out.println("Erro de calculo: " + erro.getMessage());
      
    } catch(ArrayIndexOutOfBoundsException erro){
      
      System.out.println("Erro de vetor: " + erro.getMessage());
      
    }catch(Exception erro){
      
      
      System.out.println("Erro generico ");
      
    
    }
    
    
    
    System.out.println("Mensagem final: ");
  }
}

public class App{
  
  
  
  
  public static void main(String[] args) throws Exception{
    
    
    
    try {
      System.out.println("Mensagem antes da excercao");
      int resultado = 10 / 0;
      
      System.out.println("Mensagem apos a excercao");
      
    } catch(Exception erro) {
      
      System.out.println("Erro" +erro.getMessage());
      
    } finally {
      
      System.out.println(" vou ser executado a forca");
      
    }
    
    System.out.println("Mensagem final");
    
  }
  
}

package Estrutura_de_dados;

import java.util.Scanner;

public class Main{
  
  
  public static void main(String[] args){
    
    int[] vetor = new int[8];
    
    for (int i = 0;i < vetor.length ; i++ ) {
      vetor[i] = (int) (Math.random() * 10);
      System.out.println(vetor[i]);
    }
    
    System.out.println("Qual numero vc busca? ");
    Scanner leitor = new Scanner(System.in);
    int buscado = leitor.nextInt();
    
    
    boolean achou = false;
    
    for (int i = 0;i < vetor.length ; i++ ) {
      if (vetor[i] == buscado) {
        
        achou = true;
        break;
      }
    }
    if (achou) {
      
      System.out.println("Achou");
    }else{
      
      System.out.println("N achou");
    }
  }
}

//MELHOR TESTADOR DE VELOCIDADE 

package Estrutura_de_dados;

import java.util.Scanner;

//BUSCA BINARIA

public class Bin{
  
  public static void main(String[] args) {
    
    
    int[] vetor = new int[10000];
    
    for (int i = 0 ; i < vetor.length; i++) {
      vetor[i] = i * 2;
      System.out.println(vetor[i]);
    }
    
    System.out.println("Qual numero vc busca: ");
    
    Scanner leitor = new Scanner(System.in);
    int buscado = leitor.nextInt();
    
    int contador = 0;
    
    
    boolean achou = false;
    int inicio = 0;
    int fim = vetor.length -1;
    int meio;
    
    while(inicio <= fim){
      contador ++;
      
      meio = (int) ((inicio + fim) /2);
      if (vetor[meio] == buscado) {
        
        achou = true;
        break;
      }else if(vetor[meio] < buscado){
        
        inicio = meio +1;
        
      }else{
        
        fim = meio -1;
      }
    }
    
    System.out.println("Quantidade de testes: " + contador);
    if (achou == true) {
      System.out.println("achou");
    }else{
      System.out.println("n achou");
    }
  }
}


//////Pior testador
package Estrutura_de_dados;

// BUBBLE SORT

public class Main{
  
  public static void main(String[] args) {
    int[] vetor = new int[10000];
    
    for (int i = 0; i < vetor.length ; i++) {
      vetor[i] = (int) (Math.random() *vetor.length);
      System.out.println(vetor[i]);
    }
    
    long inicio = System.currentTimeMillis();
    long fim;
    
    int aux;
    for (int i = 0; i < vetor.length ;i++ ) {
      for (int j = i +1; j < vetor.length ; j++) {
        if (vetor[i] > vetor[j]) {
          
          aux = vetor[j];
          vetor[j] = vetor[i];
          vetor[i] = aux;
          
        }
      }
    }
    fim = System.currentTimeMillis();
    System.out.println("tempo " + (fim-inicio));
    
     System.out.println("Vetor ordenado");
    for (int i = 0; i < vetor.length ; i++) {
     System.out.println(vetor[i]);
       
    }
  }
  
}


//Outra forma de organizar

public class Main{
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    for (int i = 0; i < vetor.length ; i++) {
      vetor[i] = (int) (Math.random() * vetor.length);
    }
    
    int aux, j;
    
    for (int i = 1; i < vetor.length ;i++ ) {
      
      aux = vetor[i];
      
      j = i-1;
      while( j >= 0 && vetor[j] > aux){
        
        vetor[j +1] = vetor[j];
        j--;
        
      }
      vetor[j+1] = aux;
    }
    for (int i = 0; i< vetor.length ; i++) {
      
      
      System.out.println(vetor[i]);
    }
    
  }
}

public class Main{
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    for (int i = 0; i < vetor.length ; i++){
      vetor[i] = (int) (Math.random() * vetor.length);
    } 
    
    System.out.println("desordenado");
    for (int i = 0; i < vetor.length ; i++){
      System.out.println(vetor[i]);
    }
    
    
    int posicaoMenor,aux;
    for (int i = 0; i < vetor.length ; i++) {
      
      posicaoMenor = i;
      for (int j = i+1; j < vetor.length ; j++) {
        if (vetor[j] < vetor[posicaoMenor]) {
          posicaoMenor = j;
        }
      }
      
      aux = vetor[posicaoMenor];
      vetor[posicaoMenor] = vetor[i];
      vetor[i] = aux;
      
    }
    
    System.out.println("\n\nordenado");
    for (int i = 0; i < vetor.length ; i++){
      System.out.println(vetor[i]);
    }
  }
}

public class Main {

  public static void main(String[] args) {

    int[] vetor = new int[5];

    for (int i = 0; i < vetor.length ; i++ ) {

      vetor[i] = (int) (Math.random() * vetor.length);
    }

    System.out.println("Vetor");
    for (int i = 0; i < vetor.length ; i++ ) {

      System.out.println(vetor[i]);
    }

    System.out.println("Soma");
    System.out.println(somar(0,0,vetor));
  }

  private static int somar(int soma, int posicao, int[] vetor){

    if (posicao < vetor.length) {

      soma = soma + vetor[posicao];
      return somar(soma, posicao+1, vetor);

    } else {
      return soma;
    }
  }
}


public class Main {

  public static void main(String[] args) {

    int[] vetor = new int[10];

    for (int i = 0; i < vetor.length ; i++) {

      vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }

    System.out.println("Desordenado");
    for (int i = 0; i < vetor.length ; i++){

      System.out.print(vetor[i] + " ");
    }

    //Heap sort

    int n = vetor.length;

    for (int i = n/2 -1; i >= 0 ; i-- ) { // Corrigido: operador de decremento --
      aplicarHeap(vetor, n, i);
    }

    System.out.println("\n\n Quase ordenado");
    for (int i = 0; i < vetor.length ; i++){

      System.out.print(vetor[i] + " ");
    }

    for (int j = n -1; j > 0; j--) {
      int aux = vetor[0];
      vetor[0] = vetor[j];
      vetor[j] = aux;

      aplicarHeap(vetor, j ,0);
    }


    System.out.println("\n\n Ordenado");
    for (int i = 0; i < vetor.length ; i++){

      System.out.print(vetor[i] + " ");
    }

  }

  private static void aplicarHeap(int[] vetor, int n, int i){ // Corrigido: nome do parâmetro vetor

    int raiz = i;
    int esquerda = 2*i +1;
    int direita = 2*i +2;

    if (esquerda < n && vetor[esquerda] > vetor[raiz]) {

      raiz = esquerda;
    }

    if (direita < n && vetor[direita] > vetor[raiz]) {

      raiz = direita;
    }

    if (raiz != i) {

      int aux = vetor[i];
      vetor[i] = vetor[raiz];
      vetor[raiz] = aux;

      aplicarHeap(vetor, n, raiz);
    }
  }
}




// QUICK SORT O MAIS RAPIDO

public class Main{
  
  //Quick Sort o mais rapido
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    for (int i = 0; i < vetor.length ; i++) {
      vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }
    
    System.out.println("Desordenado");
    
    for (int i = 0; i < vetor.length ; i++) {
      System.out.print(vetor[i] + " ");
    }
    
    quicksort(vetor,0,vetor.length -1);
    
    System.out.println("\n\n Ordenado");
    
    for (int i = 0; i < vetor.length ; i++) {
      System.out.print(vetor[i] + " ");
    }
    
  }
  
  static void quicksort(int[] vetor, int esquerda, int direita){
    
    if (esquerda < direita) {
      
      int p = particao(vetor,esquerda,direita);
      
      quicksort(vetor,esquerda,p);
      quicksort(vetor,p +1,direita);
    }
  }
  
  static int particao(int[] vetor , int esquerda, int direita){
    
    int meio = (int) (esquerda + direita) /2;
    int pivot = vetor[meio];
    int i = esquerda -1;
    int j = direita +1;
    
    while (true) {
      
      
      do{
        
        i++;
        
      }while(vetor[i] < pivot);
      
      do {
        
        j--;
        
      }while(vetor[j] > pivot);
      if (i >= j) {
        return j;
      }
      
      int aux = vetor[i];
      vetor[i] = vetor[j];
      vetor[j] = aux;
      
    }
  }
}




public class Arvore{
  
  


public class Elemento<TIPO>{
  
  private TIPO valor;
  
  private Elemento<TIPO> esquerda;
  private Elemento<TIPO> direita;
  
  
  
  public Elemento(TIPO novoValor){
    
    this.valor = novoValor;
    this.esquerda = null;
    this.direita = null;
    
  }
  
  
  public TIPO getValor() {
    
    return valor;
  }
  
  public void setValor(TIPO valor){
    
    this.valor = valor;
  }
  
  public Elemento<TIPO> getEsquerda() {
    
    return esquerda;
  }
  
  public void setEsquerda(Elemento<TIPO> esquerda){
    
    this.esquerda = esquerda;
  }
  
  
  public Elemento<TIPO> getDireita() {
    
    return direita;
  }
  
  public void setDireita(Elemento<TIPO> direita){
    
    this.direita = direita;
  }
  
  
}


public static class Arvore<TIPO extends Comparable>{
  
  
  private Elemento<TIPO> raiz;
    
    
    public Arvore() {
      this.raiz = null;
      
    
  }
  
  public static void adicionar(TIPO valor){
    
    Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
    if (raiz == null) {
      
      this.raiz = novoElemento;
      
    } else {
      
      Elemento<TIPO> atual = this.raiz;
      while( true ){
        
        if (novoElemento.getValor().comparableTO(atual.getValor()) == -1){
          
          if (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
            
          } else {
            
            atual.setEsquerda(novoElemento);
            break;
          }
          
        } else {
          
          if (atual.getDireita() != null) {
            atual = atual.getDireita();
            
          } else {
            
            atual.setDireita(novoElemento);
            break;
          }
        }
      }
    }
  }
  
  public Elemento<TIPO> getRaiz(){
    
    return raiz;
  }
  
  
  public void emOrdem(Elemento<TIPO> atual){
    
    if (atual != null) {
      
     emOrdem(atual.getEsquerda());
     System.out.println(atual.getValor());
     emOrdem(atual.getDireita());
     
    }
    
  }
}
  
  public static void main(String[] args) {
    
    
    Arvore<Integer> arvore = new Arvore<Integer>();
    arvore.adicionar(10);
    arvore.adicionar(5);
    arvore.emOrdem(arvore.getRaiz());
    
  }
}



public class Arvore{
  
  


public class Elemento<TIPO>{
  
  static private TIPO valor;
  
  private Elemento<TIPO> esquerda;
  private Elemento<TIPO> direita;
  
  
  
  public Elemento(TIPO novoValor){
    
    this.valor = novoValor;
    this.esquerda = null;
    this.direita = null;
    
  }
  
  
  public TIPO getValor() {
    
    return valor;
  }
  
  public void setValor(TIPO valor){
    
    this.valor = valor;
  }
  
  public Elemento<TIPO> getEsquerda() {
    
    return esquerda;
  }
  
  public void setEsquerda(Elemento<TIPO> esquerda){
    
    this.esquerda = esquerda;
  }
  
  
  public Elemento<TIPO> getDireita() {
    
    return direita;
  }
  
  public void setDireita(Elemento<TIPO> direita){
    
    this.direita = direita;
  }
  
  
}


public static class Arvore<TIPO extends Comparable>{
  
  
  private Elemento<TIPO> raiz;
    
    
    public Arvore() {
      this.raiz = null;
      
    
  }
  
  public static void adicionar(TIPO valor){
    
    Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
    if (raiz == null) {
      
      this.raiz = novoElemento;
      
    } else {
      
      Elemento<TIPO> atual = this.raiz;
      while( true ){
        
        if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
          
          if (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
            
          } else {
            
            atual.setEsquerda(novoElemento);
            break;
          }
          
        } else {
          
          if (atual.getDireita() != null) {
            atual = atual.getDireita();
            
          } else {
            
            atual.setDireita(novoElemento);
            break;
          }
        }
      }
    }
  }
  
  public Elemento<TIPO> getRaiz(){
    
    return raiz;
  }
  
  
  public void emOrdem(Elemento<TIPO> atual){
    
    if (atual != null) {
      
     emOrdem(atual.getEsquerda());
     emOrdem(atual.getDireita());
     System.out.println(atual.getValor());
     
     
    }
    
  }
  
  public void remover(TIPO valor){
    
    Elemento<TIPO> atual = this.raiz;
    Elemento<TIPO> paiAtual = null;
    while(atual != null){
      
      if (atual.getValor().equals(valor)) {
        
        break;
        
      } else if(valor.compareTO(atual.getValor()) == -1){
        atual = atual.getEsquerda();
        
      } else {
        
        paiAtual = atual;
        atual = atual.getDireita();
      }
    }
    if (atual != null) {
      
      if (atual.getDireita() != null){
        
        Elemento<TIPO> substituto = atual.getDireita();
        Elemento<TIPO> paiSubstituto = atual;
        
        while(substituto.getEsquerda() != null){
          
          paiSubstituto = substituto;
          
          substituto = substituto.getEsquerda();
        }
        
      if (paiAtual != null) {
        
        if (atual.getValor().compareTO(paiAtual.getValor()) == -1) {
          
          paiAtual.setEsquerda(substituto);
          
        } else{
          
          paiAtual.setDireita(substituto);
        }
     } else{
       
       this.raiz = substituto;
     }
        
        ////
        
      } else if(atual.getDireita() != null){
        
      } else if (atual.getEsquerda() != null){
        
        Elemento<TIPO> substituto = atual.getEsquerda();
        Elemento<TIPO> paiSubstituto = atual;
        
        while(substituto.getDireita() != null){
          
          paiSubstituto = substituto;
          
          substituto = substituto.getDireita();
        }
        
        if (paiAtual != null) {
          
        if (atual.getValor().compareTO(paiAtual.getValor()) == -1) {
          
          paiAtual.setEsquerda(substituto);
          
        } else{
          
          paiAtual.setDireita(substituto);
        }
      } else {
        
        this.raiz = substituto;
      }
        
        
        if (substituto.getValor().compareTO(paiSubstituto.getValor()) == -1) {
          
          paiSubstituto.setEsquerda(null);
          
        } else{
          
          paiSubstituto.setDireita(null);
        }
        
      } else {
        
        if (paiAtual != null) {
        if (atual.getValor().compareTO(paiAtual.getValor()) == -1) {
          
          paiAtual.setEsquerda(null);
          
        } else{
          
          paiAtual.setDireita(null);
        }
        
       } else{
         
         this.raiz = null;
       }
       
      }
      
      return true;
      
    } else{
      
      return false;
    }
  }
}
  
  public static void main(String[] args) {
    
    
    Arvore<Integer> arvore = new Arvore<Integer>();
    arvore.adicionar(10);
    arvore.adicionar(8);
    arvore.adicionar(5);
    arvore.adicionar(9);
    arvore.adicionar(7);
    arvore.adicionar(18);
    arvore.adicionar(13);
    arvore.adicionar(20);
    
    System.out.println("\n\nEm Ordem");
    arvore.emOrdem(arvore.getRaiz());
    
  }
}

import java.util.ArrayList;

public class Main{
  
  
  public static class Grafo<TIPO>{
    
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Vertice<TIPO>> arestas;
    
    
    public Grafo(){
      
      this.vertices = new ArrayList<Vertice<TIPO>>();
      this.arestas = new ArrayList<Vertice<TIPO>>();
    }
    
    
    public void adicionarVertice(TIPO dado){
      
      Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
      
      this.vertices.add(novoVertice);
      
    }
    
    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim){
      
      Vertice<TIPO> inicio = this.getVertice(dadoInicio);
      Vertice<TIPO> fim = this.getVertice(dadoFim);
      Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
      
      inicio.adicionarArestaSaida(aresta);
      fim.adicionarArestaEntrada(aresta);
      this.arestas.add(aresta);
      
    }
    
    
    public Vertice<TIPO> getVertice(TIPO dado){
      
      Vertice<TIPO> vertice = null;
      
      for (int i = 0;i < this.vertices.size() ; i++) {
        
        if (this.vertice.get(i).getDado().equals(dado)) {
          
          vertice = this.vertice.get(i);
          break;
        }
        
        
      }
      
      return vertice;
      
    }
    
    public void buscaEmLargura(){
      
      ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
      ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
      
      Vertice<TIPO> atual = this.vertices.get(0);
      marcados.add(atual);
      System.out.println(atual.getDado());
      fila.add(atual);
      while (fila.size() > 0) {
        Vertice<TIPO> visitado = fila.get(0);
        for (int i=0;i < visitado.getArestasSaida() ; i++ ) {
          
          Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
          if (!marcados.contains(proximo)) {
            marcados.add(proximo);
            System.out.println(proximo.getDado());
            fila.add(proximo);
          }
        }
        fila.remove(0);
      }
    }
  }
  
  
  
  
  
  
  public static class Vertice<TIPO>{
    
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;
    
    
    
    public Vertice(TIPO valor){
      
      this.dado = valor;
      this.arestaEntrada = new  ArrayList<Aresta<TIPO>>();
      this.arestaSaida = new  ArrayList<Aresta<TIPO>>();
      
      
    }
    
    
    public TIPO getDado(){
      
      return dado;
      
    }
    
    public void setDado(TIPO dado){
      
      this.dado = dado;
      
    }
    
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
      
      this.arestaEntrada.add(aresta);
      
    }
    
    
    public void adicionarArestaSaida(Aresta<TIPO> aresta){
      
      this.arestaSaida.add(aresta);
      
    }
    
    public ArrayList<Aresta<TIPO>> getArestasEntrada(){
      
      return arestasEntrada;
    }
    
    
    public ArrayList<Aresta<TIPO>> getArestasSaida(){
      
      return arestasSaida;
    }
    
    
    
  }
  
  
  
  
  
  public static class Aresta<TIPO>{
    
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;
    
    
    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim){
      
      this.peso = peso;
      this.inicio = inicio;
      this.fim = fim;
      
      
    }
    
    
    public Double getPeso(){
      
      return peso;
      
    }
    
    public void setPeso(Double peso){
      
      this.peso = peso;
      
    }
    
    public Vertice<TIPO> getInicio(){
      
      return inicio;
    }
    
    public void setInicio(Vertice<TIPO> inicio ){
      this.inicio = inicio;
    }
    
    public Vertice<TIPO> getFim(){
      
      return fim;
    }
    
    public void setFim(Vertice<TIPO> fim){
      
      this.fim = fim;
    }
    
  }
  
  
  
  public static void main(String[] args) {
    
    Grafo<String> grafo = new Grafo<String>();
    
    grafo.adicionarVertice("Joao");
    grafo.adicionarVertice("Lorenzo");
    grafo.adicionarVertice("Creuza");
    grafo.adicionarVertice("Creber");
    grafo.adicionarVertice("Claudio");
    
    
    grafo.adicionarAresta(2.0, "Joao", "Lorenzo");
    grafo.adicionarAresta(3.0, "Lorenzo", "Creber");
    grafo.adicionarAresta(1.0, "Creber", "Creuza");
    grafo.adicionarAresta(1.0, "Joao", "Creuza");
    grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
    grafo.adicionarAresta(3.0, "Claudio", "Joao");
    
    
    grafo.buscaEmLargura();
  }
}


// SHELL SORT

public class Main{
  
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    System.out.println("vetor desordenado");
    
    for (int i=0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * vetor.length);
      System.out.println(vetor[i]);
    }
    
    int h = 1;
    int n = vetor.length;
    while (h < n) {
      h = h *3+1;
    }
    
    h = (int) Math.floor(h/3);
    
    int c,j;
    while(h > 0){
      
      for (int i = h; i < n; i++) {
        c = vetor[i];
        j = i;
        while (j >= h && vetor[j - h] > c){
          
          vetor[j] = vetor[j - h];
          j = j - h;
        } 
        
        vetor[j] = c;
      }
      
      h = h /2;
      
    }
    
    System.out.println("Vetor Ordenado");
    
    for (int i = 0; i < vetor.length ; i++ ) {
      
      System.out.println(vetor[i]);
    }
  }
}

public class ProgramaEnorme {
    public static void main(String[] args) {
        // Início do programa
        System.out.println("Este é um programa enorme com mais de mil linhas!");

        // Função 1
        funcao1();
        
        // Função 2
        funcao2();
        
        // ...
        
        // Função 100
        funcao100();

        // Fim do programa
        System.out.println("Fim do programa.");
    }

    // Definição da Função 1
    public static void funcao1() {
        // Conteúdo da Função 1
    }
    
    // Definição da Função 2
    public static void funcao2() {
        // Conteúdo da Função 2
    }
    
    // ...
    
    // Definição da Função 100
    public static void funcao100() {
        // Conteúdo da Função 100
    }

    // ...
    // Repita o padrão de definição de funções até a função 1000
}

public class ProgramaGrande {
    public static void main(String[] args) {
        System.out.println("Este é um programa grande com mais de 500 linhas!");

        // Chamada de métodos
        metodo1();
        metodo2();
        // ...
        metodo100();
        
        // ...
        // Continuação de chamadas de métodos
        metodo101();
        metodo102();
        // ...
        metodo200();
        
        // ...
        // Mais chamadas de métodos
        metodo201();
        metodo202();
        // ...
        metodo300();
        
        // ...
        // Mais chamadas de métodos
        metodo301();
        metodo302();
        // ...
        metodo400();
        
        // ...
        // Mais chamadas de métodos
        metodo401();
        metodo402();
        // ...
        metodo500();
        
        System.out.println("Fim do programa.");
    }

    // Definição de métodos
    public static void metodo1() {
        // Conteúdo do método 1
    }
    
    public static void metodo2() {
        // Conteúdo do método 2
    }
    
    // ...
    
    public static void metodo100() {
        // Conteúdo do método 100
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo101() {
        // Conteúdo do método 101
    }
    
    public static void metodo102() {
        // Conteúdo do método 102
    }
    
    // ...
    
    public static void metodo200() {
        // Conteúdo do método 200
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo201() {
        // Conteúdo do método 201
    }
    
    public static void metodo202() {
        // Conteúdo do método 202
    }
    
    // ...
    
    public static void metodo300() {
        // Conteúdo do método 300
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo301() {
        // Conteúdo do método 301
    }
    
    public static void metodo302() {
        // Conteúdo do método 302
    }
    
    // ...
    
    public static void metodo400() {
        // Conteúdo do método 400
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo401() {
        // Conteúdo do método 401
    }
    
    public static void metodo402() {
        // Conteúdo do método 402
    }
    
    // ...
    
    public static void metodo500() {
        // Conteúdo do método 500
    }
}

public class ProgramaEnorme {
    public static void main(String[] args) {
        System.out.println("Este é um programa enorme com mais de mil linhas!");

        // Chamadas de métodos
        metodo1();
        metodo2();
        // ...
        metodo100();
        
        // Continuação de chamadas de métodos
        metodo101();
        metodo102();
        // ...
        metodo200();
        
        // Mais chamadas de métodos
        metodo201();
        metodo202();
        // ...
        metodo300();
        
        // Mais chamadas de métodos
        metodo301();
        metodo302();
        // ...
        metodo400();
        
        // Mais chamadas de métodos
        metodo401();
        metodo402();
        // ...
        metodo500();
        
        // Mais chamadas de métodos
        metodo501();
        metodo502();
        // ...
        metodo600();
        
        // Mais chamadas de métodos
        metodo601();
        metodo602();
        // ...
        metodo700();
        
        // Mais chamadas de métodos
        metodo701();
        metodo702();
        // ...
        metodo800();
        
        // Mais chamadas de métodos
        metodo801();
        metodo802();
        // ...
        metodo900();
        
        // Mais chamadas de métodos
        metodo901();
        metodo902();
        // ...
        metodo1000();
        
        // Mais chamadas de métodos
        metodo1001();
        metodo1002();
        // ...
        metodo1100();
        
        System.out.println("Fim do programa.");
    }

    // Definição de métodos
    public static void metodo1() {
        // Conteúdo do método 1
    }
    
    public static void metodo2() {
        // Conteúdo do método 2
    }
    
    // ...
    
    public static void metodo100() {
        // Conteúdo do método 100
    }
    
    // ...
    // Definições de métodos continuam até o método 1100
    public static void metodo1001() {
        // Conteúdo do método 1001
    }
    
    public static void metodo1002() {
        // Conteúdo do método 1002
    }
    
    // ...
    
    public static void metodo1100() {
        // Conteúdo do método 1100
    }
    
    // Mais definições de métodos
} 














....






public class Main {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++){
        System.out.println(i);
      }
    }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um nome: ");
    String input = scanner.nextLine();
    System.out.println("Bem vindo: " + input);
    scanner.close();
  }
}

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100);
       System.out.println(arr[i] + "");
      }
    }
  }
  
  public class Main {
  public static void main(String[] args) {
    int n[] = {3,2,7,8,9};
    
    for(int c=0; c<n.length; c++){
      System.out.println(n[c]);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
    for(int c = 0; c < mes.length; c++){
      System.out.println("O mês de " + mes[c] + " tem " + dias[c] + " dias");
    }
  }
}

// .sort deixa em ordem
// .binarySearch ,ele acha onde está 



import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    double v[] = {3.5,2.5,1.5,0.5};
    Arrays.sort(v);
    for(double valor: v) {
      System.out.println(valor +" " );
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int v[] = {3,5,7,9,5};
    for (int vet:v){
      System.out.println(v);
    }
    int p = Arrays.binarySearch(v,1);
    System.out.println(p);
    }
  }
  
  
  import java.util.Arrays
  
  
  public class Main {
  public static void main(String[] args) {
    int v[] = new int[20];
    Arrays.fill(v,3);
    for(int valor:v){
      System.out.println(valor + "");
    }
    
    
    }
  }

package Aula;

public class Aula{
  
  public static class Caneta{
  
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;
  void status(){
    System.out.print("Uma caneta " + this.cor);
  }
  
  void rabiscar(){
    
  }
  
  void tampar(){
    
  }
  
  void destampar(){
    
  }
}

  public static void main(String[] args) {
    
    Caneta c1 = new Caneta();
    c1.cor = "verde";
    c1.ponta = 0.5f;
    c1.tampada = false;
    c1.status();
    
  }
}

public class Aula{
  
  public static class Celular{
    
    String nome;
    String sistema;
    int espaco;
    float tamanho;
    
  }
  
  
  public static void main(String[] args) {
    
    
    Celular celularA = new Celular();
    
    
    celularA.nome = "Iphone 12";
    celularA.tamanho = 6.1f;
    celularA.espaco = 256;
    celularA.sistema = "iOS";
    
    
    Celular celularB = new Celular();
    
    
    celularB.nome = "Galaxy";
    celularB.tamanho = 6.9f;
    celularB.espaco = 256;
    celularB.sistema = "Android";
    
    
    System.out.format("Celular %s com tela %.1f ,com %dgb e SO %s \n", celularA.nome,
    celularA.tamanho, celularA.espaco, celularA.sistema);
    
    
    
    System.out.format("Celular %s com tela %.1f ,com %dgb e SO %s", celularB.nome,
    celularB.tamanho, celularB.espaco, celularB.sistema);
    
  }
}

import java.util.Random;

public class Aula{



public static class Personagem{
  
  
  String nome;
  int nivel;
  int forca;
  
  void mostrarStatus(){
    System.out.format("Personagem: %s (lvl %d) com %d de força ", nome, nivel, forca);
  }
  
  
  
  int calcularDano(){
    Random gerador = new Random();
    int dado20 = 1 + gerador.nextInt(19);
    int dano = forca + dado20;
    return dano;
  }
  
  
  
  void atacar(String alvo, String habilidades){
    int dano = calcularDano();
    
    if(habilidades.length() == 0){
      
      System.out.format("%s atacou %s e causou %d de dano. \n", nome, alvo,
      forca);
      
    } else{
      
      System.out.format("%s usou '%s' contra %s e causou %d de dano. \n", nome,
      habilidades,
      alvo, dano);
    }
    
    
  }
  
  }
  
  public static void main(String[] args) {
    
    Personagem heroi = new Personagem();
    
    heroi.nome = "hercules";
    heroi.nivel = 2;
    heroi.forca = 16;
    
    
    heroi.mostrarStatus();
    heroi.atacar("Hydra", "Golpe duplo");
    
    
  }
  
  
}




public class Filme{
  
  public static class ContaNetflix{
  
  
  private String idiomaP;
  private String resolucaoTela;
  
  public void entrar(){
    buscarP();
    buscarR();
  }
  
  private void buscarP(){
    idiomaP = "PT-br";
  }
  
  private void buscarR(){
    resolucaoTela = "Full HD";
  }
  
  private void assistirFilme(String nomeFilme){
    
    System.out.println("iniIniciando Filme" + nomeFilme);
    System.out.println("Carregando o filme na resolcao " + resolucaoTela);
    carregarAudio();
  }
  
  private void carregarAudio(){
    if(idiomaP == "PT-br" || idiomaP == "EN-US"){
    System.out.println("Carregando o audio " + idiomaP);
  }else{
    System.out.println("Carregando o audio em EN-US");
  }
 }
}
  
  public static void main(String[] args) throws Exception {
    
    ContaNetflix conta = new ContaNetflix();
    conta.entrar();
    conta.assistirFilme("Venom");
  }
}

public class  Classes{
  
  public static class Personagem{
    
    
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;
    
    
    
    
    
    public Personagem(String nome, String classe){
      
      
      this.nome = nome;
      this.classe = classe;
      nivel = 10;
      vida = nivel * 5000;
      if (classe.equals("Guerreiro")){
        forca = nivel * 2;
      }  else {
        forca = nivel * 1;
      }
      
      
    }
    
    
    
    public void mostrarStatus(){
      
      System.out.format(" Nome: %s\n Nivel: %d\n Vida: %d\n Classe: %s\n Forca: %d", nome , nivel, vida, classe, forca);
    }
    
      public String getNome(){
      return nome;
    }
    
    
    
    public void setNome(String nome){
      this.nome = nome;
      
    }
    
    
    public int getNivel(){
      return nivel;
      
    }
    
    
    
    public void setNivel( int nivel){
      this.nivel = nivel;
      
    }
    
    public int getForca(){
      return forca;
      
    }
    
    public void setForca(int forca){
      this.forca = forca;
    }
    
    public int getVida(){
      return vida;
      
    }
    
    public void setVida(int vida){
      this.vida = vida;
    }
    
   }
    
  
  
  public class  Classes{
  
  public static class Personagem{
    
    
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;
    
    
    
    
    
    public Personagem(String nome, String classe){
      
      
      this.nome = nome;
      this.classe = classe;
      nivel = 10;
      vida = nivel * 5000;
      if (classe.equals("Guerreiro")){
        forca = nivel * 2;
      }  else {
        forca = nivel * 1;
      }
      
      
    }
    
    
    
    public void mostrarStatus(){
      
      System.out.format(" Nome: %s\n Nivel: %d\n Vida: %d\n Classe: %s\n Forca: %d", nome , nivel, vida, classe, forca);
    }
    
      public String getNome(){
      return nome;
    }
    
    
    
    public void setNome(String nome){
      this.nome = nome;
      
    }
    
    
    public int getNivel(){
      return nivel;
      
    }
    
    
    
    public void setNivel( int nivel){
      this.nivel = nivel;
      
    }
    
    public int getForca(){
      return forca;
      
    }
    
    public void setForca(int forca){
      this.forca = forca;
    }
    
    public int getVida(){
      return vida;
      
    }
    
    public void setVida(int vida){
      this.vida = vida;
    }
    
   }
    
   public static void main(String[] args) throws Exception {
    
    Personagem guerreiro = new Personagem("Pionne", "Guerreiro");
    guerreiro.mostrarStatus();
    
  }
}


//Contrutor


public class Classes{
  

public static class Pessoa{
  
  private String nome;
  private int idade;
  private float altura;
  
  
  public Pessoa(){
    System.out.println("Uma pessoa acaba de nascer");
    altura = 1.50f;
  }
  
  
  
  
  public String getNome(){
    return nome;
    
  }
  
  public void setNome( String nome){
    this.nome = nome;
  }
  
  
  
  public int getIdade(){
    return idade;
    
  }
  
  public void setIdade( int idade){
    this.idade = idade;
    
  }
  
  
  
  public float getAltura(){
    return altura;
    
  }
  
  public void setAltura( float altura){
    this.altura = altura;
  }
  
 }
 
 public static void main(String[] args) throws Exception {
   
   Pessoa pessoa = new Pessoa();
   pessoa.setNome("joao");
   pessoa.setIdade(47);
   pessoa.setAltura(1.90f);
   
   
   System.out.format("Nome :%s, idade = %d e %.2f", pessoa.getNome(),
   pessoa.getIdade(), pessoa.getAltura());
 }

}



public class App{
  
  
  public static class Circulo implements Fig{
    
    
    
    private int raio;
    
    
    
    
    public Circulo(int raio){
      this.raio = raio;
    }
    
    
    
    public double calcularArea(){
      
      return Math.PI * Math.pow(raio,2);
      
    }
    
    public int gerRaio() {
      return raio;
    }
    
    public void setRaio( int raio){
      this.raio = raio;
    }
  }
  
  
  public static class Quadrado implements Fig{
  
  private int lado;
  
  
  public Quadrado(int lado){
    
    
    this.lado = lado;
  }
  
  public double calcularArea() {
    
    return Math.pow(lado,2);
    
  }
  
  
  public int getLado() {
      return lado;
    }
    
    public void setLado( int lado){
      this.lado = lado;
    }
    
  }
  
  
  public class CalculadorArea{
    
    
    public class somarAreas(Fig figuraA, Fig figuraB){
      
      double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
      return totalArea;
      
    }
    
  }
  
  
  
  
  public interface Fig{
    
  public double calcularArea();
  
}
  
  
  
  public static void main (String[] args) throws Exception{
    
    Circulo circuloP = new Circulo(2);
    Quadrado quadrado = new Quadrado(5);
    
    
    CalculadorArea calculador = new CalculadorArea();
    
    System.out.println(calculador.somarAreas(quadrado, circulo));
    
  }
}



public class App{
  
  public  interface  Jogo{
    
    
      public void fechar();
      public void jogar();
    
    
  }
  
  public static class PingPong implements Jogo{
    
    
    public  void  fechar() {
      
      System.out.println("Slavar o progresso");
      System.out.println("Fechar o jogo");
      
      
    }
    
    
    public  void  jogar() {
      
      System.out.println("cutscene");
      System.out.println("mostrando o menu inicial");
      System.out.println("tocando musica de fundo");
      
    }
    
  }
  
  
  public static class Xadrez implements Jogo{
    
    public void fechar(){
      System.out.println("Fechando o jogo de Xadrez");
    }
    
    public void jogar(){
      
      System.out.println("exibir menu ");
      System.out.println("Exibir video de jogadas no fundo");
      
    }
    
    
  }
  
  
  public static class TiroAoAlvo implements Jogo{
    
    public void fechar(){
      System.out.println("Salvar o progresso");
      System.out.println("Sair da partida");
      System.out.println("Sair do jogo");
    }
    
    public void jogar(){
      
      System.out.println("Carregando jogo ");
      System.out.println("se conectando ao servidor");
      System.out.println("Carregando partida");
      
    }
    
    
  }
  
  
  public static class Videogame{
    
    private boolean estaLigado;
    
    private Jogo jogo;
    
    public void ligar(){
      
      System.out.println("Ligando o videogame...");
      
      this.estaLigado = true;
    }
    
    
    
    public void jogar(Jogo jogo){
      
      if(estaLigado == true) {
      
      System.out.println("Iniciando o jogo...");
      this.jogo = jogo;
      jogo.jogar();
      } else {
        
        System.out.println("Videogame esta fechado");
        
      }
    }
    
    public void fechar(){
      
      if(estaLigado == true) {
      
      System.out.println("Fechando o jogo...");
      boolean temJogo = jogo != null;
      if(temJogo){
        
        jogo.fechar();
        jogo = null;
        
      } else {
        
        System.out.println("Nao tem nenhum jogo rodando");
        
      }
      
      } else {
        
        System.out.println("Videogame esta fechado");
        
      }
      
      System.out.println("Fechando o jogo...");
      boolean temJogo = jogo != null;
      if(temJogo){
        
        jogo.fechar();
        jogo = null;
        
      } else {
        
        System.out.println("Nao tem nenhum jogo rodando");
        
      }
    }
    
  }
  
  
  
  public static void main (String[] args) throws Exception{
    
    
   PingPong pingpong = new PingPong(); 
   Videogame xDev = new Videogame();
   xDev.ligar();
   xDev.jogar(new TiroAoAlvo());
   xDev.fechar();
  }
}


//ARRAYLIST

String[] arrayEstatico = new String[5];
    arrayEstatico[0] = "Goku";
    arrayEstatico[1] = "Maria";
    arrayEstatico[2] = "Pedro";
    arrayEstatico[3] = "Vegeta";
    arrayEstatico[4] = "bobs";
    
   ArrayList<String> arrayDinamico = new ArrayList<String>();
   arrayDinamico.add("Goku");
   arrayDinamico.add("Maria");
   arrayDinamico.add("Pedro");
   arrayDinamico.add("Vegeta");
   arrayDinamico.add("bob");
   
   for (int indice = 0; indice < arrayEstatico.length; indice ++ ){
     System.out.println(arrayEstatico[indice]);
   }
   
   
   System.out.println("Imprimindo");
   
   System.out.println("Remover o Pedro");
   
    arrayDinamico.remove(2);
   
    //arrayDinamico.clear();
   
   for (int indice = 0; indice < arrayDinamico.size(); indice ++ ){
     
     System.out.println(arrayDinamico.get(indice));
     
   }
   
   for (String nome:arrayDinamico) {
     System.out.println(nome);
   }
   
   
   import java.util.ArrayList;

public class App{
  
  public static class Pessoa{
    
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }
    
    public String getNome(){
      return nome;
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    public int getIdade(){
      return idade;
    }
    
    public void setIdade(int nome){
      this.idade = idade;
    }
    
    
  }
  
  public static void main (String[] args) throws Exception{
    
    
    
    // tipo Primitivo  ->   wrapper Class
    //     
    //     int                 Integer
    //     
    //     float               Float
    //     
    //     double              Double
    //     
    //     char                Character
    
    
    ArrayList<String> filmes = new ArrayList<String>();
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(50);
    
    Pessoa joao = new Pessoa("Joao", 20);
    Pessoa maria = new Pessoa("maria", 30);
    Pessoa pedro = new Pessoa("Pedro", 70);
    
    
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    pessoas.add();
    pessoas.add(maria);
    pessoas.add(pedro);
    
    for(Pessoa pessoa : pessoas){
      System.out.println(pessoa.getNome());
    }
   
  }
}

import java.util.ArrayList;
import java.util.Collections;

public class App{
  
  
    
    
  
  public static void main (String[] args) throws Exception{
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    numeros.add(70);
    numeros.add(80);
    numeros.add(50);
    numeros.add(10);
    numeros.add(30);
    numeros.add(-13);
    numeros.add(500);
    
    
    Collections.sort(numeros, Collections.reverseOrder());
    
    for(Integer numero: numeros){
      System.out.println(numero);
    }



  }
}


//Heranca

public class App{
  
  
  public static class Animal{
    
    
    
    
    private String nome;
    
    
    public Animal(String nome){
      this.nome = nome;
    }
    
    
    public void comer(){
      
      System.out.printf("%s comeu\n", nome);
      
    }
    
    public void beber(){
      
      System.out.printf("%s comeu\n", nome);
      
    }
    
    public String getNome(){
      return nome;
    }
    
    public void setNome( String nome){
      this.nome = nome;
    }
    
    
  }
  
  
  public static class Ave extends Animal{
    
    
    public Ave (String nome){
      
      super(nome);
      
    }
    
    public void voar (){
      
      System.out.printf("%s voou\n", getNome());
      
    }
    
  }
  
  public static class Cachorro extends Animal{
    
    private int ossosComidos;
    
    public Cachorro(String nome){
      super(nome);
      
    }
    
    public void latir(){
      
      System.out.printf("%s latiu\n", getNome());
      
    }
    public void lamber(){
      
      System.out.printf("%s lambeu\n", getNome());
      
    }
    
    
    
  }
  
  
  
  public static class Gato extends Animal{
    
    
    
    public Gato(String nome){
      super(nome);
    }
    
    public void miar(){
      
      System.out.printf("%s miou\n", getNome());
    }
    
  }
  
  public static class Dragao extends Ave{
    
    
    
    public Dragao(String nome){
      super(nome);
    }
    
    public void soltarFogo(){
      
      System.out.printf("%s soltou uma bola de fogo\n", getNome());
    }
    
  }
  
  public static class Pombo extends Ave{
    
    private int cartasEnviadas;
    
    public Pombo(String nome){
      super(nome);
      cartasEnviadas = 10;
    }
    
    
    
    public void fazerPru(){
      
      System.out.printf("%s fez Pruuu\n", getNome());
    }
    
    
    public void enviarCarta(){
      
      System.out.printf("%s enviou uma carta\n", getNome());
      cartasEnviadas ++;
    }
    
    public int getCartasEnviadas(){
      return cartasEnviadas;
    }
    
  }
  
    
    
  
  public static void main (String[] args) throws Exception{
    
    Cachorro cachorro = new Cachorro("caramelo");
    cachorro.comer();
    cachorro.latir();
    
    
    Gato gato = new Gato("Bartolomeu");
    gato.miar();
    
    
    Dragao dragao = new Dragao("Dragao de olhos");
    dragao.voar();
    dragao.soltarFogo();
    
    
    Pombo pombinha = new Pombo("cedex");
    pombinha.voar();
    pombinha.enviarCarta();
    pombinha.fazerPru();
  }
}



public class Her{
  
  public static class Serie{
    
    
    private String nome;
    
    private int temporadas;
    
    private int ano;
    
    
    
    public String pegarInformacoes(){
      
      String informacoes = String.format("Nome: %s (%d)- %d temporada", nome,
      ano, temporadas);
      
      return informacoes;
    }
    
    public String toString(){
      
      return
      
    }
    
    
    
    public Serie( String nome , int temporadas, int ano){
      
      this.nome = nome;
      this.temporadas = temporadas;
      this.ano = ano;
      
    }
    
    public String getNome(){
      return nome;
      
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    
    public int getTemporadas(){
      return temporadas;
      
    }
    
    public void setTemporadas(int temporadas){
      this.temporadas = temporadas;
    }
    
    
    public int getAno(){
      return ano;
      
    }
    
    public void setAno(int ano){
      this.ano = ano;
    }
  }
  
  
  public static void  main(String[] args) throws Exception{
    
    Serie serieQualquer = new Serie("the last uf us", 1 ,2023);
    
    //System.out.println(serieQualquer//.pegarInformacoes);
    
    System.out.println(serieQualquer.toString());
  }
}



public class Her{
  
    public static class Personagem{
      
      private String nome;
      private String classe;
      private int nivel;
      
      
      public Personagem(String nome){
        this.nome = nome;
        this.classe = "nenhuma";
        this.nivel = 1;
      }
      
      public String toString(){
        
        String informacoes = String.format("%s, (nivel: %d) - Classe: %s", nome,
        nivel, classe);
        
        return informacoes;
        
      }
      
      
      
      public void atacar(){
        
        System.out.println("O Arqueiro atacou");
        
      }
      
      
      
      public String getNome(){
        return nome;
        
      }
      
      public void setNome( String nome){
        this.nome = nome;
      }
      
      
      public String getClasse(){
        return classe;
        
      }
      
      public void setClasse( String classe){
        this.classe = classe;
      }
      
      
      public int getNivel(){
        return nivel;
        
      }
      
      public void setNivel( int nivel){
        this.nivel = nivel;
      }
    }
    
    public static class Arqueiro extends Personagem{
      
      private String arma;
      
      public Arqueiro(String nome){
        
        super(nome);
        setClasse("Arqueiro");
        this.arma = "Arco longo";
      }
      
      public String toString(){
        
        String InformacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma : %s", arma);
  
        return InformacaoPersonagem + informacaoArqueiro;
        
      }
      
    }
  
  public static void  main(String[] args) throws Exception{
    
    Personagem personagem = new Personagem("Joao");
    System.out.println(personagem);
    
    Arqueiro arqueiro = new Arqueiro("legolas");
    System.out.println(arqueiro);
    
    arqueiro.atacar();
    
  }
}


import java.util.Random;

public class App{
  
  
  public abstract static class Personagem{
  
  
  public abstract void atacar();
  
  protected int sortearNumero(){
    
    Random gerador = new Random();
    int numero = gerador.nextInt(6);
    return numero;
    
    
  }
}
  
  
  public static class Guerreiro extends Personagem{
  
  public void atacar(){
    
    int valorDado = this.sortearNumero();
    System.out.printf("voce tirou um %d no dado\n", valorDado);
    if (valorDado < 3) {
      System.out.println("O Guerreiro errou o atack");
    } else if(valorDado == 6){
      
      System.out.println("o Guerreiro acertou o especial");
      
    } else {
      System.out.println("o Guerreiro acertou");
    }
    
    
  }
  
  
}

  
  
    
  
  public static void main (String[] args) throws Exception{
    
    Guerreiro guerreiro = new Guerreiro();
    guerreiro.atacar();
    
    
  }
}

//POLIMORFISMO



public class App{
  
  public static class Video{
    
    private String nome;
    
    
    public Video(String nome){
      this.nome = nome;
    }
    
    public void play(){
      System.out.println("Play filme");
    }
    
    
    public String getNome(){
      return nome;
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
  }
  
  
  public static class Filme extends Video{
    
    private String audio;
    private String legenda;
    
    public Filme(String nome){
      super(nome);
      this.audio = "portugues";
      this.legenda = "nenhuma";
    }
    
    public void play(){
       System.out.println("Play Filme " + getNome());
      
    }
    
    public void play(String audio){
      
      this.audio = audio;
      
      
      if (audio == "portugues"){
        
        this.legenda = "nenhuma";
        
      } else {
        
        this.legenda = "portugues";
      }
      System.out.println("Play " + toString());
      
    }
    
    public void play(String audio, String legenda){
      
      this.audio = audio;
      this.legenda = legenda;
      
      
      System.out.println("Play " + toString());
      
    }
    
    public String toString(){
      
      String informacao = String.format("Filme %s (audio %s, legenda %s)",
      getNome(), audio, legenda);
      return informacao;
      
    }
    
    public String getAudio(){
      return audio;
    }
    
    public void setAudio(String audio){
      this.audio = audio;
    }
    
    
    public String getLegenda(){
      return legenda;
    }
    
    public void setLegenda(String legenda){
      this.legenda = legenda;
    }
    
    
  }
  
  
  public static class Serie extends Filme{
    
    private int temporadas;
    private int episodiosTemporadas;
    private int episodioAtual;
    private int temporadaAtual;
    
    
    public Serie (String nome, int temporadas, int episodiosTemporadas){
      
      super(nome);
      this.temporadas = temporadas;
      this.episodiosTemporadas = episodiosTemporadas;
      this.temporadaAtual = 1;
      this.episodioAtual = 1;
    }
    
    public String toString(){
      
      
      String informacao = String.format("Serie %s %dx%02d(audio %s, legenda %s)",
      getNome(), 
      temporadaAtual,
      episodioAtual,
      getAudio(),
      getLegenda());
      return informacao;
      
    }
    
    public int getTemporadas(){
      return temporadas;
    }
    
    public void setTemporadas(int temporadas){
      this.temporadas = temporadas;
    }
    
    
    public int getEpisodiosTemporadas(){
      return episodiosTemporadas;
    }
    
    public void setNome(int episodiosTemporadas){
      this.episodiosTemporadas = episodiosTemporadas;
    }
    
    
    public int getEpisodioAtual(){
      return episodioAtual;
    }
    
    public void setEpisodioAtual(int episodioAtual){
      this.episodioAtual = episodioAtual;
    }
    
    
    public int getTemporadaAtual(){
      return temporadaAtual;
    }
    
    public void setTemporadaAtual(int temporadaAtual){
      this.temporadaAtual = temporadaAtual;
    }
  }
  
  
  
    
  
  public static void main (String[] args) throws Exception{
    
    Filme filme = new Filme("lagoa azul");
    filme.play("portugues");
    
    Serie serie = new Serie("the last of us", 2, 10);
    System.out.println(serie);
    
  }
}


//AGREGAÇÃO


import java.util.ArrayList;

public class App{
  
  public static class Telefone{
    
    
    
    private String numeroChip;
    private Contatos contatos;
    
    //ArrayList<Contato> contatos;
    
    
    
    
    public Telefone(String numeroChip){
      
      
      this.numeroChip = numeroChip;
      this.contatos = new Contatos();
     // this.contatos = new ArrayList<Contato//>();
      
      
    }
    
    
    public String getNumeroChip(){
      
      return numeroChip;
    }
    
    public Contatos getContatos(){
      
      return contatos;
      
    }
    
    
    
  }
  
  public static class  Contato{
    
    private String nome;
    
    private String numero;
    
    
    
    public Contato(String nome, String numero){
      
      this.nome = nome;
      this.numero = numero;
      
    }
    
    
    public String getNome(){
      
      return nome;
      
    }
    
    public void setNome(String nome) {
      
      this.nome = nome;
      
    }
    
    
    public String getNumero(){
      
      return numero;
      
    }
    
    public void setNumero(String numero) {
      
      this.numero = numero;
      
    }
    
    public String toString(){
      
      
      String informacao = String.format("Nome: %s\t Numero: %s", nome, numero);
      return informacao;
    }
    
    
  }
  
  public static class Contatos {
    
    private ArrayList<Contato> contatos;
    
    
    
    public Contatos() {
      
      this.contatos = new ArrayList<Contato>();
      
      
    }
    
    public void adicionar (String nome, String numero){
      
      
      Contato novoContato = new Contato(nome, numero);
      contatos.add(novoContato);
    }
    
    
    public void adicionar(Contato novoContato){
      contatos.add(novoContato);
      
      
      
      
    }
    
    public Contatos buscar(String palavra){
      
      String palavraChave = palavra.toLowerCase();
      
      Contatos contatosF = new Contatos();
      
      for(Contato contato : contatos){
        String nomeContato = contato.getNome().toLowerCase();
        if (nomeContato.startsWith(palavraChave)){
          
          contatosF.adicionar(contato);
          
        }
      }
      
      return contatosF;
    }
    
    
    public ArrayList<Contato> getContatos(){
      
      return contatos;
      
    }
    
    public void setContatos(ArrayList<Contato> contatos){
      
      this.contatos = contatos;
      
    }
    
    public String toString(){
      
      
      String informacao = "Contatos:\n";
      for(Contato contato: contatos){
        
        informacao += informacao + contato.toString() + "\n";
        
      }
      return informacao;
    }
    
  }
  
  
  public static class Ligacao{
    
    private String numeroO;
    private String numeroD;
    private String horario;
    
    
    
    
    
    public Ligacao(String numeroO, String numeroD){
      
      this.numeroO = numeroO;
      this.numeroD = numeroD;
      
    }
    
    
    public void ligar(){
      System.out.println("ligando para " + numeroD);
      System.out.println("chamando...");
      System.out.println("Numero ocupado");
      
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss");
      LocalDateTime horarioAgora = LocalDateTime.now();
      horario = formatador.format(horarioAgora);
    }
    
    
    public String getNumeroO(){
      
      return numeroO;
      
    }
    
    
    public String toString(){
      String informacao = String.format("Origem: %s/t Destino: %s/t horario:%s",
      numeroO, numeroD, horario);
      return informacao;
    }
    
    
    public void setNumeroO(String numeroO) {
      
      this.numeroO = numeroO;
      
    }
      
      
    public String getNumeroD(){
      
      return numeroD;
      
    }
    
    public void setNumeroD(String numeroD) {
      
      this.numeroD = numeroD;
    }
  }
  
  
  public static void main(String[] args) throws Exception{
    
    Telefone telefone = new Telefone("4002 8922");
    
    Contato contatoA = new Contato("Lucas", "408917456");
    Contato contatoB = new Contato("Luan", "13344");
    Contato contatoC = new Contato("Maria", "838383");
    Contato contatoD = new Contato("Carlos", "737388");
    
    Contatos telefoneContatos = telefone.getContatos();
    
    telefoneContatos.adicionar(contatoA);
    telefoneContatos.adicionar(contatoB);
    telefoneContatos.adicionar(contatoC);
    telefoneContatos.adicionar(contatoD);
    
    System.out.println(telefoneContatos);
    
    
    System.out.println("contatos filtrados");
    System.out.println(telefoneContatos.buscar("l"));
    
    Ligacao ligacao = new Ligacao("123", "456");
    Ligacao.ligar();
    System.out.println(Ligacao);
  }
  
}

//Static


public class Main{
  
  
  
  public static class Matematica{
    
    
    private static double valorPi = 3.14;
    
    
    public static int somar(int numeroA, int numeroB){
      return numeroA + numeroB;
    }
    
    
    public static double calcularArea( double lado){
      
      return lado * lado;
    }
    
    
    
    
    public static double calcularAreaCirculo(double raio){
      
      double area = valorPi * raio * raio;
      return area;
    }
  }
  
  public static class Jogo{
    
    public void jogar(){
      
      double areaJogador = Matematica.calcularAreaCirculo(4);
      
    }
    
  }
  
  public static double calcularDobroDaAreaCirculo(double raio){
    
    double area = Matematica.calcularAreaCirculo(raio);
    return area;
    
  }
  
  
  public static class Carro{
    
    private String nome;
    private int ano;
    public static int anoCompra = 2023;
    
    public Carro(String nome, int ano){
      this.nome = nome;
      this.ano = ano;
    }
    
    public String getNome(){
      return nome;
      
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    
    public int getAno(){
      return ano;
      
    }
    
    public void setAno(int ano){
      this.ano = ano;
    }
    
  }
  
  
  public static void main(String[] args) throws Exception{
    
    
    Carro ferrari = new Carro("Ferrari", 2023);
    
    Carro fusca = new Carro("Fusca", 1999);
    
    System.out.println(ferrari.getNome());
    System.out.println(ferrari.anoCompra);
    
    
    
    System.out.println(fusca.getNome());
    System.out.println(fusca.anoCompra);
    
    
  }
}




//Constante

public class Main{
  
  
  public static class Login{
    
    //constante tem q ser static
    //nome em snack case
    //final
      
    private static final int TAMANHO_MINIMO = 7;
    
    public void verificarSenha(String senha){
      
      
      
      if (senha.length() >= TAMANHO_MINIMO) {
        
        System.out.println("Senha valida");
      } else {
        
        System.out.println("Senha invalida");
      }
      
    }
  }
  
  
  public static class Cpf{
    
    private static final int INDICE_REGIAO = 8;
    private static final int INDICE_PRIMEIRO = 9;
    private static final int INDICE_SEGUNDO = 10;
    
    
    public void validar(String cpf){
      
      int regiao = cpf.charAt(INDICE_REGIAO);
      int primeiroDigito = cpf.charAt(INDICE_PRIMEIRO);
      int segundoDigito = cpf.charAt(INDICE_SEGUNDO);
    }
  }
  
  public static class Matematica{
    
    private static final double PI = 3.14;
    
    public double calcularAreaCirculo(int raio){
      
      
      double area = PI * raio * raio;
      return area;
      
    }
    
    
  }
  
  public static void main(String[] args) throws Exception{
    
    
    
    
    
  }
}

//TELA NO JAVA


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.awt.event.addActionListener;



public class Tela{



public static void main(String[] args) throws Exception {

    JFrame janela = new JFrame();
    
    JLabel labelUsuario = JLabel("usuario");
    labelUsuario.setBounds(50,50,100,30);
    
    
    JTextField campoU = new JTextField();
    campoU.setBounds(50,80,100,30);
    
    
    
    JButton botao = new JButton("clique aki");
    botao.setBounds(0,0,200,30);
    bitao.addActionListener(new addActionListener(){
      
      public void actionPerformed(ActionEvent e){
        System.out.println("Se inscreva no canal");
      }
      
    })
    
    janela.add(botao);
    janela.add(labelUsuario);
    janela.add(campoU);
    
    janela.setLayout(null);
    
    
    
    
    janela.setBounds(0, 0,400,600);
    
    janela.setDefaltCloserOperation(JFrame.EXIT_ON_CLOSE);
    
    
    janela.setVisible(true);
    
    }
}

//TRY & CATCH


public class App{
  
  
  public static class Matematica{
    
    public void dividir(int numeroA, int numeroB){
      
      System.out.println(numeroA / numeroB);
    }
  }
  
  
  public static void main(String[] args) throws Exception{
    
    //vetor
    
    int[] numeros = new int[] {10,20,30,100};
    int[] peso = new int[] {2,0,4};
    Matematica matematica = new Matematica();
    
    
    
    try {
      
      
      for (int i = 0; i < 4  ; i++ ) {
        int resultado = numeros[i] / peso[i];
        
        matematica.dividir(numeros[i], peso[i]);
        System.out.printf("%d / %d = %d\n", numeros[i], peso[i], resultado);
      }
      
      System.out.println("Numeros: ");
      System.out.println(numeros[5]);
      
      
    } catch(ArithmeticException erro){
      
      System.out.println("Erro de calculo: " + erro.getMessage());
      
    } catch(ArrayIndexOutOfBoundsException erro){
      
      System.out.println("Erro de vetor: " + erro.getMessage());
      
    }catch(Exception erro){
      
      
      System.out.println("Erro generico ");
      
    
    }
    
    
    
    System.out.println("Mensagem final: ");
  }
}

public class App{
  
  
  
  
  public static void main(String[] args) throws Exception{
    
    
    
    try {
      System.out.println("Mensagem antes da excercao");
      int resultado = 10 / 0;
      
      System.out.println("Mensagem apos a excercao");
      
    } catch(Exception erro) {
      
      System.out.println("Erro" +erro.getMessage());
      
    } finally {
      
      System.out.println(" vou ser executado a forca");
      
    }
    
    System.out.println("Mensagem final");
    
  }
  
}

package Estrutura_de_dados;

import java.util.Scanner;

public class Main{
  
  
  public static void main(String[] args){
    
    int[] vetor = new int[8];
    
    for (int i = 0;i < vetor.length ; i++ ) {
      vetor[i] = (int) (Math.random() * 10);
      System.out.println(vetor[i]);
    }
    
    System.out.println("Qual numero vc busca? ");
    Scanner leitor = new Scanner(System.in);
    int buscado = leitor.nextInt();
    
    
    boolean achou = false;
    
    for (int i = 0;i < vetor.length ; i++ ) {
      if (vetor[i] == buscado) {
        
        achou = true;
        break;
      }
    }
    if (achou) {
      
      System.out.println("Achou");
    }else{
      
      System.out.println("N achou");
    }
  }
}

//MELHOR TESTADOR DE VELOCIDADE 

package Estrutura_de_dados;

import java.util.Scanner;

//BUSCA BINARIA

public class Bin{
  
  public static void main(String[] args) {
    
    
    int[] vetor = new int[10000];
    
    for (int i = 0 ; i < vetor.length; i++) {
      vetor[i] = i * 2;
      System.out.println(vetor[i]);
    }
    
    System.out.println("Qual numero vc busca: ");
    
    Scanner leitor = new Scanner(System.in);
    int buscado = leitor.nextInt();
    
    int contador = 0;
    
    
    boolean achou = false;
    int inicio = 0;
    int fim = vetor.length -1;
    int meio;
    
    while(inicio <= fim){
      contador ++;
      
      meio = (int) ((inicio + fim) /2);
      if (vetor[meio] == buscado) {
        
        achou = true;
        break;
      }else if(vetor[meio] < buscado){
        
        inicio = meio +1;
        
      }else{
        
        fim = meio -1;
      }
    }
    
    System.out.println("Quantidade de testes: " + contador);
    if (achou == true) {
      System.out.println("achou");
    }else{
      System.out.println("n achou");
    }
  }
}


//////Pior testador
package Estrutura_de_dados;

// BUBBLE SORT

public class Main{
  
  public static void main(String[] args) {
    int[] vetor = new int[10000];
    
    for (int i = 0; i < vetor.length ; i++) {
      vetor[i] = (int) (Math.random() *vetor.length);
      System.out.println(vetor[i]);
    }
    
    long inicio = System.currentTimeMillis();
    long fim;
    
    int aux;
    for (int i = 0; i < vetor.length ;i++ ) {
      for (int j = i +1; j < vetor.length ; j++) {
        if (vetor[i] > vetor[j]) {
          
          aux = vetor[j];
          vetor[j] = vetor[i];
          vetor[i] = aux;
          
        }
      }
    }
    fim = System.currentTimeMillis();
    System.out.println("tempo " + (fim-inicio));
    
     System.out.println("Vetor ordenado");
    for (int i = 0; i < vetor.length ; i++) {
     System.out.println(vetor[i]);
       
    }
  }
  
}


//Outra forma de organizar

public class Main{
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    for (int i = 0; i < vetor.length ; i++) {
      vetor[i] = (int) (Math.random() * vetor.length);
    }
    
    int aux, j;
    
    for (int i = 1; i < vetor.length ;i++ ) {
      
      aux = vetor[i];
      
      j = i-1;
      while( j >= 0 && vetor[j] > aux){
        
        vetor[j +1] = vetor[j];
        j--;
        
      }
      vetor[j+1] = aux;
    }
    for (int i = 0; i< vetor.length ; i++) {
      
      
      System.out.println(vetor[i]);
    }
    
  }
}

public class Main{
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    for (int i = 0; i < vetor.length ; i++){
      vetor[i] = (int) (Math.random() * vetor.length);
    } 
    
    System.out.println("desordenado");
    for (int i = 0; i < vetor.length ; i++){
      System.out.println(vetor[i]);
    }
    
    
    int posicaoMenor,aux;
    for (int i = 0; i < vetor.length ; i++) {
      
      posicaoMenor = i;
      for (int j = i+1; j < vetor.length ; j++) {
        if (vetor[j] < vetor[posicaoMenor]) {
          posicaoMenor = j;
        }
      }
      
      aux = vetor[posicaoMenor];
      vetor[posicaoMenor] = vetor[i];
      vetor[i] = aux;
      
    }
    
    System.out.println("\n\nordenado");
    for (int i = 0; i < vetor.length ; i++){
      System.out.println(vetor[i]);
    }
  }
}

public class Main {

  public static void main(String[] args) {

    int[] vetor = new int[5];

    for (int i = 0; i < vetor.length ; i++ ) {

      vetor[i] = (int) (Math.random() * vetor.length);
    }

    System.out.println("Vetor");
    for (int i = 0; i < vetor.length ; i++ ) {

      System.out.println(vetor[i]);
    }

    System.out.println("Soma");
    System.out.println(somar(0,0,vetor));
  }

  private static int somar(int soma, int posicao, int[] vetor){

    if (posicao < vetor.length) {

      soma = soma + vetor[posicao];
      return somar(soma, posicao+1, vetor);

    } else {
      return soma;
    }
  }
}


public class Main {

  public static void main(String[] args) {

    int[] vetor = new int[10];

    for (int i = 0; i < vetor.length ; i++) {

      vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }

    System.out.println("Desordenado");
    for (int i = 0; i < vetor.length ; i++){

      System.out.print(vetor[i] + " ");
    }

    //Heap sort

    int n = vetor.length;

    for (int i = n/2 -1; i >= 0 ; i-- ) { // Corrigido: operador de decremento --
      aplicarHeap(vetor, n, i);
    }

    System.out.println("\n\n Quase ordenado");
    for (int i = 0; i < vetor.length ; i++){

      System.out.print(vetor[i] + " ");
    }

    for (int j = n -1; j > 0; j--) {
      int aux = vetor[0];
      vetor[0] = vetor[j];
      vetor[j] = aux;

      aplicarHeap(vetor, j ,0);
    }


    System.out.println("\n\n Ordenado");
    for (int i = 0; i < vetor.length ; i++){

      System.out.print(vetor[i] + " ");
    }

  }

  private static void aplicarHeap(int[] vetor, int n, int i){ // Corrigido: nome do parâmetro vetor

    int raiz = i;
    int esquerda = 2*i +1;
    int direita = 2*i +2;

    if (esquerda < n && vetor[esquerda] > vetor[raiz]) {

      raiz = esquerda;
    }

    if (direita < n && vetor[direita] > vetor[raiz]) {

      raiz = direita;
    }

    if (raiz != i) {

      int aux = vetor[i];
      vetor[i] = vetor[raiz];
      vetor[raiz] = aux;

      aplicarHeap(vetor, n, raiz);
    }
  }
}




// QUICK SORT O MAIS RAPIDO

public class Main{
  
  //Quick Sort o mais rapido
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    for (int i = 0; i < vetor.length ; i++) {
      vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }
    
    System.out.println("Desordenado");
    
    for (int i = 0; i < vetor.length ; i++) {
      System.out.print(vetor[i] + " ");
    }
    
    quicksort(vetor,0,vetor.length -1);
    
    System.out.println("\n\n Ordenado");
    
    for (int i = 0; i < vetor.length ; i++) {
      System.out.print(vetor[i] + " ");
    }
    
  }
  
  static void quicksort(int[] vetor, int esquerda, int direita){
    
    if (esquerda < direita) {
      
      int p = particao(vetor,esquerda,direita);
      
      quicksort(vetor,esquerda,p);
      quicksort(vetor,p +1,direita);
    }
  }
  
  static int particao(int[] vetor , int esquerda, int direita){
    
    int meio = (int) (esquerda + direita) /2;
    int pivot = vetor[meio];
    int i = esquerda -1;
    int j = direita +1;
    
    while (true) {
      
      
      do{
        
        i++;
        
      }while(vetor[i] < pivot);
      
      do {
        
        j--;
        
      }while(vetor[j] > pivot);
      if (i >= j) {
        return j;
      }
      
      int aux = vetor[i];
      vetor[i] = vetor[j];
      vetor[j] = aux;
      
    }
  }
}




public class Arvore{
  
  


public class Elemento<TIPO>{
  
  private TIPO valor;
  
  private Elemento<TIPO> esquerda;
  private Elemento<TIPO> direita;
  
  
  
  public Elemento(TIPO novoValor){
    
    this.valor = novoValor;
    this.esquerda = null;
    this.direita = null;
    
  }
  
  
  public TIPO getValor() {
    
    return valor;
  }
  
  public void setValor(TIPO valor){
    
    this.valor = valor;
  }
  
  public Elemento<TIPO> getEsquerda() {
    
    return esquerda;
  }
  
  public void setEsquerda(Elemento<TIPO> esquerda){
    
    this.esquerda = esquerda;
  }
  
  
  public Elemento<TIPO> getDireita() {
    
    return direita;
  }
  
  public void setDireita(Elemento<TIPO> direita){
    
    this.direita = direita;
  }
  
  
}


public static class Arvore<TIPO extends Comparable>{
  
  
  private Elemento<TIPO> raiz;
    
    
    public Arvore() {
      this.raiz = null;
      
    
  }
  
  public static void adicionar(TIPO valor){
    
    Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
    if (raiz == null) {
      
      this.raiz = novoElemento;
      
    } else {
      
      Elemento<TIPO> atual = this.raiz;
      while( true ){
        
        if (novoElemento.getValor().comparableTO(atual.getValor()) == -1){
          
          if (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
            
          } else {
            
            atual.setEsquerda(novoElemento);
            break;
          }
          
        } else {
          
          if (atual.getDireita() != null) {
            atual = atual.getDireita();
            
          } else {
            
            atual.setDireita(novoElemento);
            break;
          }
        }
      }
    }
  }
  
  public Elemento<TIPO> getRaiz(){
    
    return raiz;
  }
  
  
  public void emOrdem(Elemento<TIPO> atual){
    
    if (atual != null) {
      
     emOrdem(atual.getEsquerda());
     System.out.println(atual.getValor());
     emOrdem(atual.getDireita());
     
    }
    
  }
}
  
  public static void main(String[] args) {
    
    
    Arvore<Integer> arvore = new Arvore<Integer>();
    arvore.adicionar(10);
    arvore.adicionar(5);
    arvore.emOrdem(arvore.getRaiz());
    
  }
}



public class Arvore{
  
  


public class Elemento<TIPO>{
  
  static private TIPO valor;
  
  private Elemento<TIPO> esquerda;
  private Elemento<TIPO> direita;
  
  
  
  public Elemento(TIPO novoValor){
    
    this.valor = novoValor;
    this.esquerda = null;
    this.direita = null;
    
  }
  
  
  public TIPO getValor() {
    
    return valor;
  }
  
  public void setValor(TIPO valor){
    
    this.valor = valor;
  }
  
  public Elemento<TIPO> getEsquerda() {
    
    return esquerda;
  }
  
  public void setEsquerda(Elemento<TIPO> esquerda){
    
    this.esquerda = esquerda;
  }
  
  
  public Elemento<TIPO> getDireita() {
    
    return direita;
  }
  
  public void setDireita(Elemento<TIPO> direita){
    
    this.direita = direita;
  }
  
  
}


public static class Arvore<TIPO extends Comparable>{
  
  
  private Elemento<TIPO> raiz;
    
    
    public Arvore() {
      this.raiz = null;
      
    
  }
  
  public static void adicionar(TIPO valor){
    
    Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
    if (raiz == null) {
      
      this.raiz = novoElemento;
      
    } else {
      
      Elemento<TIPO> atual = this.raiz;
      while( true ){
        
        if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
          
          if (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
            
          } else {
            
            atual.setEsquerda(novoElemento);
            break;
          }
          
        } else {
          
          if (atual.getDireita() != null) {
            atual = atual.getDireita();
            
          } else {
            
            atual.setDireita(novoElemento);
            break;
          }
        }
      }
    }
  }
  
  public Elemento<TIPO> getRaiz(){
    
    return raiz;
  }
  
  
  public void emOrdem(Elemento<TIPO> atual){
    
    if (atual != null) {
      
     emOrdem(atual.getEsquerda());
     emOrdem(atual.getDireita());
     System.out.println(atual.getValor());
     
     
    }
    
  }
  
  public void remover(TIPO valor){
    
    Elemento<TIPO> atual = this.raiz;
    Elemento<TIPO> paiAtual = null;
    while(atual != null){
      
      if (atual.getValor().equals(valor)) {
        
        break;
        
      } else if(valor.compareTO(atual.getValor()) == -1){
        atual = atual.getEsquerda();
        
      } else {
        
        paiAtual = atual;
        atual = atual.getDireita();
      }
    }
    if (atual != null) {
      
      if (atual.getDireita() != null){
        
        Elemento<TIPO> substituto = atual.getDireita();
        Elemento<TIPO> paiSubstituto = atual;
        
        while(substituto.getEsquerda() != null){
          
          paiSubstituto = substituto;
          
          substituto = substituto.getEsquerda();
        }
        
      if (paiAtual != null) {
        
        if (atual.getValor().compareTO(paiAtual.getValor()) == -1) {
          
          paiAtual.setEsquerda(substituto);
          
        } else{
          
          paiAtual.setDireita(substituto);
        }
     } else{
       
       this.raiz = substituto;
     }
        
        ////
        
      } else if(atual.getDireita() != null){
        
      } else if (atual.getEsquerda() != null){
        
        Elemento<TIPO> substituto = atual.getEsquerda();
        Elemento<TIPO> paiSubstituto = atual;
        
        while(substituto.getDireita() != null){
          
          paiSubstituto = substituto;
          
          substituto = substituto.getDireita();
        }
        
        if (paiAtual != null) {
          
        if (atual.getValor().compareTO(paiAtual.getValor()) == -1) {
          
          paiAtual.setEsquerda(substituto);
          
        } else{
          
          paiAtual.setDireita(substituto);
        }
      } else {
        
        this.raiz = substituto;
      }
        
        
        if (substituto.getValor().compareTO(paiSubstituto.getValor()) == -1) {
          
          paiSubstituto.setEsquerda(null);
          
        } else{
          
          paiSubstituto.setDireita(null);
        }
        
      } else {
        
        if (paiAtual != null) {
        if (atual.getValor().compareTO(paiAtual.getValor()) == -1) {
          
          paiAtual.setEsquerda(null);
          
        } else{
          
          paiAtual.setDireita(null);
        }
        
       } else{
         
         this.raiz = null;
       }
       
      }
      
      return true;
      
    } else{
      
      return false;
    }
  }
}
  
  public static void main(String[] args) {
    
    
    Arvore<Integer> arvore = new Arvore<Integer>();
    arvore.adicionar(10);
    arvore.adicionar(8);
    arvore.adicionar(5);
    arvore.adicionar(9);
    arvore.adicionar(7);
    arvore.adicionar(18);
    arvore.adicionar(13);
    arvore.adicionar(20);
    
    System.out.println("\n\nEm Ordem");
    arvore.emOrdem(arvore.getRaiz());
    
  }
}

import java.util.ArrayList;

public class Main{
  
  
  public static class Grafo<TIPO>{
    
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Vertice<TIPO>> arestas;
    
    
    public Grafo(){
      
      this.vertices = new ArrayList<Vertice<TIPO>>();
      this.arestas = new ArrayList<Vertice<TIPO>>();
    }
    
    
    public void adicionarVertice(TIPO dado){
      
      Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
      
      this.vertices.add(novoVertice);
      
    }
    
    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim){
      
      Vertice<TIPO> inicio = this.getVertice(dadoInicio);
      Vertice<TIPO> fim = this.getVertice(dadoFim);
      Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
      
      inicio.adicionarArestaSaida(aresta);
      fim.adicionarArestaEntrada(aresta);
      this.arestas.add(aresta);
      
    }
    
    
    public Vertice<TIPO> getVertice(TIPO dado){
      
      Vertice<TIPO> vertice = null;
      
      for (int i = 0;i < this.vertices.size() ; i++) {
        
        if (this.vertice.get(i).getDado().equals(dado)) {
          
          vertice = this.vertice.get(i);
          break;
        }
        
        
      }
      
      return vertice;
      
    }
    
    public void buscaEmLargura(){
      
      ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
      ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
      
      Vertice<TIPO> atual = this.vertices.get(0);
      marcados.add(atual);
      System.out.println(atual.getDado());
      fila.add(atual);
      while (fila.size() > 0) {
        Vertice<TIPO> visitado = fila.get(0);
        for (int i=0;i < visitado.getArestasSaida() ; i++ ) {
          
          Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
          if (!marcados.contains(proximo)) {
            marcados.add(proximo);
            System.out.println(proximo.getDado());
            fila.add(proximo);
          }
        }
        fila.remove(0);
      }
    }
  }
  
  
  
  
  
  
  public static class Vertice<TIPO>{
    
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;
    
    
    
    public Vertice(TIPO valor){
      
      this.dado = valor;
      this.arestaEntrada = new  ArrayList<Aresta<TIPO>>();
      this.arestaSaida = new  ArrayList<Aresta<TIPO>>();
      
      
    }
    
    
    public TIPO getDado(){
      
      return dado;
      
    }
    
    public void setDado(TIPO dado){
      
      this.dado = dado;
      
    }
    
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
      
      this.arestaEntrada.add(aresta);
      
    }
    
    
    public void adicionarArestaSaida(Aresta<TIPO> aresta){
      
      this.arestaSaida.add(aresta);
      
    }
    
    public ArrayList<Aresta<TIPO>> getArestasEntrada(){
      
      return arestasEntrada;
    }
    
    
    public ArrayList<Aresta<TIPO>> getArestasSaida(){
      
      return arestasSaida;
    }
    
    
    
  }
  
  
  
  
  
  public static class Aresta<TIPO>{
    
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;
    
    
    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim){
      
      this.peso = peso;
      this.inicio = inicio;
      this.fim = fim;
      
      
    }
    
    
    public Double getPeso(){
      
      return peso;
      
    }
    
    public void setPeso(Double peso){
      
      this.peso = peso;
      
    }
    
    public Vertice<TIPO> getInicio(){
      
      return inicio;
    }
    
    public void setInicio(Vertice<TIPO> inicio ){
      this.inicio = inicio;
    }
    
    public Vertice<TIPO> getFim(){
      
      return fim;
    }
    
    public void setFim(Vertice<TIPO> fim){
      
      this.fim = fim;
    }
    
  }
  
  
  
  public static void main(String[] args) {
    
    Grafo<String> grafo = new Grafo<String>();
    
    grafo.adicionarVertice("Joao");
    grafo.adicionarVertice("Lorenzo");
    grafo.adicionarVertice("Creuza");
    grafo.adicionarVertice("Creber");
    grafo.adicionarVertice("Claudio");
    
    
    grafo.adicionarAresta(2.0, "Joao", "Lorenzo");
    grafo.adicionarAresta(3.0, "Lorenzo", "Creber");
    grafo.adicionarAresta(1.0, "Creber", "Creuza");
    grafo.adicionarAresta(1.0, "Joao", "Creuza");
    grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
    grafo.adicionarAresta(3.0, "Claudio", "Joao");
    
    
    grafo.buscaEmLargura();
  }
}


// SHELL SORT

public class Main{
  
  
  public static void main(String[] args) {
    
    int[] vetor = new int[10];
    
    System.out.println("vetor desordenado");
    
    for (int i=0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * vetor.length);
      System.out.println(vetor[i]);
    }
    
    int h = 1;
    int n = vetor.length;
    while (h < n) {
      h = h *3+1;
    }
    
    h = (int) Math.floor(h/3);
    
    int c,j;
    while(h > 0){
      
      for (int i = h; i < n; i++) {
        c = vetor[i];
        j = i;
        while (j >= h && vetor[j - h] > c){
          
          vetor[j] = vetor[j - h];
          j = j - h;
        } 
        
        vetor[j] = c;
      }
      
      h = h /2;
      
    }
    
    System.out.println("Vetor Ordenado");
    
    for (int i = 0; i < vetor.length ; i++ ) {
      
      System.out.println(vetor[i]);
    }
  }
}

public class ProgramaEnorme {
    public static void main(String[] args) {
        // Início do programa
        System.out.println("Este é um programa enorme com mais de mil linhas!");

        // Função 1
        funcao1();
        
        // Função 2
        funcao2();
        
        // ...
        
        // Função 100
        funcao100();

        // Fim do programa
        System.out.println("Fim do programa.");
    }

    // Definição da Função 1
    public static void funcao1() {
        // Conteúdo da Função 1
    }
    
    // Definição da Função 2
    public static void funcao2() {
        // Conteúdo da Função 2
    }
    
    // ...
    
    // Definição da Função 100
    public static void funcao100() {
        // Conteúdo da Função 100
    }

    // ...
    // Repita o padrão de definição de funções até a função 1000
}

public class ProgramaGrande {
    public static void main(String[] args) {
        System.out.println("Este é um programa grande com mais de 500 linhas!");

        // Chamada de métodos
        metodo1();
        metodo2();
        // ...
        metodo100();
        
        // ...
        // Continuação de chamadas de métodos
        metodo101();
        metodo102();
        // ...
        metodo200();
        
        // ...
        // Mais chamadas de métodos
        metodo201();
        metodo202();
        // ...
        metodo300();
        
        // ...
        // Mais chamadas de métodos
        metodo301();
        metodo302();
        // ...
        metodo400();
        
        // ...
        // Mais chamadas de métodos
        metodo401();
        metodo402();
        // ...
        metodo500();
        
        System.out.println("Fim do programa.");
    }

    // Definição de métodos
    public static void metodo1() {
        // Conteúdo do método 1
    }
    
    public static void metodo2() {
        // Conteúdo do método 2
    }
    
    // ...
    
    public static void metodo100() {
        // Conteúdo do método 100
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo101() {
        // Conteúdo do método 101
    }
    
    public static void metodo102() {
        // Conteúdo do método 102
    }
    
    // ...
    
    public static void metodo200() {
        // Conteúdo do método 200
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo201() {
        // Conteúdo do método 201
    }
    
    public static void metodo202() {
        // Conteúdo do método 202
    }
    
    // ...
    
    public static void metodo300() {
        // Conteúdo do método 300
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo301() {
        // Conteúdo do método 301
    }
    
    public static void metodo302() {
        // Conteúdo do método 302
    }
    
    // ...
    
    public static void metodo400() {
        // Conteúdo do método 400
    }
    
    // ...
    // Definições de métodos continuam até o método 500
    public static void metodo401() {
        // Conteúdo do método 401
    }
    
    public static void metodo402() {
        // Conteúdo do método 402
    }
    
    // ...
    
    public static void metodo500() {
        // Conteúdo do método 500
    }
}

public class ProgramaEnorme {
    public static void main(String[] args) {
        System.out.println("Este é um programa enorme com mais de mil linhas!");

        // Chamadas de métodos
        metodo1();
        metodo2();
        // ...
        metodo100();
        
        // Continuação de chamadas de métodos
        metodo101();
        metodo102();
        // ...
        metodo200();
        
        // Mais chamadas de métodos
        metodo201();
        metodo202();
        // ...
        metodo300();
        
        // Mais chamadas de métodos
        metodo301();
        metodo302();
        // ...
        metodo400();
        
        // Mais chamadas de métodos
        metodo401();
        metodo402();
        // ...
        metodo500();
        
        // Mais chamadas de métodos
        metodo501();
        metodo502();
        // ...
        metodo600();
        
        // Mais chamadas de métodos
        metodo601();
        metodo602();
        // ...
        metodo700();
        
        // Mais chamadas de métodos
        metodo701();
        metodo702();
        // ...
        metodo800();
        
        // Mais chamadas de métodos
        metodo801();
        metodo802();
        // ...
        metodo900();
        
        // Mais chamadas de métodos
        metodo901();
        metodo902();
        // ...
        metodo1000();
        
        // Mais chamadas de métodos
        metodo1001();
        metodo1002();
        // ...
        metodo1100();
        
        System.out.println("Fim do programa.");
    }

    // Definição de métodos
    public static void metodo1() {
        // Conteúdo do método 1
    }
    
    public static void metodo2() {
        // Conteúdo do método 2
    }
    
    // ...
    
    public static void metodo100() {
        // Conteúdo do método 100
    }
    
    // ...
    // Definições de métodos continuam até o método 1100
    public static void metodo1001() {
        // Conteúdo do método 1001
    }
    
    public static void metodo1002() {
        // Conteúdo do método 1002
    }
    
    // ...
    
    public static void metodo1100() {
        // Conteúdo do método 1100
    }
    
    // Mais definições de métodos
} 