package net.hb.day0628;

public class SJUser {//호출
  public static void main(String[] args) {
    SJ sj = new SJ();
    String id = "kim";
    int A = 100;
    int B = 55;
    //학점을 구하는 메소드 생성 100~90A 89~80B 79~70C 69~60D ~59 F
    //if대신 switch 사용
    int total = sj.getTotal(id, A, B);
    double avg = sj.getMean(total);
    char grade = sj.getGrade(avg);
    String info = sj.result(avg, A, B);
    
    System.out.println(total);
    System.out.println(avg);
    System.out.println(grade);
    System.out.println(info);
    
  }//
}// class end
