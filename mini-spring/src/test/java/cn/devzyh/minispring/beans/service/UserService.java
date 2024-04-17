package cn.devzyh.minispring.beans.service;

/**
 * 用户服务
 */
public class UserService {

    // 属性：姓名
    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello Mini Spring");
        System.out.println("Current HashCode = " + this.hashCode());
    }

    public void say() {
        System.out.println("我的名字叫：" + this.name);
    }

}
