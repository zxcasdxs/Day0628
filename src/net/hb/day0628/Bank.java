package net.hb.day0628;

public class Bank {
  // 챕터 6장 5 생성자 = constructor = constr
  //기본 생성자만 기술 >> 기본생성자 생략가능
  private int pwd = 1234; // private키워드는 현재 클래스에만 적용
  public Bank() {
    
  }

  //챕터 6장 4 오버로딩 메소드 중복, 생성자 중복가능
  void cal() {}
  public void cal(int m) {}//금액
  public void cal(String name, int m) {}//은행이름, 금액
  
}
