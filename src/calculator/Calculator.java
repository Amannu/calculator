/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author STUDENT
 */
public class Calculator {

    public static void main(String[] args) {
        
        View view = new View();
        Model model = new Model();
        new Controller(view, model);
        view.setVisible(true);

    }

}
