package HeartRates;

public class App {
		public static void main(String[] args) {
			//instancia��o FrontEnd requer dia, mes e ano atuais, respectivamente .
			//FrontEnd serve de intermedi�rio entre HeatRates e o usu�rio. 
			FrontEnd FrenteAtraz = new FrontEnd(2,03,2019);   
			FrenteAtraz.exibirDados();
		}
}
