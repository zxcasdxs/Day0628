package net.hb.day0628;

public class Lotto {

  public static int[] input() {
    int[] su = new int[6];
    su[0] = 1; su[1] = 2; su[2] = 5;
    su[3] = 4; su[4] = 9; su[5] = 6;
    return su;
  }//
  
  public static void output(int[] ret) {
    for(int i = 0; i < ret.length; i++) {
      for(int j = i+1; j <ret.length; j++) {
        if(ret[i]>ret[j]) {
          int temp = ret[i];
          ret[i] = ret[j];
          ret[j] = temp;
        }
      }
        System.out.print(ret[i] + "\t");
    }
  }//
  
    public int inputHap() {
      int hap = 0;
      int[] su = new int[6];
      su[0] = 1; su[1] = 2; su[2] = 5;
      su[3] = 4; su[4] = 9; su[5] = 6;
      
      for(int i = 0; i < su.length; i++) {
        hap =+ su[i];
      }
      System.out.println("1"+hap);
      return hap;
  }//

}//class end
