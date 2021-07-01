package net.hb.day0628;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Memo extends Frame implements WindowListener, ActionListener{
  private Button btnExit = new Button("exit");
  private Button btnSend = new Button("send");
  private TextField tf = new TextField(30);//한줄 입력
  private TextArea ta = new TextArea();//가로row*세로column
  private Font ff = new Font("consolas/", Font.BOLD, 20);
  private Panel pan = new Panel(); // 레이아웃 받침대 = 쟁반역할
  
  public Memo() {
    //초간단 메모장
    
    pan.add(tf); pan.add(btnSend); pan.add(btnExit);
    
    ta.setFont(ff);
    this.add("Center", ta);
    this.add("East", pan); // pan=Panel판넬
    
    //이벤트 연결 리스너 추가
    this.addWindowListener(this); // 앞 this 뒤 this
    tf.addActionListener(this);
    btnSend.addActionListener(this);
    btnExit.addActionListener(this);
    
    //프레임의 메소드값 변경
    ta.setBackground(Color.CYAN);
    this.setSize(400, 500);
    this.setLocation(200, 200);
    this.setTitle("초간단메모장");
    this.setVisible(true);
  }//e
  
   
  
  @Override
  public void windowClosing(WindowEvent e) {
    myExit();
  }

  @Override
  public void windowOpened(WindowEvent e) {
  }


  @Override
  public void windowClosed(WindowEvent e) {
  }

  @Override
  public void windowIconified(WindowEvent e) {
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
  }

  @Override
  public void windowActivated(WindowEvent e) {
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    //버튼 클릭, 이미지 클릭, 입력란 enter
    if(ae.getSource()==tf) { //tf 한줄 입력란
      myText();
  }else if(ae.getSource()==btnSend) {
    myText();
  }else if(ae.getSource()==btnExit) {
    myExit();
  } else { }
  }//e
  
  public void myText() {
    //첫번째 tf입력란 데이터 가져오기
    //두번째 tf내용을 ta에 추가 후 tf내용 삭제, tf입력란에 초점
    String data = tf.getText();
    ta.append(data+"\n");
    tf.setText("");
    tf.requestFocus();
    
  }//e
  
  public void myExit() {
    System.out.println("초간단 메모장 프로그램을 종료합니다.");
    System.exit(0);
    
  }
  public static void main(String[] args) {
    Memo pad = new Memo();//생성자호출
//   pad.windowClosing(null);//에러는 아님. 단점
  }//e

}//C end
