import javax.swing.JButton;
 
import javax.swing.JFrame;

public class NullLayout {

public static void main(String[] args) {

JFrame frame = new JFrame("absolute positioning");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setSize(400,300);

frame.setLayout(null);

JButton btn1 = new JButton("button 1");

JButton btn2 = new JButton("button 2");

frame.add(btn1);

frame.add(btn2);

frame.setVisible(true);


}
}
