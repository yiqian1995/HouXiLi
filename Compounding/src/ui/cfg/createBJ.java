package ui.cfg;

import java.text.DecimalFormat;

public class createBJ extends create {
	public createBJ(String t1,String t2,String t3,String t4,String t5){
		super(t1,t2,t3,t4,t5);
		
	}
	@Override
	public String OperationFL(String t1, String t2, String t3, String t4, boolean TF) {
		DecimalFormat df = new DecimalFormat( "0.00 ");
		double I =Double.parseDouble(t1);//����
		double N =Integer.parseInt(t2);//����
		double F =Double.parseDouble(t4);//������ֵ
		double P=0;
		
		if(TF==true){
			int T =Integer.parseInt(t3);//��������
			P=F/Math.pow((1+I/T), N*T);//��������ı���
		}
		else
		{
			P=F/(1.0+I*N);//��������ı���
	
		}
		return ""+df.format(P);
	}

}
