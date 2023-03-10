
public class Eje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ingresos = 698082;
		int vehiculo = 3;
		int immueble = 3;		
		if((ingresos >= 498083)&&
			(vehiculo >=3)&&
			(immueble >=3))
		{System.out.println("Ingresos Altos");	
		}else if((ingresos >= 398083)&&
				(vehiculo <=2)&&
				(immueble <=2)) {
			System.out.println("Ingresos Medios");
		}else if((ingresos < 398083)&&
				(vehiculo <=1)&&
				(immueble <=1)) {
			System.out.println("Ingresos menores");
		}	
	}

}
