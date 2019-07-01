package com.winwang.storybooks.entity;

import java.util.List;

/**
 * Created by WinWang on 2019/7/1
 * Description->
 */
public class StoryInListBean extends BaseBean {

    /**
     * categoryList : [{"ID":"16","desc":"","name":"经典童话","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/hongshui.jpg"},{"ID":"12","desc":"","name":"寓言故事","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/yuyan.png"},{"ID":"13","desc":"","name":"中国成语","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/chengyu.png"},{"ID":"17","desc":"","name":"神话故事","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/shenhuagushi.jpg"},{"ID":"18","desc":"","name":"VIP抢先看","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/gushi.png"},{"ID":"11","desc":"","name":"国学","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/guoxue.png"}]
     * classlist : [{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":159143,"ID":"842","IsLyrics":true,"LevelTypeid":16,"LyricsId":1,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":1,"VIP":false,"VideoId":842,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/517cef61cdc853cbbefaa3dfb684d29fd219383e.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4833e0668ebf29034a4f4223afa946dd74977e4a.jpg","name":"海的女儿","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/9eda4a3ff103160e3e52b004ad669e17e3296e5b.jpg","shouyeShow":"1","statistics":{"buycount":"3969120","clickcount":"17423249","downLoadcount":"4160836","enshrinecount":"462613","fullMediacount":"10110818","playcount":"24501630","sharecount":"2216","xiaicount":"533818"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"947","IsLyrics":false,"LevelTypeid":13,"LyricsId":0,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"2","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/0a1c3f6f20719cc63bf73c14f512705b0f0ede1a.jpg","name":"老马识途","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/10bb282bfa427952ed1c06656a33d331dcf5c711.jpg","shouyeShow":"0","statistics":{"buycount":"0","clickcount":"27403","downLoadcount":"0","enshrinecount":"295","fullMediacount":"3299","playcount":"30620","sharecount":"0","xiaicount":"159"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":54699,"ID":"786","IsLyrics":true,"LevelTypeid":12,"LyricsId":154,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":786,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5d283e8f923791d6eddb44d5b38f64568b611bc1.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/786_Mini_s.jpg","name":"三只小猪","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/786_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2523057","clickcount":"6737224","downLoadcount":"2585080","enshrinecount":"121147","fullMediacount":"8694622","playcount":"12388889","sharecount":"898","xiaicount":"579051"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":30519,"ID":"853","IsLyrics":true,"LevelTypeid":16,"LyricsId":16,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":853,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/026b980b4326b4f94ba70eb5e6c7aeca5ad8f194.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/c3278963b28553ead92898e68c01b94506368a34.jpg","name":"丑小鸭","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/bd0ad8b18b366324daa7d7a5512718abb7d892e8.jpg","shouyeShow":"1","statistics":{"buycount":"2147837","clickcount":"3841939","downLoadcount":"2227993","enshrinecount":"85425","fullMediacount":"6317132","playcount":"9370034","sharecount":"541","xiaicount":"367017"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":23486,"ID":"818","IsLyrics":true,"LevelTypeid":12,"LyricsId":123,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":818,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/8c6fca0cf914491f70b76e4edad64fa4748e6333.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/818_Mini_s.jpg","name":"老虎拔牙","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/818_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2238066","clickcount":"5044788","downLoadcount":"2301950","enshrinecount":"104040","fullMediacount":"7104397","playcount":"10356725","sharecount":"644","xiaicount":"331041"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":48391,"ID":"920","IsLyrics":true,"LevelTypeid":16,"LyricsId":181,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":920,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a64d4238e20cea769cdead7e6096ee8da34ded28.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/3fdd26bc75ba4232621aedde260a6cbc9a41eb2f.jpg","name":"阿里巴巴和四十大盗","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/72152cc81d5e9caf4ad3f907dccce3617c87814f.jpg","shouyeShow":"1","statistics":{"buycount":"1360272","clickcount":"3138555","downLoadcount":"1420476","enshrinecount":"70915","fullMediacount":"4437073","playcount":"7746134","sharecount":"439","xiaicount":"288535"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":13882,"ID":"817","IsLyrics":true,"LevelTypeid":12,"LyricsId":140,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":817,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/e9368b1a3f18820b9813f4d89638837b8c023b8c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/2fe26b088e888ed01d1235b6895910bcc7ace17b.jpg","name":"渔夫和金鱼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/817_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1859464","clickcount":"2804720","downLoadcount":"1908059","enshrinecount":"67378","fullMediacount":"5094842","playcount":"6923045","sharecount":"308","xiaicount":"221189"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":26628,"ID":"837","IsLyrics":true,"LevelTypeid":10,"LyricsId":126,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":10,"VIP":false,"VideoId":837,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/62b2fb2a0235ec099a9c0a01e8d8fab85209ddba.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/b5b0680f734bf6477951cf4c037041a1ba79592c.png","name":"小红帽","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/63be457f231452d8a9829d31d840294e68d7f1e7.jpg","shouyeShow":"1","statistics":{"buycount":"2077433","clickcount":"3925553","downLoadcount":"2145730","enshrinecount":"83917","fullMediacount":"5833606","playcount":"8957095","sharecount":"586","xiaicount":"316413"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":29257,"ID":"9","IsLyrics":true,"LevelTypeid":16,"LyricsId":168,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":9,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/b9959e2b597e24bdf2e4339b8f445bbdac1d580a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9_Mini_s.jpg","name":"白雪公主","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/9_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1054745","clickcount":"2346725","downLoadcount":"1089891","enshrinecount":"89256","fullMediacount":"1663575","playcount":"4022736","sharecount":"303","xiaicount":"92058"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"939","IsLyrics":false,"LevelTypeid":16,"LyricsId":0,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"2","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d1baa8a5aecd7f854f5119047c871c7a74d6acde.jpg","name":"木兰从军","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/af15d3afe89e9a8feb21df6d8278422784b4febf.jpg","shouyeShow":"0","statistics":{"buycount":"0","clickcount":"331339","downLoadcount":"0","enshrinecount":"5930","fullMediacount":"34440","playcount":"547665","sharecount":"0","xiaicount":"3036"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":1833,"ID":"941","IsLyrics":true,"LevelTypeid":13,"LyricsId":198,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":941,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/0f554d62c8667a1ef6e6ba307ea9440acbe800b3.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/b3896d53ca7ae71a3442b2b8ae791313dc5dc417.jpg","name":"卧薪尝胆","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/7c3a559cb59408f863bf168ce4890f256b1629f4.jpg","shouyeShow":"0","statistics":{"buycount":"148910","clickcount":"327555","downLoadcount":"154469","enshrinecount":"6560","fullMediacount":"347549","playcount":"498582","sharecount":"30","xiaicount":"24415"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"944","IsLyrics":false,"LevelTypeid":16,"LyricsId":0,"Masked":"0","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"2","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/82eed7ba502ceff234f6569559666d1fb634a5e3.jpg","name":"小松鼠找花生","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2a635b7252e1189fcbf69f1942e2727c134630bf.jpg","shouyeShow":"0","statistics":{"buycount":"1","clickcount":"150903","downLoadcount":"1","enshrinecount":"1909","fullMediacount":"17768","playcount":"230178","sharecount":"0","xiaicount":"1113"},"status":"2"}]
     * md : d41d8cd98f00b204e9800998ecf8427e
     * nowtime : 1561976769165
     * sumcount : 115
     * typeAny : true
     * videoAnalysisUrl : http://abustoryvideo-1251889355.file.myqcloud.com/videoAnalysis/abugushijiexi20190108.jar
     * videoAnalysisVer : 7
     */

