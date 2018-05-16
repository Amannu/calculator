/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.*; 






public class View extends JFrame {

    private JTextField fn = new JTextField(5);
    private JLabel sign = new JLabel("+");
    private JTextField sn = new JTextField(5);
    private static JButton calc = new JButton("Claculation");
    private JTextField sol = new JTextField(5);

    public View() {
        JPanel jp = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        jp.add(fn);
        jp.add(sign);
        jp.add(sn);
        jp.add(calc);
        jp.add(sol);
        this.add(jp);
    }

    public int getFirstnu() {
        return Integer.parseInt(fn.getText());
    }

    public int getSectnu() {
        return Integer.parseInt(sn.getText());
    }

    public void setSolu(int solution) {
        sol.setText(Integer.toString(solution));
    }

    public static void addClaculationListner(ActionListener forButton) {
        calc.addActionListener(forButton);
    }

    public void displayerror(String error) {
        JOptionPane.showMessageDialog(this, error);
    }
}
