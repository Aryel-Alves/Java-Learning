package n5_Ponto2D;

public class TestaPonto2D {

	public static void main(String[] args) {
		Ponto2D PontoA = new Ponto2D(10,20);
		Ponto2D PontoB = new Ponto2D(5,5);
		Ponto2D PontoC = new Ponto2D();
		
		System.out.println("Coordenadas dos Pontos");
		System.out.printf("A: " + PontoA.toString() + "\n");
		System.out.printf("B: " + PontoB.toString() + "\n");
		System.out.printf("C: " + PontoC.toString() + "\n");
		System.out.println();
		System.out.printf("Euclidean A/B: %f \n\n",PontoA.EuclideanDistance(PontoB));
		
		PontoC.setX(30);
		PontoC.setY(30);
		System.out.printf("C: " + PontoC.toString() + "\n");


	}

}
