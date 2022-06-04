package com.tungee.d5_innerclass_static;
/*
    外部类
 */
public class Outer {
    public static int a = 100;
    private String hobby;

    /*
        学习静态成员内部类
     */
    public static class Inner {
        private String name;
        private String age;
        public static String schoolName;

        public Inner() {
        }

        public Inner(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("名称：" + name);
            System.out.println(a);
            System.out.println(Outer.a);

            // System.out.println(hobby);   // 报错，内部类不能直接访问外部类的实例成员
//            Outer o = new Outer();
//            System.out.println(o.hobby);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

    }
}
