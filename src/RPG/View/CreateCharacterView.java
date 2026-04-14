package RPG.View;

import RPG.Input.Input;
import RPG.Route.RoutePath;
import RPG.Route.Routes;
import RPG.System.*;

public class CreateCharacterView implements View {

    public void render() {
        mainMenu();
        String cmd = Input.Input();
        Player.playerName = cmd;
        Player.playerHP = 10;
        Player.playerAttack = 500;
        System.out.println(Player.playerName+ "(으)로 캐릭터가 생성되었습니다.");
        RoutePath.current = Routes.MAIN.name();

    }

    private void mainMenu() {
        System.out.println("======<<CREATE>>======");
        System.out.println("플레이어 이름을 입력하세요.");
        System.out.println("======================");
    }

}
