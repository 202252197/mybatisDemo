package com.lvshihao;
import com.lvshihao.dao.UserMapper;
import com.lvshihao.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *功能描述
 * @author 吕世昊
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class Test2 {
    static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession() throws IOException {
        if(sqlSessionFactory==null){
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        }
        return sqlSessionFactory.openSession();
    }
    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
//        test9();
//        test10();
//        test11();
    }

    /*====================================清空缓存的方法=========================================*/
    //如果在2条查询中间进行了增删改则会使缓存失效,或者调用sqlSessqion中的clearCache()方法强制清空缓存,清空全部缓存
    /*=====================================缓存级别顺序=========================================*/
    //如果开启了2级缓存,首先去2级缓存中查看是否有缓存,如果没有则取1级缓存,否者就去数据库查询
    //（1）当为select语句时：
    //flushCache默认为false，表示任何时候语句被调用，都不会去清空本地缓存和二级缓存。
    //useCache默认为true，表示会将本条语句的结果进行二级缓存。
    //（2）当为insert、update、delete语句时：
    //flushCache默认为true，表示任何时候语句被调用，都会导致本地缓存和二级缓存被清空。
    //useCache属性在该情况下没有。
    //当为select语句的时候，如果没有去配置flushCache、useCache，那么默认是启用缓存的，所以，如果有必要，那么就需要人工修改配置

    //二级缓存sqlSession测试
    private static void test11() throws IOException {
        /*二级缓存只需要在Mapper.xml里面加上一个cache标签和在mybatis主配置文件里面配置一个cacheEnabled属性设置为true,
        此配置mybatis3.x默认为true,
         */
        try(SqlSession sqlSession = getSqlSession();){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.testCache();
            users.forEach(System.out::println);
        }
        System.out.println("=================================");
       try(SqlSession sqlSession1 = getSqlSession();){
           UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
           List<User> users1 = mapper1.testCache();
           users1.forEach(System.out::println);
       }
    }

    //一级缓存sqlSession测试
    private static void test10() throws IOException {
    /*在控制台输出的地方可以看到只打印了一条sql语句,可见第二个语句是读取缓存中的数据的,
      如果不信请在同一方法中再创键一个sqlSession可以查看就会打印两个sql语句*/
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userByChoose1 = mapper.testCache();
        userByChoose1.forEach(System.out::println);
        List<User> userByChoose2 = mapper.testCache();
        userByChoose2.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test9() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userByChoose = mapper.getUserByLike3("%l%");
        userByChoose.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test8() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userByChoose = mapper.getUserByLike2("l");
        userByChoose.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test7() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userByChoose = mapper.getUserByLike1("l");
        userByChoose.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test6() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        List<User> userByChoose = mapper.getUserByForeach(list);
        userByChoose.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test5() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userByChoose = mapper.getUserByTrem("lvxiao",null);
        userByChoose.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test4() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userByChoose = mapper.getUserByChoose("xxxlvxxx", null);
        userByChoose.forEach(System.out::println);
        getSqlSession().close();
    }

    private static void test3() throws IOException {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int lvshihao = mapper.updateOneUser("lvssssddd","521",1);
        System.out.println(lvshihao);
        sqlSession.commit();
        sqlSession.close();
    }

    private static void test2() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        User lvshihao = mapper.getOneUser2("lvshihao", "");
        System.out.println(lvshihao);
        getSqlSession().close();
    }

    private static void test1() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        User lvshihao = mapper.getOneUser2(null, "6666666");
        System.out.println(lvshihao);
        getSqlSession().close();
    }
}
