package xust;

/*
1. 检测大写字母
给定一个单词，你需要判断单词的大写使用是否正确。
我们定义，在以下情况时，单词的大写用法是正确的：
全部字母都是大写，比如"USA"。
单词中所有字母都不是大写，比如"leetcode"。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
否则，我们定义这个单词没有正确使用大写字母。

示例 1:
输入: "USA"
输出: True

示例 2:
输入: "FlaG"
输出: False
注意: 输入是由大写和小写拉丁字母组成的非空单词。
 */
//public class Test_0212 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String word = "FlaG";
//		System.out.println(So.detectCapitalUse(word));
//	}
//}
//class Solution {
//    public boolean detectCapitalUse(String word) {
//    	if(word.length() == 0)
//    		return false;
//    	if(word.length() == 1)
//    		return true;
//        if('A' <= word.charAt(0) && word.charAt(0) <='Z'){
//        	if('A' <= word.charAt(1) && word.charAt(1) <='Z'){
//        		for(int i=2; i<word.length(); i++){
//        			if('A' > word.charAt(i) || word.charAt(i) >'Z')
//        				return false;
//        		}
//        		return true;
//        	}
//        	if('a' <= word.charAt(1) && word.charAt(1) <='z'){
//        		for(int i=2; i<word.length(); i++){
//        			if('a' > word.charAt(i) || word.charAt(i) >'z')
//        				return false;
//        		}
//        		return true;
//        	}
//        }
//        if('a' <= word.charAt(0) && word.charAt(0) <='z' && 'a' <= word.charAt(1) && word.charAt(1) <='z'){
//        	for(int i=2; i<word.length(); i++){
//    			if('a' > word.charAt(i) || word.charAt(i) >'z')
//    				return false;
//    		}
//    		return true;
//        }
//        return false;
//    }
//}
/*
2. 最长特殊序列 Ⅰ
给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。
子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。
输入为两个字符串，输出最长特殊序列的长度。如果不存在，则返回 -1。
示例 :
输入: "aba", "cdc"
输出: 3
解析: 最长特殊序列可为 "aba" (或 "cdc")
说明:
两个字符串长度均小于100。
字符串中的字符仅含有 'a'~'z'。
 */
public class Test_0212 {
	public static void main(String[] args) {
		Solution So = new Solution();
		String a = "aba";
		String b = "cdc";
		System.out.println(So.findLUSlength(a, b));
	}
}
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length() > 100 || b.length() > 100 || a.equals(b))
        	return -1;
        return Math.max(a.length(), b.length());
    }
}
/*
3. 最长特殊序列 II
给定字符串列表，你需要从它们中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。
子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。
输入将是一个字符串列表，输出是最长特殊序列的长度。如果最长特殊序列不存在，返回 -1 。

示例：
输入: "aba", "cdc", "eae"
输出: 3
提示：
所有给定的字符串长度不会超过 10 。
给定字符串列表的长度将在 [2, 50 ] 之间。
 */
//public class Test_0212 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String[] strs = {"aba", "cdc", "eae"};
//		System.out.println(So.findLUSlength(strs));
//	}
//}
//class Solution {
//    public int findLUSlength(String[] strs) {
//    	if(strs.length<2 || strs.length>50)
//    		return -1;
//        //去掉strs中重复的字符串
//    	int max = 0;
//    	for(int i=0; i<strs.length; i++){
//    		for(int j=0; j<strs.length; j++){
//    			if(i!=j && strs[i].equals(strs[j])){
//    				strs[i] = "";
//    				strs[j] = "";
//    			}
//    		}
//    		max = Math.max(strs[i].length() , max);
//    	}
//    	if(max == 0)
//    		return -1;
//    	return max;
//    }
//}