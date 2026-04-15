package RPG.View;

import RPG.Route.RoutePath;
import RPG.Route.Routes;
import RPG.Start;
import RPG.System.Monster;


public class ResultView implements View {

    public void render() {                              // false = win / true = defeat
        if (Monster.fightResult == false) {
            winMenu();
        } else if (Monster.fightResult == true) {
            defeatMenu();
        }
    }


    private void defeatMenu() {
        System.out.println("공략에 실패하였습니다...");
        Start.gameStart = false;
        System.out.println("======<< GAME OVER >>======");
    }

    private void winMenu() {
        System.out.println("모험에서 승리하였습니다!");
        BattleView.battleStart = true;
        RoutePath.current = Routes.MAIN.name();
    }
}
