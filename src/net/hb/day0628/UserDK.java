package net.hb.day0628;

import net.commen.bit.Dunkin;

public class UserDK {
  public static void main(String[] args) {

    System.out.println(" ");
    Dunkin.dounts(3);
    
    Dunkin dk = new Dunkin();
    String msg = dk.coffee();
    System.out.println(msg);

  }

}
