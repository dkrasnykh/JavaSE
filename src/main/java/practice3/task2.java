package practice3;

public class task2 {
    public static void main(String[] args) {
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
        SequentialRandom.resetRandom();
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
    }
}
