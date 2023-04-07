import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class JSpinner extends JFrame {

	private JPanel contentPane;
	private JButton btn;
	private JButton btnNewButton;
	private javax.swing.JSpinner spinner2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinner frame = new JSpinner();
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
	public JSpinner() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		javax.swing.JSpinner spinner = new javax.swing.JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println((Integer)spinner.getValue());
			}
		});
		spinner.setModel(new SpinnerNumberModel(50, 0, 100, 10));
		spinner.setBounds(12, 10, 123, 22);
		contentPane.add(spinner);
		
		btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println((Integer)spinner.getValue());
				System.out.println((String)spinner2.getValue());
				System.out.println((Date)spinner2.getValue());
			}
		});
		btn.setBounds(12, 42, 97, 23);
		contentPane.add(btn);
		
		spinner2 = new javax.swing.JSpinner();
		spinner2.setModel(new SpinnerListModel(new String[] {"\uC0AC\uACFC", "\uCC38\uC678", "\uC218\uBC15", "\uB538\uAE30"}));
		spinner2.setBounds(12, 76, 123, 32);
		contentPane.add(spinner2);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 118, 97, 23);
		contentPane.add(btnNewButton);
		
		javax.swing.JSpinner spinner_1 = new javax.swing.JSpinner();
		spinner_1.setModel(new SpinnerDateModel(new Date(1712156400000L), null, null, Calendar.DAY_OF_YEAR));
		spinner_1.setBounds(12, 151, 123, 32);
		contentPane.add(spinner_1);
	}
}
