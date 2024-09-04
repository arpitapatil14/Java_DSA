class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for(int i = 0;i<obstacles.length;i++) {
            set.add(obstacles[i][0]+","+obstacles[i][1]);
        }
        int x = 0;
        int y = 0;
        int max = 0;
        int right = 0;
        int left = 0;
        for (int item : commands) {
            if (item == -2) {
                left += 1;
                right -= 1;
                continue;
            }
            if (item == -1) {
                right += 1;
                left -= 1;
                continue;
            }
            left = left % 4;
            right = right % 4;

            while (item-- > 0) {
                
                if (left == 0 && right == 0) {
                    if (set.contains(x+","+ (y + 1))) {
                        break;
                    }
                    y++;

                } else if (right == 1) {
                    if (set.contains(x+1+","+y)) {
                        break;
                    }
                    x++;
                } else if (right == 2) {
                    if (set.contains( x+","+ (y-1))) {
                        break;
                    }
                    y--;
                } else if (right == 3) {
                    if (set.contains(x-1+","+y)) {
                        break;
                    }
                    x--;
                } else if (left == 1) {
                    if (set.contains(x-1+","+ y)) {
                        break;
                    }
                    x--;
                } else if (left == 2) {
                    if (set.contains(x+","+ (y-1))) {
                        break;
                    }
                    y--;
                } else if (left == 3) {
                    if (set.contains(x+1+","+ y)) {
                        break;
                    }
                    x++;
                }

            }
            max = Math.max(max, x * x + y * y);
        }
        return max;
    }
}