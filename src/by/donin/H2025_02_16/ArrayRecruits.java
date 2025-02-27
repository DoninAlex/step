package by.donin.H2025_02_16;

public class ArrayRecruits {
    private Recruit[] recruits;
    private static Recruit[] validRecruits;
    private static Recruit[] notValidRecruits;
    private static int totalValidRecruits = 0;
    private static int totalNotValidRecruits = 0;
    //int recruitsNumber;

    public ArrayRecruits(int capacity) {
            recruits = new Recruit[capacity];
            validRecruits = new Recruit[capacity];
            notValidRecruits = new Recruit[capacity];
        //recruitsNumber = 0;
    }

    public void add() {
        int size = Recruit.getTotalRecruits(); //getSize();
        if (size < recruits.length) {
            //recruit.id = size;
            recruits[size] = new Recruit();
            //recruitsNumber++;
            //System.out.println("### ARR RECR > Add: " + recruit.toString());
        } else {
            Recruit[] recruits1 = new Recruit[recruits.length + 1];
            for (int i = 0; i < recruits.length; i++) {
                recruits1[i] = recruits[i];
            }
            recruits1[recruits1.length - 1] = new Recruit();
            recruits = recruits1;
        }
    }

    public static void addValidRecruit (Recruit recruit) {
        validRecruits[totalValidRecruits++] = recruit;
    }

    public static Recruit getValidRecruit (int index) {
        return validRecruits[index];
    }

    public static void addNotValidRecruit (Recruit recruit) {
        notValidRecruits[totalNotValidRecruits++] = recruit;
    }

    public static Recruit getNotValidRecruit (int index) {
        return notValidRecruits[index];
    }

    public int getSize() {

        return Recruit.getTotalRecruits();
    }

    public Recruit get(int index) {
        return recruits[index];
    }

    public static int getTotalValidRecruits() {
        return totalValidRecruits;
    }

    public static void setTotalValidRecruits(int totalValidRecruits) {
        ArrayRecruits.totalValidRecruits = totalValidRecruits;
    }

    public static int getTotalNotValidRecruits() {
        return totalNotValidRecruits;
    }

    public static void setTotalNotValidRecruits(int totalNotValidRecruits) {
        ArrayRecruits.totalNotValidRecruits = totalNotValidRecruits;
    }
}
