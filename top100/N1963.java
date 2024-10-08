package algorithmbasic.leetcode.top100;

import java.util.Stack;

public class N1963 {
    public int minSwaps(String s) {
        int N = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            if(s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }else {
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop(); //将匹配的都删除掉
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        int M = stack.size(); //不匹配元素的数量
        int result = 0;
        while(M > 0) {
            M -= 4;
            result++; //交换一次减少四个括号
        }
        return result;
    }
}

/*
0：题目描述：
    给定一个0索引的字符串 s，长度为偶数 n。这个字符串由恰好 n / 2 个开括号 '[' 和 n / 2 个闭括号 ']' 组成。
    一个字符串称为平衡的，当且仅当：
    它是空字符串，或者它可以被写作 AB，其中 A 和 B 都是平衡字符串，或者它可以被写作 [C]，其中 C 是一个平衡字符串。
    你可以任意次数地交换任意两个索引处的括号。返回使 s 平衡的最小交换次数。

    示例 1:
    输入: s = "][]["
    输出: 1
    解释: 通过交换索引0和索引3的位置，你可以使字符串变得平衡。
    结果字符串是 "[[]]"。

    示例 2:
    输入: s = "]]][[["
    输出: 2
    解释: 你可以执行以下操作使字符串变得平衡：
    交换索引0和索引4。s = "[]][]["。
    交换索引1和索引5。s = "[[][]]"。
    结果字符串是 "[[][]]"。

    示例 3:
    输入: s = "[]"
    输出: 0
    解释: 字符串已经是平衡的。

    约束：
    n == s.length
    2 <= n <= 10^6
    n 是偶数。
    s[i] 要么是 '['，要么是 ']'。
    开括号 '[' 的数量等于 n / 2，闭括号 ']' 的数量也等于 n / 2。

1：思路：
    [ ]] [][[ ]  -> 将平衡的拿掉后剩余的是 -> ][ -> 交换一次即可 [] [[]] []

    [] ] [] ] [[ -> 将平衡的拿掉后剩余的是 -> ]][[ -> 交换一次即可 [][] 交换一次即可 交换一次去除4个符

    将平衡的拿去 剩下的都是 ]]]] [[[[ 这种形式   这种形式下 交换一次 可以去除四个符号


 */



























