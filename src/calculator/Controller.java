
import calculator.Model;
import calculator.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {

        this.theView = theView;

        this.theModel = theModel;

        theView.addClaculationListner(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            try {

                firstNumber = theView.getFirstnu();

                secondNumber = theView.getSectnu();

                theModel.add(firstNumber, secondNumber);
                theView.setSolu(theModel.getResult());

            } catch (NumberFormatException ex) {

                System.out.println(ex);
                theView.displayerror("You Need to Enter 2 Integers");
            }
        }
    }
}
