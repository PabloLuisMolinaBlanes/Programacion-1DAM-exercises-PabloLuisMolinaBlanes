public class Exercise09 {
  public static void main(String[] args) {
    double a;
    double b;
    double c;
    System.out.println("This program is thought to solve a second degree equation: ax^2 + bx + c = 0");
    System.out.println("Please, indicate the value for 'a' in 'ax^2'");
    a = Double.parseDouble(System.console().readLine());
    System.out.println("Now, input the value for 'b' in 'bx'");    
    b = Double.parseDouble(System.console().readLine());
    System.out.println("Now, input the value for constant 'c'");    
    c = Double.parseDouble(System.console().readLine());
    if (a != 0) {
    double result1 = (-b + Math.pow((b*b)- (4 * a * c), 1.0/2.0))/(2*a);
    double result2 = (-b - Math.pow((b*b)- (4 * a * c), 1.0/2.0))/(2*a);  
    System.out.println("The results for this equation are " + result1 + ", and " + result2);
    } else if (b == 0 && a < 0) {
    double result3 = -(Math.pow(c, 1.0/2.0));
    double result4 = Math.pow(c, 1.0/2.0);
    System.out.println("The results for this equation are " + result3 + ", and " + result4);
    } else if (c == 0) {
      double result5 = 0;
      double result6 = -b/a;
      System.out.println("The results for this equation are " + result5 + ", and " + result6); 
    } else {
      double result7 = -c/b;
      if (b != 0) {
       System.out.println("The result for this equation is " + result7); 
    } else {
      System.out.println("There is no solution for this equation");
    }
  }
}
}
