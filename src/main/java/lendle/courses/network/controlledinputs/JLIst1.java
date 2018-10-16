/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.controlledinputs;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class JLIst1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //create JList and add it to a JScrollPane
        JScrollPane scrollPane=new JScrollPane();
        Vector v = new Vector();
        v.add("a");
        v.add(100);
        JList list = new JList(v);
        
        //////////////////////////////////////////
        list.setCellRenderer(new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel la = new JLabel();
                if(value instanceof String || value instanceof Integer){
                    la.setText(""+value);
                }else
                    la.setText(""+value.hashCode());
                
                if(isSelected){
                    la.setOpaque(true);
                    la.setBackground(Color.red);
                }
                return la;
            }
        });
        scrollPane.getViewport().add(list);
        frame.add(scrollPane);
        
        frame.setVisible(true);
    }

    static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void updateUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
