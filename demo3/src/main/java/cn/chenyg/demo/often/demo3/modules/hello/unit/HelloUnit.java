package cn.chenyg.demo.often.demo3.modules.hello.unit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Created by https://github.com/CLovinr on 2019-03-22.
 */
public class HelloUnit
{
    public String getTime()
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
