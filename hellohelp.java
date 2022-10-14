import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class hellohelp {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name");
        String surname = JOptionPane.showInputDialog("Enter your surname");
        String how = JOptionPane.showInputDialog("How are you " + name + " ?");
        String idk = "i don't know";
        String[] low = {"good", "sad", "angry"};
        String[] high = {"good", "great", "happy", ""};
        List<String> lowList = new ArrayList<String>(Arrays.asList(low));
        List<String> highList = new ArrayList<String>(Arrays.asList(high));

        
        if(lowList.contains(how) || highList.contains(how)){
            String sure = JOptionPane.showInputDialog("Are you sure you are good?");
            if (sure.equals("yes")){
                JOptionPane.showMessageDialog(null, "Okay then have a lovely day " + name + "❤️❤️❤️");
            }
            else if (sure.equals("no")){

                JOptionPane.showMessageDialog(null, "I know life can be difficult but never give up " + name + " OKAY!!!");
                String talk = JOptionPane.showInputDialog( "Would you like to talk to talk more?");

                if (talk.equals("yes")){

                    String got = JOptionPane.showInputDialog("What got or triggered you? Is it something in the past, something in the from the present");
                    JOptionPane.showMessageDialog(null, got);

                    if (got.equals("past")){
                        JOptionPane.showMessageDialog(null, "I am sorry to hear that " + name);
                        String calm = JOptionPane.showInputDialog(null, "What keeps you calm and comfortable when you experience these emotions or what is your comfortable go to place?");
                    }
                    else if (got.equals("present")){
                        JOptionPane.showMessageDialog(null, "I am sorry to hear that " + name);
                        String calm = JOptionPane.showInputDialog(null, "What keeps you calm and comfortable when you experience these emotions");

                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Sorry I dont understand");
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry I don't understand?");
        }
    }
}