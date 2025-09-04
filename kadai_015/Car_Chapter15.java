package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;   // 1速から5速
    private int speed = 10; // ギアに応じた速度（初期値は1速＝10km）

    // ギアチェンジするメソッド
    public void changeGear(int afterGear) {
        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

        this.gear = afterGear;
        switch (afterGear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10; // 不正なギアは速度10kmとする
        }
    }

    // 走行メソッド
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}
