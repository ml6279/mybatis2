package market.dao;

import market.entity.EasybuyOrder;
import market.entity.NewsUser;
import market.entity.OrderDesc;
import market.entity.OrderDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface AnnotationMapper {
    //使用注解的方式
    @Insert("insert into newuser(name,password) values (#{name},#{password})")
    public void addUser(NewsUser user);

    @Update("update newuser set name = #{name},password = #{password} where id = #{id}")
    public void modifyUser(NewsUser user);

    @Delete("delete from newuser where id = #{id}")
    public void removeUser(int id);

    @Insert("insert into newuser(name,password) values (#{name},#{password})")
    @Options(useGeneratedKeys = true,keyProperty = "id")//获取自增长的id值
    public int addUser1(NewsUser user);

    @Select("select * from newuser where name = #{name} and password = #{password}")
    public NewsUser getUser(Map<String,Object> where);  //查询

    @Select("select * from newuser where name = #{name} and password = #{password}")
    public NewsUser getUser1(@Param("name") String name,@Param("password") String password);

    @Select("select a.*,serialNumber,loginName from orderdetail a,easybuyorder b where a.orderId = b.id")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "orderId",property = "orderId"),
            @Result(column = "productId",property = "productId"),
            @Result(column = "serialNumber",property = "serialNumber"),
            @Result(column = "loginName",property = "loginName"),
    })
    public List<Map<String,Object>> queryOrderDetail();

    //使用注解配置一对一的关系
    @Select("select * from orderdesc where orderId = #{id}")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "orderId",property = "orderId"),
            @Result(column = "describle",property = "describle"),
    })
    OrderDesc findDescById(int id);

    @Select("select * from easybuyOrder")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "loginName",property = "loginName"),
            @Result(column = "createTime",property = "createTime"),
            @Result(column = "cost",property = "cost"),
            @Result(column = "serialNumber",property = "serialNumber"),
            @Result(
                    column = "id",property = "orderDesc",
                    one = @One(select = "market.dao.AnnotationMapper.findDescById")
            )
    })
    public List<EasybuyOrder> queryOrderDetail1();//用这个测试

    //一对多的关系
    @Select("select * from orderDetail where orderId = #{id}")
    List<OrderDetail> findDetailById(int id);
    @Select("select * from easybuyOrder")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "loginName",property = "loginName"),
            @Result(column = "createTime",property = "createTime"),
            @Result(column = "cost",property = "cost"),
            @Result(column = "serialNumber",property = "serialNumber"),
            @Result(
                    column = "id",property = "detail",
                    many = @Many(select = "market.dao.AnnotationMapper.findDetailById")
            )
    })
    public List<EasybuyOrder> queryOrderDetail2();

    //动态sql
    @Select("<script>select * from newuser <where> "
            + "<if test=\"name !=null\"> and name = #{name} </if>"
            + "<if test=\"name !=null\"> and password = #{password} </if>"
            + "</where></script>")
    public NewsUser getUser2(@Param("name") String name,@Param("password") String password);

}
