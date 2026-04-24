class Solution {
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
    Set<Integer> visited = new HashSet<>();

    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] t : times) {
            int src = t[0];
            int[] val = new int[]{t[1], t[2]}; // neighbor, weight
            graph.computeIfAbsent(src, v -> new ArrayList<>()).add(val);
        }

        int max = 0;
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] val = pq.poll();
            int node = val[0];
            int weight = val[1];
            if (visited.contains(node)) {
                continue;
            }
            visited.add(node);
            max = Math.max(max, weight);

            if (!graph.containsKey(node)) continue;

            for (int[] entry : graph.get(node)) {
                if (visited.contains(entry[0])) continue;
                pq.offer(new int[]{entry[0], weight + entry[1]});
            }
        }

        System.out.println(visited.size());
        return visited.size() == n ? max : -1;
    }
}