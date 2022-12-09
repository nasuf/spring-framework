package org.nasuf.springframework.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();
    static {
        hashMap.put("10001", "hello");
        hashMap.put("10002", "world");
        hashMap.put("10003", "and me");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
