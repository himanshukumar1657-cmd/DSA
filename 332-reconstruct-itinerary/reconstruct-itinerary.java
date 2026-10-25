class Solution {

    Map<String, PriorityQueue<String>> map = new HashMap<>();
    LinkedList<String> ans = new LinkedList<>();

    public List<String> findItinerary(
            List<List<String>> tickets) {

        for (List<String> ticket : tickets) {

            map.putIfAbsent(
                ticket.get(0),
                new PriorityQueue<>()
            );

            map.get(ticket.get(0))
               .add(ticket.get(1));
        }

        dfs("JFK");

        return ans;
    }

    void dfs(String airport) {

        PriorityQueue<String> pq = map.get(airport);

        while (pq != null && !pq.isEmpty())
            dfs(pq.poll());

        ans.addFirst(airport);
    }
}