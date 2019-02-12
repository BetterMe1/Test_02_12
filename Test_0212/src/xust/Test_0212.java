package xust;

/*
1. ����д��ĸ
����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
ȫ����ĸ���Ǵ�д������"USA"��
������������ĸ�����Ǵ�д������"leetcode"��
������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google"��
�������Ƕ����������û����ȷʹ�ô�д��ĸ��

ʾ�� 1:
����: "USA"
���: True

ʾ�� 2:
����: "FlaG"
���: False
ע��: �������ɴ�д��Сд������ĸ��ɵķǿյ��ʡ�
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
2. ��������� ��
���������ַ���������Ҫ���������ַ������ҳ�����������С���������ж������£�������Ϊĳ�ַ������е�������У��������������ַ����������У���
�����п���ͨ��ɾȥ�ַ����е�ĳЩ�ַ�ʵ�֣������ܸı�ʣ���ַ������˳�򡣿�����Ϊ�����ַ����������У��κ��ַ���Ϊ������������С�
����Ϊ�����ַ����������������еĳ��ȡ���������ڣ��򷵻� -1��
ʾ�� :
����: "aba", "cdc"
���: 3
����: ��������п�Ϊ "aba" (�� "cdc")
˵��:
�����ַ������Ⱦ�С��100��
�ַ����е��ַ������� 'a'~'z'��
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
3. ��������� II
�����ַ����б�����Ҫ���������ҳ�����������С���������ж������£�������Ϊĳ�ַ������е�������У��������������ַ����������У���
�����п���ͨ��ɾȥ�ַ����е�ĳЩ�ַ�ʵ�֣������ܸı�ʣ���ַ������˳�򡣿�����Ϊ�����ַ����������У��κ��ַ���Ϊ������������С�
���뽫��һ���ַ����б��������������еĳ��ȡ������������в����ڣ����� -1 ��

ʾ����
����: "aba", "cdc", "eae"
���: 3
��ʾ��
���и������ַ������Ȳ��ᳬ�� 10 ��
�����ַ����б�ĳ��Ƚ��� [2, 50 ] ֮�䡣
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
//        //ȥ��strs���ظ����ַ���
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