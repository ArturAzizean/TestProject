package oca.inheritance;

public class Programmer extends Employ {

    public String getName() {
        name = "programmer name";
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
