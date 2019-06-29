package com.winwang.storybooks.entity;

import java.util.List;

/**
 * Created by WinWang on 2019/6/27
 * Description->
 */
public class MusicHomeBean extends BaseBean {


    /**
     * list : [{"ID":"4","desc":"","name":"听听-钢琴音乐","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/hongshui.jpg"},{"ID":"6","desc":"","name":"听听-儿歌","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/erge.png"},{"ID":"5","desc":"","name":"听听-故事","titleimage":"http://abugushiimg-1251889355.file.myqcloud.com/gushi.png"}]
     * md : d41d8cd98f00b204e9800998ecf8427e
     * nowtime : 1561636116570
     */

    private String md;
    private long nowtime;
    private List<ListBean> list;

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
         * ID : 4
         * desc :
         * name : 听听-钢琴音乐
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
}
