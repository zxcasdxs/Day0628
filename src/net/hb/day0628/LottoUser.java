package net.hb.day0628;

public class LottoUser {

  public static void main(String[] args) {
    System.out.println("LottoUser.java 10:08");

    int[] ret = Lotto.input();
    Lotto.output(ret);
    
    Lotto LG = new Lotto();
    int value = LG.inputHap(); // 리턴값을 안받으면 그냥 호출, 에러는 없지만 의미 없음.
    
    System.out.println("2"+value);
    System.out.println("3"+LG.inputHap());
    
    System.out.println("LottoUser 11:01");

  }

}//class end
