import javax.swing.JOptionPane;

public class main{
    public static void main(String []args){
        String name=JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"your "+age+" years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null,"your height is"+height+" cm tail");
        
        

    }
}