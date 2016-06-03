
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
