package Task3;
import java.util.ArrayList;
import java.util.List;

class Interval {
    private int start;
    private int end;
    private boolean inclusiveStart;
    private boolean inclusiveEnd;

    public Interval(int start, int end, boolean inclusiveStart, boolean inclusiveEnd) {
        this.start = start;
        this.end = end;
        this.inclusiveStart = inclusiveStart;
        this.inclusiveEnd = inclusiveEnd;
    }

    public boolean intersects(Interval other) {
        return (this.start < other.end || (this.start == other.end && this.inclusiveEnd && other.inclusiveStart)) &&
                (this.end > other.start || (this.end == other.start && this.inclusiveStart && other.inclusiveEnd));
    }

    public Interval union(Interval other) {
        if (this.intersects(other)) {
            return new Interval(Math.min(this.start, other.start), Math.max(this.end, other.end),
                    this.inclusiveStart || other.inclusiveStart,
                    this.inclusiveEnd || other.inclusiveEnd);
        }
        return null;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public static int maxDistance(List<Interval> intervals) {
        if (intervals.isEmpty()) return 0;
        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;
        for (Interval interval : intervals) {
            minStart = Math.min(minStart, interval.getStart());
            maxEnd = Math.max(maxEnd, interval.getEnd());
        }
        return maxEnd - minStart;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3, true, true));
        intervals.add(new Interval(2, 5, true, false));
        intervals.add(new Interval(6, 8, false, true));

        System.out.println("Max distance: " + maxDistance(intervals));
    }
}
