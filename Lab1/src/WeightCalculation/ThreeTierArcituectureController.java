package WeightCalculation;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

public class ThreeTierArcituectureController {

    private ThreeTierArchitectureView theView;

    private ThreeTierArchitecutreModel theModel;

     

    public ThreeTierArcituectureController(ThreeTierArchitectureView theView, ThreeTierArchitecutreModel theModel) {

        this.theView = theView;

        this.theModel = theModel;

         



        this.theView.addCalculateListener(new CalculateListener());

    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            // Surround interactions with the view with

            try{

             
                firstNumber = theView.getFirstNumber();

           

                theModel.addTwoNumbers(firstNumber, secondNumber);

                 

                theView.setCalcSolution(theModel.getCalculationValue());

             

            }

 

            catch(NumberFormatException ex){

                System.out.println(ex);

                 

              


                 

            }

             

        }

         

    }

     

}