import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;

public class LabelExample  {
	private static JTextField txtDfdrtg;
  public static void main(String []args) {
	  JFrame frame = new JFrame("Tarikul");
	  frame.getContentPane().setBackground(Color.WHITE);
	  frame.setSize(740, 568);
	  frame.getContentPane().setLayout(new MigLayout("", "[200px][237px][218px]", "[79px][11px][47px][11px][334px]"));
	  
	  JPanel panel = new JPanel();
	  frame.getContentPane().add(panel, "cell 0 0,grow");
	  
	  JButton button = new JButton("New button");
	  panel.add(button);
	  
	  JButton btnNewButton_5 = new JButton("New button");
	  panel.add(btnNewButton_5);
	  
	  txtDfdrtg = new JTextField();
	  txtDfdrtg.setText("dfdrtg");
	  panel.add(txtDfdrtg);
	  txtDfdrtg.setColumns(10);
	  
	  JPanel panel_1 = new JPanel();
	  frame.getContentPane().add(panel_1, "cell 1 0 1 3,growx,aligny top");
	  
	  JButton btnNewButton_2 = new JButton("tap");
	  btnNewButton_2.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent arg0) {
	  	}
	  });
	  btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
	  panel_1.add(btnNewButton_2);
	  
	  JButton btnNewButton_1 = new JButton("start");
	  panel_1.add(btnNewButton_1);
	  
	  JButton btnNewButton_3 = new JButton("New button");
	  panel_1.add(btnNewButton_3);
	  
	  JButton btnNewButton_4 = new JButton("New button");
	  panel_1.add(btnNewButton_4);
	  
	  JButton btnNewButton = new JButton("stop");
	  panel_1.add(btnNewButton);
	  
	  JSplitPane splitPane = new JSplitPane();
	  frame.getContentPane().add(splitPane, "cell 0 2 1 3,alignx right,growy");
	  
	  JSplitPane splitPane_1 = new JSplitPane();
	  frame.getContentPane().add(splitPane_1, "cell 1 4,alignx center,growy");
	  
	  JSplitPane splitPane_2 = new JSplitPane();
	  frame.getContentPane().add(splitPane_2, "cell 2 0 1 5,grow");
	  frame.setVisible(true);
	  frame.setResizable(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
