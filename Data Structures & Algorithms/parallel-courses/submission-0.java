class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        Map<Integer, List<Integer>> courses = new HashMap<>();

        int[] indegree = new int[n+1];
        for (int[] rel : relations) {
            courses.computeIfAbsent(rel[0], k -> new ArrayList<>()).add(rel[1]);
            indegree[rel[1]]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i=1; i<=n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int semesters = 0;
        int taken = 0;
        while (!q.isEmpty()) {
            semesters++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                taken++;

                for (int next : courses.getOrDefault(curr, new ArrayList<>())) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        q.offer(next);
                    }
                }
            }
        }

        return taken == n ? semesters : -1;
    }
}