import java.util.Arrays;

public class Solution {
	
	static int[][] input = {{1,0,0},{0,1,0},{0,0,1}};
	
	static void markLinkNeighbor(int x, int y, int[][] arr) {
		System.out.println("looking at "+x+" "+y+" ");
		
		//check north
		if(x-1>=0) {
			arr[x][y]=0;
			System.out.println("north check");
			if(arr[x-1][y]==1){//arr[x][y] is 1
				System.out.println("set arr["+x+"]["+y+"]"+"to 0 look into x="+(x-1)+"y="+y);
				markLinkNeighbor(x-1, y, arr);
				
			}
			else {
				//arr[x][y]==0, check east
				if(y+1<=arr[x].length-1) {
					if(arr[x][y+1]==1) {
						markLinkNeighbor(x, y+1, arr);
					}
				}
			}
		}
		//check east
		if(y+1<=arr[x].length-1) {
			System.out.println("east check");
			arr[x][y]=0;
			if(arr[x][y+1]==1){//arr[x][y] is 1
				System.out.println("set arr["+x+"]["+y+"]"+"to 0 look into y="+(y+1)+"x="+x);
				markLinkNeighbor(x, y+1, arr);
			}
			else { 
				 //arr[x][y]==0, check south
				if(x+1<=arr.length-1) {
					if(arr[x+1][y]==1) {
						markLinkNeighbor(x+1, y, arr);
					}
					
				}			
			}
		}

		//check south
		if(x+1<=arr.length-1) {
			System.out.println("south check");
			arr[x][y]=0;
			if(arr[x+1][y]==1) {//arr[x][y] is 1
				System.out.println("set arr["+x+"]["+y+"]"+"to 0 look into x="+(x+1)+"y="+y);
				markLinkNeighbor(x+1, y, arr);
			}
			else {
				 //arr[x][y]==0, check west
				 if(y-1>=0) {
					if(arr[x][y-1]==1) {
						markLinkNeighbor(x, y-1, arr);
					}	
				}
			}
		}
		
		//check west
		if(y-1>=0) {
			arr[x][y]=0;
			System.out.println("west check");
			if(arr[x][y-1]==1) {
				System.out.println("set arr["+x+"]["+y+"] "+"to 0 look into x="+(x)+"y="+(y-1));
				markLinkNeighbor(x, y-1, arr);
			}
			else { 
				 System.out.println("done west check");
				 return;
			}
		}
		System.out.println("end: done n e s w");
		return;
	}
		
	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Before...");
		System.out.println(Arrays.deepToString(input));
		//find the next defect
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				System.out.println("loop: looking at "+i+" "+j+" ");
				if(input[i][j]==1) {
					markLinkNeighbor(i,j,input);
					count++;
					System.out.println("count="+count);
					continue;
				}
				
					
				}
			}
		System.out.println(count);
		System.out.println("After...");
		System.out.println(Arrays.deepToString(input));
		
	}
}
