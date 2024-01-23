package festa;

public static class FestaVip{
    
    
    
    private int qunatidadeC = 30;
    private int quantidadeS = 50;
    
    
    
    public void entrar(){
      
      
      beberCafe();
      comerS();
      beberCafe();
    }
  
  
  private void beberCafe(){
    
    qunatidadeC--;
    
    System.out.println("Bebeu Cafe");
  }
  
  private void comerS(){
    
    quantidadeS--;
    
    System.out.println("Comeu salgado");
  }
}

