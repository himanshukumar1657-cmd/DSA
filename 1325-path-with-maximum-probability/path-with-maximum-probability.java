class Solution {
    public class Pair implements Comparable<Pair>{
        int node;
        double prob;
        Pair(int node,double prob){
            this.node=node;
            this.prob=prob;
        }
        public int compareTo(Pair p){
            if(this.prob==p.prob) return this.node-p.node;
            return Double.compare(this.prob,p.prob);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj=new ArrayList<>();
        double ans[]=new double[n];
        ans[start]=1;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
           double prob1=succProb[i];
            adj.get(u).add(new Pair(v,prob1));
            adj.get(v).add(new Pair(u,prob1));

        }
        PriorityQueue<Pair> q=new PriorityQueue<>(Collections.reverseOrder());
        q.add(new Pair(start,1));
        while(q.size()>0){
            Pair top=q.remove();
            int node=top.node;
            double prob2 = top.prob;
            if(top.prob>ans[top.node]) continue;
            for(Pair p:adj.get(node)){
                double totalprob = p.prob * top.prob;
                if(totalprob > ans[p.node]){
                    ans[p.node]=totalprob;
                    q.add(new Pair(p.node,totalprob));
                }
            }
        }

  
     return ans[end];      
    }
}