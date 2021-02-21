import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

public class formularz extends JFrame implements ActionListener  {

       private JLabel label,label2,label3;
        private JTextField pole1,pole2;
        private JTextArea tresc;
        private JButton przycisk;


        public formularz() {

            setTitle("formularz kontaktowy");

            setSize(500,600);
            setLayout(null);
            setResizable(false);

            label = new JLabel("panel kontaktowy");
            label.setBounds(150,10,150,50);
            label.setFont(new Font("Serif", Font.BOLD, 14));
            add(label);


            pole1 = new JTextField();

            pole1.setBounds(150,100,190,25);


            pole2 = new JTextField();
            pole2.setBounds(150,150,190,25);

            add(pole1);
            add(pole2);


            label2 = new JLabel("Enter your name");
            label3 = new JLabel("Enter your email");

            label2.setBounds(50,100,170,20);
            label2.setFont(new Font("Serif", Font.PLAIN, 14));
            label3.setBounds(50,150,170,20);
            label3.setFont(new Font("Serif", Font.PLAIN, 14));

            add(label2);
            add(label3);




            tresc = new JTextArea();
            tresc.setBounds(80,200,260,120);

            add(tresc);


            przycisk = new JButton("wyslij");
            przycisk.setBounds(200,360,120,30);
            setFont(new Font("verdana", Font.PLAIN, 11));
            add(przycisk);

            przycisk.addActionListener(this);

        }


        public static void main(String[] args) {

            formularz dane = new formularz();
            dane.setVisible(true);
            dane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }


        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource()==przycisk) {

                System.out.println("hello worlds");

            }


        }









}
