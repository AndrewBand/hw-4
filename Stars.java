package module4.hw4;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String formatHildii = "";
        int countFormat = getCount();
        while (countFormat >= 1000) {
            countFormat = countFormat - 1000;
            formatHildii += "X";
        }
        while (countFormat >= 100) {
            countFormat = countFormat - 100;
            formatHildii += "Y";
        }
        while (countFormat >= 10) {
            countFormat = countFormat - 10;
            formatHildii += "Z";
        }
        while (countFormat >= 1) {
            countFormat = countFormat - 1;
            formatHildii += "*";
        }
        return formatHildii;
    }

    public static void main(String[] args) {

        Stars stars = new Stars();
        stars.setCount(5153);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }
}
