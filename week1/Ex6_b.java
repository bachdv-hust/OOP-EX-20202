import javax.swing.*;
public class Ex6_b {
    public static void main(String[] args) {

        String equtation = "Solve the equation :\n ax + by = c \n dx + ey = f";

        String a, b, c, d, e, f;
        JOptionPane.showMessageDialog(null,equtation);
        a = JOptionPane.showInputDialog(null, "Please input a :  ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Please input b :  ", "Input b", JOptionPane.INFORMATION_MESSAGE);
        c = JOptionPane.showInputDialog(null, "Please input c :  ", "Input c", JOptionPane.INFORMATION_MESSAGE);
        d = JOptionPane.showInputDialog(null, "Please input d :  ", "Input d", JOptionPane.INFORMATION_MESSAGE);
        e = JOptionPane.showInputDialog(null, "Please input e :  ", "Input e", JOptionPane.INFORMATION_MESSAGE);
        f = JOptionPane.showInputDialog(null, "Please input f :  ", "Input f", JOptionPane.INFORMATION_MESSAGE);
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        double c1 = Double.parseDouble(c);
        double d1 = Double.parseDouble(d);
        double e1 = Double.parseDouble(e);
        double f1 = Double.parseDouble(f);
        double D = a1 * e1 - b1 * d1;
        double D1 = c1 * e1 - b1 * f1;
        double D2 = a1 * f1 - c1 * d1;
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The equation has countless solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {
            double x = D1 / D;
            double y = D2 / D;
            String str = "Slove the equation : \n" + a + " * x + " + b + " * y = " + c + "\n" + d + " * x + " + e + " * y = " + f;

            JOptionPane.showMessageDialog(null, str + " \nThe equation has 1 solution : x = " + x + "\t y = " + y, "Result", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
