import javax.swing.*;
public class Ex6_c {
    public static void main(String[] args) {
        String a, b, c;
        String content = "Slove the equation : ax^2 + bx +c = 0";
        JOptionPane.showMessageDialog(null, content);
        a = JOptionPane.showInputDialog(null, "Please input a :  ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Please input a :  ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        c = JOptionPane.showInputDialog(null, "Please input a :  ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        double d = Double.parseDouble(a);
        double e = Double.parseDouble(b);
        double f = Double.parseDouble(c);
        if (d == 0) {
            if (e == 0) {
                if (f == 0) {
                    JOptionPane.showMessageDialog(null, "The equation has countless solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "The equation has 1 solution x = " + (-f / e), "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double denta = e * e - 4 * d * f;
            if (denta < 0) {
                JOptionPane.showMessageDialog(null, "The equation has no solutions ");
            } else if (denta > 0) {
                double x1 = (-e - Math.sqrt(denta)) / (2 * d);
                double x2 = (-e + Math.sqrt(denta)) / (2 * d);
                JOptionPane.showMessageDialog(null, "The equation has 2 solutions : x1 = "  + x1 + "; x2 = " + x2 + ";", "Result", JOptionPane.INFORMATION_MESSAGE);
            }else{
                double x = (-e)/(2 * d);
                JOptionPane.showMessageDialog(null, "The equation has 1 solution : x = "  + x, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}
