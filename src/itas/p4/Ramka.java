package itas.p4;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kaibr on 16.09.2016.
 */
public class Ramka extends JFrame {

    public Ramka() {

        initUI();
    }

    private void initUI() {

        setTitle("MnP generator");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        PanelPolnoc northPanel = new PanelPolnoc();
        JPanel centrPanel = new JPanel(new GridLayout(1,2));


        final TextArea wejscieText = new TextArea();
        final TextArea wyjcieText = new TextArea();

        centrPanel.add(wejscieText);
        centrPanel.add(wyjcieText);



        add(northPanel, BorderLayout.NORTH);
        add(centrPanel, BorderLayout.CENTER);


        JPanel southPanel = new JPanel(new BorderLayout());

        JButton aktywuj = new JButton("Aktywyj");

        southPanel.add(aktywuj, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        aktywuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wyjcieText.append("begin\n");
                for (String line : wejscieText.getText().split("\\n")) {
                    wyjcieText.append("insert into ecrm_view_support.sim_swap(sim,used) values ('" + line +"',0);\n");
                }
                wyjcieText.append("end;\n");
            }
        });

    }
}

