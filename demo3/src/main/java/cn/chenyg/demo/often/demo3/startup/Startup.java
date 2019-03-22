package cn.chenyg.demo.often.demo3.startup;

import cn.xishan.oftenporter.porter.core.init.PorterConf;
import cn.xishan.oftenporter.porter.core.util.PackageUtil;
import cn.xishan.oftenporter.servlet.OftenInitializer;

import javax.servlet.ServletContext;

/**
 * <strong>注意：</strong>web.xml的web-app标签的版本参数设置成3.1,这样在jetty下能自动执行ServletContainerInitializer、从而执行OftenInitializer。
 *
 * @author Created by https://github.com/CLovinr on 2019-03-22.
 */
public class Startup implements OftenInitializer
{
    @Override
    public void beforeStart(ServletContext servletContext, BuilderBefore builderBefore) throws Exception
    {

    }

    @Override
    public void onStart(ServletContext servletContext, Builder builder) throws Exception
    {
        PorterConf porterConf = builder.newPorterConf();
        porterConf.setOftenContextName("often");
        porterConf.getSeekPackages().addPackages(PackageUtil.getPackageWithRelative(getClass(), "../modules", '.'));
        builder.startOne(porterConf);
    }
}
