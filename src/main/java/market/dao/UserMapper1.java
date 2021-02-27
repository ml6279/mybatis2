package market.dao;

import market.entity.NewsUser;

import java.util.List;

public interface UserMapper1 {
    public void addUser(NewsUser user);
    public void ModifyUser(NewsUser user);
    public void deleteUser(int id);
    public int totalUsers(); //查询表里面用户数量
    public NewsUser getUser(int id); //查询具体用户
    public List<NewsUser> getAllUser(); //查询全部用户
    public void getAllUser1();//测试batis缓存

}
