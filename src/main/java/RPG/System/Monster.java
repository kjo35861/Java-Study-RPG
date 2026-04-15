package RPG.System;

import java.util.Random;

public class Monster {

    public static Boolean fightResult = false;
    public static String monsterName;
    public static int monsterHP;
    public static int monsterAttack;

    private static String[] names = {"슬라임", "고블린", "오크", "스켈레톤", "멧돼지"};
    private static int[] hps = {10, 30, 50, 40, 20};
    private static int[] attacks = {1, 3, 8, 4, 3};

    public static void meetMonster() {
        int ran = new Random().nextInt(names.length);
        monsterName = names[ran];
        monsterHP = hps[ran];
        monsterAttack = attacks[ran];
    }

}
