package net.hb.day0628;

public class TestException2 {

  public static void main(String[] args) {
    
    int su1 = 9;
    int su2 = 0;
    int a=0, b=0;
    

    
    try {    a = (su1 * su2);
             b = (su1 / su2);
    } catch(Exception e) {}
    System.out.println(a);
    System.out.println(b);
    
    boolean[] camp = new boolean[5];
    System.out.println(camp[1]);
    System.out.println(camp[5]);

    System.out.println("\n***** 까사노의 1학기 점수 *****");
    System.out.println("국어 = 90");
    System.out.println("영어 = 85");
    System.out.println("총점 = 175");
    


  }
}
