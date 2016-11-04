/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sahebzada sumon
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.ActiveEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

 */
class pass extends JFrame {

    pass() {
        JLabel passlabel = new JLabel();
        passlabel.setText("ADMIN'S LOGIN");
        Font p = new Font("serif", Font.ITALIC, 25);
        passlabel.setFont(p);
        passlabel.setBounds(330, 150, 200, 50);
        add(passlabel);

        final JPasswordField passfield = new JPasswordField(10);
        passfield.setBounds(310, 210, 218, 30);
        add(passfield);


        JButton passbutton = new JButton("GO");
        passbutton.setBounds(350, 310, 100, 50);
        add(passbutton);

        passbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String fn;
                String sn = "123";

                fn = passfield.getText().toString();
                passfield.setText(null);
                if (fn.equals(sn)) {

                    lms obj = new lms();
                    obj.setTitle("****LIBRARY MANAGEMENT SYSTEM****");
                    obj.setBounds(200, 40, 800, 650);
                    obj.setLayout(null);
                    obj.setVisible(true);
                    obj.getContentPane().setBackground(Color.LIGHT_GRAY);
                    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter the correct passward");
                }
            }
        });

    }
}

class lms extends JFrame {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/library management";
    Connection connection = null;
    Statement statement = null;

    lms() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
            statement = (Statement) connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        JMenuBar m1;
        m1 = new JMenuBar();
        m1.setBounds(0, 0, 1500, 25);
        m1.setBackground(Color.GRAY);
        add(m1);

        JMenu menu1 = new JMenu("Home");
        m1.add(menu1);

        JMenuBar m2 = new JMenuBar();
        add(m2);
        m2.setBounds(50, 0, 1000, 20);
        JMenu menu2 = new JMenu("About");
        m1.add(menu2);
        final JMenu menu3 = new JMenu("Help");
        menu3.setBackground(Color.white);
        m1.add(menu3);

        JMenuItem a = new JMenuItem("Students ");
        a.setBackground(Color.white);

        JMenuItem b = new JMenuItem("Books ");
        b.setBackground(Color.white);

        JMenuItem c = new JMenuItem("Admins ");
        c.setBackground(Color.white);

        JMenuItem d = new JMenuItem("About ruet");
        d.setBackground(Color.white);

        JMenuItem e = new JMenuItem("About library");
        e.setBackground(Color.white);

        JMenuItem f = new JMenuItem("Help line");
        f.setBackground(Color.white);

        menu1.add(a);
        menu1.add(b);
        menu1.add(c);
        menu2.add(d);
        menu2.add(e);
        menu3.add(f);



        f.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame nw4 = new JFrame();
                nw4.setTitle("HELP LINE");

                nw4.setSize(300, 400);
                nw4.setVisible(true);



