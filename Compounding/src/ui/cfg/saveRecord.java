package ui.cfg;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class saveRecord extends JPanel {
	private JComboBox Box;
	private JLabel[] Txts=new JLabel[5];
/**
 * 
 */
	public saveRecord() {
		String[] s = { "Serif", "SansSerif", "Monospaced", "Dialog" };
		Box = new JComboBox(s);
		Box.setBounds(30, 10, 70, 20);
		this.add(Box);
		
		for(int i=0;i<Txts.length;i++)
		{
			Txts[i]=new JLabel();
		}
		Txts = new JLabel[ ] {
				new JLabel("现有本金:"),
				new JLabel("年利率：") ,
				new JLabel("存入年限   ："),
				new JLabel("年复利次数："),
				new JLabel("复利终值   ："),
		};
		init(Txts);
	}
	
	public void init(JLabel Txts[])
	{
		
		
		
		
		this.setLayout(null);
		for(int i=0;i<Txts.length;i++){
			Txts[i].setBounds(30, 50+i*35, 100, 20);
			this.add(Txts[i]);
			}
	}
}
