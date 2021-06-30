package net.hb.day0628;

import java.io.InputStream;
import java.util.Scanner;

public class Work02emp {
  public static void main(String[] args) throws Exception {
   //자바에서 표준입력 ascii코드 byte 형태
   //자바에서 표준입력 System.in 키보드 입력
    InputStream is = System.in; 
    Scanner sc = new Scanner(is);
    int sabun = 2000;
    String name = "길동";
    String temp1;

    
    //문제 키보드입력 Scanner클래스, 반복문, 예외처리, 형변환
    while(true) {
  try {
    System.out.print("사번입력>>>");
    sabun = Integer.parseInt(sc.nextLine()); //숫자, 문자 다 입력해서 단점 해결
    System.out.print("이름입력>>>");
    name = sc.nextLine();
    break;
} catch (NumberFormatException e) { }
    } 
    
    
    }

  }
