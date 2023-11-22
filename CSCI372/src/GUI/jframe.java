package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import inheritance.checkingAccount;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;


public class jframe extends JFrame {
	
	jframe(){
		
		setLayout( new GridBagLayout() );;
		setBackground(Color.white);
		setSize(500,500);
		setTitle("Hello World! Bank");
		
		checkingAccount Long = new checkingAccount("Long", "Chang", "1234");
		setLayout( new GridBagLayout() );
		GridBagConstraints layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 10);
		
		//create name panel
		JLabel outputName = new JLabel();
		outputName.setText( Long.getname() );
		JPanel namePanel = new JPanel();
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		add(namePanel.add(outputName), layoutConst);
		
		//create Balance panel
		JLabel balance = new JLabel();
		balance.setText("Balance: " + Long.getBalance() + "");
		JPanel balancePanel = new JPanel();
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		add(balancePanel.add(balance), layoutConst);
		
		//create Button Panel
		JPanel buttonsPanel = new JPanel();
		
		JButton depositBTN = new JButton("Deposit");
		JButton withdrawBTN = new JButton("Withdraw");
		buttonsPanel.add(depositBTN);
		buttonsPanel.add(withdrawBTN);
		
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		add(buttonsPanel,layoutConst); 
		
		//create transaction panel
	      
		JPanel transactionPanel = new JPanel();
		JTextField textField = new JTextField(10);
			
		JButton depositingBTN = new JButton("Deposit!");
		JButton withdrawingBTN = new JButton("Withdraw!");
		
		transactionPanel.add(depositingBTN);
		transactionPanel.add(withdrawingBTN);
		transactionPanel.add(textField);
		transactionPanel.setVisible(false);
		add(transactionPanel, layoutConst);
		
		
		//listeners
		depositBTN.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						
						depositingBTN.setVisible(true);
						buttonsPanel.setVisible(false);
						transactionPanel.setVisible(true);
						withdrawingBTN.setVisible(false);
							
					}
				}
		);
		
		withdrawBTN.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						
						withdrawingBTN.setVisible(true);
						buttonsPanel.setVisible(false);
						transactionPanel.setVisible(true);;
						depositingBTN.setVisible(false);
						
					}
				}
		);
		

		
		withdrawingBTN.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						
					double amount = Double.parseDouble(textField.getText());
					Long.withdraw(amount);
					balance.setText("Balance: " + Long.getBalance() + "");
					System.out.print(Long.getBalance());
					transactionPanel.setVisible(false);
					buttonsPanel.setVisible(true);
					textField.setText("");
					
					} catch(Exception x){
						System.out.print("invalid number!");
					}
				}
			}
			
		);
		
		depositingBTN.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							
						double amount = Double.parseDouble(textField.getText());
						Long.deposit(amount);
						balance.setText("Balance: " + Long.getBalance() + "");
						System.out.print(Long.getBalance());
						transactionPanel.setVisible(false);
						buttonsPanel.setVisible(true);
						textField.setText("");
						
						} catch(Exception x){
							System.out.print("invalid number!");
						}
					}
				}
				
			);
		
	}
	
	


}
