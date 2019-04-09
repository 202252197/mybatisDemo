package com.lvshihao.entity;

import java.util.List;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-9$
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class OnetoMany extends Books{
    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
