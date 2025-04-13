package src.list.sort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfAge;
	private JTextField tfHeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonForm frame = new PersonForm();
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
	public PersonForm() {
		
		SortPersons sortPersons = new SortPersons();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(213, 12, 225, 248);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setBorder(new EtchedBorder());
		
		tfName = new JTextField();
		tfName.setBounds(57, 13, 144, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(12, 15, 60, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(12, 44, 38, 17);
		contentPane.add(lblAge);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(12, 79, 60, 17);
		contentPane.add(lblHeight);
		
		tfAge = new JTextField();
		tfAge.setColumns(10);
		tfAge.setBounds(57, 46, 54, 21);
		contentPane.add(tfAge);
		
		tfHeight = new JTextField();
		tfHeight.setColumns(10);
		tfHeight.setBounds(57, 77, 54, 21);
		contentPane.add(tfHeight);
		
		JLabel lblYears = new JLabel("years");
		lblYears.setBounds(117, 46, 78, 17);
		contentPane.add(lblYears);
		
		JLabel lblCentimeters = new JLabel("meter");
		lblCentimeters.setBounds(117, 79, 84, 17);
		contentPane.add(lblCentimeters);
		
		JButton btnAddPerson = new JButton("Add person");
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!"".equals(tfName.getText())) {
					try {
						String name = tfName.getText();
						int age = Integer.parseInt(tfAge.getText());
						double height = Double.parseDouble(tfHeight.getText());
						sortPersons.addPerson(name, age, height);
						textArea.setText(sortPersons.toString());
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(rootPane,
								"An error occurred... \nFill in the fields:\nName, Age, Height (e.g.: 1.75) \nand try again");
					}				
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter a name");
				}
			}
		});
		btnAddPerson.setBounds(57, 113, 119, 27);
		contentPane.add(btnAddPerson);
		
		JButton btnSortByAge = new JButton("Sort by age");
		btnSortByAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""+sortPersons.sortByAge());
			}
		});
		btnSortByAge.setBounds(57, 152, 119, 27);
		contentPane.add(btnSortByAge);
		
		JButton btnSortByHeight = new JButton("Sort by height");
		btnSortByHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(sortPersons.sortByHeight().toString());
			}
		});
		btnSortByHeight.setBounds(57, 191, 119, 27);
		contentPane.add(btnSortByHeight);
	}
}
