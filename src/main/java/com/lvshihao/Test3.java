package com.lvshihao;

import com.lvshihao.dao.UserMapper;
import com.lvshihao.entity.BooksWithAuthor;
import com.lvshihao.entity.ManytoMany;
import com.lvshihao.entity.OnetoMany;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.Optional;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-9$
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class Test3 {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession() throws IOException {
        if(sqlSessionFactory==null){
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        }
        return sqlSessionFactory.openSession();
    }


    public static void main(String[] args) throws IOException {
//        oneToOne();
//        oneToMany();
//        manyToMany();
    }
    //多对多的关系映射测试
    private static void manyToMany() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        ManytoMany manytoMany = mapper.getManytoMany();
        manytoMany.getBook2s().forEach(v->{
            Optional.of(v.getId()+"==="+v.getBook()).ifPresent(System.out::println);
            v.getAuthors().forEach(System.out::println);
            Optional.of("================================================").ifPresent(System.out::println);
        });
    }
    //一对多的关系映射测试
    private static void oneToMany() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        OnetoMany oneto = mapper.getBookToManyAuthor("奇幻小说");
        Optional.of(oneto.getBook()).ifPresent(System.out::println);
        oneto.getAuthors().forEach(v->System.out.println(v.getAuthor()));
    }

    //一对一的关系映射测试
    private static void oneToOne() throws IOException {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        BooksWithAuthor oneBookWithAuthor = mapper.getOneBookWithAuthor2("奇幻小说");
        Optional.of(oneBookWithAuthor.getBook()).ifPresent(System.out::println);
        Optional.of(oneBookWithAuthor.getId()).ifPresent(System.out::println);
        Optional.of(oneBookWithAuthor.getAuthor().getAuthor()).ifPresent(System.out::println);
        Optional.of(oneBookWithAuthor.getAuthor().getbId()).ifPresent(System.out::println);
        Optional.of(oneBookWithAuthor.getAuthor().getId()).ifPresent(System.out::println);
        Optional.of(oneBookWithAuthor.getAuthor().getBooks().getBook()).ifPresent(System.out::println);
        Optional.of(oneBookWithAuthor.getAuthor().getBooks().getId()).ifPresent(System.out::println);
    }
}
