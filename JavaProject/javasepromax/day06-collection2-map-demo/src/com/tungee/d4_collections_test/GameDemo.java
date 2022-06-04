package com.tungee.d4_collections_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    功能：
        1.做牌
        2.洗牌
        3.定义3个玩家
        4.发牌
        5.排序（拓展，了解）
        6.看牌
 */
public class GameDemo {
    /*
        1、定义一个静态的集合存储54张牌对象
     */
    public static List<Card> allCards = new ArrayList<>();

    /*
        2、做牌：定义静态代码块初始化牌数据
     */
    static {
        // 3、定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4、定义花色：个数确定，类型确定，使用数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 5、组合点数和花色
        int index = 0; // 记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6、封装成一个牌对象
                Card c = new Card(size, color, index);
                // 7、存入到集合容器中去
                allCards.add(c);
            }
        }
        // 8、大小王存入到集合对象中去   大王："🤡"   小王："🃏"
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "🤡", ++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌：" + allCards);
    }

    public static void main(String[] args) {
        // 9、洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 10、发牌（定义三个玩家，每个玩家的牌也是一个集合容器）
        List<Card> zhangsan = new ArrayList<>();
        List<Card> lisi = new ArrayList<>();
        List<Card> wangwu = new ArrayList<>();

        // 11、开始发牌（从牌集合中发出51张牌给三个玩家，剩余3张作为底牌）
        // allCards = [9♥, J♥, 6♦, 5♣, A♠, A♥, 4♦, 6♠, 10♥...
        //      i       0   1   2    3   4    5   6    7    8
        for (int i = 0; i < allCards.size() - 3; i++) {
            // 拿到当前牌对象
            Card c = allCards.get(i);
            // 轮询
            if (i % 3 == 0) {
                // 发给zhangsan
                zhangsan.add(c);
            }else if (i % 3 == 1) {
                // 发给lisi
                lisi.add(c);
            }else if (i % 3 == 2) {
                // 发给wangwu
                wangwu.add(c);
            }
        }

        // 12、拿到最后三张底牌（把最后三张牌截取成一个子集合）
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());

        // 13、给玩家的牌排序（从大到小）
        sortCards(zhangsan);
        sortCards(lisi);
        sortCards(wangwu);

        // 14、输出玩家的牌
        System.out.println("张三：" + zhangsan);
        System.out.println("李四：" + lisi);
        System.out.println("王五：" + wangwu);
        System.out.println("三张底牌：" + lastThreeCards);

    }

    /**
     * 给牌排序
     * @param cards
     */
    private static void sortCards(List<Card> cards) {
        // cards = [4♦, 10♠, 5♠, 4♥, K♠, Q♠, 9♦...
//        Collections.sort(cards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                // o1 = J♥
//                // o2 = A♦
//                // 知道牌的大小，才可以指定规则
//                return o2.getIndex() - o1.getIndex();
//            }
//        });
        Collections.sort(cards, (o1, o2) -> o2.getIndex() - o1.getIndex());
    }


}

