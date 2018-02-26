import java.util.Arrays;

public class Solution {
	
	static int[][] input = {{1,0,0,1},{0,0,1,0},{0,1,0,0}, {1,0,0,0}};
	
	static boolean hasNeighbor(int x, int y, int[][] arr) {
		
		//check north
		if(x-1>=0 && arr[x-1][y]==1){
			arr[x][y]=0;
			hasNeighbor(x-1, y, arr);
			arr[x-1][y]=0;
		}
		//check east
		if(y+1<=arr[x].length-1 && arr[x][y+1]==1){
			arr[x][y]=0;
			hasNeighbor(x, y+1, arr);
			arr[x][y+1]=1;
		}
		//check south
		if(x+1<=arr.length-1 && arr[x+1][y]==1){
			arr[x][y]=0;
			hasNeighbor(x+1, y, arr);
			 arr[x+1][y]=0;
		}
		//check west
		if(y-1>=0 && arr[x][y-1]==1){
			arr[x][y]=0;
			hasNeighbor(x, y-1, arr);
			arr[x][y-1]=0;
		}
		return false;

	}
		
	public static void main(String[] args) {
		
		int count=0;
		System.out.println(Arrays.deepToString(input));
		//find the next defect
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(input[i][j]==1 && !hasNeighbor(i,j,input)) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println("After...");
		System.out.println(Arrays.deepToString(input));
		
	}
}
