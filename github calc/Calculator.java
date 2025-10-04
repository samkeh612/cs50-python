package comp200;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtOption;
	private JTextArea txtResults;
	
	public Calculator() {
		setTitle("Addition Calculator");
		setSize(450, 450); //sets size of text area
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label3 = new JLabel(" ");
		txtResults = new JTextArea(10, 15);
		panel1.add(label3);
		panel1.add(txtResults);
	
		JPanel Buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
				
		JPanel Buttons3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		//sqrt button
		JButton sqrtButton = new JButton("sqrt");
		sqrtButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				if (txtNum1 == null || txtNum2 == null) {
					System.out.println("you haven't added any number: ");
				}else {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int sum = (int) (Math.pow(num1, 2) + Math.pow(num2, 2));
				int sqrt = (int) Math.sqrt(sum);
				txtResults.append("The divistion of : " + num1 + " and " + num2 + " is: " + sqrt + "\n");
				}	
			}
		});
		Buttons3.add(sqrtButton);
		
		//exit button
		JButton exitButton = new JButton("exit");
		exitButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Thank you for trusting us");
				System.exit(0);
			}
		});
		Buttons3.add(exitButton);
		JPanel button2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JButton one = new JButton("1");
		one.addMouseListener(new MouseAdapter() {
			
		});
		button2.add(one);
		
		JButton two = new JButton("2");
		two.addMouseListener(new MouseAdapter() {
			
		});
		button2.add(two);
		
		JButton three = new JButton("3");
		three.addMouseListener(new MouseAdapter() {
			
		});
		button2.add(three);
		//add button
		JButton addButton = new JButton("+");
		addButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			//while((txtOption.getText() != "no") || (txtOption.getText() != "No")|| (txtOption.getText() != "NO")) {
				if (txtNum1 == null || txtNum2 == null) {
					System.out.println("you haven't added any number: ");
				}else {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sum = num1 + num2;
				
				txtResults.append("The sum of : " + num1 + " and " + num2 + " is: " + sum + "\n");
				}	
			//}
		}
		});
		button2.add(addButton);
		//modulas button
		JButton modButton = new JButton("modulas");
		modButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (txtNum1 == null || txtNum2 == null) {
					System.out.println("you haven't added any number: ");
				}else {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sum = num2/num1;
				int mod = num2 - sum * num1;												
				
				txtResults.append("The modulas of : " + num1 + " and " + num2 + " is: " + mod + "\n");
				}	
			}
		});
		
		button2.add(modButton);
		
		JPanel button4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton four = new JButton("4");
		four.addMouseListener(new MouseAdapter() {
			
		});
		button4.add(four);
		
		
		JButton five = new JButton("5");
		five.addMouseListener(new MouseAdapter() {
			
		});
		button4.add(five);
		JButton six = new JButton("6");
		six.addMouseListener(new MouseAdapter() {
			
		});
		button4.add(six);
		
		//subtract button
		JButton subtButton = new JButton(" - ");
		subtButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (txtNum1 == null || txtNum2 == null) {
					System.out.println("you haven't added any number: ");
				}else {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sum = num1 - num2;
				
				txtResults.append("The subt of : " + num1 + " and " + num2 + " is: " + sum + "\n");
				}	
		}
		});
		//divide button
		button4.add(subtButton);
		JButton divButton = new JButton("/");
		divButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (txtNum1 == null || txtNum2 == null) {
					System.out.println("you haven't added any number: ");
				}else {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sum = num1/num2;
				
				txtResults.append("The divistion of : " + num1 + " and " + num2 + " is: " + sum + "\n");
				}	
		}
		});
		button4.add(divButton);

		JPanel button5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton sev = new JButton("7");
		sev.addMouseListener(new MouseAdapter() {
			
		});
		button5.add(sev);
		
		JButton eight = new JButton("8");
		eight.addMouseListener(new MouseAdapter() {
			
		});
		button5.add(eight);
		JButton nine = new JButton("9");
		nine.addMouseListener(new MouseAdapter() {
			
		});
		button5.add(nine);
		
		//multiply button
		JButton multButton = new JButton(" x ");
		multButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (txtNum1 == null || txtNum2 == null) {
					System.out.println("you haven't added any number: ");
				}else {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sum = num1 * num2;
				
				txtResults.append("The product of : " + num1 + " and " + num2 + " is: " + sum + "\n");
				}	
		}
		});
        button5.add(multButton);
		panel.add(panel1);
		panel.add(panel3);
		
		panel.add(Buttons);
		panel.add(button2);
		panel.add(button4);
		panel.add(button5);
		panel.add(Buttons3);
		panel.setBackground(java.awt.Color.BLUE);
		add(panel);
	}
	public static void main(String[] args) {
		Calculator frame = new Calculator();
		frame.setVisible(true);
		
	}

}
