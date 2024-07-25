package Week14_GUI;

import java.awt.*;
import java.awt.event.*;
import java.text.Normalizer.Form;
import javax.swing.JFrame;
import javax.swing.JTextField;  

public class ShowColors extends Frame implements ActionListener {
   final TextField  tu, tpw;  
   public ShowColors() {
  
      // creating a Frame  
      Frame f = new Frame();  
      f.setSize(400,400);  
      f.setTitle("Employee Login");   
      f.setLayout(null);  
      this.setSize(400,400);  
      this.setTitle("Colors");   
      this.setLayout(null);  
   

      Label lu = new Label("Username");   
      tu = new TextField(); 
      Label lpw = new Label("Password");   
      tpw = new TextField();  
      Button b = new Button("Submit");  
      Button bClose = new Button("Close");  
      Button bClose2 = new Button("Close");  
      bClose.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            System.exit(0);
         }
      });
      bClose2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            System.exit(0);
         }
      });
      Button bShowColors = new Button("Show Colors");  
      bShowColors.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            setVisible(true);
         }
      });
  
      // setting position of above components in the frame  
      lu.setBounds(20, 80, 80, 30);  
      tu.setBounds(20, 110, 180, 30);  
      lpw.setBounds(20, 130, 80, 30);  
      tpw.setBounds(20, 160, 180, 30);  
      b.setBounds(100, 200, 80, 30); 
      bClose.setBounds(100,250, 80, 30); 
      bClose2.setBounds(100,250, 80, 30); 
      bShowColors.setBounds(100,300, 80, 30); 
      // adding components into frame    
      f.add(b);  
      f.add(lu);  
      f.add(tu);  
      f.add(lpw);  
      f.add(tpw); 
      f.add(bClose);
      f.add(bShowColors);
      this.add(bClose2);
      b.addActionListener(this);
      
      setSize(400,400);
      // setting visibility of frame  
      f.setVisible(true);  
   
   }
    public void actionPerformed(ActionEvent e){  
        String UN = tu.getText();
        String PW = tpw.getText();
        if (UN.equals("a@b.com") && PW.equals("test")) {  //if authentic, navigate user to a new page  
                    
    //create instance of the NewPage  
    Frame page = new Frame();  
        page.setSize(400,400);
    //make page visible to the user  
        page.setVisible(true);  
            
        //create a welcome label and set it to the new page  
        Label wel_label = new Label("Welcome: "+UN);  
        page.add(wel_label);
    }  
    else{  
    //show error message  
        System.out.println("Please enter valid username and password");  
    }  
        
    }  

    public void paint( Graphics g ) {
    Color c = Color.yellow;
        g.setColor( c );
        g.fillOval(25, 50, 100, 100);
        c = Color.black;
        g.setColor( c );
        g.drawOval(50, 70, 20, 25);
        g.drawOval(80, 70, 20, 25);
        g.drawArc(40, 70, 70,60,0,-180);
        g.drawArc(41, 70, 70,60,0,-180);
        g.drawArc(42, 70, 70,60,0,-180);


        g.setColor( new Color( 255, 0, 0 ) );
        g.drawString( "Current RGB: " + g.getColor(), 150, 65 );
        // set new drawing color using floats
    }   
    public static void main( String args[] )  {
    ShowColors app = new ShowColors();

    }
}
