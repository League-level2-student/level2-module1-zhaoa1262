package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	
	ArrayList<String> names = new ArrayList<String>();
	
	void run () {
		frame.setVisible(true);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		addName.setText("Add a name");
		viewNames.setText("View the names");
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter a name");
			names.add(name);
		}
		
		else if(e.getSource() == viewNames) {
			for(int i = 0; i < names.size(); i ++) {
				String sname = names.get(i);
			JOptionPane.showMessageDialog(null, "Guest #" + i + sname);
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
