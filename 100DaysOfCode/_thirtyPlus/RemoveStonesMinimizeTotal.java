package _thirtyPlus;

import java.util.PriorityQueue;

public class RemoveStonesMinimizeTotal {
    public static void main(String[] args) {
        int[] piles = {4,3,6,7};
        int k = 3;
        System.out.println(minStoneSum(piles,k));
    }

    static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b)->(b-a));
        for(int i=0; i<piles.length; i++){
            pq.add(piles[i]);
        }
        int sum=0;
        while(k-->0){
            int c = pq.poll();
            int r = Math.floorDiv(c,2);
            pq.offer(c-r);
        }
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}
