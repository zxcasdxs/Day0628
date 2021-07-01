package net.hb.day0628;

public class BitCamp_4 extends Father implements AAA, BBB{
  public static void main(String[] args) {
    BitCamp_4 bc4 = new BitCamp_4();
    
  }//e

  public void game() {
    System.out.println("삼국지 사마의");
    int m = this.bank();
  }//e

  @Override
  public void apple() {
    System.out.println("BitCamp_4소석의 apple메소드");
    
  }//e

  @Override
  public String memo() {
    return null;
  }//e

  @Override
  public boolean nullCheck(int key) {
    return false;
  }//e

  @Override
  public void blue() {
    
  }//e
  
}//C end
