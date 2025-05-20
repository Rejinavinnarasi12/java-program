import javax.swing.*; 
import java.awt.*;
public class swingframe{
public static void main(String[] args){
Frame frm = new Frame("Java awt frame");
Label lb = new Label ("welcome Reji",Label.CENTER);
frm.add(lb);
frm.setSize(400,400);
frm.setVisible(true);
}
}