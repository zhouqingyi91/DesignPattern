package design.pattern.state;

/**
 * 不能抽奖状态
 */
public class NoRaffleState extends AbstractState{

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功, 可以参与抽奖");
        this.activity.setState(this.activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    // 当前状态不能发奖品
    @Override
    public void getPrize() {
        System.out.println("不能发放奖品");
    }
}
