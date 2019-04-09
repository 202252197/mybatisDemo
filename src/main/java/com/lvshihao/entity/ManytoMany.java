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
public class ManytoMany {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private List<Books2> book2s;

    public List<Books2> getBook2s() {
        return book2s;
    }

    public void setBook2s(List<Books2> book2s) {
        this.book2s = book2s;
    }
}
