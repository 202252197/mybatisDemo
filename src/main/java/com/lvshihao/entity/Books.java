package com.lvshihao.entity;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-9
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class Books {
    private int id;
    private String book;

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", book='" + book + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
