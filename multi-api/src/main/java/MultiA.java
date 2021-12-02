


public class MultiA {

  CoreA coreA = new CoreA();



  public String reA(){
    return "A";
  }

  public String Test(){
    return coreA.CorePrint();
  }

  public static void main(String[] args) {
    MultiA a = new MultiA();
    System.out.println(a.Test());
  }

}
