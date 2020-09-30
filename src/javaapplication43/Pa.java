package javaapplication43;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Pa extends JPanel implements ActionListener ,KeyListener{
 int b1=0;int b2=0;int bb1=5;int bb2=5 ,n1=100,n2=100;
  Timer tt=new Timer(100,this);
  JButton b=new JButton("set calar");
  public Pa(){
this.add(b);
b.addActionListener(this);
      addKeyListener(this);
      setFocusable(true);
      setFocusTraversalKeysEnabled(true);
}
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);  
      tt.start();
grphcs.setColor(Color.yellow);
      grphcs.draw3DRect( 100, 100, 230, 350, true);
grphcs.setColor(Color.white);
      grphcs.fill3DRect(150, 150, 40,70 , true);
       grphcs.fill3DRect(220, 150, 40,70 , true);
       grphcs.fill3DRect(150, 280, 40,70 , true);
       grphcs.fill3DRect(220, 280, 40,70 , true);
        grphcs.fill3DRect(180, 370, 40,70 , true);
       grphcs.fillOval(b1, b2, 90,90 ); 
       grphcs.setColor(Color.red);

        grphcs.fillOval(n1, n2, 90, 90);
}
    @Override
    public void actionPerformed(ActionEvent ae) {
         
        if(ae.getSource()==b){
         JColorChooser c=new JColorChooser();
   Color vv=c.showDialog(null,"vhoose color" , Color.yellow);
   this.setBackground(vv);
        }
        if(b1<0||b1>this.getWidth()){
            
        bb1=-bb1;
        }
        else if(b2<0||b2>this.getHeight()){
                bb2=-bb2;
                
                }
       b1+=bb1;
       b2+=bb2;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int s=ke.getKeyCode();
        switch(s){
            case KeyEvent.VK_UP:
            {
            n2-=5;
            }
                break;
            case KeyEvent.VK_DOWN:
            {
            n2+=5;
            }
        break;
         case KeyEvent.VK_RIGHT:
            {
            n1+=5;
            }
                break;
            case KeyEvent.VK_LEFT:
            {
            n1-=5;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




