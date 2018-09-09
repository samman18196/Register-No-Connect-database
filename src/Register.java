import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Register {
    private JTextField txtUser;
    private JPasswordField txtPwd;
    private JPasswordField txtRPwd;
    private JTextField txtEmail;
    private JButton Submit;
    private JButton Cancel;
    private JPanel MainPanel;




    public Register() throws SQLException {
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



            }
        });
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame();
        Register form = new Register();
        frame.setContentPane(form.MainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(550,500));
        frame.setVisible(true);


        String serverName = "sql12.freemysqlhosting.net";
        String mydatabase = "sql12255832";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "sql12255832";
        String password = "VqusRaY3qH";
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.createStatement();
    }

}
