package com.nowcoder.community.util;

public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";

    // 某个实体的攒
    // like:entity:entityType:entityId -> set(userId)
    public static String getEntityLikeKey(int entityTpye, int entityId){
        return PREFIX_ENTITY_LIKE + SPLIT + entityTpye + SPLIT + entityId;
    }



}
