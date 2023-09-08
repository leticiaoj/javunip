import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizzaria {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Pizzaria");
		
		JPanel toppingPanel = new JPanel();
	    JPanel leftPanel = new JPanel();
	    JPanel rightPanel = new JPanel();
		JLabel toppingLabel = new JLabel("Selecione o sabor:");
		
		JCheckBox mussarelaChk = new JCheckBox("Mussarela");
		JCheckBox calabresaChk = new JCheckBox("Calabresa");
		JCheckBox atumChk = new JCheckBox("Atum");
		JCheckBox frangoChk = new JCheckBox("Frango");
		
		
		JCheckBox napolitanaChk = new JCheckBox("Napolitana");
		JCheckBox portuguesaChk = new JCheckBox("Portuguesa");
		JCheckBox margueritaChk = new JCheckBox("Marguerita");
		JCheckBox chocolateChk = new JCheckBox("Chocolate");
		
		toppingPanel.add(toppingLabel, BorderLayout.CENTER);
		leftPanel.setLayout(new GridLayout(0,1));
		leftPanel.add(mussarelaChk);
		leftPanel.add(calabresaChk);
		leftPanel.add(atumChk);
		leftPanel.add(frangoChk);
		
		rightPanel.setLayout(new GridLayout(0,1));
		rightPanel.add(napolitanaChk);
		rightPanel.add(portuguesaChk);
		rightPanel.add(margueritaChk);
		rightPanel.add(chocolateChk);
		
		JButton orderButton = new JButton("Fazer pedido");
		
		orderButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						
						StringBuilder orderDetails = new StringBuilder("Pedido:  ");
						if(mussarelaChk.isSelected()) {
							orderDetails.append("Mussarela");
						}
						if(calabresaChk.isSelected()) {
							orderDetails.append("Calabresa");
						}
						if(atumChk.isSelected()) {
							orderDetails.append("Atum");
						}
						if(frangoChk.isSelected()) {
							orderDetails.append("Frango");
						}
						if(napolitanaChk.isSelected()) {
							orderDetails.append("Napolitana");
						}
						if(portuguesaChk.isSelected()) {
							orderDetails.append("Portuguesa");
						}
						if(margueritaChk.isSelected()) {
							orderDetails.append("Marguerita");
						}
						if(chocolateChk.isSelected()) {
							orderDetails.append("Chocolate");
						}
						if(orderDetails.toString().equals("Pedido:  ")) {
							orderDetails.append("Nenhum sabor selecionado.");
						}
						JOptionPane.showMessageDialog(frame, orderDetails.toString());
					}
				});
		
		frame.setLayout(new BorderLayout());
		frame.add(toppingPanel, BorderLayout.NORTH);
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
		frame.add(orderButton, BorderLayout.SOUTH);
		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	

	}

}
