package by.donin.L2025_02_13_ext;

public interface Flyable {
    default void test(){
        System.out.println();
    }

    static void test2(){
        System.out.println();
    }

    private void test3(){
        System.out.println();
    }

    void fly(); // по умолчанию public и abstract

}
