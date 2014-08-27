import java.util.Stack;
/**
 * 
 * asked in Jabong interview
 * given a 2-d array with values 0 and 1 . Check id a path exists from a[0][0] to a[m-1][n-1]
 * where you can move to right from a[i][j] where a[i][j+1]=1 or move down from
 * a[i][j] if a[i+1][j]=1
 * 
 *
 */

public class FindPath2DArray {
	
	private class Element{
		Element(int i, int j){
			this.i = i;
			this.j = j;
		}
		int i;
		int j;
	}
	
	private Stack<Element> stack = null;
	
	public boolean checkPathExists(int a[][]){
		stack = new Stack<Element>();
		stack.push(new Element(0, 0));
		Element e;
		while(!stack.isEmpty()){
			e = stack.pop();
			if(e.i == a.length -1 && e.j==a[0].length -1){
				return true;
			}
			if(e.i < a.length-1 && a[e.i + 1][e.j] == 1){
				stack.push(new Element(e.i + 1, e.j));
			}
			
			if(e.j < a[0].length -1 && a[e.i][e.j + 1] == 1){
				stack.push(new Element(e.i, e.j + 1));
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		FindPath2DArray test = new FindPath2DArray();
		int[][] a = new int[][] {{1,0,1,1},
								  {1,1,0,1},
								  {0,1,1,0},
								  {1,0,1,1}};
		System.out.println(test.checkPathExists(a));
	}
}