                JTextPane ff = new JTextPane();
                ff.setBackground(Color.LIGHT_GRAY);
                String s = ("For any kind of information about the system\n visit: "
                        + " www.facebook.com/sahebzada sumon\n"
                        + " or Email: sumon_ruetbd@gmail.com\n"
                        + "  or Mail: Rizoantoufiq@yahoo.com");
                ff.setText(s);
                ff.setEditable(false);
                nw4.add(ff);

            }
        });



        JLabel zero_lebel, first_label, second_label, third_label, fourth_label, fifth_label, sixth_label, seventh_label, eighth_label;

        zero_lebel = new JLabel();
        zero_lebel.setText("*****THIS IS FOR BOOK ISSUE*****");
        zero_lebel.setForeground(Color.WHITE);
        zero_lebel.setBounds(280, 30, 300, 100);
        add(zero_lebel);

        first_label = new JLabel();
        first_label.setText("Enter student's name   :");
        first_label.setForeground(Color.WHITE);
        first_label.setBounds(200, 130, 200, 20);
        add(first_label);

        second_label = new JLabel();
        second_label.setText("Enter student's id no.    :");
        second_label.setForeground(Color.WHITE);
        second_label.setBounds(200, 160, 200, 20);
        add(second_label);

        third_label = new JLabel();
        third_label.setText(" Phone number               :");
        third_label.setForeground(Color.WHITE);
        third_label.setBounds(200, 190, 200, 20);
        add(third_label);

        fourth_label = new JLabel();
        fourth_label.setText(" Enter book's name       :");
        fourth_label.setForeground(Color.WHITE);
        fourth_label.setBounds(200, 220, 200, 20);
        add(fourth_label);

        fifth_label = new JLabel();
        fifth_label.setText("Renew date                      :");
        fifth_label.setForeground(Color.WHITE);
        fifth_label.setBounds(200, 250, 200, 20);
        add(fifth_label);

        sixth_label = new JLabel();
        sixth_label.setText(" Expireation date            :");
        sixth_label.setForeground(Color.WHITE);
        sixth_label.setBounds(200, 280, 200, 20);
        add(sixth_label);


        seventh_label = new JLabel();
        seventh_label.setText("Amount of fees               :");
        seventh_label.setForeground(Color.WHITE);
        seventh_label.setBounds(200, 310, 200, 20);
        add(seventh_label);

        eighth_label = new JLabel();
        eighth_label.setText("Account no                      :");
        eighth_label.setForeground(Color.WHITE);
        eighth_label.setBounds(200, 340, 200, 20);
        add(eighth_label);



        final JTextField first = new JTextField();
        first.setBounds(400, 130, 150, 20);
        add(first);
        first.setBackground(Color.white);
        first.setForeground(Color.BLACK);

        final JTextField second = new JTextField();
        second.setBounds(400, 160, 150, 20);
        add(second);
        second.setBackground(Color.white);
        second.setForeground(Color.BLACK);




        final JTextField third = new JTextField();
        third.setBounds(400, 190, 150, 20);
        add(third);
        third.setBackground(Color.white);
        third.setForeground(Color.BLACK);


        final JTextField fourth = new JTextField();
        fourth.setBounds(400, 220, 150, 20);
        add(fourth);
        fourth.setBackground(Color.white);
        fourth.setForeground(Color.BLACK);

        final JTextField fifth = new JTextField();
        fifth.setBounds(400, 250, 150, 20);
        add(fifth);
        fifth.setBackground(Color.white);
        fifth.setForeground(Color.BLACK);



        final JTextField sixth = new JTextField();
        sixth.setBounds(400, 280, 150, 20);
        add(sixth);
        sixth.setBackground(Color.white);
        sixth.setForeground(Color.BLACK);

        final JTextField seventh = new JTextField();
        seventh.setBounds(400, 310, 150, 20);
        add(seventh);
        seventh.setBackground(Color.white);
        seventh.setForeground(Color.BLACK);


        final JTextField eighth = new JTextField();
        eighth.setBounds(400, 340, 150, 20);
        add(eighth);
        eighth.setBackground(Color.white);
        eighth.setForeground(Color.BLACK);



        JButton search_button = new JButton("SEARCH(ID)");
        search_button.setBounds(120, 400, 100, 30);
        add(search_button);
        search_button.setBackground(Color.red);
        search_button.setForeground(Color.WHITE);
        setBackground(Color.red);

        JButton insert_button = new JButton("INSERT");
        insert_button.setBounds(230, 400, 100, 30);
        add(insert_button);
        insert_button.setBackground(Color.red);
        insert_button.setForeground(Color.WHITE);


        JButton delete_button = new JButton("DELETE");
        delete_button.setBounds(350, 400, 100, 30);
        add(delete_button);
        delete_button.setBackground(Color.red);
        delete_button.setForeground(Color.WHITE);


        JButton show_button = new JButton("SHOW");
        show_button.setBounds(470, 400, 100, 30);
        add(show_button);
        show_button.setBackground(Color.red);
        show_button.setForeground(Color.WHITE);

        final JButton exit_button = new JButton("EXIT");
        exit_button.setBounds(590, 400, 100, 30);
        add(exit_button);
        exit_button.setBackground(Color.red);
        exit_button.setForeground(Color.WHITE);


        insert_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String query = "insert into book_issue values('" + first.getText().toString() + "','" + second.getText().toString() + "',"
                            + "'" + third.getText().toString() + "','" + fourth.getText().toString() + "','" + fifth.getText().toString() + "',"
                            + "'" + sixth.getText().toString() + "','" + seventh.getText().toString() + "','" + eighth.getText().toString() + "')";

                    statement.execute(query);
                    first.setText(null);
                    second.setText(null);
                    third.setText(null);
                    fourth.setText(null);
                    fifth.setText(null);
                    sixth.setText(null);
                    seventh.setText(null);
                    eighth.setText(null);


                } catch (SQLException ex) {
                    Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        });


        delete_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "delete from book_issue  where student_id=('" + second.getText().toString() + "')";
                    statement.execute(query);
                    second.setText(null);

                } catch (SQLException ex) {
                    Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });


        search_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                /*JFrame w=new JFrame("For searching");
                w.setBounds(200,40,400,200);
                w.setVisible(true);
                w.setBackground(Color.GREEN);
                
                JLabel w1=new JLabel();
                w1.setText("Enter your ID number   :");
                w1.setForeground(Color.black);
                w1.setBounds(10, 10, 150, 20);
                w.add(w1);*/




                final JFrame bookissue = new JFrame("TABLE FOR BOOK ISSUE");
                bookissue.setBounds(200, 40, 920, 520);
                bookissue.setVisible(true);


                JTable Bookissuetable = new JTable();
                JScrollPane jScrollPane1 = new JScrollPane();
                Bookissuetable.setVisible(true);
                JLabel jLabel1 = new JLabel();


                final JButton exit_button = new JButton("CLOSE");
                exit_button.setBounds(800, 400, 80, 30);
                bookissue.add(exit_button);
                exit_button.setBackground(Color.red);
                exit_button.setForeground(Color.WHITE);


                exit_button.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        bookissue.dispose();
                    }
                });

                Bookissuetable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null}
                        },
                        new String[]{
                            "student_name", "student_id", "phone_no", "book_name", "Renew_date", "Expire_date", "Amount_of_fees", "L_Account_no"
                        }));
                jScrollPane1.setViewportView(Bookissuetable);

                jLabel1.setText("Table for Book issue");
                bookissue.add(jLabel1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(bookissue.getContentPane());
                bookissue.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                try {
                    Class.forName(JDBC_DRIVER);
                    connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                    statement = (Statement) connection.createStatement();




                    // create Statement for querying database


                    // query database                                        
                    ResultSet resultSet = statement.executeQuery(
                            "SELECT  student_name, student_id, phone_no, book_name,Renew_date,Expire_date,Amount_of_fees,L_Account_no from book_issue where student_id=('" + second.getText().toString() + "')");
                    second.setText(null);
                    java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    DefaultTableModel dtm = new DefaultTableModel();
                    Vector column_name = new Vector();
                    Vector data_rows = new Vector();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        column_name.addElement(metaData.getColumnName(i));
                    }
                    dtm.setColumnIdentifiers(column_name);
                    while (resultSet.next()) {
                        data_rows = new Vector();
                        for (int j = 1; j <= numberOfColumns; j++) {
                            data_rows.addElement(resultSet.getString(j));
                        }
                        dtm.addRow(data_rows);
                    }
                    Bookissuetable.setModel(dtm);
                } catch (Exception x) {
                    x.printStackTrace();
                }

                bookissue.add(jScrollPane1);



            }
        });

        show_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                final JFrame bookissue = new JFrame("TABLE FOR BOOK ISSUE");
                bookissue.setBounds(200, 40, 920, 520);
                bookissue.setVisible(true);


                JTable Bookissuetable = new JTable();
                JScrollPane jScrollPane1 = new JScrollPane();
                Bookissuetable.setVisible(true);
                JLabel jLabel1 = new JLabel();

                final JButton exit_button = new JButton("CLOSE");
                exit_button.setBounds(800, 400, 80, 30);
                bookissue.add(exit_button);
                exit_button.setBackground(Color.red);
                exit_button.setForeground(Color.WHITE);


                exit_button.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        bookissue.dispose();
                    }
                });

                //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                Bookissuetable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null}
                        },
                        new String[]{
                            "student_name", "student_id", "phone_no", "book_name", "Renew_date", "Expire_date", "Amount_of_fees", "L_Account_no"
                        }));
                jScrollPane1.setViewportView(Bookissuetable);

                jLabel1.setText("Table for Book issue");
                bookissue.add(jLabel1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(bookissue.getContentPane());
                bookissue.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                try {
                    Class.forName(JDBC_DRIVER);
                    connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                    statement = (Statement) connection.createStatement();




                    // create Statement for querying database


                    // query database                                        
                    ResultSet resultSet = statement.executeQuery(
                            "SELECT  student_name, student_id, phone_no, book_name,Renew_date,Expire_date,Amount_of_fees,L_Account_no from book_issue");
                    java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    DefaultTableModel dtm = new DefaultTableModel();
                    Vector column_name = new Vector();
                    Vector data_rows = new Vector();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        column_name.addElement(metaData.getColumnName(i));
                    }
                    dtm.setColumnIdentifiers(column_name);
                    while (resultSet.next()) {
                        data_rows = new Vector();
                        for (int j = 1; j <= numberOfColumns; j++) {
                            data_rows.addElement(resultSet.getString(j));
                        }
                        dtm.addRow(data_rows);
                    }
                    Bookissuetable.setModel(dtm);
                } catch (Exception x) {
                    x.printStackTrace();
                }

                bookissue.add(jScrollPane1);




            }
        });



        exit_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

