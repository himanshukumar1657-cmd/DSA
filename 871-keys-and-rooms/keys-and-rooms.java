class Solution {
    public void bfs(boolean [] vis,int i,List<List<Integer>>rooms){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(q.size()>0){
            int front=q.remove();
            for(int j:rooms.get(front)){
                if(vis[j]==false){
                    vis[j]=true;
                    q.add(j);
                }
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []vis=new boolean[n];
        vis[0]=true;
        bfs(vis,0,rooms);
        for(boolean i:vis){
            if(i==false) return false;
        }
        return true;

        
    }
}