package com.ti4n.gank.Data;

import java.util.List;

/**
 * Created by liany on 12/30/2016.
 */

public class TodayData {

    /**
     * category : ["休息视频","iOS","Android","福利","前端","拓展资源"]
     * error : false
     * results : {"Android":[{"_id":"58466bbf421aa939b835363b","createdAt":"2016-12-06T15:41:51.890Z","desc":"基于RxJava打造的多线程下载工具, 支持断点续传下载管理等","publishedAt":"2016-12-07T11:43:57.460Z","source":"web","type":"Android","url":"https://github.com/ssseasonnn/RxDownload","used":true,"who":"Season"},{"_id":"58469c0b421aa939b835363c","createdAt":"2016-12-06T19:07:55.777Z","desc":"又一个Android端动态验证码实现","images":["http://img.gank.io/4366217c-9b21-42f2-a081-240d8be5fbfd"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"web","type":"Android","url":"https://github.com/Freshman111/VerificationCodeView","used":true,"who":"sgffsg"},{"_id":"5846e289421aa963ed5064d8","createdAt":"2016-12-07T00:08:41.105Z","desc":"显示飞行器姿态的Android控件","images":["http://img.gank.io/4c16d55b-1b7b-4a7d-b64d-c414904d7222"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"web","type":"Android","url":"https://github.com/billhsu/AndroidAHRSView","used":true,"who":"Shipeng Xu"},{"_id":"58477a91421aa963eaaee129","createdAt":"2016-12-07T10:57:21.941Z","desc":"Android 矢量图动画在线辅助工具","images":["http://img.gank.io/a0c78014-1cf6-4efc-8e87-0387288d254e"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"chrome","type":"Android","url":"https://github.com/romannurik/AndroidIconAnimator","used":true,"who":"代码家"}],"iOS":[{"_id":"58465d00421aa939bb463807","createdAt":"2016-12-06T14:38:56.125Z","desc":"iOS多线程-从不会到熟练使用","images":["http://img.gank.io/3824ef16-7e97-44a9-8727-3aaf282aa870"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"web","type":"iOS","url":"http://www.jianshu.com/p/ac11fe7ef78c","used":true,"who":"抱紧我的小鲤鱼"},{"_id":"58477e99421aa963eaaee12a","createdAt":"2016-12-07T11:14:33.754Z","desc":"借助人脸追踪实现的脸部关键点采集，同时加入贴纸功能。","images":["http://img.gank.io/efeae6a0-57c9-4a3c-b253-8619d429176a"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"chrome","type":"iOS","url":"https://github.com/Sinkup/CameraStickerDemo","used":true,"who":"代码家"}],"休息视频":[{"_id":"5831d4a7421aa929b0f34e96","createdAt":"2016-11-21T00:51:51.419Z","desc":"剪辑大神把电影里哭的镜头合成一段视频","publishedAt":"2016-12-07T11:43:57.460Z","source":"chrome","type":"休息视频","url":"http://www.miaopai.com/show/7u1lnUMBUb4-JPJq5icZAA__.htm","used":true,"who":"有时放纵"}],"前端":[{"_id":"58477a4c421aa963eaaee128","createdAt":"2016-12-07T10:56:12.61Z","desc":"一个帅气的前端下拉刷新","images":["http://img.gank.io/5cb6509b-fd19-4a19-8ca8-6635c4084fe0"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"chrome","type":"前端","url":"https://github.com/BoxFactura/pulltorefresh.js","used":true,"who":"代码家"}],"拓展资源":[{"_id":"58477ad9421aa963ed5064dc","createdAt":"2016-12-07T10:58:33.84Z","desc":"开源 IoT 平台，设备管理，数据收集，处理和可视化。","images":["http://img.gank.io/54207b3a-49f2-46a2-8691-638aaffe9991"],"publishedAt":"2016-12-07T11:43:57.460Z","source":"chrome","type":"拓展资源","url":"https://github.com/thingsboard/thingsboard","used":true,"who":"嗲马甲"}],"福利":[{"_id":"58476013421aa963ed5064da","createdAt":"2016-12-07T09:04:19.739Z","desc":"12-7","publishedAt":"2016-12-07T11:43:57.460Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1fahy9m7xw0j20u00u042l.jpg","used":true,"who":"daimajia"}]}
     */

