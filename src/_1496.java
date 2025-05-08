import java.util.*;

public class _1496 {
    public boolean isPathCrossing(String path){
        Set<Integer> set = new HashSet<>();
        int x=0;
        int y=0;
        int sum = getHash(x,y);
        // set.offer(sum);
        set.add(sum);
        char[] cs = path.toCharArray(); 
        for(char c : cs){
            switch (c) {
                case 'N':
                    x++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'E':
                    y++;
                    break;
                case 'W':
                    y--;
                    break;
            }
            sum = getHash(x, y);
            if(!set.add(sum)) return true;
        }
        return false;

    }

    private int getHash(int x,int y){
        return x*200001+y;
    }

}
