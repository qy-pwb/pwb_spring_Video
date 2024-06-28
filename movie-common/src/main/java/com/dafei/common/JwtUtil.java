package com.dafei.common;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//JWT的生成和解析
public class JwtUtil {
    // 创建token
    public static String createToken(Map claims) {
        return Jwts.builder()
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))//设置有效时间为1天
                .setClaims(claims) //设置响应数据体
                .signWith(SignatureAlgorithm.HS256, "dafei_movies") //设置加密方法和加密盐
                .compact();
    }

    // 解析token
    public static Map parseToken(String token) {
        return Jwts.parser().setSigningKey("dafei_movies")
                .parseClaimsJws(token)
                .getBody();
    }

    //1. 创建一个token 令牌


    public static void main(String[] args) {

        //1. 创建一个token 令牌
        Map<String,Object> map= new HashMap<String,Object>();
        // 往 令牌中放置  用户的id
        map.put("id", 1);

        //  eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MX0.yfoWkCXiD_rFeDznBJUanB2r3VqXCBNSWtQmvWYWnCg
        String token = createToken(map);
        System.out.println("得到的token令牌是:"+token);


        //2. 根据token 令牌 进行解析 还原出用户的数据！

        System.out.println("========================");

        Map maptoken = parseToken("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MX0.yfoWkCXiD_rFeDznBJUanB2r3VqXCBNSWtQmvWYWnCg");
        System.out.println("从token令牌中还原到的数据是:"+maptoken);



    }



}
