package prueba;

public class ejercicio12 {

	public static void main(String[] args) {
		int votosSoe = 4;
		int votosPodemos = 3;
		int votosPP = 1;
		int votosCiu = 1;
		int votosVox = 1;
		int votosIzq = 0;
		int votosDer = 0;
		int porcentajeIzq;
		int porcentajeDer;
		int totalVotos;
		
		votosIzq = votosSoe + votosPodemos;
		votosDer = votosPP + votosCiu + votosVox;
		totalVotos = votosIzq+votosDer;
		porcentajeIzq = (votosIzq*100)/totalVotos;
		porcentajeDer = 100 - porcentajeIzq;
		
		System.out.println("Los votos de la izquierda son: " + votosIzq + " que constituyen el " + porcentajeIzq + "% del total y los votos de la derecha son: " + votosDer + " que constituyen el "+ porcentajeDer + "% del total");


	}

}