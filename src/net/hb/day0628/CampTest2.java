  package net.hb.day0628;

  import java.util.Scanner;
  
  public class CampTest2 {
    
    static boolean[] camp = new boolean[5];
    static Scanner sc = new Scanner(System.in);
    static int sel=9, num=0;
    

    
    

     public static void main(String[] args) {
       CampTest2 ct = new CampTest2();
         System.out.println("1차원배열 캠프예매 28일 월요일 ");

         int sel=9, num=0;
         
         ct.printAll();

        while(true) {
           try {
             switch(sel) {
               case 1: ct.input(); break;
               case 2: ct.output(); break;
               case 3: ct.printAll(); break;
               default: 
                  System.out.println("1~3메뉴를 선택하셔야 합니다");
                  break;   
             }
           }catch (Exception e) {   }
        }
       }

    
    //==============================================================================
     
  

     
     public int menu() {
       int sel = 9;
       System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
       sel = Integer.parseInt(sc.nextLine());
       return sel;
     }
     
     public void  input() {
       camp[0] = true;
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
     public void  output() {
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
     public void printAll() {
       for(int i=0; i<camp.length; i++) {
         if(camp[i]==true) {
           System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
         }else {
           System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
         }
       }
       
     }
     public void  myExit() {
  if(sel==9) {
    System.out.println("캠프장예약프로그램을 종료합니다");
       System.exit(0); }
     }
  }
     //class END
