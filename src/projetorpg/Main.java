package projetorpg;

import classes.CombatControl;
import classes.Jogador;

public class Main {
    public static void main(String[] args) {
        CombatControl cc = new CombatControl();

        Jogador godfrey = new Jogador("Godfrey", cc);

        System.out.println(godfrey.descricao());

        Jogador godfroy = new Jogador("Godfroy", cc);

        System.out.println(godfroy.descricao());

        Jogador godwyn = new Jogador("Godwyn", cc);

        System.out.println(godwyn.descricao());
    }
}