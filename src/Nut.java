public class Nut {
    private final double weight;

    public Nut() {
        weight = 10 + 8 * Math.random();
    }

    public double getWeight() {
        return weight;
    }
}
