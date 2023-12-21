public class NivelHeroi {
    public static void main(String[] args) throws Exception {
        String nomeHeroi = "Thais";
        int xp = 100;
        String nivel = "";

        while (xp<=1000) {
            nivel = "Ferro";
            break;
        }

        while (xp>=1001 && xp<=2000) {
            nivel = "Bronze";
            break;
        }

        while (xp>=2001 && xp<=5000) {
            nivel = "Prata";
            break;
        }

        while (xp>=5001 && xp<=7000) {
            nivel = "Ouro";
            break;
        }

        while (xp>=7001 && xp<=8000) {
            nivel = "Platina";
            break;
        }

        while (xp>=8001 && xp<=9000) {
            nivel = "Ascendente";
            break;
        }

        while (xp>=9001 && xp<=10000) {
            nivel = "Imortal";
            break;
        }

        while (xp>=10001) {
            nivel = "Radiante";
            break;
        }
        
        System.out.printf("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
}
}