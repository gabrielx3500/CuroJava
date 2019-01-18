public class Test {
	public static void main(String[] args){
		//CCuenta cuenta01 = new CCuenta();
		CCuentaAhorro cuenta01 = new CCuentaAhorro();
		cuenta01.asignarNombre("Un Nombre");
		cuenta01.asignarCuenta("Una cuenta");
		cuenta01.asignarTipoDeInteres(2.5);
		cuenta01.ingreso(12000);
		cuenta01.reintegro(3000);

		System.out.println(cuenta01.obtenerNombre());
		System.out.println(cuenta01.obtenerCuenta());
		System.out.println(cuenta01.estado());
		System.out.println(cuenta01.obtenerTipoDeInteres());
		

	}
}