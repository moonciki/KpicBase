package cn.kpic.base.redis;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
public class RedisCacheKey {

    /** 用于缓存每个圈子下的前十页帖子信息缓存，用户发帖一次失效一次*/
    public final static String PBAR_PAGE = "pbar:pbar_page";
    /** 用于缓存用户未读信息*/
    public final static String USER_NEWS = "user:news";
    /** 用于缓存圈子首页圈子信息，每隔 2 天失效一次*/
    public final static String PBAR_INDEX = "pbar:index";
    /** 用于缓存圈子管理页面对当前用户身份的缓存：大管理员&小管理员,每 1 天失效一次*/
    public final static String PBAR_USER_ROLE = "pbar:manager:role";
    /** 用于缓存用户节操值，每一周失效一次*/
    public final static String USER_JC_NUM = "user:jiecao";
    /** 用于缓存每个圈子的点击量，和定时任务相结合，每天定时更新点击量*/
    public final static String PBAR_HIT="pbar:pbar_hit";
    /** 用于缓存首页圈子类型*/
    public final static String PBAR_TYPE_INDEX = "pbar:type_index";

}
