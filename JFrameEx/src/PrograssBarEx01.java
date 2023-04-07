import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrograssBarEx01 extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrograssBarEx01 frame = new PrograssBarEx01();
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
	public PrograssBarEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(10);
		progressBar.setBounds(12, 10, 346, 17);
		contentPane.add(progressBar);
		
		JButton btn1 = new JButton("증가 (+10)");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(progressBar.getValue());
				if (progressBar.getValue() == progressBar.getMaximum()) {
					JOptionPane.showMessageDialog(PrograssBarEx01.this, 
							"100이상으로 값을 증가시킬수 없습니다", "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					progressBar.setValue(progressBar.getValue() + 10);
				}
			}
		});
		btn1.setBounds(12, 37, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("감소 (-10)");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(progressBar.getValue());
				if (progressBar.getValue() == progressBar.getMinimum()) {
						JOptionPane.showMessageDialog(PrograssBarEx01.this, 
								"0보다 작게 값을 감소시킬수 없습니다", "경고", JOptionPane.WARNING_MESSAGE);
					} else {
						progressBar.setValue(progressBar.getValue() -10);
					}
			}
		});
		btn2.setBounds(12, 70, 97, 23);
		contentPane.add(btn2);
	}

}