/////////////////this is for student_info list////////////////
        /////////////////////////////
        /////////////////////////////

        a.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                final JFrame nw = new JFrame();
                nw.setTitle("STUDENT INFORMATION");
                nw.setBounds(250, 40, 650, 450);
                nw.setLayout(null);
                nw.setVisible(true);
                nw.getContentPane().setBackground(Color.CYAN);
                nw.setDefaultCloseOperation(HIDE_ON_CLOSE);


                JLabel one = new JLabel();
                one.setText("Name                          :");
                one.setBounds(10, 30, 200, 20);
                nw.add(one);

                JLabel two = new JLabel();
                two.setText("Roll                              :");
                two.setBounds(10, 60, 200, 20);
                nw.add(two);

                JLabel three = new JLabel();
                three.setText(" Depertment              :");
                three.setBounds(10, 90, 200, 20);
                nw.add(three);

                JLabel four = new JLabel();
                four.setText(" Semester                  :");
                four.setBounds(10, 120, 200, 20);
                nw.add(four);

                JLabel five = new JLabel();
                five.setText("Contact no.                :");
                five.setBounds(10, 150, 200, 20);
                nw.add(five);



                final JTextField p = new JTextField();
                p.setBounds(170, 30, 150, 20);
                nw.add(p);
                p.setBackground(Color.WHITE);
                p.setForeground(Color.BLACK);

                final JTextField q = new JTextField();
                q.setBounds(170, 60, 150, 20);
                nw.add(q);
                q.setBackground(Color.WHITE);
                q.setForeground(Color.BLACK);




                final JTextField r = new JTextField();
                r.setBounds(170, 90, 150, 20);
                nw.add(r);
                r.setBackground(Color.WHITE);
                r.setForeground(Color.BLACK);


                final JTextField s = new JTextField();
                s.setBounds(170, 120, 150, 20);
                nw.add(s);
                s.setBackground(Color.WHITE);
                s.setForeground(Color.BLACK);

                final JTextField t = new JTextField();
                t.setBounds(170, 150, 150, 20);
                nw.add(t);
                t.setBackground(Color.WHITE);
                t.setForeground(Color.BLACK);



                JButton pp = new JButton("Add");
                pp.setBounds(10, 300, 100, 30);
                nw.add(pp);
                pp.setBackground(Color.red);
                pp.setForeground(Color.WHITE);
                setBackground(Color.red);

                JButton qq = new JButton("Delete");
                qq.setBounds(130, 300, 100, 30);
                nw.add(qq);
                qq.setBackground(Color.red);
                qq.setForeground(Color.WHITE);


                JButton rr = new JButton("Search");
                rr.setBounds(250, 300, 100, 30);
                nw.add(rr);
                rr.setBackground(Color.red);
                rr.setForeground(Color.WHITE);


                JButton ss = new JButton("SHOW");
                ss.setBounds(370, 300, 100, 30);
                nw.add(ss);
                ss.setBackground(Color.red);
                ss.setForeground(Color.WHITE);

                JButton tt = new JButton("EXIT");
                tt.setBounds(490, 300, 100, 30);
                nw.add(tt);
                tt.setBackground(Color.red);
                tt.setForeground(Color.WHITE);




                pp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            String query = "insert into student_info values('" + p.getText().toString() + "','" + q.getText().toString() + "',"
                                    + "'" + r.getText().toString() + "','" + s.getText().toString() + "','" + t.getText().toString() + "' )";

                            statement.execute(query);
                            p.setText(null);
                            q.setText(null);
                            r.setText(null);
                            s.setText(null);
                            t.setText(null);




                        } catch (SQLException ex) {
                            Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);

                        }

                    }
                });

                qq.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {


                        try {
                            String query = "delete from student_info  where Roll=('" + q.getText().toString() + "')";
                            statement.execute(query);
                            q.setText(null);

                        } catch (SQLException ex) {
                            Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                });

                rr.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {


                        final JFrame student = new JFrame("TABLE FOR STUDENTS");
                        student.setBounds(200, 40, 920, 520);
                        student.setVisible(true);


                        JTable studenttable = new JTable();
                        JScrollPane jScrollPane1 = new JScrollPane();
                        studenttable.setVisible(true);
                        JLabel jLabel1 = new JLabel();

                        final JButton exit_button = new JButton("CLOSE");
                        exit_button.setBounds(800, 400, 80, 30);
                        student.add(exit_button);
                        exit_button.setBackground(Color.red);
                        exit_button.setForeground(Color.WHITE);


                        exit_button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                student.dispose();
                            }
                        });




                        studenttable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null}
                                },
                                new String[]{
                                    "Name", "Roll", "Depertment", "Semester", "Contact_no"
                                }));
                        jScrollPane1.setViewportView(studenttable);

                        jLabel1.setText("Table for Students");
                        student.add(jLabel1);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(student.getContentPane());
                        student.getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                        try {
                            Class.forName(JDBC_DRIVER);
                            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                            statement = (Statement) connection.createStatement();




                            // create Statement for querying database


                            // query database                                        
                            ResultSet resultSet = statement.executeQuery(
                                    "SELECT  Name, Roll, Depertment, Semester,Contact_no from student_info where Roll=('" + q.getText().toString() + "')");
                            q.setText(null);
                            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                            int numberOfColumns = metaData.getColumnCount();
                            DefaultTableModel dtm = new DefaultTableModel();
                            Vector column_name = new Vector();
                            Vector data_rows = new Vector();
                            for (int i = 1; i <= numberOfColumns; i++) {
                                column_name.addElement(metaData.getColumnName(i));
                            }
                            dtm.setColumnIdentifiers(column_name);
                            while (resultSet.next()) {
                                data_rows = new Vector();
                                for (int j = 1; j <= numberOfColumns; j++) {
                                    data_rows.addElement(resultSet.getString(j));
                                }
                                dtm.addRow(data_rows);
                            }
                            studenttable.setModel(dtm);
                        } catch (Exception x) {
                            x.printStackTrace();
                        }

                        student.add(jScrollPane1);

                    }
                });

                ss.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        final JFrame student = new JFrame("TABLE FOR STUDENTS");
                        student.setBounds(200, 40, 920, 520);
                        student.setVisible(true);


                        JTable studenttable = new JTable();
                        JScrollPane jScrollPane1 = new JScrollPane();
                        studenttable.setVisible(true);
                        JLabel jLabel1 = new JLabel();

                        final JButton exit_button = new JButton("CLOSE");
                        exit_button.setBounds(800, 400, 80, 30);
                        student.add(exit_button);
                        exit_button.setBackground(Color.red);
                        exit_button.setForeground(Color.WHITE);


                        exit_button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                student.dispose();
                            }
                        });



                        studenttable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null}
                                },
                                new String[]{
                                    "Name", "Roll", "Depertment", "Semester", "Contact_no"
                                }));
                        jScrollPane1.setViewportView(studenttable);

                        jLabel1.setText("Table for Students");
                        student.add(jLabel1);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(student.getContentPane());
                        student.getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                        try {
                            Class.forName(JDBC_DRIVER);
                            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                            statement = (Statement) connection.createStatement();




                            // create Statement for querying database


                            // query database                                        
                            ResultSet resultSet = statement.executeQuery(
                                    "SELECT  Name, Roll, Depertment, Semester,Contact_no from student_info ");

                            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                            int numberOfColumns = metaData.getColumnCount();
                            DefaultTableModel dtm = new DefaultTableModel();
                            Vector column_name = new Vector();
                            Vector data_rows = new Vector();
                            for (int i = 1; i <= numberOfColumns; i++) {
                                column_name.addElement(metaData.getColumnName(i));
                            }
                            dtm.setColumnIdentifiers(column_name);
                            while (resultSet.next()) {
                                data_rows = new Vector();
                                for (int j = 1; j <= numberOfColumns; j++) {
                                    data_rows.addElement(resultSet.getString(j));
                                }
                                dtm.addRow(data_rows);
                            }
                            studenttable.setModel(dtm);
                        } catch (Exception x) {
                            x.printStackTrace();
                        }

                        student.add(jScrollPane1);

                    }
                });

                tt.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        nw.dispose();
                    }
                });





            }
        });

        //////this is for booklist menu item//////////////////////
        ///////////////////////////////////
        ///////////////////////////////
        /////////////////////////
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                final JFrame nw1 = new JFrame();
                nw1.setTitle("BOOKS INFORMATION");
                nw1.setBounds(250, 40, 650, 450);
                nw1.setLayout(null);
                nw1.setVisible(true);
                nw1.getContentPane().setBackground(Color.CYAN);
                nw1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


                JLabel one = new JLabel();
                one.setText("Serial no.                      :");
                one.setBounds(10, 30, 200, 20);
                nw1.add(one);

                JLabel two = new JLabel();
                two.setText("Books name                :");
                two.setBounds(10, 60, 200, 20);
                nw1.add(two);

                JLabel three = new JLabel();
                three.setText(" Author name              :");
                three.setBounds(10, 90, 200, 20);
                nw1.add(three);



                final JTextField p = new JTextField();
                p.setBounds(170, 30, 150, 20);
                nw1.add(p);
                p.setBackground(Color.WHITE);
                p.setForeground(Color.BLACK);

                final JTextField q = new JTextField();
                q.setBounds(170, 60, 150, 20);
                nw1.add(q);
                q.setBackground(Color.WHITE);
                q.setForeground(Color.BLACK);




                final JTextField r = new JTextField();
                r.setBounds(170, 90, 150, 20);
                nw1.add(r);
                r.setBackground(Color.WHITE);
                r.setForeground(Color.BLACK);


                JButton pp = new JButton("Add");
                pp.setBounds(10, 300, 100, 30);
                nw1.add(pp);
                pp.setBackground(Color.red);
                pp.setForeground(Color.WHITE);
                setBackground(Color.red);

                JButton qq = new JButton("Delete");
                qq.setBounds(130, 300, 100, 30);
                nw1.add(qq);
                qq.setBackground(Color.red);
                qq.setForeground(Color.WHITE);


                JButton rr = new JButton("Search");
                rr.setBounds(250, 300, 100, 30);
                nw1.add(rr);
                rr.setBackground(Color.red);
                rr.setForeground(Color.WHITE);


                JButton ss = new JButton("SHOW");
                ss.setBounds(370, 300, 100, 30);
                nw1.add(ss);
                ss.setBackground(Color.red);
                ss.setForeground(Color.WHITE);

                JButton tt = new JButton("EXIT");
                tt.setBounds(490, 300, 100, 30);
                nw1.add(tt);
                tt.setBackground(Color.red);
                tt.setForeground(Color.WHITE);


                pp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            String query = "insert into books values('" + p.getText().toString() + "','" + q.getText().toString() + "',"
                                    + "'" + r.getText().toString() + "' )";

                            statement.execute(query);
                            p.setText(null);
                            q.setText(null);
                            r.setText(null);



                        } catch (SQLException ex) {
                            Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);

                        }

                    }
                });

                qq.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            String query = "delete from books  where Book_name=('" + q.getText().toString() + "')";
                            statement.execute(query);
                            q.setText(null);

                        } catch (SQLException ex) {
                            Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                });

                rr.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        final JFrame book = new JFrame("TABLE FOR BOOK LISTS");
                        book.setBounds(200, 40, 920, 520);
                        book.setVisible(true);


                        JTable Booktable = new JTable();
                        JScrollPane jScrollPane1 = new JScrollPane();
                        Booktable.setVisible(true);
                        JLabel jLabel1 = new JLabel();

                        final JButton exit_button = new JButton("CLOSE");
                        exit_button.setBounds(800, 400, 80, 30);
                        book.add(exit_button);
                        exit_button.setBackground(Color.red);
                        exit_button.setForeground(Color.WHITE);


                        exit_button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                book.dispose();
                            }
                        });




                        Booktable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null}
                                },
                                new String[]{
                                    "serial_no", "Book_name", "Author_name"
                                }));
                        jScrollPane1.setViewportView(Booktable);

                        jLabel1.setText("Table for Book Lists");
                        book.add(jLabel1);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(book.getContentPane());
                        book.getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                        try {
                            Class.forName(JDBC_DRIVER);
                            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                            statement = (Statement) connection.createStatement();




                            // create Statement for querying database


                            // query database                                        
                            ResultSet resultSet = statement.executeQuery(
                                    "SELECT  serial_no, Book_name, Author_name  from books where Book_name=('" + q.getText().toString() + "')");
                            q.setText(null);
                            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                            int numberOfColumns = metaData.getColumnCount();
                            DefaultTableModel dtm = new DefaultTableModel();
                            Vector column_name = new Vector();
                            Vector data_rows = new Vector();
                            for (int i = 1; i <= numberOfColumns; i++) {
                                column_name.addElement(metaData.getColumnName(i));
                            }
                            dtm.setColumnIdentifiers(column_name);
                            while (resultSet.next()) {
                                data_rows = new Vector();
                                for (int j = 1; j <= numberOfColumns; j++) {
                                    data_rows.addElement(resultSet.getString(j));
                                }
                                dtm.addRow(data_rows);
                            }
                            Booktable.setModel(dtm);
                        } catch (Exception x) {
                            x.printStackTrace();
                        }

                        book.add(jScrollPane1);




                    }
                });





                ss.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {


                        final JFrame book = new JFrame("TABLE FOR BOOKS LIST");
                        book.setBounds(200, 40, 920, 520);
                        book.setVisible(true);


                        JTable Booktable = new JTable();
                        JScrollPane jScrollPane1 = new JScrollPane();
                        Booktable.setVisible(true);
                        JLabel jLabel1 = new JLabel();

                        final JButton exit_button = new JButton("CLOSE");
                        exit_button.setBounds(800, 400, 80, 30);
                        book.add(exit_button);
                        exit_button.setBackground(Color.red);
                        exit_button.setForeground(Color.WHITE);


                        exit_button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                book.dispose();
                            }
                        });




                        Booktable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null}
                                },
                                new String[]{
                                    "serial_no", "Book_name", "Author_name"
                                }));
                        jScrollPane1.setViewportView(Booktable);

                        jLabel1.setText("Table for Books List");
                        book.add(jLabel1);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(book.getContentPane());
                        book.getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                        try {
                            Class.forName(JDBC_DRIVER);
                            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                            statement = (Statement) connection.createStatement();




                            // create Statement for querying database


                            // query database                                        
                            ResultSet resultSet = statement.executeQuery(
                                    "SELECT  serial_no, Book_name, Author_name  from books");
                            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                            int numberOfColumns = metaData.getColumnCount();
                            DefaultTableModel dtm = new DefaultTableModel();
                            Vector column_name = new Vector();
                            Vector data_rows = new Vector();
                            for (int i = 1; i <= numberOfColumns; i++) {
                                column_name.addElement(metaData.getColumnName(i));
                            }
                            dtm.setColumnIdentifiers(column_name);
                            while (resultSet.next()) {
                                data_rows = new Vector();
                                for (int j = 1; j <= numberOfColumns; j++) {
                                    data_rows.addElement(resultSet.getString(j));
                                }
                                dtm.addRow(data_rows);
                            }
                            Booktable.setModel(dtm);
                        } catch (Exception x) {
                            x.printStackTrace();
                        }

                        book.add(jScrollPane1);



                    }
                });

                tt.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        nw1.dispose();

                    }
                });



            }
        });

