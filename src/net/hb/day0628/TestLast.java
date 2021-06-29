package net.hb.day0628;

public class TestLast {
  public static void main(String[] args) {
    
    int a = 234;
    double b = 78.9;
    String c = "1200";
    
    //문제 1 b타입을 int 형으로 변환
    
    int x = (int)b;
    System.out.println(x+34);
    
    //문제 2 c타입을 int 형으로 변환
    int y = Integer.parseInt(c);
    System.out.println(y+34);
    
    //문제 3 a타입을 String 형으로 변환
    String z = Integer.toString(a);
    System.out.println(z+34);
    
  }//main end

}// C end
