package net.hb.day0628;

public class BitCamp_2 extends LA {//LA 클 상속, 체리 메소드 호출
  public static void main(String[] args) {
    BitCamp_2 bc = new BitCamp_2();
    bc.book();
    
//    this.cherry(); // 
//    super.cherry(); // 부모클래스
//    static 메소드 에서는 this, super사용불가
    
  }//e

  public void book() {
    System.out.println("book 몽블랑");
    
    this.cherry(); // 
    super.cherry(); // 부모클래스
  }//e

  @Override
  public void cherry() {
    System.out.println("제주산 체리");
  }
  //LA클래스에 있는 cherry() 메소드 재정의 {제주산 체리 }
}//C end
