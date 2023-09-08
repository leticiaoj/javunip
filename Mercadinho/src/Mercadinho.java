import javax.swing.*;
import java.awt.*;


public class Mercadinho {

	
	public static void main(String[] args) {
		
		
		
		JFrame frame = new JFrame("Mercadinho");
		
		JPanel toppingPanel = new JPanel();
		JLabel toppingPanelLabel = new JLabel("Escolha a quantidade de produtos desejados:");
		toppingPanel.add(toppingPanelLabel);
		
		
		GridLayout grid = new GridLayout(5,3);
		JPanel midPanel = new JPanel(grid);
		
		Integer[] quantidade = {0,1,2,3,4,5,6,7,8,9,10};
		
		
		JLabel produtoLabel = new JLabel("Produtos");
		JLabel precoLabel = new JLabel("Preço");
		JLabel quantLabel = new JLabel("Quantidade");
		
		JLabel agsanLabel = new JLabel("Água sanitária");
		JLabel agsanPrice = new JLabel("7.49");
		JComboBox<Integer> agsanBox = new JComboBox<>(quantidade);
		
		JLabel cafeLabel = new JLabel("Café");
		JLabel cafePrice = new JLabel("15.99");
		JComboBox<Integer> cafeBox = new JComboBox<>(quantidade);
		
		JLabel sabpoLabel = new JLabel("Sabão em pó");
		JLabel sabpoPrice = new JLabel("19.90");
		JComboBox<Integer> sabpoBox = new JComboBox<>(quantidade);
		
		JLabel danabel = new JLabel("Danone");
		JLabel danPrice = new JLabel("9.99");
		JComboBox<Integer> danBox = new JComboBox<>(quantidade);
		
		
		midPanel.add(produtoLabel);
		midPanel.add(precoLabel);
		midPanel.add(quantLabel);
		
		midPanel.add(agsanLabel);
		midPanel.add(agsanPrice);
		midPanel.add(agsanBox);
		
		midPanel.add(cafeLabel);
		midPanel.add(cafePrice);
		midPanel.add(cafeBox);
		
		midPanel.add(sabpoLabel);
		midPanel.add(sabpoPrice);
		midPanel.add(sabpoBox);
		
		midPanel.add(danLabel);
		midPanel.add(danPrice);
		midPanel.add(danBox);
		
		
		JPanel bottonPanel = new JPanel();
		JButton botao = new JButton("Finalizar pedido");
		
		botao.addActionListener(e -> {
			double precoAgsan = Double.parseDouble(agsanPrice.getText()) * (Integer)agsanBox.getSelectedItem();
			double precoCafe = Double.parseDouble(cafePrice.getText()) * (Integer)cafeBox.getSelectedItem();
			double precoSabpo = Double.parseDouble(sabpoPrice.getText()) * (Integer)sabpoBox.getSelectedItem();
			double precoDan = Double.parseDouble(danPrice.getText()) * (Integer)danBox.getSelectedItem();
			double precoTotal = (precoAgsan + precoCafe + precoSabpo + precoDan);
			StringBuilder pedido = new StringBuilder("Valor total do pedido: R$");
			pedido.append(precoTotal);
			JOptionPane.showMessageDialog(frame, pedido);
		});
		
		
		
		
		bottonPanel.add(botao);
		
		
		
		frame.add(toppingPanel, BorderLayout.NORTH);
		frame.add(midPanel, BorderLayout.CENTER);
		frame.add(bottonPanel, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setVisible(true);
}
		
	}

	
