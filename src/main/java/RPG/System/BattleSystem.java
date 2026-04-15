package RPG.System;

import RPG.View.ResultView;

public class BattleSystem {
    private Player player;
    private Monster monster;
    private int round = 1;

    public void playerAttack() {

    }

    public void monsterAttack() {

    }

    public boolean isPlayerTurn() {
        return round % 2 != 0;
    }

    public void nextTurn() {
        round++;
    }

}
