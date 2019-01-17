package cn.finalabproject.smartdesklamp.smartdesklamp.mapper;

import cn.finalabproject.smartdesklamp.smartdesklamp.model.Background;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BackgroundMapper {

    @Insert({"insert into background(uid,flag,image_path) values(#{uid},#{flag},#{imagePath})"})
    @Options(useGeneratedKeys = true,keyProperty = "bid",keyColumn = "bid")
    public boolean insertBackground(Background background);

    @Delete("delete from background where bid=#{bid} and uid=#{uid}")
    public boolean deleteBackground(@Param("uid")Integer uid,@Param("bid")Integer bid);

    @Select("select * from background where flag=0 or uid=#{uid}")
    @Results({
            @Result(property = "imagePath",column = "image_path")
    })
    public Background[] queryBackgrounds(@Param("uid") Integer uid);

    @Select("select * from background where bid=#{bid}")
    @Results({
            @Result(property = "imagePath",column = "image_path")
    })
    public Background queryBackgroundByBid(@Param("bid") Integer bid);
}
