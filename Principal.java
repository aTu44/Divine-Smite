import modelos.Slot;

public class Principal {
    public static void main(String[] args) {
        String hud = """
        **********************************

        Qual o nivel da magia?

        Magia de nivel 1 = 2d8
        Magia de nivel 2 = 3d8
        Magia de nivel 3 = 4d8
        Magia de nivel 4 ou superior = 5d8

        """;
        System.out.println(
        "Então você arcetou um golpe é que usar o seu DIVINE SMITE!! Muito bem, mas primeiro precisamos de algumas informações! ");
        System.out.println("\n" + hud);

        Slot ataque = new Slot();
        ataque.slot();
        ataque.bonusNivel();
        ataque.danoVantagem();
        ataque.danoCritico();
        ataque.resistencia();
    }
}
