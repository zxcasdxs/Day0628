package net.commen.bit;

public class Dunkin {
  public String coffee() {
//    Non-static 메소드, 리턴값
//    필요할때 메모리에 로드
//    객체화 생성 후 // 객체명.coffee();
    String kind="커피";
    return kind;
  }

  
  public static void dounts(int cnt) {
//    static메소드, 메소드(매개인자(매개변수))
    System.out.println("도너츠 메소드 주문갯수" + cnt + " 입니다");
//    Dunkin.donuts(3); 접근
      
  }
  
  public void menu() { //리턴값X, 매개인자X
    
  }
}
