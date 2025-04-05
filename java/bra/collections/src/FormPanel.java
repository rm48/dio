package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class FormPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField taskField;
	private TaskList tasklist;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPanel frame = new FormPanel();
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
	public FormPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tasklist = new TaskList();
		
		JLabel lblTask = new JLabel("Task:");
		lblTask.setBounds(12, 12, 60, 17);
		contentPane.add(lblTask);
		
		taskField = new JTextField();
		taskField.setBounds(55, 10, 364, 21);
		contentPane.add(taskField);
		taskField.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new btnAddListener());		
		btnAdd.setBounds(22, 53, 105, 27);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new btnRemoveListener());	
		btnRemove.setBounds(22, 92, 105, 27);
		contentPane.add(btnRemove);
		
		JButton btnQuantity = new JButton("Quantity");
		btnQuantity.addActionListener(new btnQuantityListener());
		btnQuantity.setBounds(22, 131, 105, 27);
		contentPane.add(btnQuantity);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new btnListListener());
		btnList.setBounds(22, 170, 105, 27);
		contentPane.add(btnList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 43, 257, 193);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBorder(new EtchedBorder());
	}
	
	public class btnAddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String task = taskField.getText();
			if (task.isBlank()) {
				JOptionPane.showInternalMessageDialog(null, "No task added");
			}else {
				tasklist.addTask(task);
				textArea.append(" "+task+"\n");		
			}
		}
	}
	
	public class btnRemoveListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String task = taskField.getText();
			tasklist.removeTask(task);
			String lista = tasklist.getTaskDescription();
			String[] nova = lista.split(",");
			textArea.setText("");
			for(int i=0; i < nova.length; i++) {
				if (i==0) {
					String temp = nova[i].replace('[', ' ');
					nova[i]=temp;
				}
				if (i==nova.length-1) {
					String temp = nova[i].replace(']', ' ');
					nova[i]=temp;
				}
					 textArea.append(nova[i] + "\n");
			}			
		}
	}
	
	public class btnQuantityListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int quantity = tasklist.getTaskQuantity();				
			JOptionPane.showInternalMessageDialog(null, "Items: " + quantity);
		}
	}
	
	public class btnListListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {		
			String lista = tasklist.getTaskDescription();
			textArea.setText(lista);
			
		}
	}
}
