package com.winwang.storybooks.entity;

import java.util.List;

/**
 * Created by WinWang on 2019/6/13
 * Description->
 */
public class VideoDetailBean extends BaseBean {
    /**
     * md : d41d8cd98f00b204e9800998ecf8427e
     * message : 操作成功
     * nowtime : 1560425169935
     * resultcode : 0
     * video : {"Audio":"","AudioDownload":"","CoaxSleep":"0","ForcedTimeout":true,"ID":"878","IsRushHour":true,"LevelTypeid":1,"Masked":"0","MediaPayStatus":false,"MediaUrl":"http://data.video.qiyi.com/videos/v0/20190429/3a/c9/f6893f4e1b075ca50e7d6d03277993d9.f4v?qd_tvid=901862100&qd_vipres=0&qd_index=1&qd_aid=206736601&qd_stert=0&qd_scc=e3c2208a7aa1ce0f6b48eaf31980f9eb&qd_sc=c430755ba10a5b90583dd1ba63dc6711&qd_p=27603764&qd_ip=27603764&qd_k=b21bfcbdfa9de3e040f2b0ad1abc14be&qd_src=2_22_222&qd_vipdyn=0&qd_uid=0&qd_tm=1560425093851&qd_vip=0&qyid=e6e8c45708432699c53a82d5bc1275d8","Mediatype":"0","NumberOfWorks":1,"Price":"0.01","Typeid":1,"analyticType":"True","bufferswitch":"1","downvip":"0","is720P":"true","linktype":"1","lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/b73ee506589a9c83b5f08b38a052fbd126a7974f.jpg","name":"夸父逐日","peizhi":"@->l","playaddress":[{"Downloadurl":"","MediaUrl":"","isjiexi":"1","jiexicode":"","jiexitype":"","peizhi":""}],"printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/b66a16bd0e884510b3951b2db4925bc27faa7564.jpg","shouyeShow":"1","statistics":{"buycount":"1137617","clickcount":"2027495","downLoadcount":"1190315","enshrinecount":"50770","fullMediacount":"2843550","playcount":"4430867","sharecount":"104","xiaicount":"231827"},"status":"2"}
     */

    private String md;
    private long nowtime;
    private VideoBean video;

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getNowtime() {
        return nowtime;
    }

    public void setNowtime(long nowtime) {
        this.nowtime = nowtime;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
    }

    public static class VideoBean {
        /**
         * Audio :
         * AudioDownload :
         * CoaxSleep : 0
         * ForcedTimeout : true
         * ID : 878
         * IsRushHour : true
         * LevelTypeid : 1
         * Masked : 0
         * MediaPayStatus : false
         * MediaUrl : http://data.video.qiyi.com/videos/v0/20190429/3a/c9/f6893f4e1b075ca50e7d6d03277993d9.f4v?qd_tvid=901862100&qd_vipres=0&qd_index=1&qd_aid=206736601&qd_stert=0&qd_scc=e3c2208a7aa1ce0f6b48eaf31980f9eb&qd_sc=c430755ba10a5b90583dd1ba63dc6711&qd_p=27603764&qd_ip=27603764&qd_k=b21bfcbdfa9de3e040f2b0ad1abc14be&qd_src=2_22_222&qd_vipdyn=0&qd_uid=0&qd_tm=1560425093851&qd_vip=0&qyid=e6e8c45708432699c53a82d5bc1275d8
         * Mediatype : 0
         * NumberOfWorks : 1
         * Price : 0.01
         * Typeid : 1
         * analyticType : True
         * bufferswitch : 1
         * downvip : 0
         * is720P : true
         * linktype : 1
         * lllustration : http://tutuergeimages-1251889355.file.myqcloud.com/b73ee506589a9c83b5f08b38a052fbd126a7974f.jpg
         * name : 夸父逐日
         * peizhi : @->l
         * playaddress : [{"Downloadurl":"","MediaUrl":"","isjiexi":"1","jiexicode":"","jiexitype":"","peizhi":""}]
         * printscreen : http://tutuergeimages-1251889355.file.myqcloud.com/b66a16bd0e884510b3951b2db4925bc27faa7564.jpg
         * shouyeShow : 1
         * statistics : {"buycount":"1137617","clickcount":"2027495","downLoadcount":"1190315","enshrinecount":"50770","fullMediacount":"2843550","playcount":"4430867","sharecount":"104","xiaicount":"231827"}
         * status : 2
         */

        private String Audio;
        private String AudioDownload;
        private String CoaxSleep;
        private boolean ForcedTimeout;
        private String ID;
        private boolean IsRushHour;
        private int LevelTypeid;
        private String Masked;
        private boolean MediaPayStatus;
        private String MediaUrl;
        private String Mediatype;
        private int NumberOfWorks;
        private String Price;
        private int Typeid;
        private String analyticType;
        private String bufferswitch;
        private String downvip;
        private String is720P;
        private String linktype;
        private String lllustration;
        private String name;
        private String peizhi;
        private String printscreen;
        private String shouyeShow;
        private StatisticsBean statistics;
        private String status;
        private List<PlayaddressBean> playaddress;

