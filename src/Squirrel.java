public class Squirrel {

    public double pickUpNuts(Nut[] nuts) {
        double sum = 0;
        for (Nut nut : nuts) {
            System.out.printf("ура, еще орех! масса=%.2f\n", nut.getWeight());
            sum += nut.getWeight();
        }
        return sum;
    }
}
