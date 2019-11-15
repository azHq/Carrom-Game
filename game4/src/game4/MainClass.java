package game4;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("PULL GAME");
		frame.setBounds(1,1,970,1000);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarromGame pull=new CarromGame();
		
		frame.add(pull);
		frame.setVisible(true);
	}

}
