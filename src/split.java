import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JButton;

public class split extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					split frame = new split();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public split() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recorder");
		lblNewLabel.setBounds(5, 5, 786, 26);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 42, 186, 59);
		contentPane.add(panel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setToolTipText("");
		splitPane.setAlignmentY(Component.CENTER_ALIGNMENT);
		splitPane.setBounds(15, 142, 411, 305);
		contentPane.add(splitPane);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setBounds(247, 42, 179, 89);
		contentPane.add(splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setBounds(513, 42, 248, 393);
		contentPane.add(splitPane_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 446, 801, 29);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(559, 5, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.setBounds(672, 5, 89, 23);
		panel_1.add(btnNewButton_1);
	}
}
