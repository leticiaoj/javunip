import java.awt.*;
import javax.swing.*;


public class Imc {

	public static void main(String[] args) {


		JFrame frame = new JFrame("Cálculo de IMC");
		
		JPanel toppingPanel = new JPanel();
		JPanel bottonPanel = new JPanel();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		
		JLabel toppingLabel = new JLabel("Preencha os campos.");
		
		JTextField heightTextField = new JTextField(10);
		JLabel heightLabel = new JLabel("Informe a altura.");
		
		JTextField weightTextField = new JTextField(10);
		JLabel weightLabel = new JLabel("Informe o peso.");
		
		JButton calcButton = new JButton("Calcular");
		
		calcButton.addActionListener(e -> {
			double height = Double.parseDouble(heightTextField.getText());
			double weight = Double.parseDouble(weightTextField.getText());
			double imc =  weight / (height * height);
			StringBuilder resultadoImc = new StringBuilder("IMC: ");
			resultadoImc.append(imc);
			JOptionPane.showMessageDialog(frame, resultadoImc);
		});
		
		toppingPanel.add(toppingLabel);
		bottonPanel.add(calcButton);
		
		leftPanel.add(weightLabel, BorderLayout.NORTH);
		leftPanel.add(weightTextField, BorderLayout.CENTER);
		
		
		rightPanel.add(heightLabel, BorderLayout.NORTH);
		rightPanel.add(heightTextField, BorderLayout.CENTER);
		
		frame.add(toppingPanel, BorderLayout.NORTH);
		frame.add(bottonPanel, BorderLayout.SOUTH);
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
	
		
		frame.setSize(450,230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
