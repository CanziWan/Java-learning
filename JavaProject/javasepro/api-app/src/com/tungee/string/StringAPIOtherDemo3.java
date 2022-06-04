package com.tungee.string;

public class StringAPIOtherDemo3 {
    public static void main(String[] args) {
        // 1、获取字符串的长度
        String name = "ken123";
        System.out.println(name.length());

        // 2、获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("--------------遍历字符串中的每个字符------------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.print(ch + "\t");
        }
        System.out.println();

        // 3、把字符串转换成字符数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.print(ch + "\t");
        }
        System.out.println();

        // 4、截取内容（包前不包后的）
        String name2 = "Java!";
        String rs = name2.substring(0, 4);
        System.out.println(rs);
        String rs1 = name2.substring(4, 5);
        System.out.println(rs1);

        // 5、从当前索引一直截取到末尾
        String rs2 = name2.substring(1);
        System.out.println(rs2);

        // 6、字符串替换（用来做敏感词的替换）
        String name3 = "金三是最厉害的80，金三哈哈。我认识金三。";
        String rs3 = name3.replace("金三", "**");
        System.out.println(rs3);

        // 7、包含
        System.out.println(name3.contains("金三"));   // true
        System.out.println(name3.contains("金二"));   // false

        // 8、以什么开始
        System.out.println(name3.startsWith("金三"));  // true
        System.out.println(name3.startsWith("金三是"));  // true
        System.out.println(name3.startsWith("金三是2"));  // false

        // 9、按照某个内容把字符串分割成字符串数组返回
        String name4 = "小明，张三，李四";
        String[] names = name4.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
        }
        System.out.println();
    }
}
