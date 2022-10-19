import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BMICalculator extends JFrame
{
    public static void main(String[] args){
        new BMICalculator().show();
    }
    
    JLabel height = new JLabel();
    JLabel weight = new JLabel();
    JLabel bmi = new JLabel();
    JLabel feet = new JLabel();
    JLabel inches = new JLabel();
    JLabel pounds = new JLabel();
    
    JTextField ft = new JTextField();
    JTextField in = new JTextField();
    JTextField po = new JTextField();
    JTextField b = new JTextField();
    
    JButton compute = new JButton();
    JButton clear = new JButton();
    JButton exit = new JButton();
    
    public BMICalculator(){
        setTitle("BMI Calcuidlator");
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        
        height.setText("HEIGHT: ");
        grid.gridx = 0;
        grid.gridy = 0;
        getContentPane().add(height,grid);
        
        ft.setText("");
        ft.setColumns(8);
        grid.gridx = 1;
        grid.gridy = 0;
        getContentPane().add(ft,grid);
        
        feet.setText("feet  ");
        grid.gridx = 3;
        grid.gridy = 0;
        getContentPane().add(feet,grid);
        
        in.setText("");
        in.setColumns(8);
        grid.gridx = 4;
        grid.gridy = 0;
        getContentPane().add(in,grid);
        
        inches.setText("  inches  ");
        grid.gridx = 5;
        grid.gridy = 0;
        getContentPane().add(inches,grid);
        
        weight.setText("WEIGHT: ");
        grid.gridx = 0;
        grid.gridy = 1;
        getContentPane().add(weight,grid);
        
        po.setText("");
        po.setColumns(8);
        grid.gridx = 1;
        grid.gridy = 1;
        getContentPane().add(po,grid);
        
        pounds.setText("pounds  ");
        grid.gridx = 3;
        grid.gridy = 1;
        getContentPane().add(pounds,grid);
        
        bmi.setText("BMI: ");
        grid.gridx = 0;
        grid.gridy = 2;
        getContentPane().add(bmi,grid);
        
        b.setText("");
        b.setColumns(12);
        grid.gridx = 1;
        grid.gridy = 2;
        getContentPane().add(b,grid);
        
        compute.setText("Compute BMI");
        grid.gridx = 1;
        grid.gridy = 4;
        getContentPane().add(compute,grid);
        
        compute.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        clear.setText("Clear");
        grid.gridx = 3;
        grid.gridy = 4;
        getContentPane().add(clear,grid);
        
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                clearActionPerformed(e);
            }
        });
        
        exit.setText("Exit");
        grid.gridx = 4;
        grid.gridy = 4;
        getContentPane().add(exit,grid);
        
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                exitActionPerformed(e);
            }
        });
        
        pack();
    }
    
    private void computeActionPerformed(ActionEvent e){
        JFrame f;
        f = new JFrame();
        String p = po.getText();
        String fe = po.getText();
        String i = po.getText();
        //int height = fe.parseInt() * 12;
       //int result = (p.parseInt() / (fe.parseInt() * 12 + i.parseInt()));
    }
    
    private void clearActionPerformed(ActionEvent e){
        JFrame f;
        f = new JFrame();
        dispose();
        JOptionPane.showMessageDialog(f,"Exiting BMI Calculator");
    
    }
    
    private void exitActionPerformed(ActionEvent e){
        JFrame f;
        f = new JFrame();
        
    }
    
}
