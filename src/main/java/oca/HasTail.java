package oca;

public interface HasTail {
    int getNumber();
}

abstract class Puma implements HasTail {
     public int getNumber() {
        return 2;
    }
}

class Cougar extends Puma {
    public static void main(String[] args) {
        Puma puma = new Cougar();
    }

    @Override
    public int getNumber() {
        return 0;
    }
}
