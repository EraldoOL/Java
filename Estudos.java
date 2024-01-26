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