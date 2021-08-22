/*

자동차 레이싱 게임

자동차 10개를 만들면서 처음 위치랑 속도를 랜덤으로 줌
1분 뒤에 누가 제일 멀리 갔는지에 따라 우승자를 가른다.

 */

public class CarExample2 {
    public static void main(String[] args) {
        // 1. 자동차 1개를 만든다
        Car[] myCars = new Car[10];
        for (int i = 0; i < 10; i++) {
            int randomPos = getRandomNumber();
            int randomSpd = getRandomNumber();
            myCars[i] = new Car(randomPos, randomSpd);
        }

        // 2. 자동차를 60초동안 굴린다
        for (int i = 0; i < 10; i++) {
            for (int t = 0; t < 60; t++) {
                myCars[i].move();
            }
        }

        // 3. 자동차의 위치를 받는다
        for (int i = 0; i < 10; i++) {
            System.out.println(myCars[i].getPos());
        }
    }

    static int getRandomNumber() {
        return (int)(Math.random() * 10) + 1;
    }
}
