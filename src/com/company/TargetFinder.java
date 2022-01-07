package com.company;

public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] tempArr = new int[targets.length];
        int index = -1;
        for (int i = 0; i < targets.length; i++) {
            tempArr[i] = (int) Math.round(Math.sqrt(Math.pow((targets[i][0] - aiCoords[0]), 2) + Math.pow((targets[i][1] - aiCoords[1]), 2)));
        }
        int temp = tempArr[0];
        for (int i = 0; i < tempArr.length; i++) {
            if (temp == tempArr[i]) {
                continue;
            } else if (temp > tempArr[i]) {
                temp = tempArr[i];
                index = i;
            }
        }

        return targets[index];
    }
}