    private boolean error;
    private ResultsBean results;
    private List<String> category;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ResultsBean getResults() {
        return results;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public static class ResultsBean {
        private List<AndroidBean> Android;
        private List<IOSBean> iOS;
        private List<休息视频Bean> 休息视频;
        private List<前端Bean> 前端;
        private List<拓展资源Bean> 拓展资源;
        private List<福利Bean> 福利;

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "Android=" + Android +
                    ", iOS=" + iOS +
                    ", 休息视频=" + 休息视频 +
                    ", 前端=" + 前端 +
                    ", 拓展资源=" + 拓展资源 +
                    ", 福利=" + 福利 +
                    '}';
        }

        public List<AndroidBean> getAndroid() {
            return Android;
        }

        public void setAndroid(List<AndroidBean> Android) {
            this.Android = Android;
        }

        public List<IOSBean> getIOS() {
            return iOS;
        }

        public void setIOS(List<IOSBean> iOS) {
            this.iOS = iOS;
        }

        public List<休息视频Bean> get休息视频() {
            return 休息视频;
        }

        public void set休息视频(List<休息视频Bean> 休息视频) {
            this.休息视频 = 休息视频;
        }

        public List<前端Bean> get前端() {
            return 前端;
        }

        public void set前端(List<前端Bean> 前端) {
            this.前端 = 前端;
        }

        public List<拓展资源Bean> get拓展资源() {
            return 拓展资源;
        }

        public void set拓展资源(List<拓展资源Bean> 拓展资源) {
            this.拓展资源 = 拓展资源;
        }

        public List<福利Bean> get福利() {
            return 福利;
        }

        public void set福利(List<福利Bean> 福利) {
            this.福利 = 福利;
        }

        public static class AndroidBean {
            /**
             * _id : 58466bbf421aa939b835363b
             * createdAt : 2016-12-06T15:41:51.890Z
             * desc : 基于RxJava打造的多线程下载工具, 支持断点续传下载管理等
             * publishedAt : 2016-12-07T11:43:57.460Z
             * source : web
             * type : Android
             * url : https://github.com/ssseasonnn/RxDownload
             * used : true
             * who : Season
             * images : ["http://img.gank.io/4366217c-9b21-42f2-a081-240d8be5fbfd"]
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;
            private List<String> images;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }
        }

        public static class IOSBean {
            /**
             * _id : 58465d00421aa939bb463807
             * createdAt : 2016-12-06T14:38:56.125Z
             * desc : iOS多线程-从不会到熟练使用
             * images : ["http://img.gank.io/3824ef16-7e97-44a9-8727-3aaf282aa870"]
             * publishedAt : 2016-12-07T11:43:57.460Z
             * source : web
             * type : iOS
             * url : http://www.jianshu.com/p/ac11fe7ef78c
             * used : true
             * who : 抱紧我的小鲤鱼
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;
            private List<String> images;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }
        }

        public static class 休息视频Bean {
            /**
             * _id : 5831d4a7421aa929b0f34e96
             * createdAt : 2016-11-21T00:51:51.419Z
             * desc : 剪辑大神把电影里哭的镜头合成一段视频
             * publishedAt : 2016-12-07T11:43:57.460Z
             * source : chrome
             * type : 休息视频
             * url : http://www.miaopai.com/show/7u1lnUMBUb4-JPJq5icZAA__.htm
             * used : true
             * who : 有时放纵
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 前端Bean {
            /**
             * _id : 58477a4c421aa963eaaee128
             * createdAt : 2016-12-07T10:56:12.61Z
             * desc : 一个帅气的前端下拉刷新
             * images : ["http://img.gank.io/5cb6509b-fd19-4a19-8ca8-6635c4084fe0"]
             * publishedAt : 2016-12-07T11:43:57.460Z
             * source : chrome
             * type : 前端
             * url : https://github.com/BoxFactura/pulltorefresh.js
             * used : true
             * who : 代码家
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;
            private List<String> images;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }
        }

        public static class 拓展资源Bean {
            /**
             * _id : 58477ad9421aa963ed5064dc
             * createdAt : 2016-12-07T10:58:33.84Z
             * desc : 开源 IoT 平台，设备管理，数据收集，处理和可视化。
             * images : ["http://img.gank.io/54207b3a-49f2-46a2-8691-638aaffe9991"]
             * publishedAt : 2016-12-07T11:43:57.460Z
             * source : chrome
             * type : 拓展资源
             * url : https://github.com/thingsboard/thingsboard
             * used : true
             * who : 嗲马甲
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;
            private List<String> images;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }
        }

        public static class 福利Bean {
            /**
             * _id : 58476013421aa963ed5064da
             * createdAt : 2016-12-07T09:04:19.739Z
             * desc : 12-7
             * publishedAt : 2016-12-07T11:43:57.460Z
             * source : chrome
             * type : 福利
             * url : http://ww1.sinaimg.cn/large/610dc034jw1fahy9m7xw0j20u00u042l.jpg
             * used : true
             * who : daimajia
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }
    }
}
