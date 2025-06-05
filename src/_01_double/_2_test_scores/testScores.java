package _01_double._2_test_scores;

import javax.swing.JOptionPane; 

public class testScores {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("enter your test score"); 
        double x = Double.parseDouble(input); 
        if(x>80){
            JOptionPane.showMessageDialog(null, "Good job");
        }else{
            JOptionPane.showMessageDialog(null, "better luck next time. "); 
        }



    }
}
