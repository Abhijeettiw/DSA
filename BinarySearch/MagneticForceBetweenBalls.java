package BinarySearch;

import java.util.Arrays;

public class MagneticForceBetweenBalls {
    static boolean distancePossible(int[] pos, int noOfBalls, int dist) {
        int ballPlaces = 1;
        int lastBallPlacedAt = pos[0];
        for (int i = 1; i < pos.length && ballPlaces < noOfBalls; i++) {
            if (pos[i] >= lastBallPlacedAt + dist) {
                ballPlaces++;
                lastBallPlacedAt = pos[i];
            }
        }
        return ballPlaces == noOfBalls;
    }

    public static void main(String[] args) {
        int[] pos = {1, 2, 3, 4, 7};
        Arrays.sort(pos);
        int noOfBall = 3;
        int start = 1, end = pos[pos.length - 1] - pos[0], result = 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (distancePossible(pos, noOfBall, mid)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}
