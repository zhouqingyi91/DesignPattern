package design.pattern.state;

public class RaffleActivity {

    // state表示当前的状态(变化着)
    AbstractState state = null;
    // 奖品数量
    int count = 0;

    AbstractState noRaffleState = new NoRaffleState(this);
    AbstractState canRaffleState = new CanRaffleState(this);
    AbstractState dispenseState = new DispenseState(this);
    AbstractState dispenseOutState = new DispenseOutState(this);

    /*
    构造器
    1 - 初始化为不能抽奖状态
    2 - 初始化奖品数量
     */
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    //扣分, 调用当前状态的 deductMoney
    public void deductMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        // 如果当前的状态是抽奖成功
        if(state.raffle()){
            //领取奖品
            state.getPrize();
        }
    }







    public AbstractState getState() {
        return this.state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    //这里请大家注意，每领取一次奖品，count--
    public int getCount() {
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public AbstractState getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(AbstractState noRafflleState) {
        this.noRaffleState = noRafflleState;
    }

    public AbstractState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(AbstractState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public AbstractState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(AbstractState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public AbstractState getDispensOutState() {
        return dispenseOutState;
    }

    public void setDispensOutState(AbstractState dispensOutState) {
        this.dispenseOutState = dispensOutState;
    }


}
