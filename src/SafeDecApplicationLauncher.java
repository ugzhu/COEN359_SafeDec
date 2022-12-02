import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SafeDecApplicationLauncher extends JFrame{
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
    private JButton cleardisplay;
    private JButton validateinput;
    public SafeDecApplicationLauncher(String title)
    {
        super(title);
        mainpanel = new JPanel();
        this.setContentPane(mainpanel);

        final String[] billuserinfo = new String[1];
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
        servtype2 = new JCheckBox("Security");
        subpanel1.add(servtype1);
        subpanel1.add(Box.createVerticalStrut(2));
        subpanel1.add(servtype2);
        subpanel1.add(Box.createVerticalStrut(10));
        subpanel1.add(servname4);
        sensortype1 = new JCheckBox("Security service with camera");
        sensortype2 = new JCheckBox("Security service without camera");
        subpanel1.add(sensortype1);
        subpanel1.add(Box.createVerticalStrut(2));
        subpanel1.add(sensortype2);

        Format sTime = new SimpleDateFormat("HH:mm:ss");
        JLabel stimelabel = new JLabel("Start Time:");
        JFormattedTextField stimeinput = new JFormattedTextField(sTime);
        stimeinput.setValue(new Date());
        stimeinput.setColumns(20);
        subpanel1.add(Box.createVerticalStrut(10));
        subpanel1.add(stimelabel);
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(stimeinput);
        Format eTime = new SimpleDateFormat("HH:mm:ss");
        JLabel etimelabel = new JLabel("End Time:");
        JFormattedTextField etimeinput = new JFormattedTextField(eTime);
        etimeinput.setValue(new Date());
        etimeinput.setColumns(20);
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(etimelabel);
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(etimeinput);

        subpanel1.add(Box.createVerticalStrut(10));
        //JLabel orlabel = new JLabel("AND ");
        //subpanel1.add(orlabel);
        subpanel1.add(Box.createVerticalStrut(10));
        JTextField day_sch = new JTextField();
        JLabel daylabel = new JLabel("Schedule for days");
        subpanel1.add(Box.createVerticalStrut(3));
        subpanel1.add(daylabel);

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
        servtype4 = new JCheckBox("Security");
        subpanel2.add(servtype3);
        subpanel2.add(Box.createVerticalStrut(2));
        subpanel2.add(servtype4);
        subpanel2.add(Box.createVerticalStrut(10));
        subpanel2.add(servname5);
        sensortype3 = new JCheckBox("Security service with camera");
        sensortype4 = new JCheckBox("Security service without camera");
        subpanel2.add(sensortype3);
        subpanel2.add(Box.createVerticalStrut(2));
        subpanel2.add(sensortype4);

        subpanel2.add(Box.createVerticalStrut(10));

        Format srTime = new SimpleDateFormat("HH:mm:ss");
        JLabel srtimelabel = new JLabel("Start Time:");
        JFormattedTextField srtimeinput = new JFormattedTextField(srTime);
        srtimeinput.setValue(new Date());
        srtimeinput.setColumns(20);
        subpanel2.add(Box.createVerticalStrut(10));
        subpanel2.add(srtimelabel);
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(srtimeinput);
        Format erTime = new SimpleDateFormat("HH:mm:ss");
        JLabel ertimelabel = new JLabel("End Time:");
        JFormattedTextField ertimeinput = new JFormattedTextField(erTime);
        ertimeinput.setValue(new Date());
        ertimeinput.setColumns(20);
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(ertimelabel);
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(ertimeinput);
        subpanel2.add(Box.createVerticalStrut(10));
        //JLabel orlabel2 = new JLabel("AND");
        //subpanel2.add(orlabel2);
        subpanel2.add(Box.createVerticalStrut(10));
        JTextField day_sch2 = new JTextField();
        JLabel daylabel2 = new JLabel("Schedule for days");
        subpanel2.add(Box.createVerticalStrut(3));
        subpanel2.add(daylabel2);

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
        servtype6 = new JCheckBox("Security");
        subpanel3.add(servtype5);
        subpanel3.add(Box.createVerticalStrut(2));
        subpanel3.add(servtype6);
        subpanel3.add(Box.createVerticalStrut(10));
        subpanel3.add(servname6);
        sensortype5 = new JCheckBox("Security service with camera");
        sensortype6 = new JCheckBox("Security service without camera");
        subpanel3.add(sensortype5);
        subpanel3.add(Box.createVerticalStrut(2));
        subpanel3.add(sensortype6);

        subpanel3.add(Box.createVerticalStrut(10));
        Format sr2Time = new SimpleDateFormat("HH:mm:ss");
        JLabel sr2timelabel = new JLabel("Start Time:");
        JFormattedTextField sr2timeinput = new JFormattedTextField(sr2Time);
        sr2timeinput.setValue(new Date());
        sr2timeinput.setColumns(20);
        subpanel3.add(Box.createVerticalStrut(10));
        subpanel3.add(sr2timelabel);
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(sr2timeinput);
        Format er2Time = new SimpleDateFormat("HH:mm:ss");
        JLabel er2timelabel = new JLabel("End Time:");
        JFormattedTextField er2timeinput = new JFormattedTextField(er2Time);
        er2timeinput.setValue(new Date());
        er2timeinput.setColumns(20);
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(er2timelabel);
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(er2timeinput);

        subpanel3.add(Box.createVerticalStrut(10));
        //JLabel orlabel3 = new JLabel("AND");
        //subpanel3.add(orlabel3);
        subpanel3.add(Box.createVerticalStrut(10));
        JTextField day_sch3 = new JTextField();
        JLabel daylabel3 = new JLabel("Schedule for days");
        subpanel3.add(Box.createVerticalStrut(3));
        subpanel3.add(daylabel3);

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
        validateinput = new JButton("Validate input");
        validateinput.setPreferredSize(new Dimension(150,35));
        schedule = new JButton("Start monitoring");
        JLabel userlabel = new JLabel("Username");
        userpanel.add(userlabel);
        JTextField username = new JTextField(20);
        userpanel.add(username);
        JLabel passlabel = new JLabel("Password");
        userpanel.add(passlabel);
        JPasswordField password = new JPasswordField(20);
        userpanel.add(password);
        JLabel telephlabel = new JLabel("Telephone");
        userpanel.add(telephlabel);
        JTextField telephone = new JTextField(20);
        userpanel.add(telephone);
        schedule.setPreferredSize(new Dimension(150,35));
        userpanel.setPreferredSize(new Dimension(300,300));
        userpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userpanel.add(validateinput);
        userpanel.add(schedule);
        JButton disarm = new JButton("Disarm monitoring");
        disarm.setPreferredSize(new Dimension(150,35));
        userpanel.add(disarm);
        mainpanel.add(userpanel);


        bill = new JButton("Display bill");
        bill.setPreferredSize(new Dimension(200,40));
        subpanel4.add(bill);

        cleardisplay = new JButton("Clear bill");
        cleardisplay.setPreferredSize(new Dimension(200,40));
        subpanel4.add(cleardisplay);

        subpanel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainpanel.add(subpanel4);

        ArrayList<HashMap<String, Object>> roominfo = new ArrayList<HashMap<String, Object>>();
        final Factory[] serviceobj2 = new Factory[1];
        final Factory[] serviceobj3 = new Factory[1];

        HashMap<String, Object> lvr = new HashMap<>();
        HashMap<String, Object> rm1 = new HashMap<>();
        HashMap<String, Object> rm2 = new HashMap<>();
        final User[] userinput = new User[1];

        schedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Creating service obj with camera/camera_not boolean
                // Fetching user inputs given in UI
                // Fetching living room security service selected value, creation of security object
                // Fetching with camera and without camera values and passing to security service object
                // Fetching start time and end time for schedule object
                if (servtype1.isSelected()) {
                    System.out.println("text is "+servtype1.getText());
                    lvr.put("Fire", true);
                }
                if (!servtype1.isSelected()) {
                    System.out.println("text is "+servtype1.getText());
                    lvr.put("Fire", false);
                }
                if (servtype2.isSelected()) {
                    System.out.println("text is "+servtype2.getText());
                    lvr.put("Security", true);
                    if (sensortype1.isSelected())
                    {
                        System.out.println("text is "+sensortype1.getText());
                        lvr.put("Camera", true);
                    }
                    else
                    {
                        System.out.println("text is "+sensortype2.getText());
                        lvr.put("Camera", false);
                    }

                }
                if (!servtype2.isSelected()) {
                    System.out.println("text is "+servtype1.getText());
                    lvr.put("Security", false);
                }
                lvr.put("id", 1);
                lvr.put("days", day_sch.getText());

                if (servtype3.isSelected()) {
                    System.out.println("text is "+servtype3.getText());
                    rm1.put("Fire", true);
                }
                if (!servtype3.isSelected()) {
                    System.out.println("text is "+servtype3.getText());
                    rm1.put("Fire", false);
                }
                if (servtype4.isSelected()) {
                    rm1.put("Security", true);
                    System.out.println("text is "+servtype4.getText());
                    if (sensortype3.isSelected())
                    {
                        rm1.put("Camera", true);
                        System.out.println("text is "+sensortype3.getText());

                    }
                    else
                    {
                        rm1.put("Camera", false);
                        System.out.println("text is "+sensortype4.getText());

                    }

                }
                if (!servtype4.isSelected()) {
                    rm1.put("Security", false);
                }
                rm1.put("id", 2);
                rm1.put("days", day_sch2.getText());

                if (servtype5.isSelected()) {
                    System.out.println("text is "+servtype5.getText());
                    rm2.put("Fire", true);

                }
                if (!servtype5.isSelected()) {
                    System.out.println("text is "+servtype5.getText());
                    rm2.put("Fire", false);
                }
                if (servtype6.isSelected()) {
                    System.out.println("text is "+servtype6.getText());
                    rm2.put("Security", true);
                    if (sensortype5.isSelected())
                    {
                        rm2.put("Camera", true);
                        System.out.println("text is "+sensortype5.getText());

                    }
                    else
                    {
                        rm2.put("Camera", false);
                        System.out.println("text is "+sensortype6.getText());

                    }

                }
                if (!servtype6.isSelected()) {
                    System.out.println("text is " + servtype6.getText());
                    rm2.put("Security", false);
                }
                rm2.put("id", 3);
                rm2.put("days", day_sch3.getText());

                // Creating Userobject
                System.out.println("username is "+ username.getText());
                String uservalue = username.getText();
                String passwordvalue = new String(password.getPassword());
                System.out.println("password is "+passwordvalue);
                String telephonevalue = telephone.getText();
                System.out.println("telephone is "+telephonevalue);

                userinput[0] = new HomeUser(uservalue, passwordvalue, telephonevalue);
                username.setText("");
                password.setText("");
                telephone.setText("");

                JOptionPane.showMessageDialog(null,"Schedule Started !");
                subpanel1.setBackground(Color.YELLOW);
                subpanel2.setBackground(Color.YELLOW);
                subpanel3.setBackground(Color.YELLOW);
                mainpanel.revalidate();
                mainpanel.repaint();

                // Creating schedule obj per room
                System.out.println("start time value for hall is "+ stimeinput.getText() );
                System.out.println("end time value for hall is "+etimeinput.getText());
                System.out.println("start time value for room2 is "+ sr2timeinput.getText() );
                System.out.println("end time value for room2 is "+er2timeinput.getText());
                System.out.println("start time value for room1 "+srtimeinput.getText());
                System.out.println("end time value for room1 "+ertimeinput.getText());

                lvr.put("startTime", stimeinput.getText());
                lvr.put("endTime", etimeinput.getText());
                rm1.put("startTime", srtimeinput.getText());
                rm1.put("endTime", ertimeinput.getText());
                rm2.put("startTime", sr2timeinput.getText());
                rm2.put("endTime", er2timeinput.getText());

                //Calling backend code frm here frm start monitoring button click and passing
                // all input user object, room object(service object with camera or not
                // and schedule object) shld be passed to below backend object's main function

                // passing id, service object, schedule object in constructor.
                // iterate over this arraylist for bill generation

                // passing service obj(bool with_camera/without_camera) and schedule obj
                roominfo.add(lvr);
                roominfo.add(rm1);
                roominfo.add(rm2);

                // passing userobj as well to backend entry class object to store the info at backend
                BackendEntryPoint bp = new BackendEntryPoint();
                billuserinfo[0] = bp.EntryMainfunc(roominfo, userinput[0]);

                ActionListener ticktock = new ActionListener() {
                    public void actionPerformed(ActionEvent evnt) {

                        for(int i = 0 ; i < 25; i++) {
                            Toolkit.getDefaultToolkit().beep();
                            subpanel2.setBackground(Color.RED);
                            mainpanel.revalidate();
                            mainpanel.repaint();
                            try {
                                    Thread.sleep(100);
                            }catch(InterruptedException  x) {

                            }
                        }
                    }
                };
                Timer breakin1 = new Timer(2000, ticktock);
                breakin1.setRepeats(false);
                breakin1.start();

            }
        });

        bill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //subpanel5.setPreferredSize(new Dimension(500, 300));
                displaybill = new JTextArea(billuserinfo[0]);
                displaybill.setBackground(Color.white);
                displaybill.setPreferredSize(new Dimension(500, 300));
                displaybill.setLineWrap(true);
                subpanel5.add(displaybill);
                mainpanel.add(subpanel5);
                mainpanel.revalidate();
                mainpanel.repaint();
            }


        });

        cleardisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel5.remove(displaybill);
                mainpanel.add(subpanel5);
                mainpanel.revalidate();
                mainpanel.repaint();
            }


        });

        validateinput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("username is "+ username.getText());
                String uservalue = username.getText();
                String passwordvalue = new String(password.getPassword());
                System.out.println("password is "+passwordvalue);
                String telephonevalue = telephone.getText();
                System.out.println("telephone is "+telephonevalue);

                validate(telephonevalue);
            }


        });

        disarm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Stopping the Break-in alarm notification");
                String user = username.getText();
                System.out.println("user is "+user);
                String passw = new String(password.getPassword());
                System.out.println("passwd is "+passw);
                String telestr = telephone.getText();
                System.out.println("telestr is "+telestr);
                System.out.println("userobj user is "+userinput[0].get_user());
                System.out.println("userobj passwdd  is "+userinput[0].get_password());
                System.out.println("userobj telephone  is "+userinput[0].get_telephone());
                if (!user.equals(userinput[0].get_user()) )
                {
                    JOptionPane.showMessageDialog(null,"Username doesnt match");
                }
                if (!(passw.equals(userinput[0].get_password()))) {
                    JOptionPane.showMessageDialog(null,"Password doesnt match");
                }
                if (!(telestr.equals(userinput[0].get_telephone()))) {
                    JOptionPane.showMessageDialog(null,"Telephone doesnt match");
                }
                if ((user.equals(userinput[0].get_user())) && (passw.equals(userinput[0].get_password())) && (telestr.equals(userinput[0].get_telephone())) ) {
                    subpanel1.setBackground(Color.GREEN);
                    subpanel2.setBackground(Color.GREEN);
                    subpanel3.setBackground(Color.GREEN);
                    username.setText("");
                    password.setText("");
                    telephone.setText("");
                    servtype1.setSelected(false);
                    servtype2.setSelected(false);
                    servtype3.setSelected(false);
                    servtype4.setSelected(false);
                    servtype5.setSelected(false);
                    servtype6.setSelected(false);
                    sensortype1.setSelected(false);
                    sensortype2.setSelected(false);
                    sensortype3.setSelected(false);
                    sensortype4.setSelected(false);
                    sensortype5.setSelected(false);
                    sensortype6.setSelected(false);
                    subpanel1.repaint();
                    subpanel1.revalidate();
                    subpanel2.repaint();
                    subpanel2.revalidate();
                    subpanel3.repaint();
                    subpanel3.revalidate();
                    mainpanel.revalidate();
                    mainpanel.repaint();
                }
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
        JFrame frame1= new SafeDecApplicationLauncher("SafeDec portal");

        frame1.setVisible(true);

    }

    public boolean validate(String telephonevalue)
    {
        // Telephone validation
        Pattern p = Pattern.compile(
                "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");

        Matcher m = p.matcher(telephonevalue);
        if (m.matches() == false)
        {
            System.out.println("here");
            JOptionPane.showMessageDialog(mainpanel,"Please enter correct telephone number");
            return false;
        }
        JOptionPane.showMessageDialog(mainpanel,"Inputs are validated!");
        return true;
    }
}

