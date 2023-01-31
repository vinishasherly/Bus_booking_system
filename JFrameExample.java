/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;



    
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
*/
public class JFrameExample {  
    public static void main(String s[]) {  
        int isb42=30,isb42A=30,isb42C=30,isb42F=30,isb4=30,isb48A=30;
        int isb4273=30,isb42A73=30,isb42C73=30,isb42F73=30,isb473=30,isb48A73=30;
        int isb4211=30,isb42A11=30,isb42C11=30,isb42F11=30,isb411=30,isb48A11=30;
    
        
        sub ub=new sub(isb42,isb42A,isb42C,isb42F,isb4,isb48A,isb4273,isb42A73,isb42C73,isb42F73,isb473,isb48A73,isb4273,isb42A73,isb42C73,isb42F73,isb473,isb48A73);//sub su=new sub();
    }  
}
class sub extends JFrameExample implements ActionListener{
    JFrame f;
    JPanel jp;
    JLabel head1;
    JButton book,seat,exit;
    int ib42,ib42A,ib42C,ib42F,ib4,ib48A;
    int ib4273,ib42A73,ib42C73,ib42F73,ib473,ib48A73,ib4211,ib42A11,ib42C11,ib42F11,ib411,ib48A11;
    sub(int isb42,int isb42A,int isb42C,int isb42F,int isb4,int isb48A,int isb4273,int isb42A73,int isb42C73,int isb42F73,int isb473,int isb48A73,int isb4211,int isb42A11,int isb42C11,int isb42F11,int isb411,int isb48A11){
        this.ib42=isb42;this.ib42A=isb42A;this.ib42C=isb42C;this.ib42F=isb42F;this.ib4=isb4;this.ib48A=isb48A;this.ib4273=isb4273;this.ib42A73=isb42A73;this.ib42C73=isb42C73;this.ib42F73=isb42F73;this.ib473=isb473;this.ib48A73=isb48A73;this.ib4211=isb4211;this.ib42A11=isb42A11;this.ib42C11=isb42C11;this.ib42F11=isb42F11;this.ib411=isb411;this.ib48A11=isb48A11;
       
        f = new JFrame("BUS BOOKING");  
        jp = new JPanel();
        jp.setBackground(new Color(204,0,153));
        jp.setBounds(10,10,100,100);
        head1=new JLabel("WELCOME");
        head1.setFont(new Font("WELCOME",Font.BOLD,17));
        head1.setForeground(Color.cyan);
        head1.setBounds(100,50,250,100);
        book = new JButton("BUS BOOKING"); 
        book.setFont(new Font("BOOKING",Font.BOLD,17));
        book.setBounds(100,70,250,100);
        seat=new JButton("SEAT AVAILABILITY");
        seat.setFont(new Font("SEAT",Font.BOLD,17));
        seat.setBounds(100,200,250,100);
        exit=new JButton("EXIT");
        exit.setFont(new Font("EXIT",Font.BOLD,17));
        exit.setBounds(100,320,250,100);     
        jp.add(head1);
        f.add(book); 
        f.add(seat);
        f.add(exit);
        f.add(jp);
        book.addActionListener(this);
        seat.addActionListener(this);
        exit.addActionListener(this);
        f.setSize(500, 500);  
        f.setLocationRelativeTo(null);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setVisible(true);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit){            
            f.dispose();
        }
        if(e.getSource()==book){
            booking ba=new booking(ib42,ib42A,ib42C,ib42F,ib4,ib48A,ib4273,ib42A73,ib42C73,ib42F73,ib473,ib48A73,ib4211,ib42A11,ib42C11,ib42F11,ib411,ib48A11); 
        }
        if(e.getSource()==seat){
            
            seatavail sa1=new seatavail(ib42,ib42A,ib42C,ib42F,ib4,ib48A,ib4273,ib42A73,ib42C73,ib42F73,ib473,ib48A73,ib4211,ib42A11,ib42C11,ib42F11,ib411,ib48A11);//seatavail sa=new seatavail();
        }
    }    
}
class booking extends JFrame implements ActionListener{
    JFrame jf2;
    JPanel jp;
    JLabel head2,bno,btime,date;
    JButton seat,book;
    JRadioButton jr7,jr73,jr11;
    JComboBox jcb,jdc;
    ButtonGroup g;
    String[] cb={ "42(Periar-idayapatti)", "42A(Periar-Kalimangalam)", "42C(Periar-Ilamanoor)", "42F(Periar-Aandarkottaram)", "4(Arappalayam-Viranganur ring road)", "48A(Periyar bus stand-Thirumangalam)" };
    String[] d={"1.12.21","2.12.21","3.12.21","4.12.21","5.12.21","6.12.21","7.12.21","8.12.21","9.12.21","10.12.21","11.12.21","12.12.21","13.12.21","14.12.21","15.12.21","16.12.21","17.12.21","18.12.21","19.12.21","20.12.21","21.12.21","22.12.21","23.12.21","24.12.21","25.12.21","26.12.21","27.12.21","28.12.21","29.12.21","30.12.21","31.12.21"};
    String time,route,dach;
    int bb42,bb42A,bb42C,bb42F,bb4,bb48A,bb4273,bb42A73,bb42C73,bb42F73,bb473,bb48A73,bb4211,bb42A11,bb42C11,bb42F11,bb411,bb48A11;
    booking(int ib42,int ib42A,int ib42C,int ib42F,int ib4,int ib48A,int ib4273,int ib42A73,int ib42C73,int ib42F73,int ib473,int ib48A73,int ib4211,int ib42A11,int ib42C11,int ib42F11,int ib411,int ib48A11){
        this.bb42=ib42;this.bb42A=ib42A;this.bb42C=ib42C;this.bb42F=ib42F;this.bb4=ib4;this.bb48A=ib48A;this.bb4273=ib4273;this.bb42A73=ib42A73;this.bb42C73=ib42C73;this.bb42F73=ib42F73;this.bb473=ib473;this.bb48A73=ib48A73;this.bb4211=ib4211;this.bb42A11=ib42A11;this.bb42C11=ib42C11;this.bb42F11=ib42F11;this.bb411=ib411;this.bb48A11=ib48A11;
        jf2 = new JFrame("BUS BOOKING");  
        jp = new JPanel();
        jp.setSize(500, 500);
        jp.setBackground(new Color(204,0,153));
        head2=new JLabel("BUS BOOKING");
        head2.setFont(new Font("BOOK",Font.BOLD,17));
        head2.setForeground(Color.cyan);
        head2.setBounds(100,50,250,100);
        bno=new JLabel("BUS NUMBER");
        bno.setFont(new Font("BUS NO",Font.BOLD,17));
        bno.setForeground(Color.cyan);
        bno.setBounds(20,100,250,100);
        btime=new JLabel("BUS TIME");
        btime.setFont(new Font("BUS TIME",Font.BOLD,17));
        btime.setForeground(Color.cyan);
        btime.setBounds(20,150,250,100);
        date=new JLabel("DATE");
        date.setFont(new Font("DATE",Font.BOLD,17));
        date.setForeground(Color.cyan);
        date.setBounds(20,200,250,100);
        seat=new JButton("CLICK HERE TO VIEW SEAT AVAILABILITY");
        seat.setFont(new Font("SEAT",Font.BOLD,17));
        seat.setBounds(25,70,400,50);
        book=new JButton("BOOK NOW");
        book.setFont(new Font("book",Font.BOLD,17));
        book.setBounds(150,300,200,50);
        jr7=new JRadioButton("7:00");
        jr7.setBounds(150,189,70,20);
        jr7.setBackground(new Color(204,0,153));
        jr7.setForeground(Color.cyan);
        jr73=new JRadioButton("7:30");
        jr73.setBounds(250,189,70,20);
        jr73.setBackground(new Color(204,0,153));
        jr73.setForeground(Color.cyan);
        jr11=new JRadioButton("11:00");
        jr11.setBounds(350,189,70,20);
        jr11.setBackground(new Color(204,0,153));
        jr11.setForeground(Color.cyan);
        g=new ButtonGroup();
        jcb=new JComboBox(cb);
        jcb.setBounds(150,145,300,20);
        jdc=new JComboBox(d);
        jdc.setBounds(150,240,300,20);
        g.add(jr7);
        g.add(jr73);
        g.add(jr11);
        jf2.add(jcb);
        jf2.add(jdc);
        jf2.add(jr7);
        jf2.add(jr73);
        jf2.add(jr11);
        jp.add(head2);
        jf2.add(bno);
        jf2.add(btime);
        jf2.add(date);
        jf2.add(seat);
        jf2.add(book);
        jf2.add(jp);
        seat.addActionListener(this);
        jr7.addActionListener(this);
        jr73.addActionListener(this);
        jr11.addActionListener(this);
        jcb.addActionListener(this);
        jdc.addActionListener(this);
        book.addActionListener(this);
        jf2.setSize(500, 500);  
        jf2.setLocationRelativeTo(null);  
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        jf2.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==jr7){
            time="7";
        }
        if(e.getSource()==jr73){
            time="7:30";
        }
        if(e.getSource()==jr11){
            time="11";
        }
        if(e.getSource()==jcb){
            route=(String) jcb.getSelectedItem();
        }
        if(e.getSource()==jdc){
            dach=(String) jdc.getSelectedItem();
        }
        if(e.getSource()==book){
            if(route=="42(Periar-idayapatti)"){
                if(time=="7"){
                    bb42--;
                }else if(time=="7:30"){
                    bb4273--;
                }else if(time=="11"){
                    bb4211--;
                }
            
            }
            else if(route=="42A(Periar-Kalimangalam)"){
                if(time=="7"){
                    bb42A--;
                }else if(time=="7:30"){
                    bb42A73--;
                }else if(time=="11"){
                    bb42A11--;
                }
            
            }
            else if(route=="42C(Periar-Ilamanoor)"){
                if(time=="7"){
                    bb42C--;
                }else if(time=="7:30"){
                    bb42C73--;
                }else if(time=="11"){
                    bb42C11--;
                }
            
            }
            else if(route=="42F(Periar-Aandarkottaram)"){
                if(time=="7"){
                    bb42F--;
                }else if(time=="7:30"){
                    bb42F73--;
                }else if(time=="11"){
                    bb42F11--;
                }
            
            }
            else if(route=="4(Arappalayam-Viranganur ring road)"){
                if(time=="7"){
                    bb4--;
                }else if(time=="7:30"){
                    bb473--;
                }else if(time=="11"){
                    bb411--;
                }
            
            }
            else if(route=="48A(Periyar bus stand-Thirumangalam)"){
                if(time=="7"){
                    bb48A--;
                }else if(time=="7:30"){
                    bb48A73--;
                }else if(time=="11"){
                    bb48A11--;
                }
            
            }
        new info(bb42,bb42A,bb42C,bb42F,bb4,bb48A,bb4273,bb42A73,bb42C73,bb42F73,bb473,bb48A73,bb4211,bb42A11,bb42C11,bb42F11,bb411,bb48A11);

        }
        if(e.getSource()==seat){
            if(route=="42(Periar-idayapatti)"){
                if(time=="7"){
                    bb42--;
                }else if(time=="7:30"){
                    bb4273--;
                }else if(time=="11"){
                    bb4211--;
                }
            
            }
            else if(route=="42A(Periar-Kalimangalam)"){
                if(time=="7"){
                    bb42A--;
                }else if(time=="7:30"){
                    bb42A73--;
                }else if(time=="11"){
                    bb42A11--;
                }
            
            }
            else if(route=="42C(Periar-Ilamanoor)"){
                if(time=="7"){
                    bb42C--;
                }else if(time=="7:30"){
                    bb42C73--;
                }else if(time=="11"){
                    bb42C11--;
                }
            
            }
            else if(route=="42F(Periar-Aandarkottaram)"){
                if(time=="7"){
                    bb42F--;
                }else if(time=="7:30"){
                    bb42F73--;
                }else if(time=="11"){
                    bb42F11--;
                }
            
            }
            else if(route=="4(Arappalayam-Viranganur ring road)"){
                if(time=="7"){
                    bb4--;
                }else if(time=="7:30"){
                    bb473--;
                }else if(time=="11"){
                    bb411--;
                }
            
            }
            else if(route=="48A(Periyar bus stand-Thirumangalam)"){
                if(time=="7"){
                    bb48A--;
                }else if(time=="7:30"){
                    bb48A73--;
                }else if(time=="11"){
                    bb48A11--;
                }
            
            }
            new seatavail(bb42,bb42A,bb42C,bb42F,bb4,bb48A,bb4273,bb42A73,bb42C73,bb42F73,bb473,bb48A73,bb4211,bb42A11,bb42C11,bb42F11,bb411,bb48A11);
            System.out.println(bb42);
        }
        
    }
}
class seatavail extends JFrame implements ActionListener{
    JFrame jf3;
    JPanel jp;
    JLabel b42,b42A,b42C,b42F,b4,b48A,t7,t73,t11,sb42,sb42A,sb42C,sb42F,sb4,sb48A,sb4273,sb42A73,sb42C73,sb42F73,sb473,sb48A73,sb4211,sb42A11,sb42C11,sb42F11,sb411,sb48A11;
    JButton ok;
    int tb42, tb42A, tb42C, tb42F, tb4, tb48A,tb4273, tb42A73, tb42C73, tb42F73, tb473, tb48A73,tb4211, tb42A11, tb42C11, tb42F11, tb411, tb48A11;
   
