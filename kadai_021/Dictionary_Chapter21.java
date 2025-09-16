package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    // 英単語辞書（キー：英単語, 値：意味）
    private HashMap<String, String> dictionary;

    // コンストラクタで辞書を初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();

        // 10単語を辞書に登録
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 単語を調べるメソッド
    public void searchWord(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println(word + "の意味は" + dictionary.get(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
    }
}

