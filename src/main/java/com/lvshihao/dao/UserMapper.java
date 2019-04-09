package com.lvshihao.dao;

import com.lvshihao.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
//     Test1测试
     List<User> getAllUser();
     User getOneUser(@Param("name")String name,@Param("describe")String describe);
     User getOneUserByUser(@Param("user") User user);
     User getOneUserByMap(@Param("map") HashMap map);
     User getOneUserBy2User(@Param("user1")User user1,@Param("user2")User user2);
//     Test2测试
     User getOneUser2(@Param("name")String name,@Param("describe")String describe);
     int updateOneUser(@Param("name")String name,@Param("describe")String describe,@Param("id")int id);
     List<User> getUserByChoose(@Param("name")String name,@Param("describe")String describe);
     List<User> getUserByTrem(@Param("name")String name,@Param("describe")String describe);
     List<User> getUserByForeach(@Param("lists") List list);
     List<User> getUserByLike1(@Param("matching")String matching);
     List<User> getUserByLike2(@Param("matching")String matching);
     List<User> getUserByLike3(@Param("matching")String matching);
     List<User> testCache();
//      Test3测试
     BooksWithAuthor getOneBookWithAuthor(String authorName);
     BooksWithAuthor getOneBookWithAuthor2(String bookName);
     Books getBook(int id);
     OnetoMany getBookToManyAuthor(String bookName);
     ManytoMany getManytoMany();
}
