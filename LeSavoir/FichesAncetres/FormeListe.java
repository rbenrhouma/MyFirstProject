import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTable;

public class FormeListe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormeListe frame = new FormeListe();
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
	public FormeListe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(54, 48, 197, 134);
		contentPane.add(list);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(54, 18, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		textField = new JTextField();
		textField.setBounds(260, 86, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(261, 117, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		table = new JTable();
		table.setBounds(248, 246, -178, -52);
		contentPane.add(table);
	}
}
