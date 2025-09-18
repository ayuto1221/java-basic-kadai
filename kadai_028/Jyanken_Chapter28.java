package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("じゃんけんをしましょう！ (r: グー, s: チョキ, p: パー) を入力してください:");
        String choice = sc.nextLine();

        // 入力が正しいかチェック
        while (!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
            System.out.println("入力が間違っています。r, s, p のいずれかを入力してください:");
            choice = sc.nextLine();
        }
        return choice;
    }

    // 対戦相手の手を乱数で選ぶメソッド
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        Random rand = new Random();
        int index = rand.nextInt(3); // 0,1,2の乱数を取得
        return hands[index];
    }

    // じゃんけんを実行するメソッド
    public void playGame(String myChoice, String enemyChoice) {
        // 表示用のマップ
        HashMap<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        // 出した手を表示
        System.out.println("あなたの手: " + map.get(myChoice));
        System.out.println("相手の手: " + map.get(enemyChoice));

        // 勝敗判定
        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("r") && enemyChoice.equals("s")) ||
                   (myChoice.equals("s") && enemyChoice.equals("p")) ||
                   (myChoice.equals("p") && enemyChoice.equals("r"))) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです。");
        }
    }
}
