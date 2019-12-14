package domain.user;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player extends Gamer {
    private final String name;
    private final double bettingMoney;
    private double status;

    public Player(String name, double bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
        this.status = -bettingMoney;
    }

    public String getName() {
        return name;
    }

    public double getStatus() {
        return status;
    }

    public void win() {
        status += 2*bettingMoney;
    }
    public void draw() {
        status += bettingMoney;
    }
    public void blackjack() {
        status = + bettingMoney;
        status += (1.5)*bettingMoney;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + name +
                ", bettingMoney=" + bettingMoney +
                '}';
    }
}
