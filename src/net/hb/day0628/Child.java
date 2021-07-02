package net.hb.day0628;

public class Child extends Father{
  
  //Father 소속 car()메소드 호출
  //child 소속 ()car 메소드 호출

  public static void main(String[] args) {
    Child ck = new Child();
  }

  public void book() {
  super.car();
  this.car();
  }


  @Override
  public void car(){
    System.out.println("child");
  }

}