
package Unit2;
import javax.swing.*;//swing component
import java.awt.*;//awt component
import java.awt.event.*;//for event handling
class SwingControl extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    public void setControl(){
        l1=new JLabel("enter first number");
        l2=new JLabel("enter second number");
        l3=new JLabel("result");
        t1=new JTextField(15);
        t2=new JTextField(15);
        b1=new JButton("sum");
        b2=new JButton("diff");
        //adding component into window(JFrame)
        add(l1);add(t1);add(l2);add(t2);
        add(b1);add(b2);add(l3);
        //adding specification of window
        setVisible(true);//to diaplay window
        setSize(500,500);
        setLayout(new FlowLayout());
        //if window is closed then program is end
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //handling event
         b1.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;
                l3.setText("sum is"+sum);
                } 
             }
        );
        b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int diff=num1-num2;
            l3.setText("diff is"+diff);
        }
           });
    }
}
public class SwingDemo {
    public static void main(String[] args) {
        SwingControl sc=new SwingControl();
        sc.setControl();
        
    }
   
}
