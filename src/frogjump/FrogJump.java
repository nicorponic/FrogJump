/*
A small frog wants to get to the other side of the road. The frog is currently 
located at position X and wants to get to a position greater than or equal to Y.
The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its 
target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }
that, given three integers X, Y and D, returns the minimal number of jumps from 
position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Assume that:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).
Copyright 2009–2016 by Codility Limited. 
All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
package frogjump;

public class FrogJump {

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;

        int count = 0;

        while (x < y) {
            x = d + x;
            count++;
        }

        System.out.println(count);
    }

    public int solution() {
        int x = 10;
        int y = 85;
        int d = 30;
        int t = y - x;
        int j = (int) Math.floor(t / d + 1);
        return (j);
    }

    public int solution1() {
        int x = 10;
        int y = 85;
        int d = 30;
        if ((y - x) % d == 0) {
            return ((y - x) / d);
        }
        return ((y - x) / d + 1);
    }

    public int solution2() {
        int x = 10;
        int y = 85;
        int d = 30;
        return ((y - x) / d + ((y - x) % d == 0 ? 0 : 1));
    }
}
