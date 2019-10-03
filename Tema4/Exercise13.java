public class Exercise13 {
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    System.out.println("This program is thought to compare three numbers, the smaller to the bigger");
    System.out.println("Now, please, input the first number");
    a = Integer.parseInt(System.console().readLine());
    System.out.println("Now, please, input the second number");
    b = Integer.parseInt(System.console().readLine());
    System.out.println("Now, please, input the third number");
    c = Integer.parseInt(System.console().readLine());
    boolean aIsBiggerThanB = false;
    boolean bIsBiggerThanA = false;
    boolean aAndBAreEqual = false;
    int difference1 = a-b;
    if (difference1 > 0) {
      aIsBiggerThanB = true;
    } else if (difference1 < 0) {
      bIsBiggerThanA = true;
    } else {
      aAndBAreEqual = true;
    } 
    if (aIsBiggerThanB == true) {
      int difference3 = b-c;
      if (difference3 > 0 && c < a) {
          System.out.println("'a' is the biggest, 'b' is in the middle and 'c' is the smallest");
          System.out.println(c + " < " + b + " < " + a);
    } else if (difference3 < 0 && c < a) {
        System.out.println("'a' is the biggest, 'c' is in the middle and 'b' is the smallest");
        System.out.println(b + " < " + c + " < " + a);
    } else if (difference3 == 0 && c < a) {
        System.out.println("'a' is the biggest, 'b' and 'c' are the smallest");
        System.out.println(c + " = " + b + " < " + a); 
    } else if (c > a) {
       System.out.println("'c' is the biggest, 'a' is in the middle and 'b' is the smallest");
       System.out.println(b + " < " + a + " < " + c);
      } 
    } 
      
      if (bIsBiggerThanA == true) {
      int difference4 = a-c;
      if (difference4 > 0 && c < b) {
          System.out.println("'b' is the biggest, 'a' is in the middle and 'c' is the smallest");
          System.out.println(c + " < " + a + " < " + b);
    } else if (difference4 < 0 && c < b) {
      System.out.println("'b' is the biggest, 'c' is in the middle and 'a' is the smallest");
      System.out.println(a + " < " + c + " < " + b);
    } else if (difference4 == 0 && c < b) {
      System.out.println("'b' is the biggest, 'a' and 'c' are the smallest");
      System.out.println(a + " = " + c + " < " + b); 
    } else if (c > b) {
    System.out.println("'c' is the biggest, 'b' is in the middle and 'a' is the smallest");
    System.out.println(a + " < " + b + " < " + c);
  }
}
    if (aAndBAreEqual == true) {
      int difference4 = a-c;
      if (difference4 == 0) {
          System.out.println("'c', 'b' and 'a' are equal");
          System.out.println(c + " =" + b + " = " + a);
    } else if (difference4 < 0) {
      System.out.println("'c' is the biggest, 'a' and 'b' are the smallest");
      System.out.println(a + " =" + b + " < " + c);
    } else {
    System.out.println("'a' and 'b' are the biggest,'c' is the smallest");
    System.out.println(c + " <" + b + " = " + a);  
    }  
}
}      
}


    
