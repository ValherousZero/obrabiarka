package itas.p4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kaibr on 16.09.2016.
 */
public class Panel extends JPanel{

    /*private void doStuffWithLine(String line) {
        String nowa;
        nowa = wklejacz.getText();
        wyniki.setText(nowa + "dodalem");
    }*/

    public Panel() {
        setBackground(Color.BLUE);
        setSize(900,600);
        setVisible(true);
        setLayout(new GridLayout(1,3));

        JTextArea wklejacz = new JTextArea(23,20);
        JButton przyc = new JButton("RUN");
        JTextArea wyniki = new JTextArea(23,20);


        wklejacz.setFont(new Font("Serif", Font.ITALIC, 16));
        wklejacz.setLineWrap(true);
        wklejacz.setWrapStyleWord(true);
        wklejacz.setSize(200,600);
        przyc.setSize(120,150);

        wyniki.setFont(new Font("Serif", Font.ITALIC, 16));
        wyniki.setLineWrap(true);
        wyniki.setWrapStyleWord(true);
        wyniki.setSize(500,600);

        add(wklejacz);
        add(przyc);
        add(wyniki);



        przyc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (String line : wklejacz.getText().split("\\n")) {
                    wyniki.append(line + "dodalem");
                }

            }
        });


    }




}
