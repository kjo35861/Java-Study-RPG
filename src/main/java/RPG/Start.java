package RPG;

import RPG.Route.RoutePath;
import RPG.Route.Routes;

public class Start {

    public static boolean gameStart = true;

    public static void main(String[] args) {

        System.out.println("게임 실행");

        RoutePath.current = Routes.CREATECHARACTER.name();

        while (gameStart) {
            Routes.valueOf(RoutePath.current).getView().render();
        }
    }
}
