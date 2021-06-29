package net.hb.day0628;

public class TestArray {
  
  public static void main(String[] args) {
    //배열은 초기화
    //배열의 장단점
     
    String[] dong = new String[5];
    for (int i = 0; i<dong.length; i++) {
      System.out.print(dong[i] + " ");
    }
    
    System.out.println();
    
    boolean[] camp = new boolean[5];
    
    for (int i = 0; i<camp.length; i++) {
      System.out.print(camp[i] + " ");
    }
    
      System.out.println();
      double[] pi = new double[5];
      for(int i = 0; i < pi.length; i++) {
        System.out.print( pi[i] + " ");
        
//    배열은 같은 타입으로만 구성, 크기사이즈 고정
//     채팅 구성원 정보 닉이름 String, 나이 int, 성별 boolean => 배열 구성비 권장
//     웹web게시판 글쓴이, 제목, 이미지, 조회수, 날짜
//     채팅, 쇼핑몰, 게시판 구성할때 배열의 한계 극복 collection모음 List계열
//     java.util 패키지 List 인터페이스 상속 - ArrayList클래스, Vector클래스
//     java.util 패키지 Map인터페이스, Set인터페이스, List 인터페이스
//     배열의 같은타입 구성, 크기 고정인 배열의 단점을 List인터페이스 그룹의 상속받은 ArrayList나 Vector로 해결
//        같은 타입구성, 크기고정인 1차원 배열
//        boolean[] camp = new boolean[5]; // false 기본값출력
//        배열 및 문자열 시작위치 0번부터
//        자바에서 표준출력 모니터 System.out ==> PrintStream
//        자바에서 표준입력 키보드 System.in ==> Scanner 생성자
      }
  }
}



