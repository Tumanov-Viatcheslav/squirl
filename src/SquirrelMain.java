public class SquirrelMain {
    public static void main(String[] args) {
        Squirrel squirrel = new Squirrel();
        Tree tree = new Tree();
        Nut[] nuts = tree.growNuts(15);
        double sum = squirrel.pickUpNuts(nuts);
        System.out.println(sum);
    }
}