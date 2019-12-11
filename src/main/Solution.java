package main;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

/**
 * @author: DX
 * @date: 2019/11/25 14:33
 */
class Solution {

    /**
     * 猜数字
     * @param guess A的猜测
     * @param answer B的猜测
     * @return AB猜对次数
     */
    public static int game(int[] guess, int[] answer) {
        int count=0;
        for (int i=0;i<guess.length;i++){
            if (guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }

    /**
     * 机器人寻路 起始位置（0，0）
     * @param command 指令
     * @param obstacles 障碍物
     * @param x 终点X坐标
     * @param y 终点Y坐标
     * @return flag 是否可以走出
     */
    public static boolean robot(String command, int[][] obstacles, int x, int y) {
        //是否可以走出
        boolean flag = true;
        x=x-1;
        y=y-1;
         // 向Y轴正向移动 1 位
        String u ="U";
         //向X轴正向移动 1 位
        String r ="R";
        String [] strs = command.split("");
        //障碍物位置
        int fx,fy;
        fx=obstacles.length-1;
        fy=obstacles[0].length-1;
        if (fx>x||fy>y){
            flag=true;
            System.out.println("障碍物在地图外面");
        }else if (fx==x&&fy==y){
            flag=false;
            System.out.println("障碍物在终点，不可达");
        }
        //初始坐标
        int cx=0,cy=0;
        if (command.indexOf(u)==-1 || command.indexOf(r)==-1) {
            System.out.println("指令错误,command由U，R构成，且至少有一个U，至少有一个R");
            flag=false;

        }

        if(flag){
            for (int i=0;i<strs.length;i++){
                if (u.equals(strs[i])){
                    //Y轴加一
                    cy++;
                }else if (r.equals(strs[i])){
                    //X轴加一
                    cx++;
                }else {
                    //错误指令
                    flag=false;
                    System.out.println("指令错误,command由U，R构成,无其他字符");
                    break;
                }
                if(y < cy || cx <x){
                    flag=false;
                }else if(y > cy || cx >x){
                    flag=false;
                }else {
                    flag=true;
                    System.out.println("可以走到终点");
                }
                if(cx==fx&& cy==fy){
                    flag=false;
                    System.out.println("撞到障碍物");
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * 计算上下山里程
     */
    public static void calculateMi(){
        float h1=2f;
        float h2=2.5f;
        float v1 = 3f;
        float v2 = 4.5f;

        float m =(h1+h2)/(1f/v1+1f/v2);

        System.out.println(String.format("%.3f",m));

    }

    /**
     * 取款机
     */
    static class Atm{
        private String account;
        private String password;
        private double money;

        public Atm(String account, String password, double money) {
            this.account = account;
            this.password = password;
            this.money = money;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }
    }
    public static void atm(){
        Atm atm5 = new Atm("1234567890","123455",1000.00d);
        Atm atm1 = new Atm("1234567890","123456",20000.00d);
        Atm atm2 = new Atm("1234567890","123457",30000.00d);
        Atm atm3 = new Atm("1234567890","123458",10000.00d);
        Atm atm4 = new Atm("1234567890","123459",5000.00d);

        ArrayList<Atm> atmList = new ArrayList<Atm>();
        atmList.add(atm1);
        atmList.add(atm2);
        atmList.add(atm3);
        atmList.add(atm4);
        atmList.add(atm5);
        for (Atm atm:atmList){
            System.out.println("密码："+atm.password+"账户："+atm.account+" 余额："+atm.money+"元");
        }

    }
    public static void atmLogin(){}
    public static void checkAccount(){}

    /**
     * 递归求和1+2+3+···+n;
     * @param n
     * @return
     */
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        return n+sum(n-1);
    }

    /**
     * 斐波那契数列递归实现
     * @param n 位数
     * @return 第N位的 数
     */
    public static int  fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }



    /**
     * 用户话费
     */
    static class TellFee{
        public TellFee(String account, double fee) {
            this.account = account;
            this.fee = fee;
        }

        private String  account;
        private double fee;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }
    }

    /**
     * 用户登录系统
     */
    public static void tellLogin(){
        //数据库保存的账户
        final String dAccount ="12345678900";
        //数据库保存的密码
        final String dPassword = "123456";
        Scanner sc = new Scanner(System.in);
        //用户输入的账户
        System.out.println("输入账户：");
        String account = sc.nextLine();
        //用户输入的密码
        System.out.println("输入密码：");
        String password = sc.nextLine();
        //对账户和密码进行检查 三次机会
        int times=3;
        while (times>0){
            if (account.length()==11){
                if(dAccount.equals(account)&&dPassword.equals(password)){
                    //账户密码均正确
                    manue();
                    times=0;
                }else {
                    times--;
                    if(times==0){
                        System.out.println("账户密码错误三次，本次服务结束！");
                    }else {
                        System.out.println("账户密码错误,还有"+times+"次机会");
                        System.out.println("请重新输入账户：");
                        account = sc.nextLine();
                        System.out.println("请重新输入密码：");
                        password = sc.nextLine();
                    }
                }
            }else {
                times--;
                if(times==0){
                    System.out.println("账户 错误三次，本次服务结束！");
                }else {
                    System.out.println("账户 错误,还有"+times+"次机会");
                    System.out.println("请重新输入账户：");
                    account = sc.nextLine();
                    System.out.println("请重新输入密码：");
                    password = sc.nextLine();
                }
            }

        }
    }

    /**
     * 话费充值的菜单
     */
    public static void manue() {
        System.out.println("账户密码正确，请输入0：退出，1：话费充值，2：话费查询，3：金融服务");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int minM=0,maxM=3;
        //创建三个账户 和 话费
        TellFee tellFee1 = new TellFee("12345678901",123);
        TellFee tellFee2 = new TellFee("12345678902",33.5);
        TellFee tellFee3 = new TellFee("12345678903",1.11);
        TellFee [] tellFees ={tellFee1,tellFee2,tellFee3};
        while (m>=minM&&m<=maxM){
            if (m==1){
                chargeFee(tellFees);
                System.out.println("是否继续其他服务：0：退出系统，1：继续使用话费充值，2：话费查询，3：金融服务");
                m=sc.nextInt();
            }else if (m==2){
                //话费查询
                lookFee(tellFees);
                System.out.println("是否继续其他服务：0：退出系统，1：话费充值，2：继续使用话费查询，3：金融服务");
                m=sc.nextInt();
            }else if (m==3){
                //金融服务
                foundService();
                System.out.println("是否继续其他服务：0：退出系统，1：话费充值，2：话费查询，3：继续使用金融服务");
                m=sc.nextInt();
            }else if (m==0){
                //退出
                break;
            }else {
                //输入错误的处理
                System.out.println("选择有误，请重新选择，按0退出");
                m=sc.nextInt();
            }
        }
    }

    /**
     * 充话费
     * @param tellFees
     */
    public static void chargeFee(TellFee[] tellFees){
        //话费充值
        Scanner sc = new Scanner(System.in);
        String account;
        boolean flag =true;
        System.out.println("输入账户：只按0退出本次充值");
        account = sc.next();
        while (flag){
            if (account.length()==11){
                boolean isExistAccount = false;
                for (int i =0;i<tellFees.length;i++) {
                    if (account.equals(tellFees[i].getAccount())) {
                        isExistAccount=true;
                    }
                }
                if (isExistAccount){
                    System.out.println("输入充值金额，按 0 退出");
                    double money =sc.nextDouble();

                    double maxMoney = 2000d;
                    double minMoney = 100d;
                    while (flag){
                        if (money<=maxMoney&&money>=minMoney){
                            for (int i =0;i<tellFees.length;i++){
                                if (account.equals(tellFees[i].getAccount())){
                                    tellFees[i].setFee(tellFees[i].getFee()+money);
                                    System.out.println("账户："+tellFees[i].getAccount()+"充值成功,余额："+tellFees[i].getFee()+"元");
                                }
                            }
                            flag=false;
                        }else if (money==0){
                            flag=false;
                        }else {
                            System.out.println("请输入正确金额：100元-2000元");
                            money =sc.nextDouble();
                        }
                     }

                }else {
                    System.out.println("账户不存在，请重新输入账户：只按0退出本次充值");
                    account = sc.next();
                    flag=true;
                }

            }else if (account.equals("0")){
                flag=false;
                System.out.println("退出本次充值");
            } else {
                System.out.println("请重新输入账户：只按0退出本次充值");
                account = sc.next();
                flag=true;
            }
        }
    }

    /**
     * 查话费
     * @param tellFees
     */
    public static void lookFee(TellFee[] tellFees){
        //话费查询
        Scanner sc = new Scanner(System.in);
        String account;
        boolean flag =true;
        System.out.println("输入账户：只按0退出本次查询");
        account = sc.next();
        while (flag){
            if (account.length()==11){
                boolean isExistAccount = false;
                for (int i =0;i<tellFees.length;i++) {
                    if (account.equals(tellFees[i].getAccount())) {
                        isExistAccount=true;
                        System.out.println("账户："+tellFees[i].getAccount()+" 余额"+tellFees[i].getFee()+"元");
                    }
                }
                if (isExistAccount){
                            flag=false;
                }else {
                    System.out.println("账户不存在，请重新输入账户：只按0退出本次查询");
                    account = sc.next();
                    flag=true;
                }
            }else if (account.equals("0")){
                flag=false;
                System.out.println("退出本次查询");
            } else {
                System.out.println("请重新输入账户：只按0退出本次查询");
                account = sc.next();
                flag=true;
            }
        }
    }

    /**
     * 金融服务
     */
    public static void foundService(){
        System.out.println("输入里的投资金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        System.out.println("请输入年利率：");
        double rate = sc.nextDouble();
        System.out.println("输入投资年数");
        int year = sc.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        System.out.println("最终资金"+ decimalFormat.format(money*Math.pow((1+rate),year)));
    }

    /**
     * 制造长度为5的随机字符串
     */
    public static void makeRandomString(){
        String str = "abcdefghijklmnopqrstuvwxyz";
        String[] strs=str.split("");
        int n=0;
        int max=10;
        String st = "";

        while (n<max){
            int r = (int) (Math.floor(Math.random()*26)+1);
            st=st+(strs[r]);

            n++;
        }
        System.out.print(st);
    }



}
