class Solution {
    class Node{
        int v;
        double sucp;

        Node(int v, double sucp){
            this.v = v;
            this.sucp = sucp;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int dst) {
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double sucp = succProb[i];

            adj.get(u).add(new Node(v,sucp));
            adj.get(v).add(new Node(u,sucp));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((x,y)->Double.compare(y.sucp,x.sucp)); // generally we use x,y i.e x.par-y.par that gives the minimum heap behviour but here we need maximum heap thats why we are doing the opposite of that
        double probab[] = new double[n];
        probab[src] = 1;
        pq.offer(new Node(src,1));

        while(!pq.isEmpty()){
            Node temp = pq.peek();
            pq.poll();
            int node = temp.v;
            double pro = temp.sucp;

            if(node == dst) return pro;
            
            for(Node no : adj.get(node)){
                int adjnode = no.v;
                double prob = no.sucp; 
                
                if(probab[adjnode]< prob*pro){
                    probab[adjnode] = prob*pro;
                    pq.offer(new Node(adjnode,prob*pro));
                }
            }
        }
        return 0.0;
    }
}