

  package net.hb.day0628;

  import java.util.Scanner;
  

  public class CampTest1 {
    
    public CampTest1(String cp) {}

     public static void main(String[] args) {
       boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
       Scanner sc = new Scanner(System.in);
         System.out.println("1차원배열 캠프예매 28일 월요일 ");

         int sel=9, num=0;
         
         list(camp);

        while(true) {
           try {
             System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
             sel = Integer.parseInt(sc.nextLine());
             
              if(sel==9) {
               System.out.println("캠프장예약프로그램을 종료합니디");
               break;
              }
              
             switch(sel) {
               case 1: input(camp, sc); break;
               case 2: output(camp, sc); break;
               case 3: list(camp); break;
               default: 
                  System.out.println("1~3메뉴를 선택하셔야 합니다");
                  break;   
             }
           }catch (Exception e) {   }
        }
        
        sc.close();
       }

     public void list(boolean[] camp) {
      for(int i=0; i<camp.length; i++) {
          if(camp[i]==true) {
            System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
          }else {
            System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
          }
       } //for end
    }

     public void output(boolean[] camp, Scanner sc) {
      int num;
      System.out.print("퇴실캠핑번호 입력>>> ");
      num=Integer.parseInt(sc.nextLine()); //3입력하면 
      
      if(camp[num-1]==false) {
        System.out.println("  "+ (num)+"번째 □캠프장은 비어 있습니다. ");
      }else { 
        System.out.println("  " + (num)+"번째 □캠프 퇴실 되었습니다. ");
        camp[num-1] = false;
        }
      for(int i = 0; i < camp.length; i++) {
        if(camp[i]==true) {
          System.out.println("  " + (i+1)+"번째 ■캠프사용중입니다. ");
        } else {
          System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다."); 
        }
      }
    }

     public void input(boolean[] camp, Scanner sc) {
      int num;
      System.out.print("예약캠핑번호 입력>>> ");
      num=Integer.parseInt(sc.nextLine()); //고객이 5입력
      if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다");}
      
      if(camp[num-1]==true) {
        System.out.println("이미 사용중입니다. ");
      }else { 
        System.out.println("<  " + (num)+"번 캠프장 예약 되었습니다. >");
        System.out.println();
        camp[num-1] = true;
        }
      
      
      for(int i = 0; i < camp.length; i++) {
        if(camp[i]==true) {
          System.out.println("  " + (i+1)+"번째 ■캠프사용중입니다. ");
        } else {
          System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다."); 
        }
      }
    }
     }//class END
