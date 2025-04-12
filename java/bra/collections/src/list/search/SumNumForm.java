package src.list.search;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumNumForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfDisplay;
	private JTextField tfNumber;
	private JLabel lblSmallest;
	private JLabel lblLargest;
	private JLabel lblSum;
		
	SumNumbers sumNumbers = new SumNumbers();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumNumForm frame = new SumNumForm();
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
	public SumNumForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		lblLargest = new JLabel("largest:");
		lblLargest.setBounds(312, 50, 95, 17);
		contentPane.add(lblLargest);
		
		lblSmallest = new JLabel("smallest:");
		lblSmallest.setBounds(191, 50, 95, 17);
		contentPane.add(lblSmallest);
		
		lblSum = new JLabel("sum:");
		lblSum.setBounds(443, 50, 80, 17);
		contentPane.add(lblSum);
		
		tfDisplay = new JTextField();
		tfDisplay.setEditable(false);
		tfDisplay.setBounds(12, 12, 564, 21);
		contentPane.add(tfDisplay);
		tfDisplay.setColumns(10);
		
		tfNumber = new JTextField();
		tfNumber.setBounds(12, 45, 74, 27);
		contentPane.add(tfNumber);
		tfNumber.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!"".equals(tfNumber.getText())) {
					try {
						int number = Integer.parseInt(tfNumber.getText());
						sumNumbers.addNumbers(number);
						tfDisplay.setText(sumNumbers.toString());
						lblSmallest.setText("smalest: "+sumNumbers.findSmallestNumber());
						lblLargest.setText("largest: "+sumNumbers.findLargestNumber());
						lblSum.setText("sum: "+ sumNumbers.calculateSum());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Digite um inteiro");
					}
				}
			}
		});
		btnAdd.setBounds(98, 45, 75, 27);
		contentPane.add(btnAdd);
	}
}
