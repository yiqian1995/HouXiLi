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
 * ������ť���
 * @return
 */
	public static JPanel createButtonPanel(JButton jbCalculate) {
		
		//������ť��壬��ʽ����
		JPanel jp=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(jbCalculate);
		return jp;
	}
/**
 *���������
 * @return
 */
	public static JTabbedPane createMainPanel() {
		Panels = new create[ ] {
				new createBJ("�����ʣ�","�������ޣ�","�긴��������","������ֵ   ��","���豾��  ��") ,
				new createLL("���б���:","�������ޣ�","�긴��������","������ֵ   ��","��������  ��"),
				new createNX("���б���:","�����ʣ�","�긴��������","������ֵ   ��","��������  ��"),
				new createBL("���б���:","�������ޣ�","�긴��������","�����ʣ�","������  ��")
		};
		saveRecord SAVE=new saveRecord();
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("�󱾽�", Panels[0]);
		jtp.addTab("������", Panels[1]);
		jtp.addTab("������", Panels[2]);
		jtp.addTab("����", Panels[3]);
		jtp.addTab("��¼", SAVE);
		return jtp;
	}
	
}
