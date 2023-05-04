package finall;

import java.awt.EventQueue;
//import 
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JTable;


import java.text.MessageFormat;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
/*public class Finall extends JFrame {
	


	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;
	import java.text.MessageFormat;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finall frame = new Finall();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

public class Finall extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finall frame = new Finall();
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
	double cTotal;
	double cTax;
	double cash;
	double cChange;
	double  amountDue;
	double discount;
	double change;
	private JPasswordField passwordField;
	private JTextField textField;
	public void Itemcost()
	{
		double sum=0;
		double tax=3.9;
		for(int i=0;i<table.getRowCount();i++)
		{
			sum=sum+Double.parseDouble(table.getValueAt(i,2).toString());
		}
		jtxtSubTotal.setText(Double.toString(sum));
		cTotal = Double.parseDouble(jtxtSubTotal.getText());
		 cTax=(cTotal*tax)/100;
		String iTaxTotal= String.format("$ %.2f",cTax);
		jtxtTax.setText(iTaxTotal);
		
		String iSubTotal= String.format("$ %.2f",cTotal);
		jtxtSubTotal.setText(iSubTotal);
		
		String iTotal= String.format("$ %.2f",cTotal+cTax);
		jtxtTotal.setText(iTotal);
		
		//String Barcode= String.format("Total is %.2f",cTotal+cTax);
		//jtxtBarcode.setText(Barcode);
		
	}
	
	public void Change()
	{
		double sum=0;
		double tax=3.9;
		 cash=Double.parseDouble(jtxtDisplay.getText());
		for(int i=0;i<table.getRowCount();i++)
		{
			sum=sum+Double.parseDouble(table.getValueAt(i,2).toString());
		}
		
		double cTax=(tax*sum)/100;
		 cChange=(cash-(sum+cTax));
		String ChangeGiven = String.format("$ %.2f",cChange);
		jtxtChange.setText(ChangeGiven);
	}
	public Finall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(10, 10, 134, 353);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn9.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn9.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn9.setBounds(10, 10, 50, 21);
		panel.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn8.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn8.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn8.setBounds(70, 10, 50, 21);
		panel.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn7.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn7.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn7.setBounds(10, 59, 50, 21);
		panel.add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn6.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn6.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn6.setBounds(70, 59, 50, 21);
		panel.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn5.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn5.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn5.setBounds(10, 115, 50, 21);
		panel.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn4.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn4.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn4.setBounds(74, 115, 50, 21);
		panel.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn3.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn3.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn3.setBounds(10, 170, 50, 21);
		panel.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn2.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn2.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn2.setBounds(70, 170, 50, 21);
		panel.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn1.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn1.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn1.setBounds(10, 230, 50, 21);
		panel.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getText();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(btn0.getText());
				}
				else
				{
					Enternumber=jtxtDisplay.getText()+btn0.getText();
					jtxtDisplay.setText( Enternumber);
				}
			}
		});
		btn0.setBounds(74, 230, 50, 21);
		panel.add(btn0);
		
		JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! jtxtDisplay.getText().contains("."))
				{
				jtxtDisplay.setText(jtxtDisplay.getText() + btnpoint.getText());
				}
				
			}
		});
		btnpoint.setBounds(10, 293, 50, 21);
		panel.add(btnpoint);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			}
		});
		btnC.setBounds(70, 293, 50, 21);
		panel.add(btnC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(154, 10, 120, 525);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane jTable = new JScrollPane();
		jTable.setBounds(10, 0, 126, 573);
		panel_1.add(jTable);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Item", "Qt", "BDT"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(131);
		table.getColumnModel().getColumn(0).setMinWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(161);
		table.getColumnModel().getColumn(1).setMinWidth(17);
		table.getColumnModel().getColumn(2).setPreferredWidth(132);
		table.getColumnModel().getColumn(2).setMinWidth(59);
		table.getColumnModel().getColumn(2).setMaxWidth(8331);
		jTable.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(414, 10, 488, 387);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		JLabel lblCapcode = new JLabel("");
				lblCapcode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\360_F_455480661_B1ndlageM3kplzg1NRPFUgYj2iWXvDQS.jpg"));
				lblCapcode.setBounds(20, 10, 447, 367);
				//panel_2.add(lblCapcode);
				JLabel lblPencode = new JLabel("");
				lblPencode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\istockphoto-1166257074-612x612.jpg"));
				lblPencode.setBounds(20, 10, 434, 367);
				//panel_2.add(lblPencode);
				JLabel lblToycode = new JLabel("");
				lblToycode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\download.png"));
				lblToycode.setBounds(10, 10, 468, 367);
				//panel_2.add(lblToycode);
				JLabel lblBagcode = new JLabel("");
				lblBagcode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\Barcode_Invented.jpg"));
				lblBagcode.setBounds(10, 10, 419, 351);
				//panel_2.add(lblBagcode);
				JLabel lblSoap = new JLabel("");
				lblSoap.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\UPC.png"));
				lblSoap.setBounds(10, 10, 468, 367);
				//panel_2.add(lblSoap);
				JLabel lblCupcode = new JLabel("");
				lblCupcode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\gettyimages-1189521504-612x612.jpg"));
				lblCupcode.setBounds(0, 10, 478, 367);
				//panel_2.add(lblCupcode);
				JLabel lblWatch = new JLabel("");
				lblWatch.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\images.png"));
				lblWatch.setBounds(10, 9, 457, 368);
				//panel_2.add(lblWatch);
				JLabel lblShirtcode = new JLabel("");
				lblShirtcode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\images (1).png"));
				lblShirtcode.setBounds(0, 10, 478, 367);
				//panel_2.add(lblShirtcode);
				JLabel lblJugcode = new JLabel("");
				lblJugcode.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\upca.jpg"));
				lblJugcode.setBounds(10, 10, 468, 377);
				//panel_2.add(lblJugcode);
				
				
				
		
		JButton btnCap = new JButton("");
		btnCap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblCapcode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				
				double PriceOfItem=108;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cap","1",PriceOfItem});
				Itemcost();
				
			}
		});
		btnCap.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\0001128_rollsroller-base-ball-cap-size-medium_415.jpeg"));
		btnCap.setBounds(10, 44, 85, 89);
		panel_2.add(btnCap);
		
		JLabel lblCap = new JLabel("Cap");
		lblCap.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblCap.setBounds(20, 10, 85, 24);
		panel_2.add(lblCap);
		
		JButton btnPen = new JButton("");
		btnPen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblPencode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				double PriceOfItem=40;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Pen","1",PriceOfItem});
				Itemcost();
			}
		});
		btnPen.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\istockphoto-1059543698-170667a.jpg"));
		btnPen.setBounds(131, 44, 112, 89);
		panel_2.add(btnPen);
		
		JLabel lblToothpaste = new JLabel("Pen");
		lblToothpaste.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblToothpaste.setBounds(157, 9, 108, 24);
		panel_2.add(lblToothpaste);
		
		JButton btnBag = new JButton("");
		btnBag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblBagcode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				
				
				double PriceOfItem=430;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Bag","1",PriceOfItem});
				Itemcost();
			}
		});
		btnBag.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\photo-1584917865442-de89df76afd3.jfif"));
		btnBag.setBounds(10, 172, 85, 95);
		panel_2.add(btnBag);
		
		JLabel lblShampoo = new JLabel("Bag");
		lblShampoo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblShampoo.setBounds(20, 143, 118, 26);
		panel_2.add(lblShampoo);
		
		JButton btnSoap = new JButton("");
		btnSoap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblSoap);
                imageFrame.pack();
                imageFrame.setVisible(true);
				double PriceOfItem=35;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Soap","1",PriceOfItem});
				Itemcost();
			}
		});
		btnSoap.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\istockphoto-505574760-612x612.jpg"));
		btnSoap.setBounds(131, 178, 112, 89);
		panel_2.add(btnSoap);
		
		JLabel lbSoap = new JLabel("Soap");
		lbSoap.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbSoap.setBounds(153, 141, 127, 30);
		panel_2.add(lbSoap);
		
		JButton btnWatch = new JButton("");
		btnWatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblWatch);
                imageFrame.pack();
                imageFrame.setVisible(true);
				
				double PriceOfItem=700;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Watch","1",PriceOfItem});
				Itemcost();
			}
		});
		btnWatch.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\71VjM5LOeYL._AC_UL1500_.jpg"));
		btnWatch.setBounds(10, 316, 98, 61);
		panel_2.add(btnWatch);
		
		JLabel lblPrinter = new JLabel("Watch");
		lblPrinter.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPrinter.setBounds(23, 282, 85, 24);
		panel_2.add(lblPrinter);
		
		JButton btnShirt = new JButton("");
		btnShirt.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\download.jpg"));
		btnShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblShirtcode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				double PriceOfItem=900;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Shirt","1",PriceOfItem});
				Itemcost();
			}
		});
		btnShirt.setBounds(131, 316, 127, 61);
		panel_2.add(btnShirt);
		
		JLabel lblShirt = new JLabel("Shirt");
		lblShirt.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblShirt.setBounds(151, 277, 92, 29);
		panel_2.add(lblShirt);
		
		JButton btnToy = new JButton("New button");
		btnToy.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\12467985_111822-wls-baby-doll-img.jfif"));
		btnToy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblToycode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				double PriceOfItem=90;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Toy","1",PriceOfItem});
				Itemcost();
			}
		});
		btnToy.setBounds(318, 44, 126, 89);
		panel_2.add(btnToy);
		
		JLabel lblToy = new JLabel("Toy");
		lblToy.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblToy.setBounds(349, 3, 118, 38);
		panel_2.add(lblToy);
		
		JButton btnCup = new JButton("New button");
		btnCup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblCupcode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				double PriceOfItem=120;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cup","1",PriceOfItem});
				Itemcost();
			}
		});
		btnCup.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\640px-Cup_and_Saucer_LACMA_47.35.6a-b_(1_of_3).jpg"));
		btnCup.setBounds(298, 183, 146, 84);
		panel_2.add(btnCup);
		
		JLabel lblCup = new JLabel("Cup");
		lblCup.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblCup.setBounds(330, 143, 85, 26);
		panel_2.add(lblCup);
		
		JButton btnJug = new JButton("New button");
		btnJug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame imageFrame = new JFrame();
                //JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo/to/shampoo.jpg"));
                imageFrame.getContentPane().add(lblJugcode);
                imageFrame.pack();
                imageFrame.setVisible(true);
				double PriceOfItem=80;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Jug","1",PriceOfItem});
				Itemcost();
			}
			
		});
		btnJug.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\M0354_990116-6_1_(cropped).jpg"));
		btnJug.setBounds(298, 306, 146, 71);
		panel_2.add(btnJug);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(330, 292, 45, -5);
		panel_2.add(lblNewLabel);
		
		JLabel lblJug = new JLabel("Jug");
		lblJug.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblJug.setBounds(330, 276, 85, 30);
		panel_2.add(lblJug);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 387, 142, 127);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 10, 56, 13);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(0, 51, 66, 24);
		panel_3.add(lblSubTotal);
		
		JLabel Total = new JLabel("Payable");
		Total.setBounds(0, 85, 101, 32);
		panel_3.add(Total);
		
		jtxtTax = new JTextField();
		jtxtTax.setBounds(36, 7, 96, 19);
		panel_3.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jtxtSubTotal.setBounds(56, 54, 96, 19);
		panel_3.add(jtxtSubTotal);
		jtxtSubTotal.setColumns(10);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(66, 92, 86, 19);
		panel_3.add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(286, 387, 131, 137);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPayMethod = new JLabel("Pay Method");
		lblPayMethod.setBounds(10, 5, 63, 52);
		panel_4.add(lblPayMethod);
		
		JLabel lblDisplay = new JLabel("Cash");
		lblDisplay.setBounds(10, 55, 53, 31);
		panel_4.add(lblDisplay);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setBounds(10, 104, 45, 13);
		panel_4.add(lblChange);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(128, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "ATM Card", "Bkash", "Nagad"}));
		comboBox.setBounds(68, 21, 53, 21);
		panel_4.add(comboBox);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setBackground(new Color(255, 255, 255));
		jtxtDisplay.setBounds(78, 61, 56, 19);
		panel_4.add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		
		jtxtChange = new JTextField();
		jtxtChange.setBounds(68, 101, 63, 19);
		panel_4.add(jtxtChange);
		jtxtChange.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(467, 407, 229, 107);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBackground(new Color(255, 255, 0));
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Cash"));
				{
					Change();
				}
				//String total = jtxtTotal.getText(); //get the value from the text field
				//textArea.append("Total: " + total + "\n"); //append the value to the text area
				
				
			}
		});
		btnPay.setBounds(10, 10, 85, 21);
		panel_5.add(btnPay);
		
		JButton btnPrint = new JButton("Print ");
		btnPrint.setBackground(new Color(255, 255, 0));
		btnPrint.setForeground(new Color(0, 0, 0));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//MessageFormat header=new MessageFormat("Invoice Print");
				
			
				
				PrinterJob printerJob = PrinterJob.getPrinterJob();
		        printerJob.setJobName("Print JTable");

		        printerJob.setPrintable(new Printable() {
		            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		                if (pageIndex > 0) {
		                    return Printable.NO_SUCH_PAGE;
		                }

		                Graphics2D graphics2D = (Graphics2D) graphics;
		                graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

		                jTable.print(graphics2D);

		                return Printable.PAGE_EXISTS;
		            }
		        });

		        boolean returningResult = printerJob.printDialog();

		        if (returningResult) {
		            try {
		                printerJob.print();
		            } catch (PrinterException printerException) {
		                JOptionPane.showMessageDialog(null, "Print Error: " + printerException.getMessage());
		            }
		        }
				
			
			
			
			
				
				
				
				
				
				
				
				
			}
		});
		btnPrint.setBounds(10, 45, 85, 21);
		panel_5.add(btnPrint);
		
		JButton btnRemoveItem = new JButton("Remove item");
		btnRemoveItem.setBackground(new Color(255, 255, 0));
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int RemoveItem=table.getSelectedRow();
				if(RemoveItem>=0)
				{
					model.removeRow(RemoveItem);
				}
				Itemcost();
				if(comboBox.getSelectedItem().equals("Cash"))
				{
					Change();
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
				
			}
		});
		btnRemoveItem.setBounds(47, 76, 120, 21);
		panel_5.add(btnRemoveItem);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 255, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to leave the market place?","Confirmation",JOptionPane.YES_NO_OPTION)==0)
				{
					Finall.this.dispose();
					
				}
			}
		});
		btnExit.setBounds(128, 45, 75, 21);
		panel_5.add(btnExit);
		
		JButton btnReset = new JButton("Start");
		btnReset.setBounds(116, 10, 87, 24);
		panel_5.add(btnReset);
		btnReset.setBackground(new Color(255, 255, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxtTax.setText(null);
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
				
			}
		});
		
		JButton btnPaymentDone = new JButton("Make invoice");
		btnPaymentDone.setBackground(new Color(255, 255, 0));
		btnPaymentDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"... ...",  ".....","....."});
				model.addRow(new Object[] {"S.Total:"," ",cTotal});
				model.addRow(new Object[] {"Discount:"," ",discount});
				model.addRow(new Object[] {"Tax:"," ",cTax});
				model.addRow(new Object[] {"Payable:"," ",amountDue});
				model.addRow(new Object[] {"Paid:"," ",cash});
				model.addRow(new Object[] {"Change:"," ",change});
				model.addRow(new Object[] {"... ...", ".....","....."});
				model.addRow(new Object[] {"Thank","...","You"});
				model.addRow(new Object[] {"Come","...","Again"});
				model.addRow(new Object[] {"... ...", ".....","....."});
								
				
				
				
				//Itemcost();
				
				
			}
		});
		btnPaymentDone.setBounds(729, 407, 120, 30);
		contentPane.add(btnPaymentDone);
		
		JLabel lblMembership = new JLabel("Promo Code");
		lblMembership.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMembership.setBounds(727, 441, 159, 30);
		contentPane.add(lblMembership);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setBackground(new Color(255, 255, 0));
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 /*JOptionPane.showMessageDialog(null, "Congratulations you availed 30% discount");
			        try {
			            Thread.sleep(3000); // wait for 3 seconds
			        } catch (InterruptedException ex) {
			            ex.printStackTrace();
			        }
			        double total = cTotal + cTax;
			         discount = total * 0.3;
			         amountDue = total - discount;
			        //double cash = Double.parseDouble(jtxtCash.getText());
			         change = cash - amountDue;

			        jtxtTotal.setText(String.format("%.2f", amountDue)); // Display the amount due after discount
			        jtxtChange.setText(String.format("%.2f", change));*/ // Display the change after cash payment
			        String promoCode = textField.getText();

			        if (promoCode.equals("iitju")) {
			            // execute the desired code here
			        	JOptionPane.showMessageDialog(null, "Congratulations you availed 30% discount");
			        	try {
				            Thread.sleep(3000); // wait for 3 seconds
				        } catch (InterruptedException ex) {
				            ex.printStackTrace();
				        }
				        double total = cTotal + cTax;
				         discount = total * 0.3;
				         amountDue = total - discount;
				        //double cash = Double.parseDouble(jtxtCash.getText());
				         change = cash - amountDue;

				        jtxtTotal.setText(String.format("%.2f", amountDue)); // Display the amount due after discount
				        jtxtChange.setText(String.format("%.2f", change)); // Display the change after cash payment
			            
			        } else {
			            //contentPane.showMessageDialog(this, "Sorry, wrong promo code.");
			        	JOptionPane.showMessageDialog(null, "Sorry, wrong promo code.");
			        }
			        
			}
		});
		btnApply.setBounds(739, 493, 67, 21);
		contentPane.add(btnApply);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\nagad pay qr.png"));
		btnNewButton.setBounds(298, 26, 85, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342323516_1178838533515271_4091875884437609612_n.jpg"));
		btnNewButton_1.setBounds(290, 88, 114, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342483221_622108993126906_5328921727837036669_n.jpg"));
		btnNewButton_2.setBounds(298, 151, 95, 41);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\tawsi\\Pictures\\IIT second class\\nooooo\\342367820_561515472717100_3894071365816776811_n.jpg"));
		btnNewButton_3.setBounds(298, 212, 106, 64);
		contentPane.add(btnNewButton_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(298, 302, 106, 30);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("ATM Card No.");
		lblNewLabel_1.setBounds(298, 342, 106, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(729, 471, 142, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
	}
}
