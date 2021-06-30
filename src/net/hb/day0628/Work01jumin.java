package net.hb.day0628;

import java.util.Scanner;

public class Work01jumin {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
//    "871024-1541965";
    while(true) {
      
    String min = scn.nextLine();
    scn.close();
    
    String[] mins = min.split("-");
    
    String min1 = mins[0];
    String min2 = mins[1];
    
    int num = min.length();
    int num1 = min1.length();
    int num2 = min2.length();
    if(min1.length() == 6)
    if(min2.length() == 7)
    } break;
    
    //문제1 총자릿수 13자릿수, 14자릿수
    System.out.println("문제 1 : " + (num1 + num2));
    
    //문제2 ******-1541965
    if(num1 == 6) {
      min1 = "******";
      System.out.println("문제 2 : " + min1 + "-" + min2);
    }
//    min.indexOf('-')+1
    //문제3 1/3 남자 2/4여자 switch
    char A = min.charAt(7);
    System.out.println(A);

    switch(A) {
    case '1' : 
    case '3' : 
      System.out.println ("남자입니다");break;
      

    case '2' : 
    case '4' : 
      System.out.println ("여자입니다");break;
      
      default : 
        System.out.println ("잘못된 입력입니다.");break;
    }
    //length(), substring(),indexOf(),charAt()
    
    
    
    
  }//e

}//C end
