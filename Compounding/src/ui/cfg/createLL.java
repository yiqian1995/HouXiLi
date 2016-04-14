package ui.cfg;

import java.text.DecimalFormat;

public class createLL extends create {

	public createLL(String t1, String t2, String t3, String t4, String t5) {
		super(t1, t2, t3, t4, t5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String OperationFL(String t1, String t2, String t3, String t4, boolean TF) {
		DecimalFormat df = new DecimalFormat( "0.00 ");
		double P =Double.parseDouble(t1);//本金
		double N =Integer.parseInt(t2);//年限
		double F =Double.parseDouble(t4);//复利终值
		double I=0;//利率
		
		if(TF==true){
			int T =Integer.parseInt(t3);//复利次数
			I=(Math.pow(F/P, 1/(N*T))-1)*T;//复利求出利率
			//P=F/Math.pow((1+I/100/T), N*T);//复利求出的本金
		}
		else
		{
			I=((F/P)-1)/N;

		}
		return ""+df.format(I);
	}



}
