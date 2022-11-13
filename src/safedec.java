import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.Format;
import java.util.Date;


public class safedec extends JFrame{
    public JPanel mainpanel;
    private JCheckBox servtype1;
    private JCheckBox servtype2;
    private JButton schedule;
    private JButton bill;
    private JPanel subpanel1;
    private JPanel subpanel2;
    private JPanel subpanel3;
    private JPanel subpanel4;
    private JPanel subpanel5;
    private JCheckBox servtype3;
    private JCheckBox servtype4;
    private JCheckBox servtype5;
    private JCheckBox servtype6;
    private JCheckBox sensortype1, sensortype2, sensortype3, sensortype4, sensortype5, sensortype6;
    private JLabel lab1;
    private JLabel lab2;
    private JLabel lab3;
    private JLabel servname1, servname2, servname3;
    private JLabel servname4, servname5, servname6;
    private JLabel billinfo;
    private JTextArea displaybill;
    private JTextField hrs_sch;
    private JLabel hrslabel;
    private JPanel hrs_panel;

    public safedec(String title)
    {
        super(title);
        mainpanel = new JPanel();
        this.setContentPane(mainpanel);


        subpanel1 = new JPanel();
        subpanel2 = new JPanel();
        subpanel3 = new JPanel();
        subpanel4 = new JPanel();
        subpanel5 = new JPanel();

        lab1 = new JLabel("Living Room");
        subpanel1.add(lab1);
        subpanel1.add(Box.createVerticalStrut(10));
        servname1 = new JLabel("services");
        servname4 = new JLabel("sensor types");
        subpanel1.add(servname1);
        servtype1 = new JCheckBox("Fire");
        servtype2 = new JCheckBox("security");
        subpanel1.add(servtype1);
        subpanel1.add(Box.createVerticalStrut(2));
        subpanel1.add(servtype2);
        subpanel1.add(Box.createVerticalStrut(10));
        subpanel1.add(servname4);
        sensortype1 = new JCheckBox("with camera");
        sensortype2 = new JCheckBox("without camera");
        subpanel1.add(sensortype1);
        subpanel1.add(Box.createVerticalStrut(2));
        subpanel1.add(sensortype2);
        //hrs_sch = new JTextField();
        //hrs_sch.setSize(5,5);
        //hrs_sch.setText("");
        Format sTime = DateFormat.getTimeInstance(DateFormat.SHORT);
        JLabel stimelabel = new JLabel("Start Time:");
        JFormattedTextField stimeinput = new JFormattedTextField(sTime);
        stimeinput.setValue(new Date());
        stimeinput.setColumns(20);
        subpanel1.add(Box.createVerticalStrut(10));
        subpanel1.add(stimelabel);
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(stimeinput);
        Format eTime = DateFormat.getTimeInstance(DateFormat.SHORT);
        JLabel etimelabel = new JLabel("End Time:");
        JFormattedTextField etimeinput = new JFormattedTextField(eTime);
        etimeinput.setValue(new Date());
        etimeinput.setColumns(20);
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(etimelabel);
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(etimeinput);
        //hrslabel = new JLabel("select hrs for days selected");
        //subpanel1.add(Box.createVerticalStrut(10));
        //subpanel1.add(hrslabel);
        //subpanel1.add(Box.createVerticalStrut(3));
        //subpanel1.add(hrs_sch);
        subpanel1.add(Box.createVerticalStrut(10));
        JLabel orlabel = new JLabel("AND ");
        subpanel1.add(orlabel);
        subpanel1.add(Box.createVerticalStrut(10));
        JTextField day_sch = new JTextField();
        JLabel daylabel = new JLabel("select number of days in a weeks ");
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(daylabel);
        // day_sch.setSize(5,5);
        day_sch.setText("");
        day_sch.setColumns(10);
        subpanel1.add(day_sch);

        subpanel1.setPreferredSize( new Dimension(300,400));
        subpanel1.setBackground(Color.green);
        subpanel1.setLayout(new BoxLayout(subpanel1, BoxLayout.Y_AXIS));

        lab2 = new JLabel("Room_1");
        servname2 = new JLabel("services");
        servname5 = new JLabel("sensor types");
        subpanel2.add(lab2);
        subpanel2.add(Box.createVerticalStrut(10));
        subpanel2.add(servname2);
        servtype3 = new JCheckBox("Fire");
        servtype4 = new JCheckBox("security");
        subpanel2.add(servtype3);
        subpanel2.add(Box.createVerticalStrut(2));
        subpanel2.add(servtype4);
        subpanel2.add(Box.createVerticalStrut(10));
        subpanel2.add(servname5);
        sensortype3 = new JCheckBox("with camera");
        sensortype4 = new JCheckBox("without camera");
        subpanel2.add(sensortype3);
        subpanel2.add(Box.createVerticalStrut(2));
        subpanel2.add(sensortype4);
        // JTextField hrs_sch2 = new JTextField();
        // hrs_sch2.setSize(5,5);
        // hrs_sch2.setText("");
        // JLabel hrslabel2 = new JLabel("select hrs for days selected");
        subpanel2.add(Box.createVerticalStrut(10));
        //subpanel2.add(hrslabel2);
        //subpanel2.add(Box.createVerticalStrut(3));
        //subpanel2.add(hrs_sch2);
        Format srTime = DateFormat.getTimeInstance(DateFormat.SHORT);
        JLabel srtimelabel = new JLabel("Start Time:");
        JFormattedTextField srtimeinput = new JFormattedTextField(srTime);
        srtimeinput.setValue(new Date());
        srtimeinput.setColumns(20);
        subpanel2.add(Box.createVerticalStrut(10));
        subpanel2.add(srtimelabel);
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(srtimeinput);
        Format erTime = DateFormat.getTimeInstance(DateFormat.SHORT);
        JLabel ertimelabel = new JLabel("End Time:");
        JFormattedTextField ertimeinput = new JFormattedTextField(erTime);
        ertimeinput.setValue(new Date());
        ertimeinput.setColumns(20);
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(ertimelabel);
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(ertimeinput);
        subpanel2.add(Box.createVerticalStrut(10));
        JLabel orlabel2 = new JLabel("AND");
        subpanel2.add(orlabel2);
        subpanel2.add(Box.createVerticalStrut(10));
        JTextField day_sch2 = new JTextField();
        JLabel daylabel2 = new JLabel("select number of days in a weeks");
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(daylabel2);
        // day_sch.setSize(5,5);
        day_sch2.setText("");
        day_sch2.setColumns(10);
        subpanel2.add(day_sch2);
        subpanel2.setPreferredSize( new Dimension(300,400));
        subpanel2.setBackground(Color.green);
        subpanel2.setLayout(new BoxLayout(subpanel2, BoxLayout.Y_AXIS));

        lab3 = new JLabel("Room_2");
        servname3 = new JLabel("services");
        servname6 = new JLabel("sensor types");
        subpanel3.add(lab3);
        subpanel3.add(Box.createVerticalStrut(10));
        subpanel3.add(servname3);
        servtype5 = new JCheckBox("Fire");
        servtype6 = new JCheckBox("security");
        subpanel3.add(servtype5);
        subpanel3.add(Box.createVerticalStrut(2));
        subpanel3.add(servtype6);
        subpanel3.add(Box.createVerticalStrut(10));
        subpanel3.add(servname6);
        sensortype5 = new JCheckBox("with camera");
        sensortype6 = new JCheckBox("without camera");
        subpanel3.add(sensortype5);
        subpanel3.add(Box.createVerticalStrut(2));
        subpanel3.add(sensortype6);
        //JTextField hrs_sch3 = new JTextField();
        //hrs_sch3.setSize(5,5);
        //hrs_sch3.setText("");
        //JLabel hrslabel3 = new JLabel("select hrs for days selected");
        subpanel3.add(Box.createVerticalStrut(10));
        Format sr2Time = DateFormat.getTimeInstance(DateFormat.SHORT);
        JLabel sr2timelabel = new JLabel("Start Time:");
        JFormattedTextField sr2timeinput = new JFormattedTextField(sr2Time);
        sr2timeinput.setValue(new Date());
        sr2timeinput.setColumns(20);
        subpanel3.add(Box.createVerticalStrut(10));
        subpanel3.add(sr2timelabel);
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(sr2timeinput);
        Format er2Time = DateFormat.getTimeInstance(DateFormat.SHORT);
        JLabel er2timelabel = new JLabel("End Time:");
        JFormattedTextField er2timeinput = new JFormattedTextField(er2Time);
        er2timeinput.setValue(new Date());
        er2timeinput.setColumns(20);
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(er2timelabel);
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(er2timeinput);
        //subpanel3.add(hrslabel3);
        //subpanel3.add(Box.createVerticalStrut(3));
        //subpanel3.add(hrs_sch3);
        subpanel3.add(Box.createVerticalStrut(10));
        JLabel orlabel3 = new JLabel("AND");
        subpanel3.add(orlabel3);
        subpanel3.add(Box.createVerticalStrut(10));
        JTextField day_sch3 = new JTextField();
        JLabel daylabel3 = new JLabel("select number of days in a weeks");
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(daylabel3);
        // day_sch.setSize(5,5);
        day_sch3.setText("");
        day_sch3.setColumns(10);
        subpanel3.add(day_sch3);
        subpanel3.setPreferredSize( new Dimension(300,400));
        subpanel3.setBackground(Color.green);
        subpanel3.setLayout(new BoxLayout(subpanel3, BoxLayout.Y_AXIS));

        mainpanel.add(subpanel1);
        mainpanel.add(subpanel2);
        mainpanel.add(subpanel3);

        JPanel userpanel = new JPanel();
        schedule = new JButton("Start monitoring");
        JLabel userlabel = new JLabel("username");
        userpanel.add(userlabel);
        JTextField username = new JTextField(20);
        userpanel.add(username);
        JLabel passlabel = new JLabel("password");
        userpanel.add(passlabel);
        JPasswordField password = new JPasswordField(20);
        userpanel.add(password);
        JLabel telephlabel = new JLabel("telephone");
        userpanel.add(telephlabel);
        JTextField telephone = new JTextField(20);
        userpanel.add(telephone);
        schedule.setPreferredSize(new Dimension(150,35));
        userpanel.setPreferredSize(new Dimension(300,300));
        userpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userpanel.add(schedule);
        JButton disarm = new JButton("Disarm");
        disarm.setPreferredSize(new Dimension(100,35));
        userpanel.add(disarm);
        mainpanel.add(userpanel);


        bill = new JButton("Check bill");
        bill.setPreferredSize(new Dimension(200,40));
        displaybill = new JTextArea("bill price :            ");
        displaybill.setBackground(Color.white);
        subpanel4.add(bill);
        subpanel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainpanel.add(subpanel4);

        schedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Schedule started");
                subpanel1.setBackground(Color.YELLOW);
                subpanel2.setBackground(Color.YELLOW);
                subpanel3.setBackground(Color.YELLOW);
                mainpanel.revalidate();
                mainpanel.repaint();

                ActionListener ticktock = new ActionListener() {
                    public void actionPerformed(ActionEvent evnt) {
                        subpanel2.setBackground(Color.RED);
                        mainpanel.revalidate();
                        mainpanel.repaint();

                        Toolkit.getDefaultToolkit().beep();

                        //Calling backend code frm here frm start monitoring button click and passing
                        // all input user object, room object, timer object
                        // Call backend function
                    }
                };
                Timer breakin = new Timer(1000, ticktock);
                breakin.setRepeats(false);
                breakin.start();
                JOptionPane.showMessageDialog(null," Break-in the building");

                Backendentrypoint bp = new Backendentrypoint();
                bp.EntryMainfunc();
            }
        });

        bill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel5.add(displaybill);
                mainpanel.add(subpanel5);
                mainpanel.revalidate();
                mainpanel.repaint();
            }
        });

        disarm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Stopping the Break-in alarm notification");
                subpanel1.setBackground(Color.GREEN);
                subpanel2.setBackground(Color.GREEN);
                subpanel3.setBackground(Color.GREEN);
                mainpanel.revalidate();
                mainpanel.repaint();
            }
        });
        mainpanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0));
        mainpanel.revalidate();
        mainpanel.repaint();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    public static void main(String[] args)
    {
        System.gc();
        JFrame frame1= new safedec("Design pattern gui");

        frame1.setVisible(true);

    }
}

