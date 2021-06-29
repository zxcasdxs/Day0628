package net.hb.day0628;

public class TestNote {
  
  public static void main(String[] args) {
    System.out.println("123");
    System.out.println("456");
    TestNote tn = new TestNote();
    tn.note();

  }//main  end

  public String book() {   //문제 1 같은 문서의 메소드호출
    String my = "몽블랑"; //지역변수 = local variable= 어린아이 = 철저하게 보호
    return my;
  }
  
  public int price() {
    int momey = 2700;
    return momey;
  }
  
  public void note() { // Non-static 메소드
    String title = book();
    int much = price();
    System.out.println("책 제목 = " + title);
    System.out.println("책 제목 = " + book());
    System.out.println("책 제목 = " + price()); //메소드 내에서 재정의 하지 않아도 리턴값으로 사용가능
    System.out.println("책 제목 = " + much);
  }
  

  
}//class end
