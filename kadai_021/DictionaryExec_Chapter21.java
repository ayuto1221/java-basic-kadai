package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();

        // 調べる単語を配列にセット
        String[] words = {"apple", "banana", "grape", "orange"};

        // 繰り返しで辞書を検索
        for (String word : words) {
            dict.searchWord(word);
        }
    }
}