    seatavail(int ib42,int ib42A,int ib42C,int ib42F,int ib4,int ib48A,int ib4273,int ib42A73,int ib42C73,int ib42F73,int ib473,int ib48A73,int ib4211,int ib42A11,int ib42C11,int ib42F11,int ib411,int ib48A11){
        this.tb42=ib42; this.tb42A=ib42A; this.tb42C=ib42C; this.tb42F=ib42F; this.tb4=ib4; this.tb48A=ib48A;this.tb4273=ib4273; this.tb42A73=ib42A73; this.tb42C73=ib42C73; this.tb42F73=ib42F73; this.tb473=ib473; this.tb48A73=ib48A73;this.tb4211=ib4211; this.tb42A11=ib42A11; this.tb42C11=ib42C11; this.tb42F11=ib42F11; this.tb411=ib411; this.tb48A11=ib48A11;
        String sisb42=Integer.toString(tb42);
        String sisb42A=Integer.toString(tb42A);
        String sisb42C=Integer.toString(tb42C);
        String sisb42F=Integer.toString(tb42F);
        String sisb4=Integer.toString(tb4);
        String sisb48A=Integer.toString(tb48A);
        String sisb4273=Integer.toString(tb4273);
        String sisb42A73=Integer.toString(tb42A73);
        String sisb42C73=Integer.toString(tb42C73);
        String sisb42F73=Integer.toString(tb42F73);
        String sisb473=Integer.toString(tb473);
        String sisb48A73=Integer.toString(tb48A73);
        String sisb4211=Integer.toString(tb4211);
        String sisb42A11=Integer.toString(tb42A11);
        String sisb42C11=Integer.toString(tb42C11);
        String sisb42F11=Integer.toString(tb42F11);
        String sisb411=Integer.toString(tb411);
        String sisb48A11=Integer.toString(tb48A11);
        jf3 = new JFrame("SEAT AVAILABILITY");  
        jp = new JPanel();
        jp.setSize(500, 500);
        jp.setBackground(new Color(204,0,153));
        b42=new JLabel("42(Periar-idayapatti)");
        b42.setFont(new Font("42",Font.BOLD,17));
        b42.setForeground(Color.cyan);
        b42.setBounds(20,50,250,100);
        b42A=new JLabel("42A(Periar-Kalimangalam");
        b42A.setFont(new Font("42A",Font.BOLD,17));
        b42A.setForeground(Color.cyan);
        b42A.setBounds(20,100,260,100);
        b42C=new JLabel("42C(Periar-Ilamanoor)");
        b42C.setFont(new Font("42C",Font.BOLD,17));
        b42C.setForeground(Color.cyan);
        b42C.setBounds(20,150,250,100);
        b42F=new JLabel("42C(Periar-Ilamanoor)");
        b42F.setFont(new Font("42C",Font.BOLD,17));
        b42F.setForeground(Color.cyan);
        b42F.setBounds(20,200,250,100);
        b4=new JLabel("42C(Periar-Ilamanoor)");
        b4.setFont(new Font("42C",Font.BOLD,17));
        b4.setForeground(Color.cyan);
        b4.setBounds(20,250,250,100);
        b48A=new JLabel("42C(Periar-Ilamanoor)");
        b48A.setFont(new Font("42C",Font.BOLD,17));
        b48A.setForeground(Color.cyan);
        b48A.setBounds(20,300,250,100);
        t7=new JLabel("7:00");
        t7.setFont(new Font("7",Font.BOLD,17));
        t7.setForeground(Color.cyan);
        t7.setBounds(250,20,250,100);
        t73=new JLabel("7:30");
        t73.setFont(new Font("73",Font.BOLD,17));
        t73.setForeground(Color.cyan);
        t73.setBounds(350,20,250,100);
        t11=new JLabel("11:00");
        t11.setFont(new Font("11",Font.BOLD,17));
        t11.setForeground(Color.cyan);
        t11.setBounds(450,20,250,100);
        ok=new JButton("OK");
        ok.setFont(new Font("ok",Font.BOLD,17));
        ok.setBounds(170,400,80,80);
        sb42=new JLabel(sisb42);
        sb42.setFont(new Font("sisb42",Font.BOLD,17));
        sb42.setForeground(Color.cyan);
        sb42.setBounds(250,50,250,100);
        sb42A=new JLabel(sisb42A);
        sb42A.setFont(new Font("11",Font.BOLD,17));
        sb42A.setForeground(Color.cyan);
        sb42A.setBounds(250,100,250,100);
        sb42C=new JLabel(sisb42C);
        sb42C.setFont(new Font("11",Font.BOLD,17));
        sb42C.setForeground(Color.cyan);
        sb42C.setBounds(250,150,250,100);
        sb42F=new JLabel(sisb42F);
        sb42F.setFont(new Font("11",Font.BOLD,17));
        sb42F.setForeground(Color.cyan);
        sb42F.setBounds(250,200,250,100);
        sb4=new JLabel(sisb4);
        sb4.setFont(new Font("11",Font.BOLD,17));
        sb4.setForeground(Color.cyan);
        sb4.setBounds(250,250,250,100);
        sb48A=new JLabel(sisb48A);
        sb48A.setFont(new Font("11",Font.BOLD,17));
        sb48A.setForeground(Color.cyan);
        sb48A.setBounds(250,300,250,100);
        sb4273=new JLabel(sisb4273);
        sb4273.setFont(new Font("sisb42",Font.BOLD,17));
        sb4273.setForeground(Color.cyan);
        sb4273.setBounds(350,50,250,100);
        sb42A73=new JLabel(sisb42A73);
        sb42A73.setFont(new Font("11",Font.BOLD,17));
        sb42A73.setForeground(Color.cyan);
        sb42A73.setBounds(350,100,250,100);
        sb42C73=new JLabel(sisb42C73);
        sb42C73.setFont(new Font("11",Font.BOLD,17));
        sb42C73.setForeground(Color.cyan);
        sb42C73.setBounds(350,150,250,100);
        sb42F73=new JLabel(sisb42F73);
        sb42F73.setFont(new Font("11",Font.BOLD,17));
        sb42F73.setForeground(Color.cyan);
        sb42F73.setBounds(350,200,250,100);
        sb473=new JLabel(sisb473);
        sb473.setFont(new Font("11",Font.BOLD,17));
        sb473.setForeground(Color.cyan);
        sb473.setBounds(350,250,250,100);
        sb48A73=new JLabel(sisb48A73);
        sb48A73.setFont(new Font("11",Font.BOLD,17));
        sb48A73.setForeground(Color.cyan);
        sb48A73.setBounds(350,300,250,100);
        sb4211=new JLabel(sisb4211);
        sb4211.setFont(new Font("sisb42",Font.BOLD,17));
        sb4211.setForeground(Color.cyan);
        sb4211.setBounds(450,50,250,100);
        sb42A11=new JLabel(sisb42A11);
        sb42A11.setFont(new Font("11",Font.BOLD,17));
        sb42A11.setForeground(Color.cyan);
        sb42A11.setBounds(450,100,250,100);
        sb42C11=new JLabel(sisb42C11);
        sb42C11.setFont(new Font("11",Font.BOLD,17));
        sb42C11.setForeground(Color.cyan);
        sb42C11.setBounds(450,150,250,100);
        sb42F11=new JLabel(sisb42F11);
        sb42F11.setFont(new Font("11",Font.BOLD,17));
        sb42F11.setForeground(Color.cyan);
        sb42F11.setBounds(450,200,250,100);
        sb411=new JLabel(sisb411);
        sb411.setFont(new Font("11",Font.BOLD,17));
        sb411.setForeground(Color.cyan);
        sb411.setBounds(450,250,250,100);
        sb48A11=new JLabel(sisb48A11);
        sb48A11.setFont(new Font("11",Font.BOLD,17));
        sb48A11.setForeground(Color.cyan);
        sb48A11.setBounds(450,300,250,100);
        jf3.add(ok);
        jf3.add(b42);
        jf3.add(b42A);
        jf3.add(b42C);
        jf3.add(b42F);
        jf3.add(b4);
        jf3.add(b48A);
        jf3.add(t7);
        jf3.add(t73);
        jf3.add(t11);
        jf3.add(sb42);
        jf3.add(sb42A);
        jf3.add(sb42C);
        jf3.add(sb42F);
        jf3.add(sb4);
        jf3.add(sb48A);
        jf3.add(sb4273);
        jf3.add(sb42A73);
        jf3.add(sb42C73);
        jf3.add(sb42F73);
        jf3.add(sb473);
        jf3.add(sb48A73);
        jf3.add(sb4211);
        jf3.add(sb42A11);
        jf3.add(sb42C11);
        jf3.add(sb42F11);
        jf3.add(sb411);
        jf3.add(sb48A11);
        jf3.add(jp);
        ok.addActionListener(this);
        jf3.setSize(600, 600);  
        jf3.setLocationRelativeTo(null);  
        jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        jf3.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok){            
            new booking(tb42, tb42A, tb42C, tb42F, tb4, tb48A,tb4273, tb42A73, tb42C73, tb42F73, tb473, tb48A73,tb4211, tb42A11, tb42C11, tb42F11, tb411, tb48A11);
        }
    }
}
class info extends JFrame implements ActionListener{
    JPasswordField value;
    JFrame ff;
    JPanel pp;
    JLabel name,gender,ageg,pseat,usern,pass;
    JTextArea na,un;
    JRadioButton male,female,tento14,fifto45,ab45,window,middle;
    ButtonGroup g1,ag,ps;
    JButton submit;
    String gen,preffered,agegr;
    int tb42, tb42A, tb42C, tb42F, tb4, tb48A,tb4273, tb42A73, tb42C73, tb42F73, tb473, tb48A73,tb4211, tb42A11, tb42C11, tb42F11, tb411, tb48A11;
   
