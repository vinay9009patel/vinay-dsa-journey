class Solution {
    public ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> node = new LinkedList<>();
        Queue<Integer> hd = new LinkedList<>();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        node.add(root);
        hd.add(0);

        while (!node.isEmpty()) {

            Node curr = node.poll();
            int HD = hd.poll();

            // Top view logic (no overwrite)
            if (!map.containsKey(HD)) {
                map.put(HD, curr.data);
            }

            if (curr.left != null) {
                node.add(curr.left);
                hd.add(HD - 1);
            }

            if (curr.right != null) {
                node.add(curr.right);
                hd.add(HD + 1);
            }
        }

        for (int val : map.values()) {
            result.add(val);
        }

        return result;
    }
}
