package net.hb.day0706;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "";

        System.out.print("사번입력>>>");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("이름입력>>>");
        String b = sc.nextLine();

        System.out.print("부서입력>>>");
        String c = sc.nextLine();

        msg = "insert into insa(sabun,name,buse) valvues(" + a + ", "+ "'"+ b +"'" +", "+ "'"+c+"'" +")" ;
        System.out.println(msg);

     }
    }
