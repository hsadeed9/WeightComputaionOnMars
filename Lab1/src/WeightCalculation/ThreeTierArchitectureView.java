package WeightCalculation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ThreeTierArchitectureView extends JFrame{

    private JTextField EarthWeghtInput  = new JTextField(10);

   

    private JButton MyButton = new JButton("Compute Weight on Mars");
    
    private JLabel TextLabel1 = new JLabel("Enter Weight on Earth:");
    
    private JTextField CalculatedWeightOnMars = new JTextField(10);
    
   
    
int row;
DefaultTableModel dtm;



ArrayList<ThreeTierArchitectureView> earthList;
ArrayList<ThreeTierArchitectureView> MarsWeightList;


    ThreeTierArchitectureView(){
    	
    
    	
      
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 200);
        
        MyButton.addActionListener(new ActionListener(){
        	
       
			public void actionPerformed(ActionEvent e) {
				
ThreeTierArchitectureView data= new ThreeTierArchitectureView();
earthList.add(data)	; //Storing Earth Weight in ArrayList	
data.EarthWeghtInput.getText();
data.CalculatedWeightOnMars.getText();
MarsWeightList.add(data);//Storing Earth Weight in ArrayList


				// TODO Auto-generated method stub
			}
			});
        
calcPanel.add(TextLabel1);
        
        calcPanel.add(EarthWeghtInput);


        calcPanel.add(MyButton);

        calcPanel.add(CalculatedWeightOnMars);
        

        this.add(calcPanel);
       

    }
    

    public int getFirstNumber(){

        return Integer.parseInt(EarthWeghtInput.getText());

    }

         

    
  public int getCalcSolution(){

        return Integer.parseInt(CalculatedWeightOnMars.getText());

    }

    public void setCalcSolution(int solution){

         
        CalculatedWeightOnMars.setText(Integer.toString(solution));

         

    }

    void addCalculateListener(ActionListener ImplementListener){

        MyButton.addActionListener(ImplementListener);

    }

    void displayErrorMessage(String errorMessage){

         

        JOptionPane.showMessageDialog(this, errorMessage);

         

    }
    
   

     

}
