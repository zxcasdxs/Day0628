package net.hb.day0628;

public class TestJumin {
  public static void main(String[] args) {
    
    String min = "871024-1541965";
    int pos = min.indexOf("-");
    System.out.println("pos = " + pos);
    //10월 24일 생일이네요
    String mon = min.substring(2, 4);
    String day = min.substring(4, 6);
    System.out.println(mon +"-"+ day);
    
    String last = min.substring(7);
    System.out.println(last);
    
    int len = min.length();
    System.out.println(len);
    
//    
//    if(i == '1' || i == '3') {
//      System.out.println("남자입니다.");
//    } else if (i == '2' || i == '4') {
//      System.out.println("여자입니다.");
//    } else {
//      System.out.println("잘못된 입력입니다.");
//    }
    //조건 if 남자입니다/ 여자입니다
    //String 문자열은 0번째부터 시작
  
  
  }//main end
  
}//C end
