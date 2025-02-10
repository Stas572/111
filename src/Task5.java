package com.sinapps;

public class Task5 {
    public class double start;
    private boolean startInclude;

    private double end;
    private boolean endInclude;

    public Interval() {
        start = Double.NEGATIVE_INFINITY;
        startInclude = false;

        end = Double.POSITIVE_INFINITY;
        endInclude = false;
    }

    public Interval(double start, boolean startInclude, double end, boolean endInclude) {
        this.start = start;
        this.startInclude = startInclude;
        this.end = end;
        this.endInclude = endInclude;
    }
    public double getStart() {
        return start
    }

    public void setStart(double start) {
        this.start = start
    }
}
