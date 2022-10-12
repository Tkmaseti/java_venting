import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;


public class hellohelp {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        String surname = JOptionPane.showInputDialog("Enter your surname");
        String how = JOptionPane.showInputDialog("How are you " + name.toLowerCase() + " ?");
        String good = "good";
        if(how.equals(good)){
            String sure = JOptionPane.showInputDialog("Are you sure you are good?");
            if (sure.equals("yes")){
                String checking = JOptionPane.showInputDialog("Okay then have a lovely day " + name + "❤️❤️❤️");
            }
            else if (sure.equals("no")){
                JOptionPane.showMessageDialog(null, "I know life ca be difficult but never give up");
                String talk = JOptionPane.showInputDialog( "Would you like to talk to talk more?");
                if (talk.equals("yes")){
                    String got = JOptionPane.showInputDialog("What got or triggered you? Is it something in the past, something in the from the present");
                    JOptionPane.showMessageDialog(null, got);
                    if (got.equals("past")){
                        JOptionPane.showMessageDialog(null, "past works");
                    }
                    else if (got.equals("present")){
                        JOptionPane.showMessageDialog(null, "present works");
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry I don't understand?");
        }
    }
}