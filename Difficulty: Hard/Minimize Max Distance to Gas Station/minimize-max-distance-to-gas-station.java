// User function Template for Java
class Mithun{
    double first;
    int second;
    
    Mithun(double first,int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        
        Comparator<Mithun> comp = new Comparator<>(){
          public int compare(Mithun a1,Mithun a2)
          {
              return Double.compare(a2.first,a1.first);
          }
        };
        PriorityQueue<Mithun> pq = new PriorityQueue<>(comp);
        for(int i=0;i<stations.length-1;i++)
        {
            pq.add(new Mithun(stations[i+1]-stations[i],i));
        }
        
        int[] howMany=new int[stations.length-1];
        for(int i=1;i<=k;i++)
        {
            Mithun pair = pq.poll();
            int index = pair.second;
            howMany[index]++;
            double diff = (double)stations[index+1] - (double)stations[index];
            double len = diff/(double)(howMany[index]+1);
            pq.add(new Mithun(len,index));
        }
        
        return pq.poll().first;
        
    }
}
