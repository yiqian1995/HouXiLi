package ui.cfg;

import java.text.DecimalFormat;

public class createBL extends create {

	public createBL(String t1, String t2, String t3, String t4, String t5) {
		super(t1, t2, t3, t4, t5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String OperationFL(String t1, String t2, String t3, String t4, boolean TF) {
		DecimalFormat df = new DecimalFormat( "0.00 ");
		double P =Double.parseDouble(t1);//����
		double N =Integer.parseInt(t2);//����
		double I =Double.parseDouble(t4);//����
		double F=0;//����
		
		if(TF==true){
			int T =Integer.parseInt(t3);//��������
			F=P*Math.pow((1+I/T), N*T);//�����������
		}
		else
		{
			F=P+P*I*N;
		}
		return ""+df.format(F);
	}

}
