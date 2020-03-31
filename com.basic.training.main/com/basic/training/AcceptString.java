package com.basic.training;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcceptString {
	private String str;
	
	public AcceptString(String str)
	{
		this.str=str;
	}
	
	public String getStr() {
		return str.toString();
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void acceptConsole() {
		Scanner in = new Scanner (System.in);
		String str=in.nextLine();
		System.out.println("You entered string "+str);
	}
	
	public void acceptFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\vikto\\git\\BasicTraining\\com.basic.training.main\\testString");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
						
		}
	}
	
	public void acceptGUI() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container= frame.getContentPane();
		container.setLayout(new FlowLayout());
		
		final JTextField textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(150, 25));
		
		final JLabel label= new JLabel("Input string");
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = textfield.getText();
				System.out.println("Input");
				
				label.setText(input);
				System.out.println("The string is "+ input);
			}
			
		});
		container.add(textfield);
		container.add(label);
		container.add(ok);
		
		frame.setVisible(true);
		
	}
	

}
