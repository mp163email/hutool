import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * des:
 * created by miapoeng on 2020/8/21 11:35
 */
public class TestMain {
    public static void main(String[] args) {
        HashMap<String, Object> paramMap = new HashMap<>();
       // for (int j = 0; j < 2; j++) {
            for (int i = 1; i <= 36; i++) {
                paramMap.clear();
                paramMap.put("type", i + "");
                paramMap.put("clientver", "1.3.1");
                paramMap.put("platform", "Android11111");
                paramMap.put("guid", "1ba4a04-6ca3-4a9b-90e5-1f3d174f26f7-6c02f57");
                paramMap.put("channel", "9187");
                String result3= HttpUtil.get("http://47.104.210.69:8924/hit", paramMap);
                System.out.println(result3);
            }
        //}
    }
}
