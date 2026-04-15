package RPG.View;

import RPG.Input.Input;
import RPG.Route.RoutePath;
import RPG.Route.Routes;
import RPG.Start;
import RPG.System.Monster;

public class MainView implements View{

    public void render() {
        MainMenu();
        String cmd = Input.Input();
        if ("1".equals(cmd)) {
            Monster.meetMonster();
            RoutePath.current = Routes.BATTLE.name();

        } else if ("2".equals(cmd)) {
            System.out.println("현재 불가능");

        } else if ("3".equals(cmd)) {
            RoutePath.current = Routes.INFO.name();

        } else if ("4".equals(cmd)) {
            System.out.println("현재 불가능");

        } else if ("5".equals(cmd)) {
            System.out.println("현재 불가능");

        } else if ("q".equals(cmd)) {
            Start.gameStart = false;
            System.out.println("======<< 게임 종료 >>======");

        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }

    private void MainMenu() {
        System.out.println("======<<MAIN>>======");
        System.out.println("1. 모험을 떠난다");
        System.out.println("2. 휴식");
        System.out.println("3. 정보");
        System.out.println("4. 인벤토리");
        System.out.println("5. 상점");
        System.out.println("q. 게임 종료");
        System.out.println("====================");
    }
}
