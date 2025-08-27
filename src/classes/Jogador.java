package classes;

public class Jogador {
    private String nome = "";
    private CombatControl combatControl = null;

    public Jogador(String nome, CombatControl turn){
        this.nome = nome;
        combatControl = turn;
        turn.incrementarTurnoJogadores();
    }

    public String descricao(){
        String saida = "\n\nDados do jogador \n";
        saida += "Nome: " + nome + "\n";
        saida += "CombatControl: " + combatControl.getIdentificador()+ "\n";
        saida += "Turno do jogador: "+ CombatControl.getTurnoDoJogador() + "\n";
        saida += "Codigo: " + combatControl.hashCode();
        return saida;
    }
}
