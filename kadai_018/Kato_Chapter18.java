package kadai_018;

//Kato_Chapter18.java
public abstract class Kato_Chapter18 {
 public String familyName = "加藤";
 public String givenName;
 public String address = "東京都中野区〇×";

 // 共通の紹介
 public void commonIntroduce() {
     System.out.println("名前は" + familyName + givenName + "です");
     System.out.println("住所は" + address + "です");
 }

 // 個別の紹介（抽象メソッド）
 public abstract void eachIntroduce();

 // 紹介を実行する
 public void execIntroduce() {
     commonIntroduce();
     eachIntroduce();
     System.out.println(); // 改行を入れて見やすくする
 }
}
