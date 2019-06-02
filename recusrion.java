ass Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //Test(5);
    RevTest(5);

   
  }

  public static void Test(int n) {
    if( n > 0)
    {
       System.out.println(n);
       Test(n-1);
    }else {
      System.out.println("Program is going to end");
      System.exit(0);
    }
  }

  public static void RevTest(int n) { 
    if( n == 1) {
      System.out.println(n);
    } else {
      RevTest(n-1);
      System.out.println(n-1);
    }
  }
}

