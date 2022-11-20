package CoreJava_MyCode.v1ch06.interfaces.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every second
        var timer = new Timer(5000, listener);
        timer.start();

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("at the tone, the time is "
            + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
