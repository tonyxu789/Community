package com.nowcoder.community.util;

public interface CommunityConstant {

    //激活成功
    int ACTIVATION_SUCCESS = 0;

    //重复激活
    int ACTIVATION_REPEAT = 1;

    //激活失败
    int ACTIVATION_FAIL = 2;

    // 默认状态登陆凭证超时时间
    int DEFAULT_EXPIRED_SECONDS = 3600*12;

    // 记住我超时时间
    long REMEMBERME_EXPIRED_SECONDS = 3600*12*128;

    // 实体类型，帖子
    int ENTITY_TYPE_POST = 1;

    //实体类型，评论
    int ENTITY_TYPE_COMMENT = 2;

}
