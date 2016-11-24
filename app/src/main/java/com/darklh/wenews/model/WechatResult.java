package com.darklh.wenews.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by darklh on 2016/11/24.
 */

public class WechatResult implements Serializable {


    /**
     * reason : success
     * result : {"list":[{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8774101.jpg/640","id":"wechat_20151202064749","source":"果果帮","title":"笑死了,哈哈小伙子你很有前途","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20151202064749","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8590809.jpg/640","id":"wechat_20150215000867","source":"海外探客","title":"韩国品牌的傲慢与沦落：手机爆炸猛于核爆","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20150215000867","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8255071.jpg/640","id":"wechat_20160915039850","source":"功夫体育","title":"女排冠军们\u201c高\u201d人一等，谁敢娶？","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160915039850","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8575838.jpg/640","id":"wechat_20151201058612","source":"龍神迷失","title":"中国首辆上牌的布加迪威龙，以为车牌很一般，最后发现车牌很霸气","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20151201058612","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8064767.jpg/640","id":"wechat_20160908053966","source":"娱乐圈扒姐","title":"某知名女星在节目中威胁选手收贿，私下爱搞潜规则","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160908053966","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986866.jpg/640","id":"wechat_20160906017693","source":"颜小白的篮球梦","title":"科比跟乔丹比到底差在哪里？仅仅是身体素质吗","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017693","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986843.jpg/640","id":"wechat_20160906017663","source":"嘻嘻哈哈","title":"神动图|这手感绝对不差！","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017663","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986833.jpg/640","id":"wechat_20160906017658","source":"嘻嘻哈哈","title":"江湖流传的这些奇葩书，简直刷新我的三观~","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017658","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986819.jpg/640","id":"wechat_20160906017552","source":"笑你妹","title":"【搞笑段子】有心无力啊，办起事来几分钟完事~","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017552","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986802.jpg/640","id":"wechat_20160906017288","source":"TechWeb","title":"在iPhone7发布之前我们先来看看它的跑分吧","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017288","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986693.jpg/640","id":"wechat_20160906016354","source":"陇南生活网","title":"甘肃：将发生严重腐败问题的地区部门直接评为\u201c一般\u201d","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906016354","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986675.jpg/640","id":"wechat_20160906016213","source":"云上的空母","title":"万吨两栖舰上的袖珍火炮，射速为每分钟200发","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906016213","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986645.jpg/640","id":"wechat_20160906016204","source":"云上的空母","title":"全球最大口径的加特林机关炮，一眨眼打出50发炮弹","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906016204","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986534.jpg/640","id":"wechat_20160906015882","source":"钛媒体","title":"三星耗10亿美元召回Note7，并称损失令人real心痛钛晨报","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015882","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986438.jpg/640","id":"wechat_20160906015702","source":"摄影笔记","title":"一篇文章看懂尼康数码单反","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015702","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986443.jpg/640","id":"wechat_20160906015704","source":"摄影笔记","title":"中秋节要来了想拍好月亮从现在就得准备了","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015704","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986366.jpg/640","id":"wechat_20160906015392","source":"北美留学生日报","title":"2020届美国名校最新录取数据汇总，明年迎来最难申请季","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015392","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986363.jpg/640","id":"wechat_20160906015387","source":"北美留学生日报","title":"纸条|论吐槽奇葩英文名，日报的读者才是真正的扛把子！","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015387","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986372.jpg/640","id":"wechat_20160906015408","source":"北美留学生日报","title":"那些年我们遭遇到的令人无语的奇葩室友们，已无力吐槽","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015408","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986126.jpg/640","id":"wechat_20160906014853","source":"老马价值观","title":"颜值高还学霸，复旦双胞胎姐妹花一起被哈佛录取","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906014853","mark":""}],"totalPage":25,"ps":20,"pno":1}
     * error_code : 0
     */

    public String reason;
    public WechatInfo result;
    public int error_code;

