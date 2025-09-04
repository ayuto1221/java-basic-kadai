package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        // start
        System.out.println("=== start ===");

        // 車クラスのインスタンスを作成
        Car_Chapter15 car = new Car_Chapter15();

        // ギアチェンジ（3速に設定）
        car.changeGear(3);

        // 走行（現在のギアと速度を表示）
        car.run();

        // end
        System.out.println("=== end ===");
    }
}
