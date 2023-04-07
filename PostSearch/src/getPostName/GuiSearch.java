package getPostName;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class GuiSearch {

    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;
    private JList<String> resultList;
    private JTextField addressField;

    private String url = "jdbc:mariadb://localhost:3306/post";
    private String user = "root";
    private String password = "root";

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuiSearch window = new GuiSearch();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GuiSearch() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(692, 9, 80, 30);
        frame.getContentPane().add(btnSearch);
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dong = textField.getText();
                searchPostalCode(dong);
            }
        });

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 50, 762, 377);
        frame.getContentPane().add(scrollPane);

        resultList = new JList<String>();
        resultList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(resultList);

        resultList.addListSelectionListener(e -> {
            String selected = resultList.getSelectedValue();
            if (selected != null) {
                String[] info = selected.split("\t");
                String region = info[2];
                String city = info[1];
                String dong = info[3];
                String address = info[4];
                String addressLine = region + " " + city + " " + dong;
                textField.setText(addressLine);
                addressField.setText(address);
            }
        });

        addressField = new JTextField();
        addressField.setBounds(10, 468, 762, 21);
        frame.getContentPane().add(addressField);
        addressField.setColumns(10);

    }

    private void searchPostalCode(String dong) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String selectQuery = "SELECT * FROM zippost WHERE dong LIKE ?";
            PreparedStatement pstmt = conn.prepareStatement(selectQuery);
            pstmt.setString(1, dong + "%");

            ResultSet rs = pstmt.executeQuery();

            List<String> resultData = new ArrayList<>();
            while (rs.next()) {
                String zipcode = rs.getString("zipcode");
                String city = rs.getString("city");
                String region = rs.getString("region");
                dong = rs.getString("dong");
                String address = rs.getString("address");
                String resultLine = zipcode + "\t" + city + "\t" + region + "\t" + dong + "\t"
