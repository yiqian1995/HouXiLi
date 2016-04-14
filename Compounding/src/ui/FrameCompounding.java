package ui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import ui.cfg.FrameConfig;

public class FrameCompounding extends JFrame{
	
	public FrameCompounding (){
		//设置窗口大小
		this.setSize(320,300);
		//设置布局管理器
		this.setLayout(new BorderLayout());
		//添加主面板
		this.add(FrameConfig.createMainPanel(), BorderLayout.CENTER);
		//设置标题
		this.setTitle("复利计算");
		
		//设计默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//不允许改变窗口 
		this.setResizable(false);
		//居中
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
				
		int x=(screen.width-this.getWidth())/2;
		int y=(screen.height-this.getHeight())/2 - 32;
		this.setLocation(x,y);

		//默认该窗口为显示
		this.setVisible(true);
	    
		
		}
	
}
