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


