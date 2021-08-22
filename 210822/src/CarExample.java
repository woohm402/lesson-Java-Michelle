/*

자동차 레이싱 게임

자동차 10개를 만들면서 처음 위치랑 속도를 랜덤으로 줌
1분 뒤에 누가 제일 멀리 갔는지에 따라 우승자를 가른다.

 */

public class CarExample {
    public static void main(String[] args) {
        // 1. 자동차 1개를 만든다
        Car myCar1 = new Car(getRandomNumber(), getRandomNumber());
        Car myCar2 = new Car(getRandomNumber(), getRandomNumber());

        // 2. 자동차를 60초동안 굴린다
        for (int i = 0; i < 60; i++) {
            myCar1.move();
        }
        for (int i = 0; i < 60; i++) {
            myCar2.move();
        }

        // 3. 자동차의 위치를 받는다
        System.out.println(myCar1.getPos());
        System.out.println(myCar2.getPos());
    }

    static int getRandomNumber() {
        return (int)(Math.random() * 10) + 1;
    }
}

class Car {
    // pos: 위치, spd: 속력
    private int pos, spd;

    Car(int pos, int spd) {
        this.pos = pos;
        this.spd = spd;
    }

    // 1초 동안 움직이는 함수
    void move() {
        pos += spd;
    }

    int getPos() {
        return pos;
    }
}
