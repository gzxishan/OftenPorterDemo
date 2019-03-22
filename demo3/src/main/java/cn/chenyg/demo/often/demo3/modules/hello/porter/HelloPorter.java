package cn.chenyg.demo.often.demo3.modules.hello.porter;

import cn.chenyg.demo.often.demo3.modules.hello.unit.HelloUnit;
import cn.xishan.oftenporter.porter.core.JResponse;
import cn.xishan.oftenporter.porter.core.annotation.AutoSet;
import cn.xishan.oftenporter.porter.core.annotation.PortIn;
import cn.xishan.oftenporter.porter.core.base.OftenObject;

/**
 * @author Created by https://github.com/CLovinr on 2019-03-22.
 */
@PortIn
public class HelloPorter
{
    @AutoSet
    HelloUnit helloUnit;

    @PortIn(nece = {"name"})
    public JResponse say(OftenObject oftenObject)
    {
        String name = oftenObject.fnOf(0);
        return JResponse.success("你好," + name + "(时间:" + helloUnit.getTime() + ")");
    }

}
