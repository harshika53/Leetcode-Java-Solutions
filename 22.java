class Solution {
    static List<String> list;
    public List<String> generateParenthesis(int n) {
          list = new ArrayList<>();
         para("", 0, 0, n);
	  return list;
    }

    public static  void para(String str, int open, int close, int n) {
	  if(open == n && open == close) {
		  list.add(str);
		  return;
	  }
	  if(open > n || close>n) {
		  return;
	  }
	  if(open < n) {
	  para(str+"(",open +1, close, n);//including opening
	  }
	  if(close< open) {
	  para(str+")", open, close+1, n);//excluding closing
  }
 }
}