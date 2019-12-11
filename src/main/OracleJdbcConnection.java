package main;

/**
 * 连接数据库操作
 * 1.注册驱动
 * 2.获取连接
 * 3.获取执行sql语句对象
 * 4.执行sql语句
 * 5.处理结果集
 * 6.关闭资源
 * @author: DX
 * @date: 2019/11/28 10:33
 */
public class OracleJdbcConnection {
    private static final String DRIVER = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static final String USR = "duanxu";
    private static final String PASWORD = "dx4017";

}
