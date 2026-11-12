public class Boxes {
    private int size;
    private static final int MAX_SIZE = 10;

    // Constructor that accepts the size of the box
    public Boxes(int size) {
        setSize(size);
    }

    // Method that sets the size of the box (capped at 10)
    public void setSize(int size) {
        if (size > MAX_SIZE) {
            size = MAX_SIZE;
        } else if (size < 1) {
            size = 1;
        }
        this.size = size;
    }

    // Returns the size as a String, e.g. "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // Draws the square box to the console
    public void draw() {
        String horizontal = repeat("-", size);
        String spaces = repeat(" ", size - 2);
        System.out.println(horizontal);
        for (int i = 0; i < size - 2; i++) {
            System.out.println("|" + spaces + "|");
        }
        System.out.println(horizontal);
    }

    private String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
