package com.tungee.d6_regex;
/*
    目标：全面、深入学习正则表达式的规则
 */
public class RegexDemo02 {
    public static void main(String[] args) {
        // public boolean matches(String regex): 判断是否与正则表达式匹配，匹配返回true

        // 只能是a b c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false
        System.out.println("-------------------");

        // 不能出现a b c
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true
        System.out.println("-------------------");

        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w")); // false
        System.out.println("你".matches("\\W")); // true
        // 以上正则匹配只能校验单个字符
        System.out.println("-------------------");

        // 校验密码
        // 必须是数字 字母 下划线 至少6位
        System.out.println("ssds3c".matches("\\w{6,}")); // true
        System.out.println("ssdsc".matches("\\w{6,}")); // false
        System.out.println("ssdsda232s你c".matches("\\w{6,}")); // false
        System.out.println("-------------------");

        // 验证码：必须是数字和字母 必须是4位
        System.out.println("dsd2".matches("[a-zA-Z0-9]{4}")); // true
        System.out.println("A3_2".matches("[a-zA-Z0-9]{4}")); // false

        System.out.println("dsd2".matches("[\\w&&[^_]]{4}")); // true
        System.out.println("A3_2".matches("[\\w&&[^_]]{4}")); // false
    }
}
