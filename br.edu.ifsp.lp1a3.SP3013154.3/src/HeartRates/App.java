package HeartRates;

public class App {
		public static void main(String[] args) {
			//instanciação FrontEnd requer dia, mes e ano atuais, respectivamente .
			//FrontEnd serve de intermediário entre HeatRates e o usuário. 
			FrontEnd FrenteAtraz = new FrontEnd(2,03,2019);   
			FrenteAtraz.exibirDados();
		}
}
