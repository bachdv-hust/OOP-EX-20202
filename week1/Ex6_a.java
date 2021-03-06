import javax.swing.*;
public class Ex6_a {
    public static void main(String[] args) {
        String a, b;
        String c = "Slove the equation : ax + b = 0";
        JOptionPane.showMessageDialog(null, c);
        a = JOptionPane.showInputDialog(null, "Please input a :  ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Please input b :", "Input b", JOptionPane.INFORMATION_MESSAGE);
        if (Double.parseDouble(a) == 0) {
            if (Double.parseDouble(b) == 0)
                JOptionPane.showMessageDialog(null, "The equation has countless solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "the equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double x = -(Double.parseDouble(b)) / Double.parseDouble(a);
            JOptionPane.showMessageDialog(null, "The equation has 1 solution : x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
        }


    }


}
