public class BoxDriver {
    public static void main(String[] args) {
        Boxes small = new Boxes(3);
        System.out.println(small.toString());
        small.draw();

        Boxes large = new Boxes(10);
        System.out.println(large.toString());
        large.draw();
    }
}
