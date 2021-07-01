package net.hb.day0628;

public class BitCamp_3 {//LA 클 상속, 체리 메소드 호출
  public BitCamp_3() {this("종각점", 7 , "AIA");
  }
  public BitCamp_3(String location) {//String타입의 매개인자 있는 생성자
  }
  public BitCamp_3(int floor) {
  }
  public BitCamp_3(String location, int floor, String name) {
    System.out.println(location + floor + name);
  }

  public static void main(String[] args) {
    BitCamp_3 bc = new BitCamp_3("종각점", 7 , "AIA");
    bc.coffee();

  }//e

  public void coffee() { // Non-static
    System.out.println("coffee 카누");
    cookie();//this 생략가능 this()현재클래스 생성자 접근

  }//e

  public void cookie() {// Non-static
    System.out.println("cookie");
  }//e
  
  
}//C end
