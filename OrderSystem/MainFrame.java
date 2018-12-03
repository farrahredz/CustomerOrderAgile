package OrderSystem;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MainFrame extends JFrame {
	public MainFrame() {
		getContentPane().setLayout(new GridLayout(6, 2));
		
		JButton btnCustomer = new JButton("Customer");
		getContentPane().add(btnCustomer);
		
		JButton btnSupplier = new JButton("Supplier");
		getContentPane().add(btnSupplier);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
