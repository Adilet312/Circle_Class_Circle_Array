import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
/**
 * Provides a GUI interface to allow a user to read in a file of Circles,
 * and get interesting stats
 * 
 * You are not responsible for understanding this code, but if you have any questions,
 * I'd be happy to answer them.
 * 
 * NOTE - if you want to call more methods on your CircleSet object, add statements to the method
 * buildDisplay()
 * 
 * @author csc142 
 * @version Spring 2012
 */
public class CircleApp
{
    private JTextArea text; 
    
    /**
     * Constructor for objects of class GPSApp
     */
    public CircleApp()
    {
        JFrame win = new JFrame("142 Crop Circles");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(500, 400);
        
        // Create the button 
        JButton button = new JButton("Load File");
        
        // put button in a panel and then into the frame
        JPanel back = new JPanel();
        back.setBackground(Color.blue);
        back.add(button);
        win.getContentPane().add(back,BorderLayout.SOUTH );
        
        // now set up the event handler
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                process();
            }
            
        });
        
        // create the display area and place it
        text = new JTextArea();
        JScrollPane p = new JScrollPane(text);
        win.getContentPane().add(p, BorderLayout.CENTER);
        
        // get the frame ready to show
        win.validate();
        win.setVisible(true);
        win.toFront();
    }
    
    // processing the button click
    private void process(){
        
        // get filename from user
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File f = fc.getSelectedFile();
            
            // create a LocationSet and display results
            try {
                CircleSet cs = new CircleSet(f);
                String results = buildDisplay(cs);
                text.setText("File:\t" + f.getName() + "\n\n");
                text.append(results);
            } catch (FileNotFoundException e){
                text.setText("Sorry, file not found\nPlease try again");
            }catch (IllegalStateException e) {
                text.setText("Sorry, file must have at least 2 circles\nPlease try again");
            }
        } 
    }
    
    // build & return String for display using information from ls
    private String buildDisplay(CircleSet cs) {
        String output = "";
        
        Circle[] closest = cs.getClosest();
      
        output += "Number of circles =  " + cs.getCount() + '\n';
        output += "Brightness change    =  " + cs.changingBrightness() + "\n\n";
        output += "Circles that are the closest = \n";
        output += "\n1) " + closest[0] + " \n2) " + closest[1] + "\n";
        output += "\ndistance = " + closest[0].distance(closest[1]);
        output += "\n\nData Set\n------------\n" + cs;
                
      
        return output;
        
    }

    public static void main(String [] args) {
         //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CircleApp b = new CircleApp();
            }
        });
    }

}
