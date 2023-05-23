public class BmiApp{
	public static void main(String[] args){
		double bmi = calcBMI(170.0,71.2);
		System.out.printf("BMI:%.2f%n",bmi);
	}
		/*
	 * cslcBMIメゾット
	 * 身長CMと体重KgからBMIを求めるメゾット
	 * 引数:heighCm(double)身長cm,weightkg(double)体重kg
	 * 戻り値:bmi(double)
	 */
	public static double calcBMI(double heightCm,double weightkg){
		double heightM = heightCm/100;
		double bmi = weightkg / (heightCm/100*heightCm/100);
		return bmi;
	}
}
