package com.company;

public class Levels {
    private final LevelInfo levelInfo;
    private final Point[] points;

    public Levels(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash() {
        int hash = 0;
        for (int i = 0; i < points.length; i++) {
            hash += (points[i].getX() * points[i].getY());
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Quarke level, name is "
                + levelInfo.getName()
                + ", difficulty is "
                + levelInfo.getDifficulty()
                + ", point count is "
                + points.length;
    }

    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static class LevelInfo {
        private final String name;
        private final String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}
