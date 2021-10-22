package oca.cast;

public class Manager implements Interviewer {
    int teamSize;
    @Override
    public void conductInterview() {
        System.out.println("Manager - conducting interview");
    }
}