///////////////This is for admin menun item/////////////////
///////////////////////////////////////
//////////////////////////////////////





        c.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                final JFrame nw2 = new JFrame();
                nw2.setTitle("ADMIN INFORMATION");
                nw2.setBounds(250, 40, 650, 450);
                nw2.setLayout(null);
                nw2.setVisible(true);
                nw2.getContentPane().setBackground(Color.CYAN);
                nw2.setDefaultCloseOperation(HIDE_ON_CLOSE);



                JLabel one = new JLabel();
                one.setText("Name                         :");
                one.setBounds(100, 30, 200, 20);
                nw2.add(one);

                JLabel two = new JLabel();
                two.setText("Rank                           :");
                two.setBounds(100, 60, 200, 20);
                nw2.add(two);

                JLabel three = new JLabel();
                three.setText(" Contact no.              :");
                three.setBounds(100, 90, 200, 20);
                nw2.add(three);


                final JTextField p = new JTextField();
                p.setBounds(250, 30, 150, 20);
                nw2.add(p);
                p.setBackground(Color.WHITE);
                p.setForeground(Color.BLACK);
                //ob.setVisible(true);
                final JTextField q = new JTextField();
                q.setBounds(250, 60, 150, 20);
                nw2.add(q);
                q.setBackground(Color.WHITE);
                q.setForeground(Color.BLACK);

                //ob.setBackground(Color.green);
                // setVisible(true);


                final JTextField r = new JTextField();
                r.setBounds(250, 90, 150, 20);
                nw2.add(r);
                r.setBackground(Color.WHITE);
                r.setForeground(Color.BLACK);


                JButton pp = new JButton("Add");
                pp.setBounds(10, 300, 100, 30);
                nw2.add(pp);
                pp.setBackground(Color.red);
                pp.setForeground(Color.WHITE);
                setBackground(Color.red);

                JButton qq = new JButton("Delete");
                qq.setBounds(130, 300, 100, 30);
                nw2.add(qq);
                qq.setBackground(Color.red);
                qq.setForeground(Color.WHITE);


                JButton rr = new JButton("Search");
                rr.setBounds(250, 300, 100, 30);
                nw2.add(rr);
                rr.setBackground(Color.red);
                rr.setForeground(Color.WHITE);


                JButton ss = new JButton("SHOW");
                ss.setBounds(370, 300, 100, 30);
                nw2.add(ss);
                ss.setBackground(Color.red);
                ss.setForeground(Color.WHITE);

                JButton tt = new JButton("EXIT");
                tt.setBounds(490, 300, 100, 30);
                nw2.add(tt);
                tt.setBackground(Color.red);
                tt.setForeground(Color.WHITE);


                pp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            String query = "insert into admin_info values('" + p.getText().toString() + "','" + q.getText().toString() + "',"
                                    + "'" + r.getText().toString() + "' )";

                            statement.execute(query);
                            p.setText(null);
                            q.setText(null);
                            r.setText(null);



                        } catch (SQLException ex) {
                            Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);

                        }

                    }
                });

                qq.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            String query = "delete from admin_info  where Name=('" + p.getText().toString() + "')";
                            p.setText(null);
                            statement.execute(query);
                            q.setText(null);

                        } catch (SQLException ex) {
                            Logger.getLogger(lms.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });


                rr.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        final JFrame admin = new JFrame("TABLE FOR ADMIN LISTS");
                        admin.setBounds(200, 40, 920, 520);
                        admin.setVisible(true);


                        JTable admintable = new JTable();
                        JScrollPane jScrollPane1 = new JScrollPane();
                        admintable.setVisible(true);
                        JLabel jLabel1 = new JLabel();

                        final JButton exit_button = new JButton("CLOSE");
                        exit_button.setBounds(800, 400, 80, 30);
                        admin.add(exit_button);
                        exit_button.setBackground(Color.red);
                        exit_button.setForeground(Color.WHITE);


                        exit_button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                admin.dispose();
                            }
                        });




                        admintable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null}
                                },
                                new String[]{
                                    "Name", "Rank", "Contact_no"
                                }));
                        jScrollPane1.setViewportView(admintable);

                        jLabel1.setText("Table for Admin Lists");
                        admin.add(jLabel1);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(admin.getContentPane());
                        admin.getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                        try {
                            Class.forName(JDBC_DRIVER);
                            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                            statement = (Statement) connection.createStatement();




                            // create Statement for querying database


                            // query database                                        
                            ResultSet resultSet = statement.executeQuery(
                                    "SELECT  Name, Rank, Contact_no  from admin_info where Name=('" + p.getText().toString() + "')");
                            p.setText(null);
                            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                            int numberOfColumns = metaData.getColumnCount();
                            DefaultTableModel dtm = new DefaultTableModel();
                            Vector column_name = new Vector();
                            Vector data_rows = new Vector();
                            for (int i = 1; i <= numberOfColumns; i++) {
                                column_name.addElement(metaData.getColumnName(i));
                            }
                            dtm.setColumnIdentifiers(column_name);
                            while (resultSet.next()) {
                                data_rows = new Vector();
                                for (int j = 1; j <= numberOfColumns; j++) {
                                    data_rows.addElement(resultSet.getString(j));
                                }
                                dtm.addRow(data_rows);
                            }
                            admintable.setModel(dtm);
                        } catch (Exception x) {
                            x.printStackTrace();
                        }

                        admin.add(jScrollPane1);

                    }
                });


                ss.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {


                        final JFrame admin = new JFrame("TABLE FOR ADMIN LIST");
                        admin.setBounds(200, 40, 920, 520);
                        admin.setVisible(true);


                        JTable admintable = new JTable();
                        JScrollPane jScrollPane1 = new JScrollPane();
                        admintable.setVisible(true);
                        JLabel jLabel1 = new JLabel();

                        final JButton exit_button = new JButton("CLOSE");
                        exit_button.setBounds(800, 400, 80, 30);
                        admin.add(exit_button);
                        exit_button.setBackground(Color.red);
                        exit_button.setForeground(Color.WHITE);


                        exit_button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                admin.dispose();
                            }
                        });




                        admintable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null},
                                    {null, null, null, null, null, null}
                                },
                                new String[]{
                                    "Name", "Rank", "Contact_no"
                                }));
                        jScrollPane1.setViewportView(admintable);

                        jLabel1.setText("Table for Admin List");
                        admin.add(jLabel1);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(admin.getContentPane());
                        admin.getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(157, 157, 157).addComponent(jLabel1))).addContainerGap()));
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(8, 8, 8).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(46, Short.MAX_VALUE)));



                        try {
                            Class.forName(JDBC_DRIVER);
                            connection = (Connection) DriverManager.getConnection(DATABASE_URL, "root", "");
                            statement = (Statement) connection.createStatement();




                            // create Statement for querying database


                            // query database                                        
                            ResultSet resultSet = statement.executeQuery(
                                    "SELECT  Name, Rank, Contact_no  from admin_info");
                            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
                            int numberOfColumns = metaData.getColumnCount();
                            DefaultTableModel dtm = new DefaultTableModel();
                            Vector column_name = new Vector();
                            Vector data_rows = new Vector();
                            for (int i = 1; i <= numberOfColumns; i++) {
                                column_name.addElement(metaData.getColumnName(i));
                            }
                            dtm.setColumnIdentifiers(column_name);
                            while (resultSet.next()) {
                                data_rows = new Vector();
                                for (int j = 1; j <= numberOfColumns; j++) {
                                    data_rows.addElement(resultSet.getString(j));
                                }
                                dtm.addRow(data_rows);
                            }
                            admintable.setModel(dtm);
                        } catch (Exception x) {
                            x.printStackTrace();
                        }

                        admin.add(jScrollPane1);

                    }
                });

                tt.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        nw2.dispose();
                    }
                });


            }
        });




