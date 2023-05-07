package lecture_20230423;

import java.util.Scanner;

public class lol8 {

    public static void ww(){
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void choose(String mod) {
        switch (mod) {
            case "일반게임":
                System.out.println("일반게임을 선택했습니다.");
                System.out.println("일반게임을 일반게임을 매칭을 하겠습니다..............");
                ww();
                System.out.println("게임이 매칭되었습니다.");
                break;
            case "랭크게임":
                System.out.println("랭크게임을 선택했습니다.");
                System.out.println("랭크게임을 일반게임을 매칭을 하겠습니다..............");
                ww();
                System.out.println("게임이 매칭되었습니다.");
                break;
            case "우르프":
                System.out.println("우르프을 선택했습니다.");
                System.out.println("우르프을 일반게임을 매칭을 하겠습니다..............");
                ww();
                System.out.println("게임이 매칭되었습니다.");

                break;

            case "단일챔피언":
                System.out.println("단일챔피언을 선택했습니다.");
                System.out.println("단일챔피언을 일반게임을 매칭을 하겠습니다..............");
                ww();
                System.out.println("게임이 매칭되었습니다.");
                break;

            case "ai": case "AI": case "Ai":
                System.out.println("Ai을 선택했습니다.");
                System.out.println("Ai을 매칭을 하겠습니다..............");
                ww();
                System.out.println("게임이 매칭되었습니다.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mod = sc.nextLine();

        choose(mod);
        game game1 = new game();
        game1.setRedLife(100);
        game1.setRedNexusLife(100);

        Kayn backjunbackseung = new Kayn();
        backjunbackseung.setUser_id("전병국");
        backjunbackseung.setHp(600);
        backjunbackseung.setMp(200);
        backjunbackseung.setAttack(50);
        backjunbackseung.setAttack_skill("낫배드");
        System.out.println(backjunbackseung.toString());

        Soraka backjunbackseung2 = new Soraka();
        backjunbackseung2.setUser_id("전병국");
        backjunbackseung2.setHp(600);
        backjunbackseung2.setMp(200);
        backjunbackseung2.setAttack(50);
        backjunbackseung2.setHeal("Heal");
        System.out.println(backjunbackseung2.toString());


    }
}