    public static class WechatInfo implements Serializable{
        /**
         * list : [{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8774101.jpg/640","id":"wechat_20151202064749","source":"果果帮","title":"笑死了,哈哈小伙子你很有前途","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20151202064749","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8590809.jpg/640","id":"wechat_20150215000867","source":"海外探客","title":"韩国品牌的傲慢与沦落：手机爆炸猛于核爆","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20150215000867","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8255071.jpg/640","id":"wechat_20160915039850","source":"功夫体育","title":"女排冠军们\u201c高\u201d人一等，谁敢娶？","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160915039850","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8575838.jpg/640","id":"wechat_20151201058612","source":"龍神迷失","title":"中国首辆上牌的布加迪威龙，以为车牌很一般，最后发现车牌很霸气","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20151201058612","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-8064767.jpg/640","id":"wechat_20160908053966","source":"娱乐圈扒姐","title":"某知名女星在节目中威胁选手收贿，私下爱搞潜规则","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160908053966","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986866.jpg/640","id":"wechat_20160906017693","source":"颜小白的篮球梦","title":"科比跟乔丹比到底差在哪里？仅仅是身体素质吗","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017693","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986843.jpg/640","id":"wechat_20160906017663","source":"嘻嘻哈哈","title":"神动图|这手感绝对不差！","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017663","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986833.jpg/640","id":"wechat_20160906017658","source":"嘻嘻哈哈","title":"江湖流传的这些奇葩书，简直刷新我的三观~","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017658","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986819.jpg/640","id":"wechat_20160906017552","source":"笑你妹","title":"【搞笑段子】有心无力啊，办起事来几分钟完事~","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017552","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986802.jpg/640","id":"wechat_20160906017288","source":"TechWeb","title":"在iPhone7发布之前我们先来看看它的跑分吧","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906017288","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986693.jpg/640","id":"wechat_20160906016354","source":"陇南生活网","title":"甘肃：将发生严重腐败问题的地区部门直接评为\u201c一般\u201d","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906016354","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986675.jpg/640","id":"wechat_20160906016213","source":"云上的空母","title":"万吨两栖舰上的袖珍火炮，射速为每分钟200发","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906016213","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986645.jpg/640","id":"wechat_20160906016204","source":"云上的空母","title":"全球最大口径的加特林机关炮，一眨眼打出50发炮弹","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906016204","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986534.jpg/640","id":"wechat_20160906015882","source":"钛媒体","title":"三星耗10亿美元召回Note7，并称损失令人real心痛钛晨报","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015882","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986438.jpg/640","id":"wechat_20160906015702","source":"摄影笔记","title":"一篇文章看懂尼康数码单反","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015702","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986443.jpg/640","id":"wechat_20160906015704","source":"摄影笔记","title":"中秋节要来了想拍好月亮从现在就得准备了","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015704","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986366.jpg/640","id":"wechat_20160906015392","source":"北美留学生日报","title":"2020届美国名校最新录取数据汇总，明年迎来最难申请季","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015392","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986363.jpg/640","id":"wechat_20160906015387","source":"北美留学生日报","title":"纸条|论吐槽奇葩英文名，日报的读者才是真正的扛把子！","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015387","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986372.jpg/640","id":"wechat_20160906015408","source":"北美留学生日报","title":"那些年我们遭遇到的令人无语的奇葩室友们，已无力吐槽","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906015408","mark":""},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-7986126.jpg/640","id":"wechat_20160906014853","source":"老马价值观","title":"颜值高还学霸，复旦双胞胎姐妹花一起被哈佛录取","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20160906014853","mark":""}]
         * totalPage : 25
         * ps : 20
         * pno : 1
         */

        public int totalPage;
        public int ps;
        public int pno;
        public List<Wechat> list;

        public static class Wechat implements Serializable{
            /**
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-8774101.jpg/640
             * id : wechat_20151202064749
             * source : 果果帮
             * title : 笑死了,哈哈小伙子你很有前途
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20151202064749
             * mark :
             */

            public String firstImg;
            public String id;
            public String source;
            public String title;
            public String url;
            public String mark;
        }
    }
}
