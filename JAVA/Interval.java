public class Interval {
    private final double left;
    private final double right;

    public Interval(double l, double r) {
        left = l;
        right = r;
    }

    public boolean contains(double x) {
        if (x >= left || x <= right)
            return true;
        return false;
    }

    public boolean intersects(Interval b) {
        if ((b.left >= left && b.left <= right) || (b.right >= left && b.right <= right))
            return true;

        return false;
    }

    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public static void main(String[] args) {
        Interval interval = new Interval(-1, 1);
        Interval interval1 = new Interval(-0.4, 2);
        Interval interval2 = new Interval(-2, 2);
        StdOut.println(
                "Checking if the interval " + interval.toString() + " contains 0.8 ... " + interval
                        .contains(0.8));
        StdOut.println(
                "Checking if the interval " + interval2.toString() + " intersects with " + interval1
                        .toString() + " ... " + interval2.intersects(interval1));
    }
}
