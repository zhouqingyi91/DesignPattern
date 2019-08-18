package design.pattern.state;

/**
 * 状态抽象类
 */
public abstract class AbstractState {

    // 扣除积分
    public abstract void deductMoney();

    // 抽奖 -- 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract void getPrize();
}
