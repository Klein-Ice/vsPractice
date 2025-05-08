import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        list.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }

}
