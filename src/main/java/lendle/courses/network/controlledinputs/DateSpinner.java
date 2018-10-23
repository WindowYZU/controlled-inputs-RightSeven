/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.controlledinputs;

import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class DateSpinner {

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
        //create a SpinnerDateModel
        SpinnerDateModel model = new SpinnerDateModel();
        model.setCalendarField(Calendar.DATE);
        spinner.setModel(model);
        ///////////////////////////////////////////////////
        frame.add(spinner);
        
        frame.setVisible(true);
    }
    
}
