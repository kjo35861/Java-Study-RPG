package RPG.View;

import RPG.Input.Input;
import RPG.Route.RoutePath;
import RPG.Route.Routes;
import RPG.System.Player;

public class InfoView implements View {

    public void render() {
        infoMenu();
        String cmd = Input.Input();
        if (cmd != null) {
            RoutePath.current = Routes.MAIN.name();
        }
    }

    private void infoMenu() {
        System.out.println("==========<<INFO>>==========");
        System.out.println("이  름 : " + Player.playerName);
        System.out.println("레  벨 : " + Player.playerLv);
        System.out.println("체  력 : " + Player.playerHP);
        System.out.println("공격력 : " + Player.playerAttack);
        System.out.println("소지금 : " + Player.playerMoney);
        System.out.println("============================");
        System.out.println("메인메뉴로 돌아가려면 Enter...");

    }
}
