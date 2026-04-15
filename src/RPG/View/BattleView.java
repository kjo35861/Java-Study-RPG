package RPG.View;

import RPG.Input.Input;
import RPG.Route.RoutePath;
import RPG.Route.Routes;
import RPG.System.*;


public class BattleView implements View {
    int round = 1;
    public static boolean battleStart = true;
    public void render() {
        if (battleStart) {                          // 전투 시작 시 1회만 작동
            System.out.println("[ 전투 시작! ]");
            monsterInfo();
            battleStart = false;
        }

        if (Monster.monsterHP > 0) {
            if (round % 2 == 0) {           // 몬스터 턴
                monsterAttack();
                round++;

            } else if (round % 2 != 0) {    // 플레이어 턴
                battleMenu();
                String cmd = Input.Input();

                if ("1".equals(cmd)) {
                    playerAttack();

                } else if ("2".equals(cmd)) {
                    System.out.println("사용 불가");        // 포션 코드 안만듬 임시 방편
                    round--;                                //

                } else {
                    System.out.println("잘못된 입력입니다.");
                    round--;
                }
                round++;
            }
        }

        if (Monster.monsterHP <= 0) {                    // 몬스터 토벌 성공
            Monster.fightResult = false;
            round = 1;
            RoutePath.current = Routes.RESULT.name();
        }

        if (Player.playerHP <= 0) {                     // 플레이어 체력 0 이하일 시 게임 종료
            Monster.fightResult = true;
            RoutePath.current = Routes.RESULT.name();
        }
    }


    private void battleMenu() {
        System.out.println("==========<<BATTLE>>==========");
        System.out.println(Player.playerName + "의 차례!");
        System.out.println("1. 공격한다 (공격력 : " + Player.playerAttack + ")");
        System.out.println("2. 포션사용 (남은 갯수 : " + ")");
        System.out.println("==============================");
    }

    private void monsterInfo() {
        System.out.println("야생의 " + Monster.monsterName + "(이)가 나타났다!");
        System.out.println(Monster.monsterName + " | HP : " + Monster.monsterHP + " | 공격력 : " + Monster.monsterAttack);
        System.out.println();
    }

    private void playerAttack() {
        System.out.println(Player.playerName + "(이)가 " + Monster.monsterName + "(을)를 공격했다!");
        Monster.monsterHP -= Player.playerAttack;
        System.out.println(Monster.monsterName + "에게 " + Player.playerAttack + "의 피해!");
        System.out.println();
        System.out.println(Monster.monsterName + "의 체력 : " + Monster.monsterHP);
        System.out.println();
    }

    private void monsterAttack() {
        System.out.println(Monster.monsterName + "(이)가 공격했다!");
        Player.playerHP -= Monster.monsterAttack;
        System.out.println(Player.playerName + "(이)가 " + Monster.monsterAttack + "의 피해를 입었다!");
        System.out.println();
        System.out.println(Player.playerName + "의 체력 : " + Player.playerHP);
        System.out.println();
    }
}
