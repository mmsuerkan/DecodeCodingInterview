package org.example.facebook;

public class FriendCircles {

    private static int friendCircles(boolean[][] friends, int numberOfPeople) {

        if(numberOfPeople == 0){
            return 0;
        }

        int numCircles = 0;

        boolean [] visited = new boolean[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < numberOfPeople; i++) {

            if(!visited[i]){
                visited[i] = true;
                DFS(friends,numberOfPeople,visited,i);//recursive step to find all friend
                numCircles += 1;
            }
        }
            return numCircles;

    }

    public static void DFS(boolean[][] friends, int numberOfPeople, boolean[] visited, int v){

        for (int i = 0; i < numberOfPeople; i++) {
            if(friends[v][i] && !visited[i] && i != v){
                visited[i] = true;
                DFS(friends,numberOfPeople,visited,i);
            }
        }
    }

    public static void main(String args[])
    {
        int numberOfPeople = 4;
        boolean[][] friends = {
                {true,true,false,false},
                {true,true,true,false},
                {false,true,true,false},
                {false,false,false,true}
        };
        System.out.println("Number of friends circles: " + friendCircles(friends, numberOfPeople));
    }


}
