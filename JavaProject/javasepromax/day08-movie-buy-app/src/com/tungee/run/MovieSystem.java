package com.tungee.run;

import com.tungee.bean.Customer;
import com.tungee.bean.Business;
import com.tungee.bean.Movie;
import com.tungee.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    /*
        定义系统的数据容器用于存储数据
        1、存储很多用户（客户对象，商家对象）
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /*
        2、存储系统全部商家和其排片信息
            商家1 = [p1, p2, p3, ...]
            商家2 = [p2, p3, ...]
            ...
     */
    public static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    // 定义一个扫描器对象
    public static final Scanner SYS_SC = new Scanner(System.in);

    // 定义一个静态的User类型的变量记住当前登录成功的用户对象
    public static User loginUser;

    // 定义一个简单日期格式化对象
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    // 创建一个日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    /*
        3、准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zs888");
        c.setPassWord("123456");
        c.setUserName("张三");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("ls888");
        c1.setPassWord("123456");
        c1.setUserName("李四");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("xiaoping888");
        b.setPassWord("123456");
        b.setUserName("小萍");
        b.setMoney(0);
        b.setSex('女');
        b.setPhone("110110");
        b.setAddress("广州海珠江南大道中6号2B二层");
        b.setShopName("珠江国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("wsc888");
        b2.setPassWord("123456");
        b2.setUserName("王思聪");
        b2.setMoney(0);
        b2.setSex('男');
        b2.setPhone("110110");
        b2.setAddress("广州天河员村8号万达广场8B八层");
        b2.setShopName("万达国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies3); // b2 = []
    }

    public static void main(String[] args) {
        showMain(); // 展示首页
    }

    /*
        首页展示
     */
    private static void showMain() {
        while (true) {
            System.out.println("================== TUNGEE Movie Front Page ==================");
            System.out.println("1、Login");
            System.out.println("2、Customer Register");
            System.out.println("3、Business Register");
            System.out.println("Please enter the action command:");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 登录
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Sorry, your command is error! Please try again!");
                    break;
            }
        }
    }

    /*
        登录功能
     */
    private static void login() {
        while (true) {
            System.out.println("Please enter your loginName:");
            String loginName = SYS_SC.nextLine();
            System.out.println("Please enter your passWord:");
            String passWord = SYS_SC.nextLine();

            // 1、根据用户名查询用户对象
            User u = getUserByLoginName(loginName);
            // 2、判断用户对象是否存在，存在说明登录名称正确了
            if (u != null) {
                // 3、判断密码是否正确
                if (u.getPassWord().equals(passWord)) {
                    // 登录成功
                    loginUser = u; // 记住登录成功的用户
                    LOGGER.info(u.getUserName() + "登录了系统");
                    // 判断是客户登录的，还是商家登录的（用instanceof查类型即可）
                    if (u instanceof Customer) {
                        // 当前登录的是普通客户
                        showCustomerMain(); // 展示客户的首页
                    }else {
                        // 当前登录的是商家
                        showBusinessMain(); // 展示商家的首页
                    }
                    return;
                }else {
                    System.out.println("Sorry, your passWord is error! Please try again!");
                }
            }else {
                System.out.println("Sorry, your loginName is error! Please try again!");
            }
        }
    }

    /*
        商家的后台操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("=============== TUNGEE Movie Business Front Page ==============");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "欢迎您进入系统");
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");
            System.out.println("Please enter the action command:");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfo();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    // 退出系统
                    System.out.println(loginUser.getUserName() + "请您下次再来！");
                    return; // 干掉方法
                default:
                    System.out.println("Sorry, the command does not exist! Please try again!");
                    break;
            }
        }
    }

    /*
        商家进行电影信息修改功能
     */
    private static void updateMovie() {
        System.out.println("=========================== 修改电影 ===========================");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        if (movies.size() == 0) {
            System.out.println("当前无电影可以修改！");
            return;
        }

        // 2、让用户选择需要修改的电影名称
        while (true) {
            System.out.println("请您输入需要修改的电影名称：");
            String movieName = SYS_SC.nextLine();

            // 3、去查询是否有这个电影对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                // 修改它
                System.out.println("请您输入修改后的片名：");
                String name = SYS_SC.nextLine();
                System.out.println("请您输入修改后的主演：");
                String actor = SYS_SC.nextLine();
                System.out.println("请您输入修改后的时长：");
                String time = SYS_SC.nextLine();
                System.out.println("请您输入修改后的票价：");
                String price = SYS_SC.nextLine();
                System.out.println("请您输入修改后的票数：");
                String totalNumber = SYS_SC.nextLine(); // 200\n
                while (true) {
                    try {
                        System.out.println("请您输入修改后的影片放映时间：");
                        String stime = SYS_SC.nextLine();

                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setTime(Double.valueOf(time));
                        movie.setPrice(Double.valueOf(price));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(sdf.parse(stime));

                        System.out.println("您成功修改了该影片！");
                        showBusinessInfo();
                        return; // 直接退出去
                    } catch (Exception e) {
                        e.printStackTrace();
                        LOGGER.error("时间解析出问题");
                    }
                }
            }else {
                System.out.println("您的影院没有上架该电影！");
                System.out.println("请问需要继续修改吗？y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的！");
                        return;
                }
            }
        }

    }

    /*
        商家进行电影下架功能
     */
    private static void deleteMovie() {
        System.out.println("=========================== 下架电影 ===========================");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("当前无电影可以下架！");
            return;
        }

        // 2、让用户选择需要下架的电影名称
        while (true) {
            System.out.println("请您输入需要下架的电影名称：");
            String movieName = SYS_SC.nextLine();

            // 3、去查询是否有这个电影对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                // 下架它
                movies.remove(movie);
                System.out.println("您当前影院已经成功下架了：" + movie.getName());
                showBusinessInfo();
                return;
            }else {
                System.out.println("您的影院没有上架该电影！");
                System.out.println("请问需要继续下架吗？y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的！");
                        return;
                }
            }
        }
    }

    /*
        根据电影名称找到电影对象(注意：查询的只是当前商家的排片)
     */
    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    /*
        商家进行电影上架
        Map<Business, List<Movie>> ALL_MOVIES
        u1 = [p1, p2, p3, ...]
        u2 = [p1, p2, p3, ...]
     */
    private static void addMovie() {
        System.out.println("=========================== 上架电影 ===========================");
        Business business = (Business) loginUser;
        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键，提取对应的值就是其排片信息：Map<Business, List<Movie>> ALL_MOVIES
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("请您输入新片名：");
        String name = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime = SYS_SC.nextLine();
                // public Movie(String name, String actor, double score, double time, double price, int number, Date startTime)
                // 封装成电影对象，加入集合Movies中去
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price)
                        , Integer.valueOf(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出问题");
            }
        }
    }

    /*
        展示商家的详细信息：展示当前登录的商家的信息
     */
    private static void showBusinessInfo() {
        System.out.println("================== Business Details Interface =================");
        LOGGER.info(loginUser.getUserName() + "商家，正在查看自己的详情");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress()
                + "\t\t余额：" + business.getMoney());
        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键，提取对应的值就是其排片信息：Map<Business, List<Movie>> ALL_MOVIES
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() > 0) {
            System.out.println("片名\t\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber()
                        + "\t\t" + sdf.format(movie.getStartTime()));
            }
        }else {
            System.out.println("您的电影院当前无电影放映！");
        }
    }

    /*
        客户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("=============== TUNGEE Movie Customer Front Page ==============");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "欢迎您进入系统"
                    + "\t余额：" + loginUser.getMoney());
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("Please enter the action command:");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    // 根据电影名称查询电影信息

                    break;
                case "3":
                    // 评分功能

                    break;
                case "4":
                    // 购票功能
                    buyMovieTicket();
                    break;
                case "5":
                    // 退出系统

                    return; // 干掉方法
                default:
                    System.out.println("Sorry, the command does not exist! Please try again!");
                    break;
            }
        }
    }

    /*
        客户购票功能   ALL_MOVIES = {b1 = [p1, p2, p3, ...], b2 = [p2, p3, ...], ...}
     */
    private static void buyMovieTicket() {
        showAllMovies();
        System.out.println("========================= 客户购票功能 ========================");
        while (true) {
            System.out.println("请您输入需要购票的电影院名：");
            String shopName = SYS_SC.nextLine();
            // 1、查询是否存在该商家
            Business business = getBusinessByShopName(shopName);
            if (business == null) {
                System.out.println("对不起，没有该店铺！请确认。");
            }else {
                // 2、此商家的全部排片
                List<Movie> movies = ALL_MOVIES.get(business);
                // 3、判断是否存在上映的电影
                if (movies.size() > 0) {
                    // 4、开始进行选片购买
                    while (true) {
                        System.out.println("请您输入需要购买的电影名称：");
                        String movieName = SYS_SC.nextLine();
                        // 去当前商家下，查询该电影对象
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if (movie != null) {
                            // 开始购买
                            while (true) {
                                System.out.println("请您输入要购买的电影票数：");
                                String number = SYS_SC.nextLine();
                                int buyNumber = Integer.valueOf(number);
                                // 判断该电影余票是否足够
                                if (movie.getNumber() >= buyNumber) {
                                    // 可以购买了
                                    // 当前需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber))
                                            .doubleValue();
                                    if (loginUser.getMoney() >= money) {
                                        // 终于可以购票了
                                        System.out.println("您成功购买了" + movie.getName() + buyNumber + "张票！总金额是：" + money);
                                        // 更新自己的金额 更新商家的金额、电影的票数
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setNumber(movie.getNumber() - buyNumber);
                                        return; // 结束方法
                                    }else {
                                        // 钱不够
                                        System.out.println("对不起，您的账户余额不足！");
                                        System.out.println("您是否继续购票呢？y/n");
                                        String command = SYS_SC.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的！");
                                                return;
                                        }
                                    }
                                }else {
                                    // 票数不够
                                    System.out.println("您当前最多可以购买：" + movie.getNumber());
                                    System.out.println("是否继续购票呢？y/n");
                                    String command = SYS_SC.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的！");
                                            return;
                                    }
                                }
                            }
                        }else {
                            System.out.println("对不起，您输入的电影名称有误！");
                        }
                    }
                }else {
                    System.out.println("该电影院休息中！");
                    System.out.println("是否继续购票？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的！");
                            return;
                    }
                }
            }
        }
    }

    /*
        根据商家店铺名称和电影名称查询电影对象
     */
    public static Movie getMovieByShopAndName(Business business, String name) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                return movie;
            }
        }
        return null;
    }

    /*
        根据商家店铺名称查询商家对象
     */
    public static Business getBusinessByShopName(String shopName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    /*
        客户功能：展示全部商家和其排片信息
     */
    private static void showAllMovies() {
        System.out.println("======================= 展示全部商家排片信息 ======================");
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress());
            System.out.println("\t\t\t片名\t\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber()
                        + "\t\t" + sdf.format(movie.getStartTime()));
            }
        });
    }

    /*
        根据用户名查询用户对象
     */
    public static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            // 判断这个用户的登录名是否是我们想要的
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null; // 查无此用户
    }

}





