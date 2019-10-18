package foostour.app;

public class Player {

    public String name;
    public int preferredPosition = 0; // 0 - both, 1 - defense, 2 - attack

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreferredPosition() {
        return preferredPosition;
    }

    public void setPreferredPosition(int preferredPosition) {
        this.preferredPosition = preferredPosition;
    }
}
