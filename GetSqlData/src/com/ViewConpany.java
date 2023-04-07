package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class ViewConpany extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewConpany frame = new ViewConpany();
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
	public ViewConpany() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 10, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( textField.getText().trim().length() < 2 ) {
					textArea.setText( "부서명을 두자 이상 입력하셔야 합니다" );
				} else {
					textArea.setText("");
					System.out.println();
					
					String strDong = textField.getText().trim();
					
					GetSqlData Gsd = new GetSqlData();
					ArrayList<Properties> addresses = Gsd.getSqlCompany( strDong );
					
					for( Properties p : addresses ) {
						String address = String.format( "%s %s %s %s %s %s",
							p.getDeptno(), p.getEmpno(), p.getEname(),
							p.getJob(), p.getLoc(), p.getSal() );
						
						textArea.append( address + System.lineSeparator() );
					}
					
				}
			}
		});
		btnNewButton.setBounds(394, 9, 97, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 40, 479, 336);
		contentPane.add(textArea);
	}
}