        public String getAudio() {
            return Audio;
        }

        public void setAudio(String Audio) {
            this.Audio = Audio;
        }

        public String getAudioDownload() {
            return AudioDownload;
        }

        public void setAudioDownload(String AudioDownload) {
            this.AudioDownload = AudioDownload;
        }

        public String getCoaxSleep() {
            return CoaxSleep;
        }

        public void setCoaxSleep(String CoaxSleep) {
            this.CoaxSleep = CoaxSleep;
        }

        public boolean isForcedTimeout() {
            return ForcedTimeout;
        }

        public void setForcedTimeout(boolean ForcedTimeout) {
            this.ForcedTimeout = ForcedTimeout;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public boolean isIsRushHour() {
            return IsRushHour;
        }

        public void setIsRushHour(boolean IsRushHour) {
            this.IsRushHour = IsRushHour;
        }

        public int getLevelTypeid() {
            return LevelTypeid;
        }

        public void setLevelTypeid(int LevelTypeid) {
            this.LevelTypeid = LevelTypeid;
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

        public String getMediaUrl() {
            return MediaUrl;
        }

        public void setMediaUrl(String MediaUrl) {
            this.MediaUrl = MediaUrl;
        }

        public String getMediatype() {
            return Mediatype;
        }

        public void setMediatype(String Mediatype) {
            this.Mediatype = Mediatype;
        }

        public int getNumberOfWorks() {
            return NumberOfWorks;
        }

        public void setNumberOfWorks(int NumberOfWorks) {
            this.NumberOfWorks = NumberOfWorks;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String Price) {
            this.Price = Price;
        }

        public int getTypeid() {
            return Typeid;
        }

        public void setTypeid(int Typeid) {
            this.Typeid = Typeid;
        }

        public String getAnalyticType() {
            return analyticType;
        }

        public void setAnalyticType(String analyticType) {
            this.analyticType = analyticType;
        }

        public String getBufferswitch() {
            return bufferswitch;
        }

        public void setBufferswitch(String bufferswitch) {
            this.bufferswitch = bufferswitch;
        }

        public String getDownvip() {
            return downvip;
        }

        public void setDownvip(String downvip) {
            this.downvip = downvip;
        }

        public String getIs720P() {
            return is720P;
        }

        public void setIs720P(String is720P) {
            this.is720P = is720P;
        }

        public String getLinktype() {
            return linktype;
        }

        public void setLinktype(String linktype) {
            this.linktype = linktype;
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

        public String getPeizhi() {
            return peizhi;
        }

        public void setPeizhi(String peizhi) {
            this.peizhi = peizhi;
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

        public List<PlayaddressBean> getPlayaddress() {
            return playaddress;
        }

        public void setPlayaddress(List<PlayaddressBean> playaddress) {
            this.playaddress = playaddress;
        }

        public static class StatisticsBean {
            /**
             * buycount : 1137617
             * clickcount : 2027495
             * downLoadcount : 1190315
             * enshrinecount : 50770
             * fullMediacount : 2843550
             * playcount : 4430867
             * sharecount : 104
             * xiaicount : 231827
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

        public static class PlayaddressBean {
            /**
             * Downloadurl :
             * MediaUrl :
             * isjiexi : 1
             * jiexicode :
             * jiexitype :
             * peizhi :
             */

            private String Downloadurl;
            private String MediaUrl;
            private String isjiexi;
            private String jiexicode;
            private String jiexitype;
            private String peizhi;

            public String getDownloadurl() {
                return Downloadurl;
            }

            public void setDownloadurl(String Downloadurl) {
                this.Downloadurl = Downloadurl;
            }

            public String getMediaUrl() {
                return MediaUrl;
            }

            public void setMediaUrl(String MediaUrl) {
                this.MediaUrl = MediaUrl;
            }

            public String getIsjiexi() {
                return isjiexi;
            }

            public void setIsjiexi(String isjiexi) {
                this.isjiexi = isjiexi;
            }

            public String getJiexicode() {
                return jiexicode;
            }

            public void setJiexicode(String jiexicode) {
                this.jiexicode = jiexicode;
            }

            public String getJiexitype() {
                return jiexitype;
            }

            public void setJiexitype(String jiexitype) {
                this.jiexitype = jiexitype;
            }

            public String getPeizhi() {
                return peizhi;
            }

            public void setPeizhi(String peizhi) {
                this.peizhi = peizhi;
            }
        }
    }
}