    info(int ib42,int ib42A,int ib42C,int ib42F,int ib4,int ib48A,int ib4273,int ib42A73,int ib42C73,int ib42F73,int ib473,int ib48A73,int ib4211,int ib42A11,int ib42C11,int ib42F11,int ib411,int ib48A11){
                this.tb42=ib42; this.tb42A=ib42A; this.tb42C=ib42C; this.tb42F=ib42F; this.tb4=ib4; this.tb48A=ib48A;this.tb4273=ib4273; this.tb42A73=ib42A73; this.tb42C73=ib42C73; this.tb42F73=ib42F73; this.tb473=ib473; this.tb48A73=ib48A73;this.tb4211=ib4211; this.tb42A11=ib42A11; this.tb42C11=ib42C11; this.tb42F11=ib42F11; this.tb411=ib411; this.tb48A11=ib48A11;

        ff=new JFrame("INFORMATION ");
        pp=new JPanel();
        pp.setBackground(new Color(204,0,153));
        name=new JLabel("NAME");
        name.setFont(new Font("N",Font.BOLD,17));
        name.setForeground(Color.cyan);
        name.setBounds(20,50,250,100);
        gender=new JLabel("GENDER");
        gender.setFont(new Font("G",Font.BOLD,17));
        gender.setForeground(Color.cyan);
        gender.setBounds(20,100,250,100);
        ageg=new JLabel("AGE");
        ageg.setFont(new Font("A",Font.BOLD,17));
        ageg.setForeground(Color.cyan);
        ageg.setBounds(20,150,250,100);
        pseat=new JLabel("PREFFEERED SEAT");
        pseat.setFont(new Font("PS",Font.BOLD,17));
        pseat.setForeground(Color.cyan);
        pseat.setBounds(20,200,250,100);
        usern=new JLabel("USER NAME");
        usern.setFont(new Font("UN",Font.BOLD,17));
        usern.setForeground(Color.cyan);
        usern.setBounds(20,250,250,100);
        pass=new JLabel("PASSWORD");
        pass.setFont(new Font("PW",Font.BOLD,17));
        pass.setForeground(Color.cyan);
        pass.setBounds(20,300,250,100);
        na=new JTextArea();
        na.setBounds(200,90,300,20);
        un=new JTextArea();
        un.setBounds(200,290,300,20);
        male=new JRadioButton("MALE");
        male.setBounds(200,140,100,20);
        male.setBackground(new Color(204,0,153));
        male.setForeground(Color.cyan);
        female=new JRadioButton("FEMALE");
        female.setBounds(350,140,100,20);
        female.setBackground(new Color(204,0,153));
        female.setForeground(Color.cyan);
        tento14=new JRadioButton("0-14");
        tento14.setBounds(200,200,80,20);
        tento14.setBackground(new Color(204,0,153));
        tento14.setForeground(Color.cyan);
        fifto45=new JRadioButton("15-45");
        fifto45.setBounds(300,200,80,20);
        fifto45.setBackground(new Color(204,0,153));
        fifto45.setForeground(Color.cyan);
        ab45=new JRadioButton("above 45");
        ab45.setBounds(400,200,80,20);
        ab45.setBackground(new Color(204,0,153));
        ab45.setForeground(Color.cyan);
        window=new JRadioButton("WINDOW");
        window.setBounds(200,240,100,20);
        window.setBackground(new Color(204,0,153));
        window.setForeground(Color.cyan);
        middle=new JRadioButton("MIDDLE");
        middle.setBounds(300,240,100,20);
        middle.setBackground(new Color(204,0,153));
        middle.setForeground(Color.cyan);
        g1=new ButtonGroup();
        ag=new ButtonGroup();
        ps=new ButtonGroup();
        value = new JPasswordField(); 
        value.setBounds(200,340,100,20); 
        submit=new JButton("SUBMIT");
        submit.setFont(new Font("SUB",Font.BOLD,17));
        submit.setBounds(170,400,200,80);
        g1.add(male);
        g1.add(female);
        ag.add(tento14);
        ag.add(fifto45);
        ag.add(ab45);
        ps.add(window);
        ps.add(middle);
        ff.add(value);
        ff.add(tento14);ff.add(fifto45);ff.add(ab45);
        ff.add(window);
        ff.add(middle);
        ff.add(name);
        ff.add(un);
        ff.add(male);
        ff.add(female);
        ff.add(gender);
        ff.add(ageg);
        ff.add(pseat);
        ff.add(usern);
        ff.add(pass);
        ff.add(na);
        ff.add(submit);
        ff.add(pp);
        male.addActionListener(this);
        female.addActionListener(this);
        tento14.addActionListener(this);fifto45.addActionListener(this);ab45.addActionListener(this);window.addActionListener(this);middle.addActionListener(this);
        submit.addActionListener(this);
        ff.setSize(600, 600);  
        ff.setLocationRelativeTo(null);  
        ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        ff.setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name=new String();
       name=un.getText();
       String pass=new String();
       pass=value.getText();
      
       
       String una=na.getText();
        if(e.getSource()==male){
            gen="male";
        }else if(e.getSource()==female){
            gen="female";
        }if(e.getSource()==tento14){
            agegr="0-14";
        }else if(e.getSource()==fifto45){
            agegr="15-45";
        }else if(e.getSource()==ab45){
            agegr="above  45";
        }
        if(e.getSource()=="WINDOW"){
            preffered="WINDOW";
        }else if(e.getSource()=="MIDDLE"){
            preffered="MIDDLE";
        }if(e.getSource()==submit){
            if((name.trim().equals("vini")&&pass.trim().equals("21"))||(name.trim().equals("appeh")&&pass.trim().equals("20"))||(name.trim().equals("yazh")&&pass.trim().equals("24"))||(name.trim().equals("therusha")&&pass.trim().equals("04")))
            {
                dispinfo pd=new dispinfo(una,gen,agegr,tb42, tb42A, tb42C, tb42F, tb4, tb48A,tb4273, tb42A73, tb42C73, tb42F73, tb473, tb48A73,tb4211, tb42A11, tb42C11, tb42F11, tb411, tb48A11);
               
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
class dispinfo extends JFrame implements ActionListener{
    JFrame df;
    JPanel jp;
    
    JLabel name,gender,ageg,pseat,namea,gendera,agega,pseata;
    JButton ok,add;
    String nameal,genderal,agegal,pseatal;
    int tb42, tb42A, tb42C, tb42F, tb4, tb48A,tb4273, tb42A73, tb42C73, tb42F73, tb473, tb48A73,tb4211, tb42A11, tb42C11, tb42F11, tb411, tb48A11;
    dispinfo(String una,String gen,String agegr,int ib42,int ib42A,int ib42C,int ib42F,int ib4,int ib48A,int ib4273,int ib42A73,int ib42C73,int ib42F73,int ib473,int ib48A73,int ib4211,int ib42A11,int ib42C11,int ib42F11,int ib411,int ib48A11){
        this.nameal=una;this.genderal=gen;this.agegal=agegr;
        this.tb42=ib42; this.tb42A=ib42A; this.tb42C=ib42C; this.tb42F=ib42F; this.tb4=ib4; this.tb48A=ib48A;this.tb4273=ib4273; this.tb42A73=ib42A73; this.tb42C73=ib42C73; this.tb42F73=ib42F73; this.tb473=ib473; this.tb48A73=ib48A73;this.tb4211=ib4211; this.tb42A11=ib42A11; this.tb42C11=ib42C11; this.tb42F11=ib42F11; this.tb411=ib411; this.tb48A11=ib48A11;

        df=new JFrame("PRESON DETAILS");
        jp=new JPanel();
        jp.setBackground(new Color(204,0,153));
        name=new JLabel("NAME");
        name.setFont(new Font("N",Font.BOLD,17));
        name.setForeground(Color.cyan);
        name.setBounds(20,50,250,100);
        gender=new JLabel("GENDER");
        gender.setFont(new Font("G",Font.BOLD,17));
        gender.setForeground(Color.cyan);
        gender.setBounds(20,100,250,100);
        ageg=new JLabel("AGE");
        ageg.setFont(new Font("A",Font.BOLD,17));
        ageg.setForeground(Color.cyan);
        ageg.setBounds(20,150,250,100);
        
        namea=new JLabel(nameal);
        namea.setFont(new Font("N",Font.BOLD,17));
        namea.setForeground(Color.cyan);
        namea.setBounds(250,50,250,100);
        gendera=new JLabel(genderal);
        gendera.setFont(new Font("G",Font.BOLD,17));
        gendera.setForeground(Color.cyan);
        gendera.setBounds(250,100,250,100);
        agega=new JLabel(agegal);
        agega.setFont(new Font("A",Font.BOLD,17));
        agega.setForeground(Color.cyan);
        agega.setBounds(250,150,250,100);
        ok=new JButton("OK");
        ok.setFont(new Font("ok",Font.BOLD,17));
        ok.setBounds(20,400,80,80);
        add=new JButton("ADD SEAT");
        add.setFont(new Font("ok",Font.BOLD,17));
        add.setBounds(200,400,300,80);
        df.add(name);
        df.add(gender);
        df.add(ageg);
        df.add(namea);
        df.add(gendera);
        df.add(agega);
        df.add(ok);
        df.add(add);
        df.add(jp);
        ok.addActionListener(this);add.addActionListener(this);
        df.setSize(600, 600);  
        df.setLocationRelativeTo(null);  
        df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        df.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok){
            JOptionPane.showMessageDialog(this,"THANKS!!! HAVE A GREATE DAY!!!");
        }
        else if(e.getSource()==add){
            new seatavail(tb42, tb42A, tb42C, tb42F, tb4, tb48A,tb4273, tb42A73, tb42C73, tb42F73, tb473, tb48A73,tb4211, tb42A11, tb42C11, tb42F11, tb411, tb48A11);
        }
    }
}
