package net.hb.day0628;

public class Child extends Father{

  public static void main(String[] args) {
    //모든클래스 최상위 Object클래스의 상속을 받았음.
    Child cd = new Child();
    int a = cd.bank();
  }

  public void book() {int m = bank(); }
  
}
