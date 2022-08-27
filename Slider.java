/*
 * THIS IS A SIMPLE EXAMPLE OF JSLIDER IN REFERENCE WITH THERMOMETER
 */
package jslider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener{
    
    JFrame frame;
    JLabel label;
    JSlider slider;
    JPanel panel;
    
    Slider()
    {
	
	frame=new JFrame("JSlider Demo");
	label=new JLabel();
	slider=new JSlider(0,100,50);
	panel= new JPanel();
	
	slider.setPreferredSize(new Dimension(300,200));
	slider.setPaintTicks(true);
	slider.setPaintTrack(true);
	slider.setMajorTickSpacing(25);
	slider.setMinorTickSpacing(10);
	slider.setPaintLabels(true);
	slider.setFont(new Font("Serg UI", Font.PLAIN,16));
	slider.setOrientation(SwingConstants.VERTICAL); // by default it is horizontal
	label.setText("°C =  "+slider.getValue());

	slider.addChangeListener(this);
	label.setFont(new Font("Serg UI",Font.PLAIN,24));
	
	panel.add(slider);
	panel.add(label);
	frame.add(panel);
	frame.setSize(300,400);
	frame.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
	
	label.setText("°C =  "+slider.getValue());
    }
}