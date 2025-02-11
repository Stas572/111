package com.sinapps;

public class Task5B {
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

    public boolean isStartInclude() {
        return startInclude;
    }

    public void setStartInclude(boolean startInclude) {
        this.endInclude = startInclude;
    }

    public double getEnd() {
        return  end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public boolean isEndInclude() {
        return endInclude;
    }

    public void setEndInclude(boolean endInclude) {
        this.endInclude = endInclude;
    }

    public Interval crossing(Interval interval) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (startInclude && start != Double.NEGATIVE_INFINITY) {
            result.append("[");
            } else {
            result.append("(");
        }

        if ()
    }
}

