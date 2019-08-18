package design.pattern.state;

/**
 * 产品发放完状态
 */
public class DispenseOutState extends AbstractState {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void getPrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
