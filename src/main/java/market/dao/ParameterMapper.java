package market.dao;

import market.entity.NewsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    public List<NewsUser> query2(Map<String,Object> where);

    public List<NewsUser> query3(Map<String,Object> where);

    public List<NewsUser> query4(String name,String password);//这么写查不出来

    public List<NewsUser> query5(@Param("name1") String name,@Param("password") String password);

}
