package cn.devzyh.minispring.beans.service;

/**
 * 用户服务
 */
public class UserService {

    public void hello() {
        System.out.println("Hello Mini Spring");
        System.out.println("Current HashCode = " + this.hashCode());
    }

}
