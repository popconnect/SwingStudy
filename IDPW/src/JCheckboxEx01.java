import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;

public class JCheckboxEx01 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckboxEx01 frame = new JCheckboxEx01();
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
	public JCheckboxEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chckbxNewCheckBox = new JCheckBox("사과");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(12, 91, 115, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("수박");
		chckbxNewCheckBox_1.setBounds(12, 116, 115, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("딸기");
		chckbxNewCheckBox_2.setBounds(12, 141, 115, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("뭐가 체크됨?");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * System.out.println(chckbxNewCheckBox.isSelected());
				 * System.out.println(chckbxNewCheckBox_1.isSelected());
				 * System.out.println(chckbxNewCheckBox_2.isSelected());
				 * 
				 * System.out.println(chckbxNewCheckBox.getText());
				 * System.out.println(chckbxNewCheckBox_1.getText());
				 * System.out.println(chckbxNewCheckBox_2.getText());
				 */
				
				if (chckbxNewCheckBox.isSelected()) System.out.println(chckbxNewCheckBox.getText());
				if (chckbxNewCheckBox_1.isSelected()) System.out.println(chckbxNewCheckBox_1.getText());
				if (chckbxNewCheckBox_2.isSelected()) System.out.println(chckbxNewCheckBox_2.getText());
				
			
			}
		});
		btnNewButton.setBounds(12, 170, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("전체선택");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxNewCheckBox.setSelected(true);
				chckbxNewCheckBox_1.setSelected(true);
				chckbxNewCheckBox_2.setSelected(true);
			}
		});
		btnNewButton_1.setBounds(12, 10, 97, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("전체 해제");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
			}
		});
		btnNewButton_2.setBounds(121, 10, 97, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("전체선택");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnNewButton_3.getText().equals("전체선택")) {
					btnNewButton_3.setText("전체해제");
				} else {
					btnNewButton_3.setText("전체선택");
				}
			}
		});
		btnNewButton_3.setBounds(12, 43, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(121, 43, 135, 23);
		contentPane.add(tglbtnNewToggleButton);
	}
}
