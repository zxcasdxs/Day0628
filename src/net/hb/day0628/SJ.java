package net.hb.day0628;

public class SJ {//구현

  //합계 구하는 함수 hap~~ sum~~ total~~ getXXX()
  public int getTotal(String name, int j, int k) {

    System.out.println(name +" 님의 성적 합계처리");
    int total = j + k;
    return total;
}//
  
  //평균 구하는 함수 avg~~ average~~ mean~~ setXXX()
  
  public double getMean(int total) {
    double Mean = 0;
    Mean = ((double)total/2);
    return Mean;
  }
  //학점 구하는 함수 grade~~
  
  public char getGrade(double avg) {
    char grade = 0;
    
    
    switch ((int)avg/10) {//평균 데이터 점수 int 정수화
      
      case 10 : 
        grade = 'A';
        break;
      case 9 :
        grade = 'A';
        break;
      case 8 :
        grade = 'B';
        break;
      case 7 :
        grade = 'C';
        break;
      case 6 : 
        grade = 'D';
        break;
        
      default:
        grade = 'F';
      break;
    }
    return grade;
  }
  //합격 여부를 구하는 함수 pass~~ success~~
  
  public String result(double avg, int A, int B) {
    String info = "합격 여부:";

    if(avg >= 70 && A >= 60 && B >= 60) {
          info = "합격";
        } else {
          info = "불합격";
      }

      
    return info;
  }
  
  
}//class end
