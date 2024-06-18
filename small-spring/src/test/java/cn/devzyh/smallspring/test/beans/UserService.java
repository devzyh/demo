package cn.devzyh.smallspring.test.beans;

/**
 * 用户服务层
 */
public class UserService {

    // 依赖Bean对象
    private UserDao userDao;

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

    public void printAddress() {
        System.out.printf("%s的住址是：%s\n", this.name, this.userDao.getAddressByName(this.name));
    }
}
