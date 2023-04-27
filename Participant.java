package lesson1;

public class Participant {
    private String name;
    private int canJumpHeights;

    public Participant(String name, int canJumpHeights) {
        this.name = name;
        this.canJumpHeights = canJumpHeights;
    }

    public String getName() {
        return name;
    }

    public int getCanJumpHeights() {
        return canJumpHeights;
    }
}
