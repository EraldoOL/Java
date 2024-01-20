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