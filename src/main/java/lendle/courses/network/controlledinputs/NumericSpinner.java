/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.controlledinputs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class NumericSpinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JSpinner spinner=new JSpinner();
        //create a SpinnerNumberModel
        SpinnerNumberModel model = new SpinnerNumberModel();
        model.setMaximum(100.);
        model.setMinimum(0.);
        model.setValue(50.0);
        model.setStepSize(0.5);
        spinner.setModel(model);
        ///////////////////////////////////////////////////
        frame.add(spinner);
        
        frame.setVisible(true);
    }
    
}
