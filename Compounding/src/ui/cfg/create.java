package ui.cfg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public abstract class create extends JPanel{
	
	
	public create(String t1,String t2,String t3,String t4,String t5){
		String Ts[] = new String[]{t1,t2,t3,t4,t5};
		
	    JButton JbCalculate = new JButton("����");
	    
	    JButton Empty = new JButton("���");
	    
	    JTextField[] Texts =new JTextField[4];//�����
	    
	    JLabel[] Txts =new JLabel[6];//�ı���ʾ��
	    
		JRadioButton Fu=new JRadioButton("��������",true);
		JRadioButton Dan=new JRadioButton("��������",false);
		ButtonGroup bg=new ButtonGroup();//��ť��
		
		for(int i=0;i<Txts.length -1;i++)
		{
			Txts[i]=new JLabel();
			Txts[i].setText(Ts[i]);
		}
		Txts[5]=new JLabel();
		
		init(Txts,Texts,Fu);
		init2(bg,Fu,Dan,JbCalculate,Empty);
		
		/**
		 * ���㰴ť����
		 */
		JbCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ToCalculate(Txts[5],Texts,Fu);
            	repaint();
            }
        });
		/**
		 * ��հ�ť����
		 */
		Empty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	empty(Texts,Txts[5]);
            	repaint();
            }
        });
		/**
		 * ������ť����
		 */
		Dan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	empty(Texts,Txts[5]);
            	Texts[2].setEditable(false);
            	repaint();
            }
        });
		/**
		 * ������ť����
		 */
		Fu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	empty(Texts,Txts[5]);
            	Texts[2].setEditable(true);
            	repaint();
            }
        });
	}
	//���
		protected void empty(JTextField[] Texts,JLabel Txts) {
			for(int i=0;i<Texts.length;i++)
			{
				Texts[i].setText("");
			}
			Txts.setText("");
			
			
			
	}
		//���㰴ťӦ�ü��㷽��
		private void ToCalculate(JLabel TXT6,JTextField Texts[],JRadioButton Fu) {
			//�ж��Ƿ��и�ֵ
			if(Texts[0].getText().equals("")||Texts[1].getText().equals("")||Texts[3].getText().equals(""))
			{
				 JOptionPane.showMessageDialog(this,"������ֵ","��ʾ",
                         JOptionPane.ERROR_MESSAGE);
			}
			else {
				TXT6.setText(OperationFL(Texts[0].getText(),Texts[1].getText(),Texts[2].getText(),Texts[3].getText(),Fu.isSelected()));
			}
		}
		
		public void init(JLabel Txts[],JTextField Texts[],JRadioButton Fu)
		{
			this.setLayout(null);
			for(int i=0;i<Texts.length;i++){
			Texts[i]=new JTextField();
			Texts[i].setText("");
			Texts[i].setBounds(110, 40+i*35, 100, 20);
			this.add(Texts[i]);
			}
			for(int i=0;i<Txts.length-1;i++){
				Txts[i].setBounds(30, 40+i*35, 100, 20);
				this.add(Txts[i]);
				}
			Txts[5].setBounds(110, 180, 100, 20);
			this.add(Txts[5]);
			
		}
		
		
		public void init2(ButtonGroup bg,JRadioButton Fu,JRadioButton Dan,JButton JbCalculate,JButton Empty){
			bg.add(Dan);
			bg.add(Fu);
			
			this.setLayout(null);
			JbCalculate.setBounds(220, 200, 70, 20);
			Empty.setBounds(120, 200, 70, 20);
			this.add(JbCalculate);
			this.add(Empty);
			Dan.setBounds(30, 10, 100, 20);
			Fu.setBounds(140, 10, 100, 20);
			this.add(Dan);
			this.add(Fu);
			
		}
		abstract public String OperationFL(String t1,String t2,String t3,String t4,boolean TF);

}
