package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

// 持有用户信息，用于代替session对象(session对象是持有用户信息的，并且本身就是线程隔离的)
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<User>();

    public void setUsers(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }

}
