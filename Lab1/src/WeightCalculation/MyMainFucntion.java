package WeightCalculation;

import javax.swing.JTable;

public class MyMainFucntion {

    public static void main(String[] args) {

        ThreeTierArchitectureView MyView = new ThreeTierArchitectureView();

        ThreeTierArchitecutreModel MyModel = new ThreeTierArchitecutreModel();

        ThreeTierArcituectureController MyController = new ThreeTierArcituectureController(MyView,MyModel);

        MyView.setVisible(true);
        
        
        

    }

}
