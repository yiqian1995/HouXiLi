package ui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import ui.cfg.FrameConfig;

public class FrameCompounding extends JFrame{
	
	public FrameCompounding (){
		//���ô��ڴ�С
		this.setSize(320,300);
		//���ò��ֹ�����
		this.setLayout(new BorderLayout());
		//��������
		this.add(FrameConfig.createMainPanel(), BorderLayout.CENTER);
		//���ñ���
		this.setTitle("��������");
		
		//���Ĭ�Ϲر����ԣ����������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//������ı䴰�� 
		this.setResizable(false);
		//����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
				
		int x=(screen.width-this.getWidth())/2;
		int y=(screen.height-this.getHeight())/2 - 32;
		this.setLocation(x,y);

		//Ĭ�ϸô���Ϊ��ʾ
		this.setVisible(true);
	    
		
		}
	
}
