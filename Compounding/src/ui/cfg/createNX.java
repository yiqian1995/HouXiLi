package ui.cfg;

import java.text.DecimalFormat;

public class createNX extends create {

	public createNX(String t1, String t2, String t3, String t4, String t5) {
		super(t1, t2, t3, t4, t5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String OperationFL(String t1, String t2, String t3, String t4, boolean TF) {
		DecimalFormat df = new DecimalFormat( "0.00 ");
		double P =Double.parseDouble(t1);//����
		double I =Double.parseDouble(t2);//����
		double F =Double.parseDouble(t4);//������ֵ
		
		int i=1;
		if(TF==true){
			int T =Integer.parseInt(t3);//��������
			
			for(i=1;;i++)
			{
				if(F<=P*Math.pow(1+I/T, i*T)  ){
					break;
				}
			}
			//P=F/Math.pow((1+I/100/T), N*T);//��������ı���
		}
		else
		{
			for(i=1;;i++)
			{
				if(F<=P+P*(1+I)*i  ){
					break;
				}
			}
			
		}
		return ""+i;
	}

}
