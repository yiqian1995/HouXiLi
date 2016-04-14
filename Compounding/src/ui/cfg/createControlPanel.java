package ui.cfg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class createControlPanel extends JPanel{
	private static JButton jbCalculate = new JButton("计算");
	private static JTextField text1 = new JTextField();
	private static JTextField text2 = new JTextField();
	private static JTextField text3 = new JTextField();
	private static JTextField text4 = new JTextField();
	private static JLabel TXT1=new JLabel("年利率(%)：");
	private static JLabel TXT2=new JLabel("存入年限   ：");
	private static JLabel TXT3=new JLabel("年复利次数：");
	private static JLabel TXT4=new JLabel("复利终值   ：");
	private static JLabel TXT5=new JLabel("所需本金  ：");
	private static JLabel TXT6=new JLabel();
	private static JRadioButton Fu=new JRadioButton("复利计算",true);
	private static JRadioButton Dan=new JRadioButton("单利计算",false);
	private ButtonGroup bg=new ButtonGroup();
	public createControlPanel(){
		init();
		init2();
		jbCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ToCalculate();
            	repaint();
            }
        });
	}
	private void ToCalculate() {
		if(text1.getText()!=null)
		{
			 double i=Integer.parseInt(text1.getText());

			
			TXT6.setText(text1.getText());
		}
		
		
	}
	public void init()
	{
		this.setLayout(null);
		
		text1.setBounds(110, 40, 100, 20);
		text2.setBounds(110, 75, 100, 20);
		text3.setBounds(110, 110, 100, 20);
		text4.setBounds(110, 145, 100, 20);
		TXT1.setBounds(30, 40, 100, 20);
		TXT2.setBounds(30, 75, 100, 20);
		TXT3.setBounds(30, 110, 100, 20);
		TXT4.setBounds(30, 145, 100, 20);
		TXT5.setBounds(30, 180, 100, 20);
		TXT6.setBounds(115,180, 100, 20);
		this.add(TXT1);
		this.add(TXT2);
		this.add(TXT3);
		this.add(TXT4);
		this.add(TXT5);
		
		this.add(TXT6);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(text4);
	}
	public void init2(){
		bg.add(Dan);
		bg.add(Fu);
		
		this.setLayout(null);
		jbCalculate.setBounds(220, 200, 70, 20);
		this.add(jbCalculate);
		Dan.setBounds(30, 10, 100, 20);
		Fu.setBounds(140, 10, 100, 20);
		this.add(Dan);
		this.add(Fu);
		
	}
}
