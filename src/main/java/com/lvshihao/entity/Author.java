package com.lvshihao.entity;

import java.util.Objects;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-9
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class Author {
    private int id;
    private int  bId;
    private String author;
    private Books books;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", bId=" + bId +
                ", author='" + author + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return id == author1.id &&
                bId == author1.bId &&
                Objects.equals(author, author1.author) &&
                Objects.equals(books, author1.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bId, author, books);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }
}
