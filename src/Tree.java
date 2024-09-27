public class Tree {
    public Nut[] growNuts(int n) {
        Nut[] nuts = new Nut[n];
        for (int i = 0; i < nuts.length; i++) {
            nuts[i] = new Nut();
        }
        return nuts;
    }
}
