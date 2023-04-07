import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

import org.w3c.dom.css.RGBColor;

import javax.swing.event.ChangeEvent;

public class RGBCount extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JSlider slider;
	private JSlider slider_1;
	private JSlider slider_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RGBCount frame = new RGBCount();
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
	public RGBCount() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(26, 153, 746, 366);
		contentPane.add(panel);
		
		JLabel lbl1 = new JLabel("RED");
		lbl1.setBounds(26, 10, 74, 26);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("GREEN");
		lbl2.setBounds(26, 59, 74, 26);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("BLUE");
		lbl3.setBounds(26, 108, 74, 26);
		contentPane.add(lbl3);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (slider != null) {
					panel.setBackground(new Color(
							slider.getValue(), 
							(slider_1 != null) ? slider_1.getValue() : 0, 
							(slider_2 != null) ? slider_2.getValue() : 0 ));
				}
			}
		});
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(255);
		slider.setMaximum(255);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setBounds(82, 10, 690, 39);
		contentPane.add(slider);
		
		slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (slider_1 != null) {
					panel.setBackground(new Color(
							(slider != null) ? slider.getValue() : 0,
							 slider_1.getValue(),
							(slider_2 != null) ? slider_2.getValue() : 0
			        ));
				}
			}
		});
		slider_1.setMinorTickSpacing(5);
		slider_1.setMajorTickSpacing(255);
		slider_1.setMaximum(255);
		slider_1.setPaintLabels(true);
		slider_1.setPaintTicks(true);
		slider_1.setBounds(82, 59, 690, 39);
		contentPane.add(slider_1);
		
		slider_2 = new JSlider();
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (slider_2 != null) {
					 panel.setBackground(new Color(
				            (slider != null) ? slider.getValue() : 0,
				            (slider_1 != null) ? slider_1.getValue() : 0,
				             slider_2.getValue()
				            ));
				}
			}
		});
		slider_2.setMinorTickSpacing(5);
		slider_2.setMajorTickSpacing(255);
		slider_2.setMaximum(255);
		slider_2.setPaintLabels(true);
		slider_2.setPaintTicks(true);
		slider_2.setBounds(82, 106, 690, 39);
		contentPane.add(slider_2);
		
		
	}
}
