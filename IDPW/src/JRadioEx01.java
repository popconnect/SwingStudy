import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class JRadioEx01 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioEx01 frame = new JRadioEx01();
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
	public JRadioEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(16, 10, 133, 121);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdobtn1 = new JRadioButton("사과");
		rdobtn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		buttonGroup.add(rdobtn1);
		rdobtn1.setSelected(true);
		rdobtn1.setBounds(6, 17, 121, 23);
		panel.add(rdobtn1);
		
		JRadioButton rdobtn2 = new JRadioButton("수박");
		rdobtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setToolTipText(rdobtn2.getText());
			}
		});
		buttonGroup.add(rdobtn2);
		rdobtn2.setBounds(6, 42, 121, 23);
		panel.add(rdobtn2);
		
		JRadioButton rdobtn3 = new JRadioButton("딸기");
		rdobtn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.set(rdobtn3.getText());
			}
		});
		buttonGroup.add(rdobtn3);
		rdobtn3.setBounds(6, 67, 121, 23);
		panel.add(rdobtn3);
		
		JRadioButton rdobtn4 = new JRadioButton("배");
		rdobtn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setToolTipText(rdobtn4.getText());
			}
		});
		buttonGroup.add(rdobtn4);
		rdobtn4.setBounds(6, 92, 121, 23);
		panel.add(rdobtn4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(51, 135, 97, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(16, 172, 133, 36);
		contentPane.add(textArea);
	}

}
