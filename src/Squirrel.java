public class Squirrel {

    public double pickUpNuts(Nut[] nuts) {
        double sum = 0;
        for (Nut nut : nuts) {
            System.out.println("ура, еще орех!");
            sum += nut.getWeight();
        }
        return sum;
    }
}
