public class CMiAplicacion{
	
	public static void main(String[] args){
		CEcuacion ec1 = new CEcuacion();
		ec1.Ecuacion(1,-3.2,0,7);

		double r = ec1.ValorPara(1);
		System.out.println(r);

		r = ec1.ValorPara(1.5);
		System.out.println(r);

	}
}
