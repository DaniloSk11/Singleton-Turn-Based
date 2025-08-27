package classes;

public class CombatControl {
    private final String identificador = "GERÊNCIADOR DE TURNOS - RPG";
    private static int turnoDoJogador = 0;

    public String getIdentificador(){return identificador;}
    public static int getTurnoDoJogador(){return turnoDoJogador;}
    public void incrementarTurnoJogadores(){turnoDoJogador++;}

}
