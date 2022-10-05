/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable
{
    Thread t;
    Splash()
    {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730,550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        int x=1;
        setVisible(true);
        for(int i=2;i<600;i+=4,x+=1)
        {
            setSize(i + x,i);
            setLocation(700 - ((i+x)/2),100 - (1/2));
            try{
                Thread.sleep(5);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        t = new Thread(this);
        t.start();
        setVisible(true);
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
            
    public static void main(String args[])
    {
        new Splash();
    }
}
