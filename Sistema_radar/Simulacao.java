package Sistema_radar;

public class Simulacao {

    public static void main(String[] arg){
        System.out.println("Simulação");

        Carro lancer = new Carro( "ACLR300", "Comodoro", 76, 0);
       

        Radar radar = new Radar(60, "Pistao Sul");
      
        radar.avaliarVelocidade(lancer);

        lancer.acelerar();
        lancer.acelerar(); 
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar(); 
        lancer.acelerar();
        lancer.acelerar();
        lancer.acelerar();
        lancer.setVelocidade(-60);

        
        radar.avaliarVelocidade(lancer);

        lancer.frear();

        radar.avaliarVelocidade(lancer);
    
    }
    
}
