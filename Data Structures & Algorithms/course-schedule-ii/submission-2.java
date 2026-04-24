class Solution {
    // BFS solution with indegree
    Map<Integer, List<Integer>> adjList = new HashMap<>();
    List<Integer> res = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];

        buildGraph(prerequisites, indegree);

        Queue<Integer> q = new ArrayDeque<>();

        // start with 0 indegree nodes
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        while (!q.isEmpty()) {
            int course = q.poll();
            res.add(course);

            if (!adjList.containsKey(course)) continue;

            for (int next : adjList.get(course)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        return res.size() == numCourses
                ? res.stream().mapToInt(i -> i).toArray()
                : new int[0];

    }

    private void buildGraph(int[][] prerequisites, int[] indegree) {
        for (int[] pair : prerequisites) {
            adjList.computeIfAbsent(pair[1], x -> new ArrayList<>()).add(pair[0]);
            indegree[pair[0]]++;
        }
    }
}