//////////////////this is for menu item d//////////////////////
//////////////////////////////////////////////////////////

        d.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame nw3 = new JFrame();
                nw3.setTitle("RUET");
                //nw3.setBounds(250,40,650,450);
                //nw3.setLayout(null);
                nw3.setSize(400, 300);
                nw3.setVisible(true);
                // nw3.getContentPane().setBackground(Color.LIGHT_GRAY);
                nw3.setDefaultCloseOperation(HIDE_ON_CLOSE);



                JTextPane dd = new JTextPane();
                String s = ("Rajshahi University of Engineering and Technology(RUET) is one of most famous university all around the"
                        + "world. It has a very beautiful evergreen large campus. It is situated at Kazla,Talaimari,Rajshahi."
                        + "The univerity has three faculties with eight depertments now. It has more than three thousand students"
                        + " at undergraduate level. This university also provide MSC,MPhill,PhD in several subjects.   ");
                dd.setText(s);
                dd.setBackground(Color.LIGHT_GRAY);
                dd.setEditable(false);
                nw3.add(dd);

            }
        });

        /////This is for menu item e////////////
        /////////////////////////////////////


        e.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                JFrame nw3 = new JFrame();
                nw3.setTitle("RUET LIBRARY");
                //nw3.setBounds(250,40,650,450);
                //nw3.setLayout(null);
                nw3.setSize(400, 300);
                nw3.setVisible(true);
                nw3.getContentPane().setBackground(Color.WHITE);
                nw3.setDefaultCloseOperation(HIDE_ON_CLOSE);



                JTextPane ee = new JTextPane();
                String s = (" Rajshahi University of Engineering and Technology has an awesome library at the center part of the campus."
                        + " The library is nicely structured. Millions of books of various catagories are arranged in the library.   ");
                ee.setText(s);
                ee.setBackground(Color.LIGHT_GRAY);
                ee.setEditable(false);
                nw3.add(ee);

            }
        });

        Icon k = new ImageIcon(getClass().getResource("bookself.jpg"));
        JLabel passimage = new JLabel(k);
        passimage.setBounds(0, 0, 800, 650);
        add(passimage);


    }
}

public class Newlms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pass ob = new pass();
        ob.setTitle("****LIBRARY MANAGEMENT****");
        ob.setBounds(200, 40, 800, 650);
        ob.setLayout(null);
        ob.setVisible(true);
        ob.getContentPane().setBackground(Color.LIGHT_GRAY);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
