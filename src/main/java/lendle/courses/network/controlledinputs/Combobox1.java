/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.controlledinputs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class Combobox1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        //create JComboBox and add 0~99 to the combobox
        JComboBox<String> combox = new JComboBox<String>();
        for(int i=0 ; i<=99 ; i++){
            combox.addItem(""+i);
        }
        frame.add(combox);
        ///////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
