/**
 * Leetcode - p535_encode_and_decode_tinyurl
 */
package me.txie.leetcode.p535_encode_and_decode_tinyurl;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    private Map<Integer, String> dic = new HashMap<>();
    private int count = 0;
    private final String PREFIX = "http://tinyurl.com/";

    @Override
    public String encode(String longUrl) {
        int id = ++count;
        dic.put(id, longUrl);
        return PREFIX + id;
    }

    @Override
    public String decode(String shortUrl) {
        int id = Integer.parseInt(shortUrl.replace(PREFIX, ""));
        return dic.remove(id);
    }
}
