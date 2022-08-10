import java.util.ArrayList;

public class graphColoringProblem{
    // humko number of vertices given hai aur humko colors  given hai...
    //  mujhe har  ek vertices ko aise color
    // krna hai jaise ki  no adjacent  nodes have 
    //  same color.

    public static boolean driverFunction(boolean [][] graph, int n , int m){

     ArrayList<ArrayList<Integer>> graphList =  new ArrayList<>();
     for(int i =0; i<n; i++){
        graphList.add(new ArrayList<>());
     }

     for(int i =0; i<n; i++){
        for(int j =0; j<n; j++){
            if(graph[i][j]=true){
                graphList.get(i).add(j);
                graphList.get(j).add(i);
            }
        }
     }

     int [] color = new int[n];

     if(solver(0, graphList, color, n, m)){
        return true;
     }
     return false;

    }
    public static boolean isPossible(int node , ArrayList<ArrayList<Integer>> edges , int [] color , int i){
        // yeh mera function mujhe 
        // yeh jaan ne meh help karega ki 
        //  vertex which am currently processing...
        // is it right to color it the given color.
        for(int neigbour : edges.get(node)){
            if(color[node]==neigbour) return false;
        }
        return true;
    }
    public static boolean solver(int node , ArrayList<ArrayList<Integer>> edges , int [] color , int  n , int m){

         if(node ==n) return true;

         for(int clr =1; clr<=m; clr++){
            if(isPossible(node, edges, color, clr)){
                color[node] = clr;
                if(solver(node+1, edges, color, n, m)==true) return true;
                else // backtrack
                color[node] = 0;
            }
         }
         return false;



    }
    public static void main(String[] args) {
        System.out.println("Namaste world");
    }
}