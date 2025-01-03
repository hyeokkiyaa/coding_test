class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>());
        }
        if (numRows >= 1) {
            result.get(0).add(1);
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = result.get(i);
            List<Integer> prevRow = result.get(i - 1);

            currentRow.add(1);
            for (int j = 1; j < i; j++){
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            currentRow.add(1);

        }
        return result;
    }
}