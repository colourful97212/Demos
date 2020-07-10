package abloutJwtSomething;

import java.security.Key;
import java.util.Date;
import java.util.UUID;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Description
 *
 *  Header（头部） —— base64编码的Json字符串
 *  Payload（载荷） —— base64编码的Json字符串
 *  Signature（签名）—— 使用指定算法，通过Header和Payload加盐计算的字符串
 *  各部分以" . "分割
 *
 * @Version
 * @Date 7/10/2020
 * @Author Gon
 */
public class JwtDemo
{
    private static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String createToken()
    {
        //System.out.println("密钥：" + key);

        //System.out.println("=============创建 JWT===========");
        Date now = new Date();
        JwtBuilder builder= Jwts.builder()
                .setId(UUID.randomUUID().toString()) // 载荷-标准中注册的声明
                .setSubject("admin") // 载荷-标准中注册的声明
                .setIssuedAt(now) // 载荷-标准中注册的声明，表示签发时间
                .claim("id", "123456") // 载荷-公共的声明
                .claim("name", "MoonlightL") // 载荷-公共的声明
                .claim("sex", "male") // 载荷-公共的声明
                .signWith(key); // 签证

        String jwt = builder.compact();
        //System.out.println("生成的 jwt :" +jwt);
        return jwt;
    }

    public static void parseToken(String token)
    {
        Jws<Claims> result = Jwts.parser().setSigningKey(key).parseClaimsJws(token);
        // 以下步骤随实际情况而定，只要上一行代码执行不抛异常就证明 jwt 是有效的、合法的
        Claims body = result.getBody();

        System.out.println("载荷-标准中注册的声明 id:" + body.getId());
        System.out.println("载荷-标准中注册的声明 subject:" + body.getSubject());
        System.out.println("载荷-标准中注册的声明 issueAt:" + body.getIssuedAt());

        System.out.println("载荷-公共的声明的 id:" + result.getBody().get("id"));
        System.out.println("载荷-公共的声明的 name:" + result.getBody().get("name"));
        System.out.println("载荷-公共的声明的 sex:" + result.getBody().get("sex"));
    }

    public static Key generateKey(String strKey)
    {
        byte[] encodedKey = Base64.decodeBase64(strKey);
        System.out.println(encodedKey);
        System.out.println(Base64.encodeBase64URLSafeString(encodedKey));
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "HS256");
        return key;
    }

    public static void main(String[] args)
    {
        String token = createToken();

        parseToken(token);
    }
}
