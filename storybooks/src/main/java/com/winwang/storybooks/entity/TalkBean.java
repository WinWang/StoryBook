package com.winwang.storybooks.entity;

import java.util.List;

/**
 * Created by WinWang on 2019/7/3
 * Description->
 */
public class TalkBean extends BaseBean {
    /**
     * HowManyPeopleSingFree : 248
     * NumberOfWorksFree : 164
     * list : [{"Collected":false,"HowManyPeopleSing":21540,"Id":162,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/6bf0cb2b0a1c80c63c25cdb8d8b2875174e99d43.jpg","IsLyrics":true,"Name":"狼来了","NumberOfWorks":267,"VideoId":10,"WorkType":2},{"Collected":false,"HowManyPeopleSing":56099,"Id":154,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/5d283e8f923791d6eddb44d5b38f64568b611bc1.jpg","IsLyrics":true,"Name":"三只小猪","NumberOfWorks":589,"VideoId":786,"WorkType":2},{"Collected":false,"HowManyPeopleSing":46426,"Id":157,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/d5972cce683f4bd3383f375e1574aa1e91512068.jpg","IsLyrics":true,"Name":"小壁虎借尾巴","NumberOfWorks":408,"VideoId":788,"WorkType":2},{"Collected":false,"HowManyPeopleSing":45376,"Id":153,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/74e420440fab861b66402ef5e1be282461248b36.jpg","IsLyrics":true,"Name":"孔融让梨","NumberOfWorks":484,"VideoId":785,"WorkType":2},{"Collected":false,"HowManyPeopleSing":34159,"Id":164,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/658633e4ef4d7ca1cd49c29254778acfaeb276b4.jpg","IsLyrics":true,"Name":"小蝌蚪找妈妈","NumberOfWorks":296,"VideoId":15,"WorkType":2},{"Collected":false,"HowManyPeopleSing":18503,"Id":163,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/8ed7e47fba29069505bb74dc7bd506e0e2d703dd.jpg","IsLyrics":true,"Name":"猴子捞月亮","NumberOfWorks":120,"VideoId":16,"WorkType":2},{"Collected":false,"HowManyPeopleSing":16160,"Id":158,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/fd91a7296c4c295b4407e652fb3771fca799c19c.jpg","IsLyrics":true,"Name":"小猴子下山","NumberOfWorks":217,"VideoId":789,"WorkType":2},{"Collected":false,"HowManyPeopleSing":7039,"Id":148,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/1c73f5e97c502740c826b43917677162726ef829.jpg","IsLyrics":true,"Name":"龟兔赛跑","NumberOfWorks":103,"VideoId":780,"WorkType":2},{"Collected":false,"HowManyPeopleSing":14370,"Id":160,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/69b466b3a2170abf03424f43adf08289eca51d62.jpg","IsLyrics":true,"Name":"小猫钓鱼","NumberOfWorks":208,"VideoId":791,"WorkType":2},{"Collected":false,"HowManyPeopleSing":8621,"Id":12,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/e1ce20cae68393b9754740a23b3a6838a61a6c96.jpg","IsLyrics":true,"Name":"乌鸦喝水","NumberOfWorks":85,"VideoId":12,"WorkType":2},{"Collected":false,"HowManyPeopleSing":6181,"Id":161,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/3ccff133f5fff59ad82652557de572b683d6390e.jpg","IsLyrics":true,"Name":"愚公移山","NumberOfWorks":73,"VideoId":792,"WorkType":2},{"Collected":false,"HowManyPeopleSing":8945,"Id":166,"Image":"http://abugushiimg-1251889355.file.myqcloud.com/27fbae37be99bc2ebac3ab9deb27cddacadde695.jpg","IsLyrics":true,"Name":"刻舟求剑","NumberOfWorks":62,"VideoId":13,"WorkType":2}]
     * md : d41d8cd98f00b204e9800998ecf8427e
     * nowtime : 1562153568010
     */

    private int HowManyPeopleSingFree;
    private int NumberOfWorksFree;
    private String md;
    private long nowtime;
    private List<ListBean> list;

    public int getHowManyPeopleSingFree() {
        return HowManyPeopleSingFree;
    }

    public void setHowManyPeopleSingFree(int HowManyPeopleSingFree) {
        this.HowManyPeopleSingFree = HowManyPeopleSingFree;
    }

    public int getNumberOfWorksFree() {
        return NumberOfWorksFree;
    }

    public void setNumberOfWorksFree(int NumberOfWorksFree) {
        this.NumberOfWorksFree = NumberOfWorksFree;
    }

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

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * Collected : false
         * HowManyPeopleSing : 21540
         * Id : 162
         * Image : http://abugushiimg-1251889355.file.myqcloud.com/6bf0cb2b0a1c80c63c25cdb8d8b2875174e99d43.jpg
         * IsLyrics : true
         * Name : 狼来了
         * NumberOfWorks : 267
         * VideoId : 10
         * WorkType : 2
         */

        private boolean Collected;
        private int HowManyPeopleSing;
        private int Id;
        private String Image;
        private boolean IsLyrics;
        private String Name;
        private int NumberOfWorks;
        private int VideoId;
        private int WorkType;

        public boolean isCollected() {
            return Collected;
        }

        public void setCollected(boolean Collected) {
            this.Collected = Collected;
        }

        public int getHowManyPeopleSing() {
            return HowManyPeopleSing;
        }

        public void setHowManyPeopleSing(int HowManyPeopleSing) {
            this.HowManyPeopleSing = HowManyPeopleSing;
        }

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getImage() {
            return Image;
        }

        public void setImage(String Image) {
            this.Image = Image;
        }

        public boolean isIsLyrics() {
            return IsLyrics;
        }

        public void setIsLyrics(boolean IsLyrics) {
            this.IsLyrics = IsLyrics;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getNumberOfWorks() {
            return NumberOfWorks;
        }

        public void setNumberOfWorks(int NumberOfWorks) {
            this.NumberOfWorks = NumberOfWorks;
        }

        public int getVideoId() {
            return VideoId;
        }

        public void setVideoId(int VideoId) {
            this.VideoId = VideoId;
        }

        public int getWorkType() {
            return WorkType;
        }

        public void setWorkType(int WorkType) {
            this.WorkType = WorkType;
        }
    }
}
