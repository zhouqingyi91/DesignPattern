package design.pattern.template;

public class PureSoyMilk extends SoyMilk {
    public void addCondiments() {

    }

    @Override
    public boolean addCondiment() {
        return false;
    }
}
