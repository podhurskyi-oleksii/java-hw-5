package com.company;

import java.util.*;

public class QuarkeTrack {

    private int[] trakDate;

    public QuarkeTrack(int[] lines) {
        trakDate = lines;
    }

    public int[] getTrakDate() {
        return trakDate;
    }

    public int sum() {
        int[] arr = getTrakDate();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (((QuarkeTrack) o).sum() == this.sum()) return true;
        QuarkeTrack that = (QuarkeTrack) o;
        return Arrays.equals(trakDate, that.trakDate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sum());
    }
}
