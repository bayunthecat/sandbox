package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class PathsCrossing {

    public boolean isPathCrossing(String path) {
        Set<Point> points = new HashSet<>();
        int x = 0, y = 0;
        points.add(new Point(x, y));
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            Point next = switch (direction) {
                case 'N' -> new Point(x, ++y);
                case 'S' -> new Point(x, --y);
                case 'E' -> new Point(++x, y);
                case 'W' -> new Point(--x, y);
                default -> new Point(x, y);
            };
            if (!points.add(next)) {
                return true;
            }
        }
        return false;
    }

    private record Point(int x, int y) {
    }

}