    private String md;
    private long nowtime;
    private String sumcount;
    private boolean typeAny;
    private String videoAnalysisUrl;
    private String videoAnalysisVer;
    private List<CategoryListBean> categoryList;
    private List<ClasslistBean> classlist;

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public long getNowtime() {
        return nowtime;
    }

    public void setNowtime(long nowtime) {
        this.nowtime = nowtime;
    }

    public String getSumcount() {
        return sumcount;
    }

    public void setSumcount(String sumcount) {
        this.sumcount = sumcount;
    }

    public boolean isTypeAny() {
        return typeAny;
    }

    public void setTypeAny(boolean typeAny) {
        this.typeAny = typeAny;
    }

    public String getVideoAnalysisUrl() {
        return videoAnalysisUrl;
    }

    public void setVideoAnalysisUrl(String videoAnalysisUrl) {
        this.videoAnalysisUrl = videoAnalysisUrl;
    }

    public String getVideoAnalysisVer() {
        return videoAnalysisVer;
    }

    public void setVideoAnalysisVer(String videoAnalysisVer) {
        this.videoAnalysisVer = videoAnalysisVer;
    }

    public List<CategoryListBean> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryListBean> categoryList) {
        this.categoryList = categoryList;
    }

    public List<ClasslistBean> getClasslist() {
        return classlist;
    }

    public void setClasslist(List<ClasslistBean> classlist) {
        this.classlist = classlist;
    }

    public static class CategoryListBean {
        /**
         * ID : 16
         * desc :
         * name : 经典童话
         * titleimage : http://abugushiimg-1251889355.file.myqcloud.com/hongshui.jpg
         */

        private String ID;
        private String desc;
        private String name;
        private String titleimage;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitleimage() {
            return titleimage;
        }

        public void setTitleimage(String titleimage) {
            this.titleimage = titleimage;
        }
    }

    public static class ClasslistBean {
        /**
         * CoaxSleep : 0
         * Downloadurl :
         * EduAny : true
         * HowManyPeopleSing : 159143
         * ID : 842
         * IsLyrics : true
         * LevelTypeid : 16
         * LyricsId : 1
         * Masked : 0
         * MediaPayStatus : false
         * Mediatype : 0
         * Price : 0.01
         * ShareDesc :
         * State : 2
         * Typeid : 1
         * VIP : false
         * VideoId : 842
         * VideoImage : http://abugushiimg-1251889355.file.myqcloud.com/517cef61cdc853cbbefaa3dfb684d29fd219383e.jpg
         * WorkType : 2
         * downvip : 0
         * itemList : []
         * lllustration : http://tutuergeimages-1251889355.file.myqcloud.com/4833e0668ebf29034a4f4223afa946dd74977e4a.jpg
         * name : 海的女儿
         * printscreen : http://abugushiimg-1251889355.file.myqcloud.com/9eda4a3ff103160e3e52b004ad669e17e3296e5b.jpg
         * shouyeShow : 1
         * statistics : {"buycount":"3969120","clickcount":"17423249","downLoadcount":"4160836","enshrinecount":"462613","fullMediacount":"10110818","playcount":"24501630","sharecount":"2216","xiaicount":"533818"}
         * status : 2
         */

        private String CoaxSleep;
        private String Downloadurl;
        private boolean EduAny;
        private int HowManyPeopleSing;
        private String ID;
        private boolean IsLyrics;
        private int LevelTypeid;
        private int LyricsId;
        private String Masked;
        private boolean MediaPayStatus;
        private String Mediatype;
        private String Price;
        private String ShareDesc;
        private String State;
        private int Typeid;
        private boolean VIP;
        private int VideoId;
        private String VideoImage;
        private int WorkType;
        private String downvip;
        private String lllustration;
        private String name;
        private String printscreen;
        private String shouyeShow;
        private StatisticsBean statistics;
        private String status;
        private List<?> itemList;

        public String getCoaxSleep() {
            return CoaxSleep;
        }

        public void setCoaxSleep(String CoaxSleep) {
            this.CoaxSleep = CoaxSleep;
        }

        public String getDownloadurl() {
            return Downloadurl;
        }

        public void setDownloadurl(String Downloadurl) {
            this.Downloadurl = Downloadurl;
        }

        public boolean isEduAny() {
            return EduAny;
        }

        public void setEduAny(boolean EduAny) {
            this.EduAny = EduAny;
        }

        public int getHowManyPeopleSing() {
            return HowManyPeopleSing;
        }

        public void setHowManyPeopleSing(int HowManyPeopleSing) {
            this.HowManyPeopleSing = HowManyPeopleSing;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public boolean isIsLyrics() {
            return IsLyrics;
        }

        public void setIsLyrics(boolean IsLyrics) {
            this.IsLyrics = IsLyrics;
        }

        public int getLevelTypeid() {
            return LevelTypeid;
        }

        public void setLevelTypeid(int LevelTypeid) {
            this.LevelTypeid = LevelTypeid;
        }

        public int getLyricsId() {
            return LyricsId;
        }

        public void setLyricsId(int LyricsId) {
            this.LyricsId = LyricsId;
        }

        public String getMasked() {
            return Masked;
        }

        public void setMasked(String Masked) {
            this.Masked = Masked;
        }

        public boolean isMediaPayStatus() {
            return MediaPayStatus;
        }

        public void setMediaPayStatus(boolean MediaPayStatus) {
            this.MediaPayStatus = MediaPayStatus;
        }

        public String getMediatype() {
            return Mediatype;
        }

        public void setMediatype(String Mediatype) {
            this.Mediatype = Mediatype;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String Price) {
            this.Price = Price;
        }

        public String getShareDesc() {
            return ShareDesc;
        }

        public void setShareDesc(String ShareDesc) {
            this.ShareDesc = ShareDesc;
        }

        public String getState() {
            return State;
        }

        public void setState(String State) {
            this.State = State;
        }

        public int getTypeid() {
            return Typeid;
        }

        public void setTypeid(int Typeid) {
            this.Typeid = Typeid;
        }

        public boolean isVIP() {
            return VIP;
        }

        public void setVIP(boolean VIP) {
            this.VIP = VIP;
        }

        public int getVideoId() {
            return VideoId;
        }

        public void setVideoId(int VideoId) {
            this.VideoId = VideoId;
        }

        public String getVideoImage() {
            return VideoImage;
        }

        public void setVideoImage(String VideoImage) {
            this.VideoImage = VideoImage;
        }

        public int getWorkType() {
            return WorkType;
        }

        public void setWorkType(int WorkType) {
            this.WorkType = WorkType;
        }

        public String getDownvip() {
            return downvip;
        }

        public void setDownvip(String downvip) {
            this.downvip = downvip;
        }

        public String getLllustration() {
            return lllustration;
        }

        public void setLllustration(String lllustration) {
            this.lllustration = lllustration;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrintscreen() {
            return printscreen;
        }

        public void setPrintscreen(String printscreen) {
            this.printscreen = printscreen;
        }

        public String getShouyeShow() {
            return shouyeShow;
        }

        public void setShouyeShow(String shouyeShow) {
            this.shouyeShow = shouyeShow;
        }

        public StatisticsBean getStatistics() {
            return statistics;
        }

        public void setStatistics(StatisticsBean statistics) {
            this.statistics = statistics;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<?> getItemList() {
            return itemList;
        }

        public void setItemList(List<?> itemList) {
            this.itemList = itemList;
        }

        public static class StatisticsBean {
            /**
             * buycount : 3969120
             * clickcount : 17423249
             * downLoadcount : 4160836
             * enshrinecount : 462613
             * fullMediacount : 10110818
             * playcount : 24501630
             * sharecount : 2216
             * xiaicount : 533818
             */

            private String buycount;
            private String clickcount;
            private String downLoadcount;
            private String enshrinecount;
            private String fullMediacount;
            private String playcount;
            private String sharecount;
            private String xiaicount;

            public String getBuycount() {
                return buycount;
            }

            public void setBuycount(String buycount) {
                this.buycount = buycount;
            }

            public String getClickcount() {
                return clickcount;
            }

            public void setClickcount(String clickcount) {
                this.clickcount = clickcount;
            }

            public String getDownLoadcount() {
                return downLoadcount;
            }

            public void setDownLoadcount(String downLoadcount) {
                this.downLoadcount = downLoadcount;
            }

            public String getEnshrinecount() {
                return enshrinecount;
            }

            public void setEnshrinecount(String enshrinecount) {
                this.enshrinecount = enshrinecount;
            }

            public String getFullMediacount() {
                return fullMediacount;
            }

            public void setFullMediacount(String fullMediacount) {
                this.fullMediacount = fullMediacount;
            }

            public String getPlaycount() {
                return playcount;
            }

            public void setPlaycount(String playcount) {
                this.playcount = playcount;
            }

            public String getSharecount() {
                return sharecount;
            }

            public void setSharecount(String sharecount) {
                this.sharecount = sharecount;
            }

            public String getXiaicount() {
                return xiaicount;
            }

            public void setXiaicount(String xiaicount) {
                this.xiaicount = xiaicount;
            }
        }
    }
}
