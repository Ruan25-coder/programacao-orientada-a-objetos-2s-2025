package Sistema_radar;

public class Simulacao {

    public static void main(String[] arg){
        System.out.println("Simulação");

        Carro lancer = new Carro();
        lancer.ano = 76;
        lancer.modelo = "Comodoro";
        lancer.placa = "ACLR300";
        lancer.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistao Sul";

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
        

        radar.avaliarVelocidade(lancer);
    
    }
    
}
