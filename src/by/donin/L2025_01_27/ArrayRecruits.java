package by.donin.L2025_01_27;

public class ArrayRecruits {
    public Recruit[] recruits;
    int recruitsNumber;

    ArrayRecruits(int recruitsCount) {
            recruits = new Recruit[recruitsCount];
        recruitsNumber = 0;
    }

    public void add(Recruit recruit) {
        int size = recruitsNumber; //getSize();
        if (size <= recruits.length) {
            recruit.id = size;
            recruits[size] = recruit;
            recruitsNumber++;
            //System.out.println("### ARR RECR > Add: " + recruit.toString());
        }
    }

    public int getSize() {

        return this.recruitsNumber;
    }

    public Recruit get(int index) {
        return recruits[index];
    }
}
