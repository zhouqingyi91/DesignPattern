package design.pattern2.builder;

public class House {
    private String wall;
    private String roof;
    private String foundation;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "House{" +
                "wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
