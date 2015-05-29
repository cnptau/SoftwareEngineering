package myclass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import myclass.Modify;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String[] Currency;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("\u6C47\u7387\u8F6C\u6362\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 586, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(241, 69, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u5F85\u8F6C\u6362\u8D27\u5E01");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label.setBounds(69, 69, 103, 24);
		contentPane.add(label);
		
		Currency = new String [5];//建立String数组储存货币名称
		Currency[0] = "USD美元";
		Currency[1] = "CNY人民币";
		Currency[2] = "HKD港元";
		Currency[3] = "EUR欧元";
		Currency[4] = "JPY日元";
		
		JComboBox comboBox = new JComboBox(Currency);
		comboBox.setBounds(396, 69, 103, 24);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("\u76EE\u6807\u8D27\u5E01");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_1.setBounds(69, 125, 103, 28);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 127, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox(Currency);
		comboBox_1.setBounds(396, 127, 103, 24);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("\u8F6C\u6362");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//private 
			}
		});
		button.setBounds(341, 227, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u6C47\u7387\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modify m = new Modify();
				m.show();
			}
		});
		button_1.setBounds(114, 227, 113, 27);
		contentPane.add(button_1);
	}
}
