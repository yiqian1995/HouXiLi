package ui.cfg;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
public class FrameConfig extends JFrame{
	
	public static create[] Panels = null;
	public FrameConfig(){
		

	}
/**
 * 创建按钮面板
 * @return
 */
	public static JPanel createButtonPanel(JButton jbCalculate) {
		
		//创建按钮面板，流式布局
		JPanel jp=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(jbCalculate);
		return jp;
	}
/**
 *创建主面板
 * @return
 */
	public static JTabbedPane createMainPanel() {
		Panels = new create[ ] {
				new createBJ("年利率：","存入年限：","年复利次数：","复利终值   ：","所需本金  ：") ,
				new createLL("现有本金:","存入年限：","年复利次数：","复利终值   ：","所需利率  ："),
				new createNX("现有本金:","年利率：","年复利次数：","复利终值   ：","所需年限  ："),
				new createBL("现有本金:","存入年限：","年复利次数：","年利率：","所求本利  ：")
		};
		saveRecord SAVE=new saveRecord();
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("求本金", Panels[0]);
		jtp.addTab("求利率", Panels[1]);
		jtp.addTab("求年限", Panels[2]);
		jtp.addTab("求本利", Panels[3]);
		jtp.addTab("记录", SAVE);
		return jtp;
	}
	
}
