package src.list.cart;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FormPanel2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ShoppingCart shoppingCart;
	private JTextArea textArea;
	private JTextField tfPrice;
	private JComboBox cbItem;
	private JComboBox cbQuantity;
	
	DecimalFormat formato = new DecimalFormat("#.##"); 
	String itemValor = "";
	int size = 0;
	String priceString= "0";
	String item = "";
	int quantity = 0;
	double price = 0.0;
	double total = 0.0;
	String resultado = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPanel2 frame = new FormPanel2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//JComboBox cbQuantity
	/**
	 * Create the frame.
	 */
	public FormPanel2() {
		shoppingCart = new ShoppingCart();
		
		janela();
	}
	
	public void janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(30, 10, 49, 17);
		contentPane.add(lblItem);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new btnAddListener());		
		btnAdd.setBounds(20, 147, 83, 27);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new btnRemoveListener());	
		btnRemove.setBounds(115, 147, 83, 27);
		contentPane.add(btnRemove);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new btnTotalListener());
		btnTotal.setBounds(115, 199, 83, 27);
		contentPane.add(btnTotal);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new btnListListener());
		btnList.setBounds(22, 199, 83, 27);
		contentPane.add(btnList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 7, 203, 219);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBorder(new EtchedBorder());
		
		
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(30, 56, 75, 17);
		contentPane.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(30, 105, 75, 17);
		contentPane.add(lblPrice);
		
		tfPrice = new JTextField();
		tfPrice.setColumns(10);
		tfPrice.setBounds(115, 100, 83, 27);
		contentPane.add(tfPrice);
		
		cbItem = new JComboBox();
		cbItem.addActionListener(new cbItemListener());
		cbItem.setModel(new DefaultComboBoxModel(new String[] {"Pencil  2.50", "Pen  3.80", "Eraser  1.8", "Notebook 33.40", "Notepad 12.75", "Ruler  4.35", "Glue  9.95", "Sharpener  5.25"}));
		cbItem.setBounds(76, 7, 122, 26);
		contentPane.add(cbItem);
		
		cbQuantity = new JComboBox();
		cbQuantity.addActionListener(new cbQuantityListener());
		cbQuantity.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cbQuantity.setBounds(115, 51, 83, 26);
		contentPane.add(cbQuantity);
		
	}
	public class cbItemListener implements ActionListener	{
		@Override
		public void actionPerformed(ActionEvent e) {
			cbQuantity.setSelectedIndex(0);
		}
		
	}
	
	
	public void getValues() {
		itemValor = (String) cbItem.getSelectedItem();
		size = itemValor.length();
		priceString = itemValor.substring(size-5, size);
		item = itemValor.substring(0,size-5).trim();
		price = Double.parseDouble(priceString);
		quantity = cbQuantity.getSelectedIndex();
		//total = Double.valueOf(formato.format(price*quantity));
		total = price*quantity;
		total = Double.valueOf(total);
		resultado = String.format("%.2f", total);
		tfPrice.setText(resultado);
	}
	
	public class cbQuantityListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			getValues();			
		}
	}
	
	public class btnAddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			{
				getValues();
					shoppingCart.addItem(quantity, item, total);
					textArea.append(quantity+" "+item+" "+resultado+"\n");		
//				}
			}
			
		}
	}
	
	public class btnRemoveListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			getValues();
			
			shoppingCart.removeItem(item);
			String lista = shoppingCart.toString();
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
					 textArea.append(nova[i]);
			}			
		}
	}
	
	public class btnTotalListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double totalValue = shoppingCart.calculateTotalValue();	
			totalValue = Double.valueOf(totalValue);
			JOptionPane.showInternalMessageDialog(null, "Total value: " + formato.format(totalValue));
		}
	}
	
	public class btnListListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {		
			//String lista = 
			shoppingCart.displayItems();
			//textArea.setText(lista);
			
		}
	}

	
}
