/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Khalil
 */
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

public class TestChart extends JFrame { 
  private JPanel pnl; 

  public TestChart() { 
    addWindowListener(new WindowAdapter() { 
      public void windowClosing(WindowEvent e) { 
        dispose(); 
        System.exit(0); 
      } 
    }); 
    pnl = new JPanel(new BorderLayout()); 
    setContentPane(pnl); 
    setSize(400, 250); 

    DefaultPieDataset pieDataset = new DefaultPieDataset(); 
    pieDataset.setValue("Valeur1", new Integer(27)); 
    pieDataset.setValue("Valeur2", new Integer(10)); 
    pieDataset.setValue("Valeur3", new Integer(50)); 
    pieDataset.setValue("Valeur4", new Integer(5)); 

    JFreeChart pieChart = ChartFactory.createPieChart("Test camembert", 
      pieDataset, true, true, true); 
    ChartPanel cPanel = new ChartPanel(pieChart); 
    pnl.add(cPanel); 
  } 
}
