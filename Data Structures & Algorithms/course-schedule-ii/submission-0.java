class Solution {
    Map<Integer, List<Integer>> adjList = new HashMap<>();
    Set<Integer> visiting = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    List<Integer> res = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        buildGraph(prerequisites);

        for (int i = 0 ; i < numCourses; i++) {
            if (dfs(i) == false) return new int[0];
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void buildGraph(int[][] prerequisites) {
        for (int[] pair : prerequisites) {
            adjList.computeIfAbsent(pair[0], x -> new ArrayList<>()).add(pair[1]);
        }
    }

    private boolean dfs(int course) {
        if (visited.contains(course)) return true; // already visited
        if (visiting.contains(course)) return false; // cycle
        visiting.add(course);
        
        if (adjList.containsKey(course)) {
            for (Integer pre : adjList.get(course)) {
                if (dfs(pre) == false) return false;
            }
        }
        visiting.remove(course);
        visited.add(course);
        res.add(course);
        return true;
    }
}