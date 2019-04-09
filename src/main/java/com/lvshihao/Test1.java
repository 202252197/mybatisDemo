package com.lvshihao;

import com.lvshihao.dao.UserMapper;
import com.lvshihao.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Test1 {
    public static SqlSession getSqlSession() throws IOException {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
       return build.openSession();
    }
    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
    }
    private static void test5() throws IOException {

        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        User user1=new User();
        user1.setName("lvshihao");
        User user2=new User();
        user2.setDescribe("6666666");
        User oneUser = userMapper.getOneUserBy2User(user1,user2);
        System.out.println(oneUser);
        getSqlSession().close();
    }

    private static void test4() throws IOException {
        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("name","lvshihao");
        hashMap.put("describe","6666666");
        User oneUser = userMapper.getOneUserByMap(hashMap);
        System.out.println(oneUser);
        getSqlSession().close();
    }

    private static void test3() throws IOException {
        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        User user=new User();
        user.setName("lvshihao");
        user.setDescribe("6666666");
        User oneUser = userMapper.getOneUserByUser(user);
        System.out.println(oneUser);
        getSqlSession().close();
    }

    private static void test2() throws IOException {
        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        User oneUser = userMapper.getOneUser("lvshihao","6666666");
        System.out.println(oneUser);
        getSqlSession().close();
    }


    private static void test1() throws IOException {
        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        List<User> allUser = userMapper.getAllUser();
        allUser.forEach(System.out::println);
        getSqlSession().close();
    }
}
