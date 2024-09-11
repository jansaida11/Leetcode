class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        l.add(first);

        for (int i = 1; i <rowIndex+1; i++) {
            ArrayList<Integer> next = new ArrayList<>();
            next.add(1);
            for (int j = 1; j < i; j++) {
                int sum = l.get(i - 1).get(j) + l.get(i - 1).get(j - 1);
                next.add(sum);
            }

            next.add(1);
            
            l.add(next);

        }

        List<Integer> nl = l.get(rowIndex);
        return nl;
    }
}