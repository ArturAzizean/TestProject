package oca.cast;

public class Main {

    public static void main(String[] args) {
        test();
    }
    public static void test() {

        Interviewer interviewer = new HRExecutive();
        ((HRExecutive) interviewer).specialization = new String[] {"Staffing"};

    }
}
