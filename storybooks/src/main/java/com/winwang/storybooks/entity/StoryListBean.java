package com.winwang.storybooks.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by WinWang on 2019/6/5
 * Description->
 */
public class StoryListBean extends BaseBean{
    /**
     * md : d41d8cd98f00b204e9800998ecf8427e
     * message : 操作成功
     * nowtime : 1559728060342
     * resultcode : 0
     * s1002 : {"downloadurl":"","newversion":"1.2.3.0","vermessage":"","versioncanuse":"1"}
     * s1005 : {"classlist1":[{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":149490,"ID":"842","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":1,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":1,"VIP":false,"VideoId":842,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/517cef61cdc853cbbefaa3dfb684d29fd219383e.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4833e0668ebf29034a4f4223afa946dd74977e4a.jpg","name":"海的女儿","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/9eda4a3ff103160e3e52b004ad669e17e3296e5b.jpg","shouyeShow":"1","statistics":{"buycount":"3803179","clickcount":"16770848","downLoadcount":"3988155","enshrinecount":"448187","fullMediacount":"9712103","playcount":"23570874","sharecount":"2123","xiaicount":"514449"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2371,"ID":"891","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":89,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":1,"VIP":false,"VideoId":891,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/bf58dea93d7792459e0b1932ce012d62d69748ca.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/7dde47f3a54f25a683fcc3700d91f9e03bac1f0e.jpg","name":"端午节的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/d0479316ce0b08552093fa3616151f3a859d91d3.jpg","shouyeShow":"1","statistics":{"buycount":"372872","clickcount":"646028","downLoadcount":"390384","enshrinecount":"16079","fullMediacount":"880795","playcount":"1229368","sharecount":"58","xiaicount":"57756"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":41004,"ID":"786","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":154,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":786,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5d283e8f923791d6eddb44d5b38f64568b611bc1.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/786_Mini_s.jpg","name":"三只小猪","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/786_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2348722","clickcount":"6203648","downLoadcount":"2406685","enshrinecount":"113748","fullMediacount":"7995914","playcount":"11382830","sharecount":"838","xiaicount":"541504"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":27244,"ID":"853","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":16,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":853,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/026b980b4326b4f94ba70eb5e6c7aeca5ad8f194.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/c3278963b28553ead92898e68c01b94506368a34.jpg","name":"丑小鸭","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/bd0ad8b18b366324daa7d7a5512718abb7d892e8.jpg","shouyeShow":"1","statistics":{"buycount":"1996592","clickcount":"3639531","downLoadcount":"2072887","enshrinecount":"80478","fullMediacount":"5766600","playcount":"8569019","sharecount":"523","xiaicount":"341947"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":20247,"ID":"818","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":123,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":818,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/8c6fca0cf914491f70b76e4edad64fa4748e6333.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/818_Mini_s.jpg","name":"老虎拔牙","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/818_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2085213","clickcount":"4767832","downLoadcount":"2145170","enshrinecount":"99235","fullMediacount":"6515331","playcount":"9560630","sharecount":"609","xiaicount":"310184"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":12101,"ID":"817","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":140,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":817,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/e9368b1a3f18820b9813f4d89638837b8c023b8c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/2fe26b088e888ed01d1235b6895910bcc7ace17b.jpg","name":"渔夫和金鱼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/817_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1726260","clickcount":"2653821","downLoadcount":"1771622","enshrinecount":"63894","fullMediacount":"4624422","playcount":"6301481","sharecount":"290","xiaicount":"205903"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":45549,"ID":"920","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":181,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":920,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a64d4238e20cea769cdead7e6096ee8da34ded28.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/3fdd26bc75ba4232621aedde260a6cbc9a41eb2f.jpg","name":"阿里巴巴和四十大盗","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/72152cc81d5e9caf4ad3f907dccce3617c87814f.jpg","shouyeShow":"1","statistics":{"buycount":"1225223","clickcount":"2910572","downLoadcount":"1281347","enshrinecount":"66412","fullMediacount":"4042377","playcount":"7071928","sharecount":"419","xiaicount":"267537"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"850","IsCategory":false,"IsLyrics":false,"LevelTypeid":1,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/574c43f7109daae084e717675f6d4716c3ad28a5.png","name":"神笔马良","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/c5e70732f25a2046a53c521fbbb48e549fe255bb.jpg","shouyeShow":"1","statistics":{"buycount":"1580935","clickcount":"3092907","downLoadcount":"1649119","enshrinecount":"81935","fullMediacount":"4087218","playcount":"6217195","sharecount":"354","xiaicount":"177763"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":24653,"ID":"837","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":126,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":837,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/62b2fb2a0235ec099a9c0a01e8d8fab85209ddba.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/b5b0680f734bf6477951cf4c037041a1ba79592c.png","name":"小红帽","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/63be457f231452d8a9829d31d840294e68d7f1e7.jpg","shouyeShow":"1","statistics":{"buycount":"1975844","clickcount":"3754484","downLoadcount":"2041117","enshrinecount":"80590","fullMediacount":"5532148","playcount":"8508593","sharecount":"561","xiaicount":"303872"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":25838,"ID":"9","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":168,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":9,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/b9959e2b597e24bdf2e4339b8f445bbdac1d580a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9_Mini_s.jpg","name":"白雪公主","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/9_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"936244","clickcount":"2120846","downLoadcount":"967530","enshrinecount":"81733","fullMediacount":"1458539","playcount":"3528160","sharecount":"283","xiaicount":"82557"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":14342,"ID":"875","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":119,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":875,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/89307b4a21fa36121243acf1ec6687cd5a16131c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/b9c00a123e6c6ba7dc693f10863f33d21f66a793.jpg","name":"田螺姑娘","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/33130ee91262492390dda5cd4c4d1b5c6e3e5c58.jpg","shouyeShow":"1","statistics":{"buycount":"1809247","clickcount":"3067632","downLoadcount":"1876107","enshrinecount":"77918","fullMediacount":"5259032","playcount":"7364855","sharecount":"316","xiaicount":"374881"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":18894,"ID":"901","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":170,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":901,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/568065dac54a6996ace7b5515741731302fdac15.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/4c6d1fd50dee290f13340e3e473a4a9e60e72b0e.jpg","name":"闻鸡起舞","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/668d3bb0070cc4a8daf1498df23092da8d297c08.jpg","shouyeShow":"1","statistics":{"buycount":"1123796","clickcount":"1499438","downLoadcount":"1167517","enshrinecount":"41625","fullMediacount":"3136558","playcount":"4497336","sharecount":"246","xiaicount":"152465"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":21644,"ID":"884","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":22,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":884,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a90af199fc1455f16946ed403dfc7016475b4874.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/73599ceb19766ea8c7aa47c9f5a62055acd301f5.jpg","name":"狼和小羊","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/472c5ccbafe14069bf95af48ab61b16c35b0d82b.jpg","shouyeShow":"1","statistics":{"buycount":"2054253","clickcount":"4548188","downLoadcount":"2120861","enshrinecount":"75639","fullMediacount":"7350777","playcount":"10037051","sharecount":"659","xiaicount":"418160"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":25717,"ID":"879","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":2,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":879,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7359124850dec035e698c832d8a98fe45f8e8d76.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/d4f832bb5a429b61c1c13ab5a6ac7d1feb775b83.jpg","name":"睡美人","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/5070a6762fe8fd9ddeaeb8a074a940258fb379eb.jpg","shouyeShow":"1","statistics":{"buycount":"2239144","clickcount":"4028172","downLoadcount":"2338963","enshrinecount":"141161","fullMediacount":"5013544","playcount":"9775463","sharecount":"528","xiaicount":"268867"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":11764,"ID":"925","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":169,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":925,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/4b4634b6bbea0ce97289b3bcedd5f57585abea90.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d43bf73b2d824b47efd989e27789e5df27b63c82.jpg","name":"七夕节的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/40114281bb26aa00a6c0bd1349e2a9c4d17c5820.jpg","shouyeShow":"1","statistics":{"buycount":"497527","clickcount":"778912","downLoadcount":"530317","enshrinecount":"26319","fullMediacount":"918227","playcount":"1624478","sharecount":"111","xiaicount":"66371"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13566,"ID":"895","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":88,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":895,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/033310620f6fe51e99562a6320fe5aa79d98a446.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6cc9c07231ef17e97644f2225beedb53a1b064fe.jpg","name":"八仙过海","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/c19ca87f46195e78c056a3acc86690deeb0735d5.jpg","shouyeShow":"1","statistics":{"buycount":"1199616","clickcount":"2073248","downLoadcount":"1255500","enshrinecount":"54549","fullMediacount":"3414107","playcount":"4777630","sharecount":"188","xiaicount":"179486"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":36008,"ID":"910","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":178,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":910,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/74222a0d463eaa6c1eed9ae5fe36d89d6baaf1af.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6281e4457fd0680fa3e1fd0948627db6b307a597.jpg","name":"包公审石头的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/b9b5edd9b877d4975d4931a71811cca2cd232d50.jpg","shouyeShow":"1","statistics":{"buycount":"917144","clickcount":"1899670","downLoadcount":"955561","enshrinecount":"42335","fullMediacount":"3043686","playcount":"4349603","sharecount":"279","xiaicount":"218458"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8759,"ID":"887","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":29,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":887,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/06efcbdcb340a31634bc78b551c75f13c0940de9.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/170f6a5ca3e259b6b163d6ef311f24c05fd801d1.jpg","name":"牛顿与苹果的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/4c505aa9ca193dd0d09d1c771e5592dc88d3c5fe.jpg","shouyeShow":"1","statistics":{"buycount":"1243686","clickcount":"1661217","downLoadcount":"1292922","enshrinecount":"42553","fullMediacount":"3361479","playcount":"4779216","sharecount":"202","xiaicount":"169728"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":12803,"ID":"819","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":138,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":819,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7cb3f31e1b7c2428efabd094f91a4d888f599f54.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/819_Mini_s.jpg","name":"三个和尚","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/819_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1678553","clickcount":"2782787","downLoadcount":"1723527","enshrinecount":"63775","fullMediacount":"4364722","playcount":"6009357","sharecount":"412","xiaicount":"182597"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":14329,"ID":"890","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":28,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":890,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/8c5beda6f18bda02fca2c607adcf6a06d9fa416d.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/b6f7e69313e2bbae399990963f3d0558169f958e.jpg","name":"美女与野兽","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/130be04f7bc8ca6c9f99721e47be1e943de8229b.jpg","shouyeShow":"1","statistics":{"buycount":"1315066","clickcount":"2567327","downLoadcount":"1377715","enshrinecount":"76739","fullMediacount":"3237848","playcount":"5234312","sharecount":"235","xiaicount":"251374"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4547,"ID":"878","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":116,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":878,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/0b3a3eaea3ff51daa1336e54634368e8edb625bb.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/b73ee506589a9c83b5f08b38a052fbd126a7974f.jpg","name":"夸父逐日","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/b66a16bd0e884510b3951b2db4925bc27faa7564.jpg","shouyeShow":"1","statistics":{"buycount":"1118977","clickcount":"1995552","downLoadcount":"1170896","enshrinecount":"50162","fullMediacount":"2799793","playcount":"4364858","sharecount":"100","xiaicount":"228001"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":10266,"ID":"829","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":129,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":829,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/16d339ab907df5e6dcc4b142605474a4d1aefde1.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/829_s.jpg?1=1","name":"阿拉丁和神灯","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/829_h.jpg?1=1","shouyeShow":"1","statistics":{"buycount":"1919498","clickcount":"3695852","downLoadcount":"1987883","enshrinecount":"90820","fullMediacount":"4986262","playcount":"8297289","sharecount":"268","xiaicount":"400976"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":17822,"ID":"822","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":19,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":822,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/4c31dca19401e6c8d30a20e69d1ba3e2db287821.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/e57f8ea2ceb0bb606b80632f9bb118accb86443c.jpg","name":"年的传说","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/822_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1875629","clickcount":"3262626","downLoadcount":"1929764","enshrinecount":"93704","fullMediacount":"4292450","playcount":"7020595","sharecount":"457","xiaicount":"269879"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6990,"ID":"871","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":115,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":871,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/68db1cfa138e700eafe269b26539d00ab2fef0cb.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/31c20677975d62969790094d7fa5bdf940dda1f4.jpg","name":"精卫填海","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/508a401e3ede39270f7d008aaabe64a60c992886.jpg","shouyeShow":"1","statistics":{"buycount":"1417032","clickcount":"2015444","downLoadcount":"1477309","enshrinecount":"54448","fullMediacount":"3819476","playcount":"5368079","sharecount":"175","xiaicount":"360310"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":11820,"ID":"865","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":130,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":865,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/d76dc89dccf214cea5e1502308bb4f003354dd4f.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/35360d10da03dc727ccde182674c4f78f48ba569.jpg","name":"卖火柴的小女孩","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/6a979aa81966f162f09409c671afef963d66af84.jpg","shouyeShow":"1","statistics":{"buycount":"1425713","clickcount":"2159172","downLoadcount":"1495477","enshrinecount":"68960","fullMediacount":"2677334","playcount":"5282230","sharecount":"412","xiaicount":"170315"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":36525,"ID":"909","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":176,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":909,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/553eee19aa6503f4f6e41136371e133ad5c43f90.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/114595d34e5c043998eced023719b259e3568208.jpg","name":"小白兔和小灰兔","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/29ce2f34c2ce83633dbfbb1285be4b6e997cbce2.jpg","shouyeShow":"1","statistics":{"buycount":"1099629","clickcount":"2513762","downLoadcount":"1140119","enshrinecount":"44339","fullMediacount":"4253761","playcount":"5617225","sharecount":"499","xiaicount":"265410"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6820,"ID":"855","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":135,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":855,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/1f6ffa4cb54ab3b649c07aa8154f80e61dce3183.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/1d0f94a19975fe1083a9b28f666fddc10515dc9b.jpg","name":"东郭先生和狼","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/ff68d1f986d62ae7a95f6241b90a22b6437b181a.jpg","shouyeShow":"1","statistics":{"buycount":"1319185","clickcount":"2001135","downLoadcount":"1371203","enshrinecount":"48047","fullMediacount":"3008655","playcount":"4715155","sharecount":"223","xiaicount":"194412"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":28146,"ID":"929","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":187,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":929,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/96822f2516a7877af93168970b401512b4c142f8.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/69e0e00b24293cfc2ca93076a0f7d9fabc3ef3de.jpg","name":"懒人吃饼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/96822f2516a7877af93168970b401512b4c142f8.jpg","shouyeShow":"1","statistics":{"buycount":"785540","clickcount":"1601653","downLoadcount":"815300","enshrinecount":"31682","fullMediacount":"2511549","playcount":"3338224","sharecount":"265","xiaicount":"140670"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":19336,"ID":"898","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":21,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":898,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/1ef828e38da44858a52fc75e610dbb3034c41fd2.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/f7a42fb054669eb9d51de290bf6c0cac55c696f1.jpg","name":"十二生肖的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/c07ce15a87ad20617b1a625045a56c666ebf33b2.jpg","shouyeShow":"1","statistics":{"buycount":"1205494","clickcount":"2492892","downLoadcount":"1253307","enshrinecount":"60150","fullMediacount":"3213352","playcount":"5047242","sharecount":"363","xiaicount":"234685"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7196,"ID":"838","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":127,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":838,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/87d608b0e22ad01984c7bf4b187b2a23b22f47d5.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/ecc34a1bb2dde9c9ecf64f384d5e669e110a8691.jpg","name":"嫦娥奔月","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/a8e6db1e449d81c98aac33d5154762ce3d0eb45c.jpg","shouyeShow":"1","statistics":{"buycount":"1613348","clickcount":"2450969","downLoadcount":"1671297","enshrinecount":"74193","fullMediacount":"3627613","playcount":"5921341","sharecount":"288","xiaicount":"228208"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8838,"ID":"823","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":143,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":823,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/992f26f21b61887b481c4db0da32e17fc7bf073c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/823_Mini_s.jpg","name":"小花猫种鱼","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/baa26174eb7fe3723106e5663ee926c0d0291da9.jpg","shouyeShow":"1","statistics":{"buycount":"1481788","clickcount":"2772802","downLoadcount":"1511131","enshrinecount":"54452","fullMediacount":"4628210","playcount":"6182099","sharecount":"317","xiaicount":"353436"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8401,"ID":"787","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":156,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":787,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/55dad993d7c0d603b7b90b93b4c7b77f35b0072b.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/787_Mini_s.jpg","name":"司马光砸缸","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/787_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1535762","clickcount":"2335041","downLoadcount":"1569183","enshrinecount":"58724","fullMediacount":"4259088","playcount":"6061459","sharecount":"309","xiaicount":"259865"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13588,"ID":"831","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":128,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":831,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2ed2012c2a2abab8fc76d34cb86cc22b44b8d718.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/831_s.jpg","name":"灰姑娘","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/831_h.jpg","shouyeShow":"1","statistics":{"buycount":"1651863","clickcount":"3249192","downLoadcount":"1721691","enshrinecount":"99421","fullMediacount":"3659378","playcount":"6280616","sharecount":"293","xiaicount":"283808"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9357,"ID":"888","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":27,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":888,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/3833ca542c573719d257bc04735e4d6eb3c02808.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/1db79563524bcde760695655f784508c78417b8f.jpg","name":"金斧头银斧头","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/f464425eb8cdb2ed2214dc91b4e67ee175894b29.jpg","shouyeShow":"1","statistics":{"buycount":"1164997","clickcount":"2386465","downLoadcount":"1217091","enshrinecount":"57718","fullMediacount":"3340105","playcount":"4840278","sharecount":"221","xiaicount":"158649"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":15434,"ID":"908","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":175,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":908,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/36f7c678ef654a584706acaa6b5f9497b5c2b186.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/e9e69f9922b93d9f605ad3cc5c2105a5cd3b28bf.jpg","name":"胯下之辱","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/be82846bec13ce4819348dbc9d6082efd74697d7.jpg","shouyeShow":"1","statistics":{"buycount":"781595","clickcount":"998220","downLoadcount":"811914","enshrinecount":"29707","fullMediacount":"2424802","playcount":"3345001","sharecount":"132","xiaicount":"120504"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7080,"ID":"784","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":152,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":784,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/abec63e9eb7bd0d7d4c0f12c1107b4a1687ab26a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/784_Mini_s.jpg","name":"皇帝的新装","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/784_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1306066","clickcount":"1782047","downLoadcount":"1335362","enshrinecount":"51009","fullMediacount":"3022635","playcount":"4516540","sharecount":"146","xiaicount":"156590"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7799,"ID":"820","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":125,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":820,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/9ad28c0261ec73e7703580d2e6f5b4168aceb35d.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/62c61d9f72504d07a20f8dfd4a1125c31f7d8dc1.jpg","name":"女娲补天","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/820_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1508924","clickcount":"2785710","downLoadcount":"1557685","enshrinecount":"69349","fullMediacount":"3552217","playcount":"5240356","sharecount":"152","xiaicount":"278816"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7013,"ID":"821","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":78,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":821,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/6f8ddad88ac442403bec11cabb002a4bcfe7fc95.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/821_Mini_s.jpg","name":"农夫与蛇","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/821_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1285150","clickcount":"1870074","downLoadcount":"1315530","enshrinecount":"45861","fullMediacount":"2713956","playcount":"4342402","sharecount":"234","xiaicount":"134882"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":7619,"ID":"874","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":117,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":874,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/e9c0048ec58b574e38f5353097ebdcd16341648e.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/f462313ae8af42e36745a988f4e6ef4affc08100.jpg","name":"猎人海力布","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/3e08ef30315aede589e331d98012b0bda568884d.jpg","shouyeShow":"1","statistics":{"buycount":"1473989","clickcount":"2332776","downLoadcount":"1535862","enshrinecount":"56523","fullMediacount":"3796822","playcount":"5682803","sharecount":"179","xiaicount":"301778"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":23990,"ID":"921","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":182,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":921,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/284268719ebc2148be6553d228d70e0c5761ce32.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/348bfc0d389ca9ffd397d1d7b9e7fe934d0169a9.jpg","name":"桃太郎的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/4d99a916f40da4ecab913277e32c4de85812c11b.jpg","shouyeShow":"1","statistics":{"buycount":"610872","clickcount":"1605965","downLoadcount":"644386","enshrinecount":"38849","fullMediacount":"1983340","playcount":"3267540","sharecount":"181","xiaicount":"130003"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8755,"ID":"813","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":74,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":813,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/cf6787a8f7333688a67d9d903d1fb9d35a115e2a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/39eca8c49f752cdab204c5d635e77e52546ffaba.jpg","name":"北风与太阳","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/813_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1426030","clickcount":"2748969","downLoadcount":"1456176","enshrinecount":"54459","fullMediacount":"4193151","playcount":"5464546","sharecount":"177","xiaicount":"233791"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8509,"ID":"781","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":149,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":781,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2a7370c1bc8ebdf573d6aef44d24122ecfe608e4.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/781_Mini_s.jpg","name":"狐假虎威","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/781_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"898099","clickcount":"1302436","downLoadcount":"932020","enshrinecount":"27480","fullMediacount":"2234619","playcount":"3102791","sharecount":"131","xiaicount":"132118"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8995,"ID":"816","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":136,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":816,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7560c36acf81e9b5308e13100d12812854a0bf5d.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/68fed7d6c7bf97b29cb6727d81e8ed55ee15ffcd.jpg","name":"曹冲称象","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/816_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1322074","clickcount":"1960234","downLoadcount":"1354591","enshrinecount":"56716","fullMediacount":"3033829","playcount":"4571587","sharecount":"188","xiaicount":"146584"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13718,"ID":"789","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":158,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":789,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/fd91a7296c4c295b4407e652fb3771fca799c19c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/789_Mini_s.jpg","name":"小猴子下山","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/789_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1612489","clickcount":"3330269","downLoadcount":"1646379","enshrinecount":"64910","fullMediacount":"4688415","playcount":"6513378","sharecount":"347","xiaicount":"328135"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":12056,"ID":"791","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":160,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":791,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/69b466b3a2170abf03424f43adf08289eca51d62.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/791_Mini_s.jpg","name":"小猫钓鱼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/791_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"631651","clickcount":"1116511","downLoadcount":"655750","enshrinecount":"22357","fullMediacount":"1748117","playcount":"2404741","sharecount":"215","xiaicount":"119996"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":21840,"ID":"11","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":167,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":11,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/145b8491084d13ab6b7793af3c473070ff76528a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/11_Mini_s.jpg","name":"小兔子乖乖","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/11_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1738594","clickcount":"3700666","downLoadcount":"1779531","enshrinecount":"82725","fullMediacount":"4971896","playcount":"7587141","sharecount":"416","xiaicount":"253368"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9243,"ID":"778","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":146,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":778,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a6286b42df42c21198d90088adae28859c60442a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4ce0256f41fe043d3019801ed0828cc0be422d65.jpg","name":"拔苗助长","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/778_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1452779","clickcount":"1851926","downLoadcount":"1483543","enshrinecount":"50489","fullMediacount":"3764588","playcount":"5318513","sharecount":"215","xiaicount":"218479"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9230,"ID":"866","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":134,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":866,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5b6ba44b7b5859ef039297a8043393a9e4851506.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/ffef36218d62eaee5451d3406206e132198fa8d1.jpg","name":"文彦博树洞取球","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/42046170bf16b17380ac7f6573775d6457a6a853.jpg","shouyeShow":"1","statistics":{"buycount":"1318698","clickcount":"2073007","downLoadcount":"1366877","enshrinecount":"48677","fullMediacount":"3565469","playcount":"4933229","sharecount":"166","xiaicount":"211572"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9786,"ID":"779","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":147,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":779,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/c1692d2a882a3ea69f9155e06a1935181100ff54.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/779_Mini_s.jpg","name":"对牛弹琴","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/779_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1331395","clickcount":"1602148","downLoadcount":"1355269","enshrinecount":"50583","fullMediacount":"3146150","playcount":"4658333","sharecount":"182","xiaicount":"134420"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16102,"ID":"828","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":139,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":828,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/10d7111683a6623877adf4263043aee73d1caf76.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/828_s.jpg","name":"掩耳盗铃","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/828_h.jpg?1=1","shouyeShow":"1","statistics":{"buycount":"1721286","clickcount":"3646114","downLoadcount":"1771126","enshrinecount":"77985","fullMediacount":"4912976","playcount":"6673694","sharecount":"339","xiaicount":"241370"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":28402,"ID":"15","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":164,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":15,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/658633e4ef4d7ca1cd49c29254778acfaeb276b4.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/15_Mini_s.jpg","name":"小蝌蚪找妈妈","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/15_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1843089","clickcount":"4293693","downLoadcount":"1891079","enshrinecount":"99309","fullMediacount":"4794963","playcount":"8078762","sharecount":"661","xiaicount":"270592"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":35830,"ID":"788","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":157,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":788,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/d5972cce683f4bd3383f375e1574aa1e91512068.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/788_Mini_s.jpg","name":"小壁虎借尾巴","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/788_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2163790","clickcount":"6194326","downLoadcount":"2210929","enshrinecount":"117180","fullMediacount":"7173792","playcount":"11007474","sharecount":"653","xiaicount":"459671"},"status":"2"},{"CoaxSleep":"0","ID":"18","IsCategory":true,"LevelTypeid":"18","Masked":"1","Mediatype":"0","State":"0","Typeid":"1","downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/gushi.png","name":"VIP抢先看","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/index_vip_fengmian_1.png","shouyeShow":"1","statistics":{"buycount":"0","clickcount":"0","downLoadcount":"0","enshrinecount":"0","fullMediacount":"0","playcount":"0","sharecount":"0","xiaicount":"0"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":38990,"ID":"785","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":153,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":785,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/74e420440fab861b66402ef5e1be282461248b36.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/d30dda5bf0fe5f1c11d5cd60f8af2228bc0fd3ff.jpg","name":"孔融让梨","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/785_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2368302","clickcount":"5932544","downLoadcount":"2421502","enshrinecount":"133135","fullMediacount":"7882633","playcount":"11814383","sharecount":"948","xiaicount":"471574"},"status":"2"}],"classlist2":[{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":1823,"ID":"64","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":49,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":64,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/2ff8629a34a46f4bb556c7a81a6015ff84e3a5fe.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/cfffadcc2940cdea29664df5d76fb7c308d29638.jpg","name":"端午节","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/2ff8629a34a46f4bb556c7a81a6015ff84e3a5fe.jpg","shouyeShow":"1","statistics":{"buycount":"396451","clickcount":"612380","downLoadcount":"406233","enshrinecount":"13029","fullMediacount":"1336266","playcount":"1780817","sharecount":"36","xiaicount":"70359"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16077,"ID":"928","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":186,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":928,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2915fc288dce1e6d3ce14d684799a71e04555ef3.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/92999200633ccf46a841e3f6dda17c570bf02b20.jpg","name":"海草舞","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2915fc288dce1e6d3ce14d684799a71e04555ef3.jpg","shouyeShow":"1","statistics":{"buycount":"518698","clickcount":"1962355","downLoadcount":"544215","enshrinecount":"34709","fullMediacount":"2362910","playcount":"3573363","sharecount":"242","xiaicount":"110919"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"943","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/68426d7319def47b78658a9b7100096656fa3ba3.jpg","name":"咖喱咖喱","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/b93fd701fdf966501aff855758c552ed04011b8b.jpg","shouyeShow":"1","statistics":{"buycount":"62172","clickcount":"165488","downLoadcount":"64422","enshrinecount":"2183","fullMediacount":"227546","playcount":"290306","sharecount":"5","xiaicount":"15814"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"942","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d63587ce5d38d4c43d131bd21d1f130036aa4ee2.jpg","name":"小小少年","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/3ff51df0ee29b70d87872d852034323818624404.jpg","shouyeShow":"1","statistics":{"buycount":"47191","clickcount":"47356","downLoadcount":"48776","enshrinecount":"1202","fullMediacount":"134300","playcount":"204629","sharecount":"3","xiaicount":"6354"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16453,"ID":"931","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":190,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":931,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/6e09528a913ad73f2013b3960a5078b74b9c1b31.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9c36c76bd5c16a363ce05656c851bf713ead487e.jpg","name":"学猫叫","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/6e09528a913ad73f2013b3960a5078b74b9c1b31.jpg","shouyeShow":"1","statistics":{"buycount":"307586","clickcount":"964480","downLoadcount":"321967","enshrinecount":"22252","fullMediacount":"1132962","playcount":"1840978","sharecount":"169","xiaicount":"47331"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13077,"ID":"927","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":185,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":927,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5a3b7e1b6850ff63df68d57d2b63d11090284895.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/102fb352a71b85ec992da05af50a57b5ad2f6b8a.jpg","name":"少林英雄","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/5a3b7e1b6850ff63df68d57d2b63d11090284895.jpg","shouyeShow":"1","statistics":{"buycount":"466662","clickcount":"1331575","downLoadcount":"488262","enshrinecount":"30629","fullMediacount":"2306845","playcount":"3282811","sharecount":"201","xiaicount":"136505"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"940","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/2c03f538a3e966420ac4b4c1ed223d0d83ce1a06.jpg","name":"我的好妈妈","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2da51c6c2d9d5411099d00515b4c12f2e33caa1c.jpg","shouyeShow":"1","statistics":{"buycount":"110781","clickcount":"204319","downLoadcount":"114843","enshrinecount":"2971","fullMediacount":"422636","playcount":"538676","sharecount":"12","xiaicount":"21486"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":49526,"ID":"843","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":97,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":843,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/e53a071b237f5dd7be33952f2dfd2389d371d1fc.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/3180ea7c55be522f542d499db9c56451980fb29c.png","name":"大王叫我来巡山","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/e53a071b237f5dd7be33952f2dfd2389d371d1fc.jpg","shouyeShow":"1","statistics":{"buycount":"1691438","clickcount":"8723429","downLoadcount":"1763148","enshrinecount":"160467","fullMediacount":"7417852","playcount":"13086179","sharecount":"924","xiaicount":"344562"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":23035,"ID":"847","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":100,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":847,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/0bf26a96ad593d78df2b3333428e5b6fd09a65a8.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9c2d7cf69163d2d1ee6dcb000179d53f34438c92.png","name":"小跳蛙","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/0bf26a96ad593d78df2b3333428e5b6fd09a65a8.jpg","shouyeShow":"1","statistics":{"buycount":"1271488","clickcount":"4321881","downLoadcount":"1314969","enshrinecount":"81116","fullMediacount":"7114994","playcount":"10307725","sharecount":"562","xiaicount":"263939"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"827","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/31_s.jpg","name":"好爸爸坏爸爸","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/31_h.jpg","shouyeShow":"1","statistics":{"buycount":"1189749","clickcount":"2158283","downLoadcount":"1216465","enshrinecount":"46131","fullMediacount":"5203364","playcount":"7121475","sharecount":"164","xiaicount":"213857"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7946,"ID":"33","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":46,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":33,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/505bc1a0ffbbeca4da0853073df1dfbb9561cf7d.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/33_s.jpg","name":"四季童谣","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/505bc1a0ffbbeca4da0853073df1dfbb9561cf7d.jpg","shouyeShow":"1","statistics":{"buycount":"603464","clickcount":"1117898","downLoadcount":"626685","enshrinecount":"27069","fullMediacount":"2754252","playcount":"3821558","sharecount":"119","xiaicount":"90855"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13142,"ID":"27","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":40,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":27,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/5573e895fa88291ab0925f0cbe9617f3d8e363d1.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/90f2e73c3141fa35029b33307ca8a2eaf8d11f80.jpg","name":"宝贝宝贝","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/5573e895fa88291ab0925f0cbe9617f3d8e363d1.jpg","shouyeShow":"1","statistics":{"buycount":"720334","clickcount":"1689124","downLoadcount":"752120","enshrinecount":"41015","fullMediacount":"2860675","playcount":"4356605","sharecount":"341","xiaicount":"100299"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5646,"ID":"4","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":42,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":4,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/4_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/4_s.jpg","name":"找朋友","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/4_h.jpg","shouyeShow":"1","statistics":{"buycount":"813074","clickcount":"1561437","downLoadcount":"826867","enshrinecount":"27586","fullMediacount":"4265009","playcount":"5550959","sharecount":"101","xiaicount":"137828"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2821,"ID":"924","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":184,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":924,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7fe1bb19127fa98fa778f3e293e04dd363cffe71.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/a14cf3fc6336e5e60b0df462b95c379a5c406bc5.jpg","name":"Apple Song","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/7fe1bb19127fa98fa778f3e293e04dd363cffe71.jpg","shouyeShow":"1","statistics":{"buycount":"229848","clickcount":"342240","downLoadcount":"240466","enshrinecount":"4789","fullMediacount":"962547","playcount":"1176767","sharecount":"21","xiaicount":"45222"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":11259,"ID":"893","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":107,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":893,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a0597efcd99f329268b7405224775762e6605ea2.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d85555cdc2a0bb7bc83fbd6e36f0689a9fdfbc8a.jpg","name":"小兔子乖乖","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/a0597efcd99f329268b7405224775762e6605ea2.jpg","shouyeShow":"1","statistics":{"buycount":"559399","clickcount":"1296698","downLoadcount":"578887","enshrinecount":"18543","fullMediacount":"2819098","playcount":"3756466","sharecount":"119","xiaicount":"103932"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6726,"ID":"854","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":103,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":854,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/b6cdcd895219275d4068ca13ccc5317e4859bac7.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/ab360de257c0f125785d6b844bd95b57868c47bb.jpg","name":"我爱北京天安门","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/b6cdcd895219275d4068ca13ccc5317e4859bac7.jpg","shouyeShow":"1","statistics":{"buycount":"816961","clickcount":"1402164","downLoadcount":"846755","enshrinecount":"35630","fullMediacount":"3267784","playcount":"4913131","sharecount":"101","xiaicount":"101744"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16852,"ID":"873","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":106,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":873,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/babamama_h2.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/babamama_s.jpg","name":"爸爸妈妈听我说","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/babamama_h2.jpg","shouyeShow":"1","statistics":{"buycount":"1110129","clickcount":"2818505","downLoadcount":"1151047","enshrinecount":"53144","fullMediacount":"5611965","playcount":"7518206","sharecount":"318","xiaicount":"233353"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2833,"ID":"851","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":101,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":851,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/79d882bd3cb381aeec2aa90047facd938e77962a.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/acea03b99131c3aecd24cb4a4be785fa3d6d7ccc.jpg","name":"Twinkle Twinkle Little Star","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/79d882bd3cb381aeec2aa90047facd938e77962a.jpg","shouyeShow":"1","statistics":{"buycount":"558257","clickcount":"841967","downLoadcount":"575861","enshrinecount":"17201","fullMediacount":"2142721","playcount":"2841233","sharecount":"54","xiaicount":"92262"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5258,"ID":"845","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":99,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":845,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/0a2b3749295d7fa7ecbf72998f1dc3b75dbf135b.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6bbd1e1a2416c48383ec6b8f7117aca73d501064.png","name":"生日快乐歌","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/0a2b3749295d7fa7ecbf72998f1dc3b75dbf135b.jpg","shouyeShow":"1","statistics":{"buycount":"558707","clickcount":"955972","downLoadcount":"577842","enshrinecount":"19143","fullMediacount":"1869186","playcount":"2573571","sharecount":"85","xiaicount":"84950"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":18044,"ID":"833","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":96,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":833,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/9b09035b6c6599e381d3e305960b4dd76d5ada6b.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/771eadd292dbccb2ab4f700b46ad6fd3e5cbc5f5.jpg","name":"不上你的当","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/9b09035b6c6599e381d3e305960b4dd76d5ada6b.jpg","shouyeShow":"1","statistics":{"buycount":"1304083","clickcount":"3981070","downLoadcount":"1348445","enshrinecount":"73282","fullMediacount":"6990798","playcount":"9375259","sharecount":"393","xiaicount":"406009"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2602,"ID":"68","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":51,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":68,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/68_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/68_s.jpg","name":"庆祝六一","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/68_h.jpg","shouyeShow":"1","statistics":{"buycount":"460347","clickcount":"698471","downLoadcount":"463448","enshrinecount":"18447","fullMediacount":"1438198","playcount":"2145927","sharecount":"59","xiaicount":"51550"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4042,"ID":"23","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":41,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":23,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/9b5661c07d1c61f2c22ac09d363c34c3b6553678.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/23_s.jpg","name":"蜗牛与黄鹂鸟","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/9b5661c07d1c61f2c22ac09d363c34c3b6553678.jpg","shouyeShow":"1","statistics":{"buycount":"570457","clickcount":"926494","downLoadcount":"579554","enshrinecount":"25040","fullMediacount":"1666109","playcount":"2486215","sharecount":"103","xiaicount":"76176"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3709,"ID":"71","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":38,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":71,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/71_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/71_s.jpg","name":"一只哈巴狗","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/71_h.jpg","shouyeShow":"1","statistics":{"buycount":"619546","clickcount":"1188579","downLoadcount":"627601","enshrinecount":"23058","fullMediacount":"2239057","playcount":"3000294","sharecount":"67","xiaicount":"108468"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2769,"ID":"56","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":59,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":56,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/56_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/56_s.jpg","name":"卖报歌","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/56_h.jpg","shouyeShow":"1","statistics":{"buycount":"534469","clickcount":"757388","downLoadcount":"540023","enshrinecount":"20206","fullMediacount":"1708416","playcount":"2375668","sharecount":"42","xiaicount":"91760"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2768,"ID":"7","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":11,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":7,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/7_s.jpg","name":"采蘑菇的小姑娘","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/e11568ea46ff624a20c4e1e7d00bac612c567810.jpg","shouyeShow":"1","statistics":{"buycount":"526869","clickcount":"944040","downLoadcount":"534579","enshrinecount":"22698","fullMediacount":"1865131","playcount":"2529842","sharecount":"67","xiaicount":"99435"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6971,"ID":"863","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":104,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":863,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/5dafcb375e435a651604f2a126e5536793874adb.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/af5545cf823c9677896de3720929eabb89357874.jpg","name":"歌唱祖国","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/5dafcb375e435a651604f2a126e5536793874adb.jpg","shouyeShow":"1","statistics":{"buycount":"563070","clickcount":"1197332","downLoadcount":"588017","enshrinecount":"26904","fullMediacount":"1896165","playcount":"2794984","sharecount":"111","xiaicount":"108950"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7336,"ID":"814","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":93,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":814,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/814_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/814_s.jpg","name":"种太阳","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/814_h.jpg","shouyeShow":"1","statistics":{"buycount":"948688","clickcount":"1108725","downLoadcount":"965587","enshrinecount":"33605","fullMediacount":"3588019","playcount":"5124365","sharecount":"117","xiaicount":"124114"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2849,"ID":"66","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":39,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":66,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/66_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/66_s.jpg","name":"花仙子","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/66_h.jpg","shouyeShow":"1","statistics":{"buycount":"584976","clickcount":"1163502","downLoadcount":"595853","enshrinecount":"28583","fullMediacount":"1951768","playcount":"2766120","sharecount":"52","xiaicount":"111153"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3721,"ID":"65","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":50,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":65,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/65_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/65_s.jpg","name":"捉泥鳅","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/65_h.jpg","shouyeShow":"1","statistics":{"buycount":"582710","clickcount":"1073845","downLoadcount":"590622","enshrinecount":"26552","fullMediacount":"1995324","playcount":"2754369","sharecount":"88","xiaicount":"111986"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3998,"ID":"63","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":53,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":63,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/25468e5af05c2eb36f9666b4e1c3cad4669a0de8.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d93f427bccf9478c076fc4c6e06f74e5a1e0ca4f.jpg","name":"拔萝卜","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/25468e5af05c2eb36f9666b4e1c3cad4669a0de8.jpg","shouyeShow":"1","statistics":{"buycount":"630924","clickcount":"1397087","downLoadcount":"640375","enshrinecount":"23800","fullMediacount":"2284560","playcount":"3215396","sharecount":"70","xiaicount":"80911"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":1433,"ID":"62","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":43,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":62,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/9edb2835465782f0b8599fad0b4b0f13353d5d62.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4c9421cea96bd8b3fe6b6557dee76c2bf26ba9d9.jpg","name":"劳动最光荣","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/9edb2835465782f0b8599fad0b4b0f13353d5d62.jpg","shouyeShow":"1","statistics":{"buycount":"280828","clickcount":"361512","downLoadcount":"286611","enshrinecount":"8388","fullMediacount":"923640","playcount":"1342378","sharecount":"32","xiaicount":"34373"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8019,"ID":"58","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":67,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":58,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/58_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/58_s.jpg","name":"上学歌","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/58_h.jpg","shouyeShow":"1","statistics":{"buycount":"506465","clickcount":"741987","downLoadcount":"522286","enshrinecount":"15532","fullMediacount":"2292359","playcount":"2874953","sharecount":"93","xiaicount":"76519"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3639,"ID":"53","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":87,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":53,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/53_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/53_s.jpg","name":"踏浪","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/53_h.jpg","shouyeShow":"1","statistics":{"buycount":"339949","clickcount":"580990","downLoadcount":"353693","enshrinecount":"15286","fullMediacount":"884915","playcount":"1473068","sharecount":"56","xiaicount":"43227"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2795,"ID":"42","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":25,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":42,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/925ae8f1fa72f08e4b99ccab6375a096d9f3cad5.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/0c24717f03ac2836374f2289e583032cdf0fb1c1.jpg","name":"家庭礼貌称呼歌","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/925ae8f1fa72f08e4b99ccab6375a096d9f3cad5.jpg","shouyeShow":"1","statistics":{"buycount":"485563","clickcount":"1003783","downLoadcount":"495190","enshrinecount":"19581","fullMediacount":"1749222","playcount":"2395622","sharecount":"55","xiaicount":"117709"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3105,"ID":"40","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":30,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":40,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/947653c2509f98dd90c2880312140ebc2cfb534d.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/40_s.jpg","name":"数鸭子","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/947653c2509f98dd90c2880312140ebc2cfb534d.jpg","shouyeShow":"1","statistics":{"buycount":"376518","clickcount":"650130","downLoadcount":"390737","enshrinecount":"14203","fullMediacount":"1309775","playcount":"1912242","sharecount":"49","xiaicount":"59901"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5809,"ID":"38","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":35,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":38,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/bb39998cd0309932925cbc90f72849f407ed04ac.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/38_s.jpg","name":"白龙马","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/bb39998cd0309932925cbc90f72849f407ed04ac.jpg","shouyeShow":"1","statistics":{"buycount":"591712","clickcount":"1781424","downLoadcount":"616455","enshrinecount":"35412","fullMediacount":"2739682","playcount":"3474451","sharecount":"92","xiaicount":"213369"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3013,"ID":"36","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":44,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":36,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/33512406bd823a7d30df1cfd226ca28292740691.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/36_s.jpg","name":"丑小鸭","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/33512406bd823a7d30df1cfd226ca28292740691.jpg","shouyeShow":"1","statistics":{"buycount":"395681","clickcount":"596430","downLoadcount":"411131","enshrinecount":"15826","fullMediacount":"1159509","playcount":"1875073","sharecount":"24","xiaicount":"58439"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5677,"ID":"35","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":47,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":35,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/cfdd320fa344cc11214453611b866c40ae271cab.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/35_s.jpg","name":"春天在哪里","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/cfdd320fa344cc11214453611b866c40ae271cab.jpg","shouyeShow":"1","statistics":{"buycount":"394904","clickcount":"860922","downLoadcount":"411290","enshrinecount":"19306","fullMediacount":"1429291","playcount":"2177136","sharecount":"74","xiaicount":"47067"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4339,"ID":"34","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":45,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":34,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/96ce55a43a5a606e9c5a2454a9bf5b4001e639d9.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/34_s.jpg","name":"两只老虎","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/96ce55a43a5a606e9c5a2454a9bf5b4001e639d9.jpg","shouyeShow":"1","statistics":{"buycount":"392264","clickcount":"690034","downLoadcount":"409155","enshrinecount":"16569","fullMediacount":"1121135","playcount":"1732519","sharecount":"61","xiaicount":"48806"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5268,"ID":"26","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":55,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":26,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/566807ecfedf2ec033cdaa845bd05935e9a82a15.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/26_s.jpg","name":"摇篮曲","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/566807ecfedf2ec033cdaa845bd05935e9a82a15.jpg","shouyeShow":"1","statistics":{"buycount":"475716","clickcount":"1044694","downLoadcount":"495990","enshrinecount":"30772","fullMediacount":"1302281","playcount":"2292518","sharecount":"117","xiaicount":"44150"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4418,"ID":"25","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":63,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":25,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/25_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/25_s.jpg","name":"世上只有妈妈好","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/25_h.jpg","shouyeShow":"1","statistics":{"buycount":"434982","clickcount":"984226","downLoadcount":"453534","enshrinecount":"22249","fullMediacount":"1502022","playcount":"2126069","sharecount":"68","xiaicount":"93001"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6625,"ID":"8","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":10,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":8,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/3fb51859687f4c0970c3caefdeef88c6ff188d78.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/8_s.jpg","name":"小红帽","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/3fb51859687f4c0970c3caefdeef88c6ff188d78.jpg","shouyeShow":"1","statistics":{"buycount":"658626","clickcount":"1660347","downLoadcount":"675445","enshrinecount":"34963","fullMediacount":"1988583","playcount":"3188214","sharecount":"76","xiaicount":"135714"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7128,"ID":"6","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":36,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":6,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/6_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6_s.jpg","name":"一分钱","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/6_h.jpg","shouyeShow":"1","statistics":{"buycount":"682545","clickcount":"1679017","downLoadcount":"696234","enshrinecount":"38394","fullMediacount":"2187310","playcount":"3355954","sharecount":"83","xiaicount":"149097"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6455,"ID":"2","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":86,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":2,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/2_s.jpg","name":"每当我走过老师窗前","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2_h.jpg","shouyeShow":"1","statistics":{"buycount":"747033","clickcount":"1060453","downLoadcount":"766211","enshrinecount":"32194","fullMediacount":"2302998","playcount":"3600946","sharecount":"140","xiaicount":"85373"},"status":"2"}],"sumcount":"0","sumcount2":"0"}
     * s1088 : {"lists":[{"count":"0","index":"1","list":[],"name":"引导页","status":"false"},{"count":"0","index":"2","list":[],"name":"列表顶部广告","status":"false"},{"count":"0","index":"3","list":[],"name":"播放中顶部banner","status":"false"},{"count":"0","index":"4","list":[],"name":"暂停画面","status":"false"},{"count":"0","index":"5","list":[],"name":"播放缓冲","status":"false"},{"count":"0","index":"6","list":[],"name":"缓冲Banner","status":"false"},{"count":"0","index":"7","list":[],"name":"宝宝讲录制前","status":"false"},{"count":"0","index":"8","list":[],"name":"退出弹层广告","status":"false"}]}
     * s1094 : {"360cookies":"test_cookie_enable=null; count=2; __guid=200722236.68751497832660420.1470811345237.5774; Q=u%3D%25P8%25N5%25P4%25RN%25P2%25S2%25P1%25PO%25O8%25S6%25O1%25NQ%26n%3D%26le%3DAQR3ZQt1BQRkWGDjpKRhL29g%26m%3D%26qid%3D52458154%26im%3D1_t016b0cc32399655921%26src%3Dpcw_cloud%26t%3D1; T=s%3Dcb0f693eb5f1629ba796f4179d2d2c5e%26t%3D1470811362%26lm%3D%26lf%3D1%26sk%3D2344a9d88970f127c762c2d113344102%26mt%3D1470811362%26rc%3D%26v%3D2.0%26a%3D0; token=3663232296.23.e28a82ae.52458154.1470811364","ActivityButtonWwitch":"1","AdDoYouJumpVIP":"1","AdvertisingDays":"3","AdvertisingInt":"3","AdvertisingInterval":"1","AdvertisingRotationChannel":"Xiaomi","AdvertisingSource":"1","AdvertisingTime":"5","BaiduBannerAdvType":"1","CacheCleanupTime":"2019/6/5 14:38:13","CacheTime":"1","ClarityControl":"2","DeviceCount":"5","EduPrice":"0.1","EffectiveTime":-1,"ForcedTimeout":"20","GoldShareCountMax":"3","GroupNickname":"兔兔儿歌,阿布故事,风再起时,2月4呺,圈圈,诠释","HomeTotal":"10","HomeTotal1":"15","HomepageAdsType":"1","IOSPlusQQGroupLink":"PlusQQGroupLink","IntroductionButtonText":"分享二维码给好友","IntroductionPrompt":"，关注阿布睡前故事公众号，可控制孩子APP使用时长","IntroductionQRCode":"http://abugushiimg-1251889355.costj.myqcloud.com/abugongzonghao.png","IntroductionQRCodeDisplay":"1","IntroductionShareDesc":"三只小猪盖房子的故事《三只小猪》是一则英国著名的童话故事,讲述了三只小猪在长大后，学好了本领，各自盖了不同的房子，却遭遇大灰狼的故事。这个故事构思简洁，主题鲜明，教育孩子做人要勤劳肯干、聪明机智、乐于助人。","IntroductionShareImgurl":"http://mmbiz.qpic.cn/mmbiz_jpg/av8DIiaaAImdb8C9sHTAHxteHRjvWAiaLwV5p25ChY9d3NLRSFdlXBkODGqhcZv23COdkohB76ODmDsRmFibuLNwA/640?wx_fmt=jpeg&tp=webp&wxfrom=5","IntroductionShareTitle":"英国经典童话故事《三只小猪》","IntroductionShareType":"1","IntroductionShareUrl":"http://mp.weixin.qq.com/s/ExAiAOWaMr7bvVae-DwHAA","IsAdRotationChannel":false,"IsNoAdProcessingRecommend":"0","IsShowRecommend":"1","LeisureForcedTimeout":"10","ListenSwitch":"1","MediaPrice":"0.01","NoAdProcessingChannel":"Jinli,Anzhi","NoAdProcessingInterval":"3","NoAdProcessingLink":"https://imtt.dd.qq.com/16891/13F3A3509290735D879F79DC9E1D250B.apk?fsname=com.android.abustory_1.2.2.6_29.apk&csr=1bbd","NowVersion":"1.2.3.1","OfflineDownloadSwitch":"1","OwnHomepageAdsType":"1","PayHostHead":"pay.abustory.com","PlusQQGroup":"589180450","PlusQQGroupImage":"http://abugushiimg-1251889355.file.myqcloud.com/5a793fb9efa914df09694e1cd5da867fcc5542f8.png","PlusQQGroupLink":"nNYMpXkdCEIPh_Zd5tN4XR6xyiulbM9z","RedEnvelopeSwitchIos":"1","ReinstallWhetherTheNewUser":"0","RushHour":"19,20,21,22","ShareCountMax":"3","ShareLink":"https://e.eqxiu.com/s/4wqDQEVv","SharePicture":"http://www.tutuerge.com/images/2017-8-29-abu-128.png","ShareRestrict":"1","ShareTheDescription":"阿布故事，我最近在用的哄娃神器，看到的朋友进来给宝宝送朵小红花吧","ShareType":"2","ShareUnlock":"1","ShareUrl":"http://h5.abustory.com/Home/Share","ShareUrl2":"http://www.tutuerge.com/abustory.html","ShowRecommendInterval":"1","StorageJudgment":"10","adinterval_TransformationInterval":"4","adinterval_buffer":"0","adinterval_download":"0","adinterval_guide":"0","adinterval_list":"0","adinterval_listtop":"0","adinterval_setup":"0","adinterval_suspend":"0","adtime_buffer":"8","adtime_download":"60","adtime_guide":"10","adtime_list":"5","adtime_listtop":"60","adtime_setup":"0","adtime_suspend":"0","adv_compatible":"0","adv_loadinterval":"11","adv_notshow":"5","adv_viewinterval":"5","advb_viewtime":"22","aftershare":"100000","aiqiyiinter":"http://wscctcdn.inter.qiyi.com/","aiqiyikey":"4a1caba4b4465345366f28da7c117d20","bufferswitch":"1","dianzancount":"1","dianzandays":"3","displayshare":"0","displayshare2":"1","fxDate":"2016/10/31","haopingDays":"2","haopingSwitch":"1","intervalshare":"10000000","intervalshare2":"3","isjiexi":"2","lepancookies":"sso_tk=10218fa53dkAxQxyAxB7kqYgb9m1m2uV1Kh8i5tQpRFjRTuhSCCiSlJFj81r4bBDrFOQ26Aem1A;ssouid=103734902;","mm3price":"15","mmprice":"5","qiandaojiangli":"10","shareUrl":"","shareid":"7","ssotk":"102c46b007gZ4Ecm1MvJKT4jm36OZQbRWlfQOFLdMD9EzXr11xRrz9GfQ4RbiYB4hg3rKbx6","time_lun":"5","tjDate":"2016/7/31","videoAnalysisMd5":"ea29490977b49c422789d7b75f0a5465","videoAnalysisUrl":"http://abustoryvideo-1251889355.file.myqcloud.com/videoAnalysis/abugushijiexi20190108.jar","videoAnalysisVer":"7","xingbi_dui_huiyuan":"70"}
     */

    private String md;

    private long nowtime;
    private S1002Bean s1002;
    private S1005Bean s1005;
    private S1088Bean s1088;
    private S1094Bean s1094;

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

    public S1002Bean getS1002() {
        return s1002;
    }

    public void setS1002(S1002Bean s1002) {
        this.s1002 = s1002;
    }

    public S1005Bean getS1005() {
        return s1005;
    }

    public void setS1005(S1005Bean s1005) {
        this.s1005 = s1005;
    }

    public S1088Bean getS1088() {
        return s1088;
    }

    public void setS1088(S1088Bean s1088) {
        this.s1088 = s1088;
    }

    public S1094Bean getS1094() {
        return s1094;
    }

    public void setS1094(S1094Bean s1094) {
        this.s1094 = s1094;
    }

    public static class S1002Bean {
        /**
         * downloadurl :
         * newversion : 1.2.3.0
         * vermessage :
         * versioncanuse : 1
         */

        private String downloadurl;
        private String newversion;
        private String vermessage;
        private String versioncanuse;

        public String getDownloadurl() {
            return downloadurl;
        }

        public void setDownloadurl(String downloadurl) {
            this.downloadurl = downloadurl;
        }

        public String getNewversion() {
            return newversion;
        }

        public void setNewversion(String newversion) {
            this.newversion = newversion;
        }

        public String getVermessage() {
            return vermessage;
        }

        public void setVermessage(String vermessage) {
            this.vermessage = vermessage;
        }

        public String getVersioncanuse() {
            return versioncanuse;
        }

        public void setVersioncanuse(String versioncanuse) {
            this.versioncanuse = versioncanuse;
        }
    }

    public static class S1005Bean {
        /**
         * classlist1 : [{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":149490,"ID":"842","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":1,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":1,"VIP":false,"VideoId":842,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/517cef61cdc853cbbefaa3dfb684d29fd219383e.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4833e0668ebf29034a4f4223afa946dd74977e4a.jpg","name":"海的女儿","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/9eda4a3ff103160e3e52b004ad669e17e3296e5b.jpg","shouyeShow":"1","statistics":{"buycount":"3803179","clickcount":"16770848","downLoadcount":"3988155","enshrinecount":"448187","fullMediacount":"9712103","playcount":"23570874","sharecount":"2123","xiaicount":"514449"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2371,"ID":"891","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":89,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":1,"VIP":false,"VideoId":891,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/bf58dea93d7792459e0b1932ce012d62d69748ca.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/7dde47f3a54f25a683fcc3700d91f9e03bac1f0e.jpg","name":"端午节的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/d0479316ce0b08552093fa3616151f3a859d91d3.jpg","shouyeShow":"1","statistics":{"buycount":"372872","clickcount":"646028","downLoadcount":"390384","enshrinecount":"16079","fullMediacount":"880795","playcount":"1229368","sharecount":"58","xiaicount":"57756"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":41004,"ID":"786","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":154,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":786,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5d283e8f923791d6eddb44d5b38f64568b611bc1.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/786_Mini_s.jpg","name":"三只小猪","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/786_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2348722","clickcount":"6203648","downLoadcount":"2406685","enshrinecount":"113748","fullMediacount":"7995914","playcount":"11382830","sharecount":"838","xiaicount":"541504"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":27244,"ID":"853","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":16,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":853,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/026b980b4326b4f94ba70eb5e6c7aeca5ad8f194.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/c3278963b28553ead92898e68c01b94506368a34.jpg","name":"丑小鸭","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/bd0ad8b18b366324daa7d7a5512718abb7d892e8.jpg","shouyeShow":"1","statistics":{"buycount":"1996592","clickcount":"3639531","downLoadcount":"2072887","enshrinecount":"80478","fullMediacount":"5766600","playcount":"8569019","sharecount":"523","xiaicount":"341947"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":20247,"ID":"818","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":123,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":818,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/8c6fca0cf914491f70b76e4edad64fa4748e6333.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/818_Mini_s.jpg","name":"老虎拔牙","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/818_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2085213","clickcount":"4767832","downLoadcount":"2145170","enshrinecount":"99235","fullMediacount":"6515331","playcount":"9560630","sharecount":"609","xiaicount":"310184"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":12101,"ID":"817","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":140,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":817,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/e9368b1a3f18820b9813f4d89638837b8c023b8c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/2fe26b088e888ed01d1235b6895910bcc7ace17b.jpg","name":"渔夫和金鱼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/817_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1726260","clickcount":"2653821","downLoadcount":"1771622","enshrinecount":"63894","fullMediacount":"4624422","playcount":"6301481","sharecount":"290","xiaicount":"205903"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":45549,"ID":"920","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":181,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":920,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a64d4238e20cea769cdead7e6096ee8da34ded28.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/3fdd26bc75ba4232621aedde260a6cbc9a41eb2f.jpg","name":"阿里巴巴和四十大盗","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/72152cc81d5e9caf4ad3f907dccce3617c87814f.jpg","shouyeShow":"1","statistics":{"buycount":"1225223","clickcount":"2910572","downLoadcount":"1281347","enshrinecount":"66412","fullMediacount":"4042377","playcount":"7071928","sharecount":"419","xiaicount":"267537"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"850","IsCategory":false,"IsLyrics":false,"LevelTypeid":1,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/574c43f7109daae084e717675f6d4716c3ad28a5.png","name":"神笔马良","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/c5e70732f25a2046a53c521fbbb48e549fe255bb.jpg","shouyeShow":"1","statistics":{"buycount":"1580935","clickcount":"3092907","downLoadcount":"1649119","enshrinecount":"81935","fullMediacount":"4087218","playcount":"6217195","sharecount":"354","xiaicount":"177763"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":24653,"ID":"837","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":126,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":837,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/62b2fb2a0235ec099a9c0a01e8d8fab85209ddba.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/b5b0680f734bf6477951cf4c037041a1ba79592c.png","name":"小红帽","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/63be457f231452d8a9829d31d840294e68d7f1e7.jpg","shouyeShow":"1","statistics":{"buycount":"1975844","clickcount":"3754484","downLoadcount":"2041117","enshrinecount":"80590","fullMediacount":"5532148","playcount":"8508593","sharecount":"561","xiaicount":"303872"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":25838,"ID":"9","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":168,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":9,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/b9959e2b597e24bdf2e4339b8f445bbdac1d580a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9_Mini_s.jpg","name":"白雪公主","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/9_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"936244","clickcount":"2120846","downLoadcount":"967530","enshrinecount":"81733","fullMediacount":"1458539","playcount":"3528160","sharecount":"283","xiaicount":"82557"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":14342,"ID":"875","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":119,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":875,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/89307b4a21fa36121243acf1ec6687cd5a16131c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/b9c00a123e6c6ba7dc693f10863f33d21f66a793.jpg","name":"田螺姑娘","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/33130ee91262492390dda5cd4c4d1b5c6e3e5c58.jpg","shouyeShow":"1","statistics":{"buycount":"1809247","clickcount":"3067632","downLoadcount":"1876107","enshrinecount":"77918","fullMediacount":"5259032","playcount":"7364855","sharecount":"316","xiaicount":"374881"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":18894,"ID":"901","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":170,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":901,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/568065dac54a6996ace7b5515741731302fdac15.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/4c6d1fd50dee290f13340e3e473a4a9e60e72b0e.jpg","name":"闻鸡起舞","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/668d3bb0070cc4a8daf1498df23092da8d297c08.jpg","shouyeShow":"1","statistics":{"buycount":"1123796","clickcount":"1499438","downLoadcount":"1167517","enshrinecount":"41625","fullMediacount":"3136558","playcount":"4497336","sharecount":"246","xiaicount":"152465"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":21644,"ID":"884","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":22,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":884,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a90af199fc1455f16946ed403dfc7016475b4874.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/73599ceb19766ea8c7aa47c9f5a62055acd301f5.jpg","name":"狼和小羊","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/472c5ccbafe14069bf95af48ab61b16c35b0d82b.jpg","shouyeShow":"1","statistics":{"buycount":"2054253","clickcount":"4548188","downLoadcount":"2120861","enshrinecount":"75639","fullMediacount":"7350777","playcount":"10037051","sharecount":"659","xiaicount":"418160"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":25717,"ID":"879","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":2,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":879,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7359124850dec035e698c832d8a98fe45f8e8d76.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/d4f832bb5a429b61c1c13ab5a6ac7d1feb775b83.jpg","name":"睡美人","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/5070a6762fe8fd9ddeaeb8a074a940258fb379eb.jpg","shouyeShow":"1","statistics":{"buycount":"2239144","clickcount":"4028172","downLoadcount":"2338963","enshrinecount":"141161","fullMediacount":"5013544","playcount":"9775463","sharecount":"528","xiaicount":"268867"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":11764,"ID":"925","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":169,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":925,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/4b4634b6bbea0ce97289b3bcedd5f57585abea90.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d43bf73b2d824b47efd989e27789e5df27b63c82.jpg","name":"七夕节的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/40114281bb26aa00a6c0bd1349e2a9c4d17c5820.jpg","shouyeShow":"1","statistics":{"buycount":"497527","clickcount":"778912","downLoadcount":"530317","enshrinecount":"26319","fullMediacount":"918227","playcount":"1624478","sharecount":"111","xiaicount":"66371"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13566,"ID":"895","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":88,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":895,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/033310620f6fe51e99562a6320fe5aa79d98a446.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6cc9c07231ef17e97644f2225beedb53a1b064fe.jpg","name":"八仙过海","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/c19ca87f46195e78c056a3acc86690deeb0735d5.jpg","shouyeShow":"1","statistics":{"buycount":"1199616","clickcount":"2073248","downLoadcount":"1255500","enshrinecount":"54549","fullMediacount":"3414107","playcount":"4777630","sharecount":"188","xiaicount":"179486"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":36008,"ID":"910","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":178,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":910,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/74222a0d463eaa6c1eed9ae5fe36d89d6baaf1af.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6281e4457fd0680fa3e1fd0948627db6b307a597.jpg","name":"包公审石头的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/b9b5edd9b877d4975d4931a71811cca2cd232d50.jpg","shouyeShow":"1","statistics":{"buycount":"917144","clickcount":"1899670","downLoadcount":"955561","enshrinecount":"42335","fullMediacount":"3043686","playcount":"4349603","sharecount":"279","xiaicount":"218458"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8759,"ID":"887","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":29,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":887,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/06efcbdcb340a31634bc78b551c75f13c0940de9.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/170f6a5ca3e259b6b163d6ef311f24c05fd801d1.jpg","name":"牛顿与苹果的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/4c505aa9ca193dd0d09d1c771e5592dc88d3c5fe.jpg","shouyeShow":"1","statistics":{"buycount":"1243686","clickcount":"1661217","downLoadcount":"1292922","enshrinecount":"42553","fullMediacount":"3361479","playcount":"4779216","sharecount":"202","xiaicount":"169728"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":12803,"ID":"819","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":138,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":819,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7cb3f31e1b7c2428efabd094f91a4d888f599f54.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/819_Mini_s.jpg","name":"三个和尚","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/819_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1678553","clickcount":"2782787","downLoadcount":"1723527","enshrinecount":"63775","fullMediacount":"4364722","playcount":"6009357","sharecount":"412","xiaicount":"182597"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":14329,"ID":"890","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":28,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":890,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/8c5beda6f18bda02fca2c607adcf6a06d9fa416d.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/b6f7e69313e2bbae399990963f3d0558169f958e.jpg","name":"美女与野兽","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/130be04f7bc8ca6c9f99721e47be1e943de8229b.jpg","shouyeShow":"1","statistics":{"buycount":"1315066","clickcount":"2567327","downLoadcount":"1377715","enshrinecount":"76739","fullMediacount":"3237848","playcount":"5234312","sharecount":"235","xiaicount":"251374"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4547,"ID":"878","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":116,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":878,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/0b3a3eaea3ff51daa1336e54634368e8edb625bb.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/b73ee506589a9c83b5f08b38a052fbd126a7974f.jpg","name":"夸父逐日","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/b66a16bd0e884510b3951b2db4925bc27faa7564.jpg","shouyeShow":"1","statistics":{"buycount":"1118977","clickcount":"1995552","downLoadcount":"1170896","enshrinecount":"50162","fullMediacount":"2799793","playcount":"4364858","sharecount":"100","xiaicount":"228001"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":10266,"ID":"829","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":129,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":829,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/16d339ab907df5e6dcc4b142605474a4d1aefde1.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/829_s.jpg?1=1","name":"阿拉丁和神灯","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/829_h.jpg?1=1","shouyeShow":"1","statistics":{"buycount":"1919498","clickcount":"3695852","downLoadcount":"1987883","enshrinecount":"90820","fullMediacount":"4986262","playcount":"8297289","sharecount":"268","xiaicount":"400976"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":17822,"ID":"822","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":19,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":822,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/4c31dca19401e6c8d30a20e69d1ba3e2db287821.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/e57f8ea2ceb0bb606b80632f9bb118accb86443c.jpg","name":"年的传说","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/822_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1875629","clickcount":"3262626","downLoadcount":"1929764","enshrinecount":"93704","fullMediacount":"4292450","playcount":"7020595","sharecount":"457","xiaicount":"269879"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6990,"ID":"871","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":115,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":871,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/68db1cfa138e700eafe269b26539d00ab2fef0cb.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/31c20677975d62969790094d7fa5bdf940dda1f4.jpg","name":"精卫填海","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/508a401e3ede39270f7d008aaabe64a60c992886.jpg","shouyeShow":"1","statistics":{"buycount":"1417032","clickcount":"2015444","downLoadcount":"1477309","enshrinecount":"54448","fullMediacount":"3819476","playcount":"5368079","sharecount":"175","xiaicount":"360310"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":11820,"ID":"865","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":130,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":865,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/d76dc89dccf214cea5e1502308bb4f003354dd4f.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/35360d10da03dc727ccde182674c4f78f48ba569.jpg","name":"卖火柴的小女孩","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/6a979aa81966f162f09409c671afef963d66af84.jpg","shouyeShow":"1","statistics":{"buycount":"1425713","clickcount":"2159172","downLoadcount":"1495477","enshrinecount":"68960","fullMediacount":"2677334","playcount":"5282230","sharecount":"412","xiaicount":"170315"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":36525,"ID":"909","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":176,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":909,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/553eee19aa6503f4f6e41136371e133ad5c43f90.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/114595d34e5c043998eced023719b259e3568208.jpg","name":"小白兔和小灰兔","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/29ce2f34c2ce83633dbfbb1285be4b6e997cbce2.jpg","shouyeShow":"1","statistics":{"buycount":"1099629","clickcount":"2513762","downLoadcount":"1140119","enshrinecount":"44339","fullMediacount":"4253761","playcount":"5617225","sharecount":"499","xiaicount":"265410"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6820,"ID":"855","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":135,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":855,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/1f6ffa4cb54ab3b649c07aa8154f80e61dce3183.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/1d0f94a19975fe1083a9b28f666fddc10515dc9b.jpg","name":"东郭先生和狼","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/ff68d1f986d62ae7a95f6241b90a22b6437b181a.jpg","shouyeShow":"1","statistics":{"buycount":"1319185","clickcount":"2001135","downLoadcount":"1371203","enshrinecount":"48047","fullMediacount":"3008655","playcount":"4715155","sharecount":"223","xiaicount":"194412"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":28146,"ID":"929","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":187,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":929,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/96822f2516a7877af93168970b401512b4c142f8.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/69e0e00b24293cfc2ca93076a0f7d9fabc3ef3de.jpg","name":"懒人吃饼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/96822f2516a7877af93168970b401512b4c142f8.jpg","shouyeShow":"1","statistics":{"buycount":"785540","clickcount":"1601653","downLoadcount":"815300","enshrinecount":"31682","fullMediacount":"2511549","playcount":"3338224","sharecount":"265","xiaicount":"140670"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":19336,"ID":"898","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":21,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":898,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/1ef828e38da44858a52fc75e610dbb3034c41fd2.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/f7a42fb054669eb9d51de290bf6c0cac55c696f1.jpg","name":"十二生肖的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/c07ce15a87ad20617b1a625045a56c666ebf33b2.jpg","shouyeShow":"1","statistics":{"buycount":"1205494","clickcount":"2492892","downLoadcount":"1253307","enshrinecount":"60150","fullMediacount":"3213352","playcount":"5047242","sharecount":"363","xiaicount":"234685"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7196,"ID":"838","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":127,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":838,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/87d608b0e22ad01984c7bf4b187b2a23b22f47d5.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/ecc34a1bb2dde9c9ecf64f384d5e669e110a8691.jpg","name":"嫦娥奔月","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/a8e6db1e449d81c98aac33d5154762ce3d0eb45c.jpg","shouyeShow":"1","statistics":{"buycount":"1613348","clickcount":"2450969","downLoadcount":"1671297","enshrinecount":"74193","fullMediacount":"3627613","playcount":"5921341","sharecount":"288","xiaicount":"228208"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8838,"ID":"823","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":143,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":823,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/992f26f21b61887b481c4db0da32e17fc7bf073c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/823_Mini_s.jpg","name":"小花猫种鱼","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/baa26174eb7fe3723106e5663ee926c0d0291da9.jpg","shouyeShow":"1","statistics":{"buycount":"1481788","clickcount":"2772802","downLoadcount":"1511131","enshrinecount":"54452","fullMediacount":"4628210","playcount":"6182099","sharecount":"317","xiaicount":"353436"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8401,"ID":"787","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":156,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":787,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/55dad993d7c0d603b7b90b93b4c7b77f35b0072b.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/787_Mini_s.jpg","name":"司马光砸缸","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/787_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1535762","clickcount":"2335041","downLoadcount":"1569183","enshrinecount":"58724","fullMediacount":"4259088","playcount":"6061459","sharecount":"309","xiaicount":"259865"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13588,"ID":"831","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":128,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":831,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2ed2012c2a2abab8fc76d34cb86cc22b44b8d718.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/831_s.jpg","name":"灰姑娘","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/831_h.jpg","shouyeShow":"1","statistics":{"buycount":"1651863","clickcount":"3249192","downLoadcount":"1721691","enshrinecount":"99421","fullMediacount":"3659378","playcount":"6280616","sharecount":"293","xiaicount":"283808"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9357,"ID":"888","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":27,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":888,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/3833ca542c573719d257bc04735e4d6eb3c02808.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/1db79563524bcde760695655f784508c78417b8f.jpg","name":"金斧头银斧头","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/f464425eb8cdb2ed2214dc91b4e67ee175894b29.jpg","shouyeShow":"1","statistics":{"buycount":"1164997","clickcount":"2386465","downLoadcount":"1217091","enshrinecount":"57718","fullMediacount":"3340105","playcount":"4840278","sharecount":"221","xiaicount":"158649"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":15434,"ID":"908","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":175,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":908,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/36f7c678ef654a584706acaa6b5f9497b5c2b186.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/e9e69f9922b93d9f605ad3cc5c2105a5cd3b28bf.jpg","name":"胯下之辱","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/be82846bec13ce4819348dbc9d6082efd74697d7.jpg","shouyeShow":"1","statistics":{"buycount":"781595","clickcount":"998220","downLoadcount":"811914","enshrinecount":"29707","fullMediacount":"2424802","playcount":"3345001","sharecount":"132","xiaicount":"120504"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7080,"ID":"784","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":152,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":784,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/abec63e9eb7bd0d7d4c0f12c1107b4a1687ab26a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/784_Mini_s.jpg","name":"皇帝的新装","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/784_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1306066","clickcount":"1782047","downLoadcount":"1335362","enshrinecount":"51009","fullMediacount":"3022635","playcount":"4516540","sharecount":"146","xiaicount":"156590"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7799,"ID":"820","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":125,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":820,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/9ad28c0261ec73e7703580d2e6f5b4168aceb35d.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/62c61d9f72504d07a20f8dfd4a1125c31f7d8dc1.jpg","name":"女娲补天","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/820_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1508924","clickcount":"2785710","downLoadcount":"1557685","enshrinecount":"69349","fullMediacount":"3552217","playcount":"5240356","sharecount":"152","xiaicount":"278816"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7013,"ID":"821","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":78,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":821,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/6f8ddad88ac442403bec11cabb002a4bcfe7fc95.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/821_Mini_s.jpg","name":"农夫与蛇","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/821_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1285150","clickcount":"1870074","downLoadcount":"1315530","enshrinecount":"45861","fullMediacount":"2713956","playcount":"4342402","sharecount":"234","xiaicount":"134882"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":7619,"ID":"874","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":117,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":874,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/e9c0048ec58b574e38f5353097ebdcd16341648e.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/f462313ae8af42e36745a988f4e6ef4affc08100.jpg","name":"猎人海力布","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/3e08ef30315aede589e331d98012b0bda568884d.jpg","shouyeShow":"1","statistics":{"buycount":"1473989","clickcount":"2332776","downLoadcount":"1535862","enshrinecount":"56523","fullMediacount":"3796822","playcount":"5682803","sharecount":"179","xiaicount":"301778"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":23990,"ID":"921","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":182,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":921,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/284268719ebc2148be6553d228d70e0c5761ce32.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/348bfc0d389ca9ffd397d1d7b9e7fe934d0169a9.jpg","name":"桃太郎的故事","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/4d99a916f40da4ecab913277e32c4de85812c11b.jpg","shouyeShow":"1","statistics":{"buycount":"610872","clickcount":"1605965","downLoadcount":"644386","enshrinecount":"38849","fullMediacount":"1983340","playcount":"3267540","sharecount":"181","xiaicount":"130003"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8755,"ID":"813","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":74,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":813,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/cf6787a8f7333688a67d9d903d1fb9d35a115e2a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/39eca8c49f752cdab204c5d635e77e52546ffaba.jpg","name":"北风与太阳","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/813_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1426030","clickcount":"2748969","downLoadcount":"1456176","enshrinecount":"54459","fullMediacount":"4193151","playcount":"5464546","sharecount":"177","xiaicount":"233791"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8509,"ID":"781","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":149,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":781,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2a7370c1bc8ebdf573d6aef44d24122ecfe608e4.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/781_Mini_s.jpg","name":"狐假虎威","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/781_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"898099","clickcount":"1302436","downLoadcount":"932020","enshrinecount":"27480","fullMediacount":"2234619","playcount":"3102791","sharecount":"131","xiaicount":"132118"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8995,"ID":"816","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":136,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":816,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7560c36acf81e9b5308e13100d12812854a0bf5d.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/68fed7d6c7bf97b29cb6727d81e8ed55ee15ffcd.jpg","name":"曹冲称象","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/816_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1322074","clickcount":"1960234","downLoadcount":"1354591","enshrinecount":"56716","fullMediacount":"3033829","playcount":"4571587","sharecount":"188","xiaicount":"146584"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13718,"ID":"789","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":158,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":789,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/fd91a7296c4c295b4407e652fb3771fca799c19c.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/789_Mini_s.jpg","name":"小猴子下山","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/789_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1612489","clickcount":"3330269","downLoadcount":"1646379","enshrinecount":"64910","fullMediacount":"4688415","playcount":"6513378","sharecount":"347","xiaicount":"328135"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":12056,"ID":"791","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":160,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":791,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/69b466b3a2170abf03424f43adf08289eca51d62.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/791_Mini_s.jpg","name":"小猫钓鱼","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/791_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"631651","clickcount":"1116511","downLoadcount":"655750","enshrinecount":"22357","fullMediacount":"1748117","playcount":"2404741","sharecount":"215","xiaicount":"119996"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":21840,"ID":"11","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":167,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":11,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/145b8491084d13ab6b7793af3c473070ff76528a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/11_Mini_s.jpg","name":"小兔子乖乖","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/11_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1738594","clickcount":"3700666","downLoadcount":"1779531","enshrinecount":"82725","fullMediacount":"4971896","playcount":"7587141","sharecount":"416","xiaicount":"253368"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9243,"ID":"778","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":146,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":778,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a6286b42df42c21198d90088adae28859c60442a.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4ce0256f41fe043d3019801ed0828cc0be422d65.jpg","name":"拔苗助长","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/778_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1452779","clickcount":"1851926","downLoadcount":"1483543","enshrinecount":"50489","fullMediacount":"3764588","playcount":"5318513","sharecount":"215","xiaicount":"218479"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9230,"ID":"866","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":134,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":866,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5b6ba44b7b5859ef039297a8043393a9e4851506.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/ffef36218d62eaee5451d3406206e132198fa8d1.jpg","name":"文彦博树洞取球","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/42046170bf16b17380ac7f6573775d6457a6a853.jpg","shouyeShow":"1","statistics":{"buycount":"1318698","clickcount":"2073007","downLoadcount":"1366877","enshrinecount":"48677","fullMediacount":"3565469","playcount":"4933229","sharecount":"166","xiaicount":"211572"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":9786,"ID":"779","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":147,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":779,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/c1692d2a882a3ea69f9155e06a1935181100ff54.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/779_Mini_s.jpg","name":"对牛弹琴","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/779_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1331395","clickcount":"1602148","downLoadcount":"1355269","enshrinecount":"50583","fullMediacount":"3146150","playcount":"4658333","sharecount":"182","xiaicount":"134420"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16102,"ID":"828","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":139,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":828,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/10d7111683a6623877adf4263043aee73d1caf76.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/828_s.jpg","name":"掩耳盗铃","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/828_h.jpg?1=1","shouyeShow":"1","statistics":{"buycount":"1721286","clickcount":"3646114","downLoadcount":"1771126","enshrinecount":"77985","fullMediacount":"4912976","playcount":"6673694","sharecount":"339","xiaicount":"241370"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":28402,"ID":"15","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":164,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":15,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/658633e4ef4d7ca1cd49c29254778acfaeb276b4.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/15_Mini_s.jpg","name":"小蝌蚪找妈妈","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/15_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"1843089","clickcount":"4293693","downLoadcount":"1891079","enshrinecount":"99309","fullMediacount":"4794963","playcount":"8078762","sharecount":"661","xiaicount":"270592"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":35830,"ID":"788","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":157,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":788,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/d5972cce683f4bd3383f375e1574aa1e91512068.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/788_Mini_s.jpg","name":"小壁虎借尾巴","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/788_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2163790","clickcount":"6194326","downLoadcount":"2210929","enshrinecount":"117180","fullMediacount":"7173792","playcount":"11007474","sharecount":"653","xiaicount":"459671"},"status":"2"},{"CoaxSleep":"0","ID":"18","IsCategory":true,"LevelTypeid":"18","Masked":"1","Mediatype":"0","State":"0","Typeid":"1","downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/gushi.png","name":"VIP抢先看","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/index_vip_fengmian_1.png","shouyeShow":"1","statistics":{"buycount":"0","clickcount":"0","downLoadcount":"0","enshrinecount":"0","fullMediacount":"0","playcount":"0","sharecount":"0","xiaicount":"0"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":true,"HowManyPeopleSing":38990,"ID":"785","IsCategory":false,"IsLyrics":true,"LevelTypeid":1,"LyricsId":153,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":1,"VIP":false,"VideoId":785,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/74e420440fab861b66402ef5e1be282461248b36.jpg","WorkType":2,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/d30dda5bf0fe5f1c11d5cd60f8af2228bc0fd3ff.jpg","name":"孔融让梨","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/785_Mini_h.jpg","shouyeShow":"1","statistics":{"buycount":"2368302","clickcount":"5932544","downLoadcount":"2421502","enshrinecount":"133135","fullMediacount":"7882633","playcount":"11814383","sharecount":"948","xiaicount":"471574"},"status":"2"}]
         * classlist2 : [{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":1823,"ID":"64","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":49,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":64,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/2ff8629a34a46f4bb556c7a81a6015ff84e3a5fe.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/cfffadcc2940cdea29664df5d76fb7c308d29638.jpg","name":"端午节","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/2ff8629a34a46f4bb556c7a81a6015ff84e3a5fe.jpg","shouyeShow":"1","statistics":{"buycount":"396451","clickcount":"612380","downLoadcount":"406233","enshrinecount":"13029","fullMediacount":"1336266","playcount":"1780817","sharecount":"36","xiaicount":"70359"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16077,"ID":"928","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":186,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":928,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2915fc288dce1e6d3ce14d684799a71e04555ef3.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/92999200633ccf46a841e3f6dda17c570bf02b20.jpg","name":"海草舞","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2915fc288dce1e6d3ce14d684799a71e04555ef3.jpg","shouyeShow":"1","statistics":{"buycount":"518698","clickcount":"1962355","downLoadcount":"544215","enshrinecount":"34709","fullMediacount":"2362910","playcount":"3573363","sharecount":"242","xiaicount":"110919"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"943","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/68426d7319def47b78658a9b7100096656fa3ba3.jpg","name":"咖喱咖喱","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/b93fd701fdf966501aff855758c552ed04011b8b.jpg","shouyeShow":"1","statistics":{"buycount":"62172","clickcount":"165488","downLoadcount":"64422","enshrinecount":"2183","fullMediacount":"227546","playcount":"290306","sharecount":"5","xiaicount":"15814"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"942","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d63587ce5d38d4c43d131bd21d1f130036aa4ee2.jpg","name":"小小少年","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/3ff51df0ee29b70d87872d852034323818624404.jpg","shouyeShow":"1","statistics":{"buycount":"47191","clickcount":"47356","downLoadcount":"48776","enshrinecount":"1202","fullMediacount":"134300","playcount":"204629","sharecount":"3","xiaicount":"6354"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16453,"ID":"931","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":190,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":931,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/6e09528a913ad73f2013b3960a5078b74b9c1b31.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9c36c76bd5c16a363ce05656c851bf713ead487e.jpg","name":"学猫叫","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/6e09528a913ad73f2013b3960a5078b74b9c1b31.jpg","shouyeShow":"1","statistics":{"buycount":"307586","clickcount":"964480","downLoadcount":"321967","enshrinecount":"22252","fullMediacount":"1132962","playcount":"1840978","sharecount":"169","xiaicount":"47331"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13077,"ID":"927","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":185,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"2","Typeid":2,"VIP":false,"VideoId":927,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/5a3b7e1b6850ff63df68d57d2b63d11090284895.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/102fb352a71b85ec992da05af50a57b5ad2f6b8a.jpg","name":"少林英雄","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/5a3b7e1b6850ff63df68d57d2b63d11090284895.jpg","shouyeShow":"1","statistics":{"buycount":"466662","clickcount":"1331575","downLoadcount":"488262","enshrinecount":"30629","fullMediacount":"2306845","playcount":"3282811","sharecount":"201","xiaicount":"136505"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"940","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/2c03f538a3e966420ac4b4c1ed223d0d83ce1a06.jpg","name":"我的好妈妈","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2da51c6c2d9d5411099d00515b4c12f2e33caa1c.jpg","shouyeShow":"1","statistics":{"buycount":"110781","clickcount":"204319","downLoadcount":"114843","enshrinecount":"2971","fullMediacount":"422636","playcount":"538676","sharecount":"12","xiaicount":"21486"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":49526,"ID":"843","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":97,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":843,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/e53a071b237f5dd7be33952f2dfd2389d371d1fc.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/3180ea7c55be522f542d499db9c56451980fb29c.png","name":"大王叫我来巡山","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/e53a071b237f5dd7be33952f2dfd2389d371d1fc.jpg","shouyeShow":"1","statistics":{"buycount":"1691438","clickcount":"8723429","downLoadcount":"1763148","enshrinecount":"160467","fullMediacount":"7417852","playcount":"13086179","sharecount":"924","xiaicount":"344562"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":23035,"ID":"847","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":100,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":847,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/0bf26a96ad593d78df2b3333428e5b6fd09a65a8.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/9c2d7cf69163d2d1ee6dcb000179d53f34438c92.png","name":"小跳蛙","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/0bf26a96ad593d78df2b3333428e5b6fd09a65a8.jpg","shouyeShow":"1","statistics":{"buycount":"1271488","clickcount":"4321881","downLoadcount":"1314969","enshrinecount":"81116","fullMediacount":"7114994","playcount":"10307725","sharecount":"562","xiaicount":"263939"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":0,"ID":"827","IsCategory":false,"IsLyrics":false,"LevelTypeid":2,"LyricsId":0,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":0,"VideoImage":"","WorkType":0,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/31_s.jpg","name":"好爸爸坏爸爸","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/31_h.jpg","shouyeShow":"1","statistics":{"buycount":"1189749","clickcount":"2158283","downLoadcount":"1216465","enshrinecount":"46131","fullMediacount":"5203364","playcount":"7121475","sharecount":"164","xiaicount":"213857"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7946,"ID":"33","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":46,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":33,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/505bc1a0ffbbeca4da0853073df1dfbb9561cf7d.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/33_s.jpg","name":"四季童谣","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/505bc1a0ffbbeca4da0853073df1dfbb9561cf7d.jpg","shouyeShow":"1","statistics":{"buycount":"603464","clickcount":"1117898","downLoadcount":"626685","enshrinecount":"27069","fullMediacount":"2754252","playcount":"3821558","sharecount":"119","xiaicount":"90855"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":13142,"ID":"27","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":40,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":27,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/5573e895fa88291ab0925f0cbe9617f3d8e363d1.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/90f2e73c3141fa35029b33307ca8a2eaf8d11f80.jpg","name":"宝贝宝贝","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/5573e895fa88291ab0925f0cbe9617f3d8e363d1.jpg","shouyeShow":"1","statistics":{"buycount":"720334","clickcount":"1689124","downLoadcount":"752120","enshrinecount":"41015","fullMediacount":"2860675","playcount":"4356605","sharecount":"341","xiaicount":"100299"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5646,"ID":"4","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":42,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":4,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/4_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/4_s.jpg","name":"找朋友","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/4_h.jpg","shouyeShow":"1","statistics":{"buycount":"813074","clickcount":"1561437","downLoadcount":"826867","enshrinecount":"27586","fullMediacount":"4265009","playcount":"5550959","sharecount":"101","xiaicount":"137828"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2821,"ID":"924","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":184,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":924,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7fe1bb19127fa98fa778f3e293e04dd363cffe71.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/a14cf3fc6336e5e60b0df462b95c379a5c406bc5.jpg","name":"Apple Song","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/7fe1bb19127fa98fa778f3e293e04dd363cffe71.jpg","shouyeShow":"1","statistics":{"buycount":"229848","clickcount":"342240","downLoadcount":"240466","enshrinecount":"4789","fullMediacount":"962547","playcount":"1176767","sharecount":"21","xiaicount":"45222"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":11259,"ID":"893","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":107,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"1","Typeid":2,"VIP":false,"VideoId":893,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/a0597efcd99f329268b7405224775762e6605ea2.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d85555cdc2a0bb7bc83fbd6e36f0689a9fdfbc8a.jpg","name":"小兔子乖乖","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/a0597efcd99f329268b7405224775762e6605ea2.jpg","shouyeShow":"1","statistics":{"buycount":"559399","clickcount":"1296698","downLoadcount":"578887","enshrinecount":"18543","fullMediacount":"2819098","playcount":"3756466","sharecount":"119","xiaicount":"103932"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6726,"ID":"854","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":103,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":854,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/b6cdcd895219275d4068ca13ccc5317e4859bac7.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/ab360de257c0f125785d6b844bd95b57868c47bb.jpg","name":"我爱北京天安门","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/b6cdcd895219275d4068ca13ccc5317e4859bac7.jpg","shouyeShow":"1","statistics":{"buycount":"816961","clickcount":"1402164","downLoadcount":"846755","enshrinecount":"35630","fullMediacount":"3267784","playcount":"4913131","sharecount":"101","xiaicount":"101744"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":16852,"ID":"873","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":106,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":873,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/babamama_h2.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/babamama_s.jpg","name":"爸爸妈妈听我说","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/babamama_h2.jpg","shouyeShow":"1","statistics":{"buycount":"1110129","clickcount":"2818505","downLoadcount":"1151047","enshrinecount":"53144","fullMediacount":"5611965","playcount":"7518206","sharecount":"318","xiaicount":"233353"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2833,"ID":"851","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":101,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":851,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/79d882bd3cb381aeec2aa90047facd938e77962a.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/acea03b99131c3aecd24cb4a4be785fa3d6d7ccc.jpg","name":"Twinkle Twinkle Little Star","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/79d882bd3cb381aeec2aa90047facd938e77962a.jpg","shouyeShow":"1","statistics":{"buycount":"558257","clickcount":"841967","downLoadcount":"575861","enshrinecount":"17201","fullMediacount":"2142721","playcount":"2841233","sharecount":"54","xiaicount":"92262"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5258,"ID":"845","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":99,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":845,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/0a2b3749295d7fa7ecbf72998f1dc3b75dbf135b.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6bbd1e1a2416c48383ec6b8f7117aca73d501064.png","name":"生日快乐歌","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/0a2b3749295d7fa7ecbf72998f1dc3b75dbf135b.jpg","shouyeShow":"1","statistics":{"buycount":"558707","clickcount":"955972","downLoadcount":"577842","enshrinecount":"19143","fullMediacount":"1869186","playcount":"2573571","sharecount":"85","xiaicount":"84950"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":18044,"ID":"833","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":96,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":833,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/9b09035b6c6599e381d3e305960b4dd76d5ada6b.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/771eadd292dbccb2ab4f700b46ad6fd3e5cbc5f5.jpg","name":"不上你的当","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/9b09035b6c6599e381d3e305960b4dd76d5ada6b.jpg","shouyeShow":"1","statistics":{"buycount":"1304083","clickcount":"3981070","downLoadcount":"1348445","enshrinecount":"73282","fullMediacount":"6990798","playcount":"9375259","sharecount":"393","xiaicount":"406009"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2602,"ID":"68","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":51,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":68,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/68_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/68_s.jpg","name":"庆祝六一","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/68_h.jpg","shouyeShow":"1","statistics":{"buycount":"460347","clickcount":"698471","downLoadcount":"463448","enshrinecount":"18447","fullMediacount":"1438198","playcount":"2145927","sharecount":"59","xiaicount":"51550"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4042,"ID":"23","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":41,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":23,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/9b5661c07d1c61f2c22ac09d363c34c3b6553678.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/23_s.jpg","name":"蜗牛与黄鹂鸟","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/9b5661c07d1c61f2c22ac09d363c34c3b6553678.jpg","shouyeShow":"1","statistics":{"buycount":"570457","clickcount":"926494","downLoadcount":"579554","enshrinecount":"25040","fullMediacount":"1666109","playcount":"2486215","sharecount":"103","xiaicount":"76176"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3709,"ID":"71","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":38,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":71,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/71_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/71_s.jpg","name":"一只哈巴狗","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/71_h.jpg","shouyeShow":"1","statistics":{"buycount":"619546","clickcount":"1188579","downLoadcount":"627601","enshrinecount":"23058","fullMediacount":"2239057","playcount":"3000294","sharecount":"67","xiaicount":"108468"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2769,"ID":"56","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":59,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":56,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/56_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/56_s.jpg","name":"卖报歌","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/56_h.jpg","shouyeShow":"1","statistics":{"buycount":"534469","clickcount":"757388","downLoadcount":"540023","enshrinecount":"20206","fullMediacount":"1708416","playcount":"2375668","sharecount":"42","xiaicount":"91760"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2768,"ID":"7","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":11,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":7,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/7_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/7_s.jpg","name":"采蘑菇的小姑娘","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/e11568ea46ff624a20c4e1e7d00bac612c567810.jpg","shouyeShow":"1","statistics":{"buycount":"526869","clickcount":"944040","downLoadcount":"534579","enshrinecount":"22698","fullMediacount":"1865131","playcount":"2529842","sharecount":"67","xiaicount":"99435"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6971,"ID":"863","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":104,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":863,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/5dafcb375e435a651604f2a126e5536793874adb.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/af5545cf823c9677896de3720929eabb89357874.jpg","name":"歌唱祖国","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/5dafcb375e435a651604f2a126e5536793874adb.jpg","shouyeShow":"1","statistics":{"buycount":"563070","clickcount":"1197332","downLoadcount":"588017","enshrinecount":"26904","fullMediacount":"1896165","playcount":"2794984","sharecount":"111","xiaicount":"108950"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7336,"ID":"814","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":93,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":814,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/814_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/814_s.jpg","name":"种太阳","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/814_h.jpg","shouyeShow":"1","statistics":{"buycount":"948688","clickcount":"1108725","downLoadcount":"965587","enshrinecount":"33605","fullMediacount":"3588019","playcount":"5124365","sharecount":"117","xiaicount":"124114"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2849,"ID":"66","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":39,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":66,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/66_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/66_s.jpg","name":"花仙子","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/66_h.jpg","shouyeShow":"1","statistics":{"buycount":"584976","clickcount":"1163502","downLoadcount":"595853","enshrinecount":"28583","fullMediacount":"1951768","playcount":"2766120","sharecount":"52","xiaicount":"111153"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3721,"ID":"65","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":50,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":65,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/65_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/65_s.jpg","name":"捉泥鳅","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/65_h.jpg","shouyeShow":"1","statistics":{"buycount":"582710","clickcount":"1073845","downLoadcount":"590622","enshrinecount":"26552","fullMediacount":"1995324","playcount":"2754369","sharecount":"88","xiaicount":"111986"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3998,"ID":"63","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":53,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":63,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/25468e5af05c2eb36f9666b4e1c3cad4669a0de8.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/d93f427bccf9478c076fc4c6e06f74e5a1e0ca4f.jpg","name":"拔萝卜","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/25468e5af05c2eb36f9666b4e1c3cad4669a0de8.jpg","shouyeShow":"1","statistics":{"buycount":"630924","clickcount":"1397087","downLoadcount":"640375","enshrinecount":"23800","fullMediacount":"2284560","playcount":"3215396","sharecount":"70","xiaicount":"80911"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":1433,"ID":"62","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":43,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":62,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/9edb2835465782f0b8599fad0b4b0f13353d5d62.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/4c9421cea96bd8b3fe6b6557dee76c2bf26ba9d9.jpg","name":"劳动最光荣","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/9edb2835465782f0b8599fad0b4b0f13353d5d62.jpg","shouyeShow":"1","statistics":{"buycount":"280828","clickcount":"361512","downLoadcount":"286611","enshrinecount":"8388","fullMediacount":"923640","playcount":"1342378","sharecount":"32","xiaicount":"34373"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":8019,"ID":"58","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":67,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":58,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/58_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/58_s.jpg","name":"上学歌","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/58_h.jpg","shouyeShow":"1","statistics":{"buycount":"506465","clickcount":"741987","downLoadcount":"522286","enshrinecount":"15532","fullMediacount":"2292359","playcount":"2874953","sharecount":"93","xiaicount":"76519"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3639,"ID":"53","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":87,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":53,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/53_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/53_s.jpg","name":"踏浪","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/53_h.jpg","shouyeShow":"1","statistics":{"buycount":"339949","clickcount":"580990","downLoadcount":"353693","enshrinecount":"15286","fullMediacount":"884915","playcount":"1473068","sharecount":"56","xiaicount":"43227"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":2795,"ID":"42","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":25,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":42,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/925ae8f1fa72f08e4b99ccab6375a096d9f3cad5.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://tutuergeimages-1251889355.file.myqcloud.com/0c24717f03ac2836374f2289e583032cdf0fb1c1.jpg","name":"家庭礼貌称呼歌","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/925ae8f1fa72f08e4b99ccab6375a096d9f3cad5.jpg","shouyeShow":"1","statistics":{"buycount":"485563","clickcount":"1003783","downLoadcount":"495190","enshrinecount":"19581","fullMediacount":"1749222","playcount":"2395622","sharecount":"55","xiaicount":"117709"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3105,"ID":"40","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":30,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":40,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/947653c2509f98dd90c2880312140ebc2cfb534d.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/40_s.jpg","name":"数鸭子","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/947653c2509f98dd90c2880312140ebc2cfb534d.jpg","shouyeShow":"1","statistics":{"buycount":"376518","clickcount":"650130","downLoadcount":"390737","enshrinecount":"14203","fullMediacount":"1309775","playcount":"1912242","sharecount":"49","xiaicount":"59901"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5809,"ID":"38","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":35,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":38,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/bb39998cd0309932925cbc90f72849f407ed04ac.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/38_s.jpg","name":"白龙马","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/bb39998cd0309932925cbc90f72849f407ed04ac.jpg","shouyeShow":"1","statistics":{"buycount":"591712","clickcount":"1781424","downLoadcount":"616455","enshrinecount":"35412","fullMediacount":"2739682","playcount":"3474451","sharecount":"92","xiaicount":"213369"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":3013,"ID":"36","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":44,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":36,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/33512406bd823a7d30df1cfd226ca28292740691.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/36_s.jpg","name":"丑小鸭","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/33512406bd823a7d30df1cfd226ca28292740691.jpg","shouyeShow":"1","statistics":{"buycount":"395681","clickcount":"596430","downLoadcount":"411131","enshrinecount":"15826","fullMediacount":"1159509","playcount":"1875073","sharecount":"24","xiaicount":"58439"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5677,"ID":"35","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":47,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":35,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/cfdd320fa344cc11214453611b866c40ae271cab.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/35_s.jpg","name":"春天在哪里","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/cfdd320fa344cc11214453611b866c40ae271cab.jpg","shouyeShow":"1","statistics":{"buycount":"394904","clickcount":"860922","downLoadcount":"411290","enshrinecount":"19306","fullMediacount":"1429291","playcount":"2177136","sharecount":"74","xiaicount":"47067"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4339,"ID":"34","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":45,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":34,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/96ce55a43a5a606e9c5a2454a9bf5b4001e639d9.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/34_s.jpg","name":"两只老虎","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/96ce55a43a5a606e9c5a2454a9bf5b4001e639d9.jpg","shouyeShow":"1","statistics":{"buycount":"392264","clickcount":"690034","downLoadcount":"409155","enshrinecount":"16569","fullMediacount":"1121135","playcount":"1732519","sharecount":"61","xiaicount":"48806"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":5268,"ID":"26","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":55,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":26,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/566807ecfedf2ec033cdaa845bd05935e9a82a15.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/26_s.jpg","name":"摇篮曲","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/566807ecfedf2ec033cdaa845bd05935e9a82a15.jpg","shouyeShow":"1","statistics":{"buycount":"475716","clickcount":"1044694","downLoadcount":"495990","enshrinecount":"30772","fullMediacount":"1302281","playcount":"2292518","sharecount":"117","xiaicount":"44150"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":4418,"ID":"25","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":63,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":25,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/25_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/25_s.jpg","name":"世上只有妈妈好","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/25_h.jpg","shouyeShow":"1","statistics":{"buycount":"434982","clickcount":"984226","downLoadcount":"453534","enshrinecount":"22249","fullMediacount":"1502022","playcount":"2126069","sharecount":"68","xiaicount":"93001"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6625,"ID":"8","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":10,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":8,"VideoImage":"http://tutuergeimages-1251889355.file.myqcloud.com/3fb51859687f4c0970c3caefdeef88c6ff188d78.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/8_s.jpg","name":"小红帽","printscreen":"http://tutuergeimages-1251889355.file.myqcloud.com/3fb51859687f4c0970c3caefdeef88c6ff188d78.jpg","shouyeShow":"1","statistics":{"buycount":"658626","clickcount":"1660347","downLoadcount":"675445","enshrinecount":"34963","fullMediacount":"1988583","playcount":"3188214","sharecount":"76","xiaicount":"135714"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":7128,"ID":"6","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":36,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":6,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/6_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/6_s.jpg","name":"一分钱","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/6_h.jpg","shouyeShow":"1","statistics":{"buycount":"682545","clickcount":"1679017","downLoadcount":"696234","enshrinecount":"38394","fullMediacount":"2187310","playcount":"3355954","sharecount":"83","xiaicount":"149097"},"status":"2"},{"CoaxSleep":"0","Downloadurl":"","EduAny":false,"HowManyPeopleSing":6455,"ID":"2","IsCategory":false,"IsLyrics":true,"LevelTypeid":2,"LyricsId":86,"Masked":"1","MediaPayStatus":false,"Mediatype":"0","Price":"0.01","ShareDesc":"","State":"0","Typeid":2,"VIP":false,"VideoId":2,"VideoImage":"http://abugushiimg-1251889355.file.myqcloud.com/2_h.jpg","WorkType":3,"downvip":"0","itemList":[],"lllustration":"http://abugushiimg-1251889355.file.myqcloud.com/2_s.jpg","name":"每当我走过老师窗前","printscreen":"http://abugushiimg-1251889355.file.myqcloud.com/2_h.jpg","shouyeShow":"1","statistics":{"buycount":"747033","clickcount":"1060453","downLoadcount":"766211","enshrinecount":"32194","fullMediacount":"2302998","playcount":"3600946","sharecount":"140","xiaicount":"85373"},"status":"2"}]
         * sumcount : 0
         * sumcount2 : 0
         */

        private String sumcount;
        private String sumcount2;
        private List<Classlist1Bean> classlist1;
        private List<Classlist1Bean> classlist2;

        public String getSumcount() {
            return sumcount;
        }

        public void setSumcount(String sumcount) {
            this.sumcount = sumcount;
        }

        public String getSumcount2() {
            return sumcount2;
        }

        public void setSumcount2(String sumcount2) {
            this.sumcount2 = sumcount2;
        }

        public List<Classlist1Bean> getClasslist1() {
            return classlist1;
        }

        public void setClasslist1(List<Classlist1Bean> classlist1) {
            this.classlist1 = classlist1;
        }

        public List<Classlist1Bean> getClasslist2() {
            return classlist2;
        }

        public void setClasslist2(List<Classlist1Bean> classlist2) {
            this.classlist2 = classlist2;
        }

        public static class Classlist1Bean {
            /**
             * CoaxSleep : 0
             * Downloadurl :
             * EduAny : true
             * HowManyPeopleSing : 149490
             * ID : 842
             * IsCategory : false
             * IsLyrics : true
             * LevelTypeid : 1
             * LyricsId : 1
             * Masked : 1
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
             * statistics : {"buycount":"3803179","clickcount":"16770848","downLoadcount":"3988155","enshrinecount":"448187","fullMediacount":"9712103","playcount":"23570874","sharecount":"2123","xiaicount":"514449"}
             * status : 2
             */

            private String CoaxSleep;
            private String Downloadurl;
            private boolean EduAny;
            private int HowManyPeopleSing;
            private String ID;
            private boolean IsCategory;
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

            public boolean isIsCategory() {
                return IsCategory;
            }

            public void setIsCategory(boolean IsCategory) {
                this.IsCategory = IsCategory;
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
                 * buycount : 3803179
                 * clickcount : 16770848
                 * downLoadcount : 3988155
                 * enshrinecount : 448187
                 * fullMediacount : 9712103
                 * playcount : 23570874
                 * sharecount : 2123
                 * xiaicount : 514449
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

        public static class Classlist2Bean {
            /**
             * CoaxSleep : 0
             * Downloadurl :
             * EduAny : false
             * HowManyPeopleSing : 1823
             * ID : 64
             * IsCategory : false
             * IsLyrics : true
             * LevelTypeid : 2
             * LyricsId : 49
             * Masked : 1
             * MediaPayStatus : false
             * Mediatype : 0
             * Price : 0.01
             * ShareDesc :
             * State : 2
             * Typeid : 2
             * VIP : false
             * VideoId : 64
             * VideoImage : http://tutuergeimages-1251889355.file.myqcloud.com/2ff8629a34a46f4bb556c7a81a6015ff84e3a5fe.jpg
             * WorkType : 3
             * downvip : 0
             * itemList : []
             * lllustration : http://tutuergeimages-1251889355.file.myqcloud.com/cfffadcc2940cdea29664df5d76fb7c308d29638.jpg
             * name : 端午节
             * printscreen : http://tutuergeimages-1251889355.file.myqcloud.com/2ff8629a34a46f4bb556c7a81a6015ff84e3a5fe.jpg
             * shouyeShow : 1
             * statistics : {"buycount":"396451","clickcount":"612380","downLoadcount":"406233","enshrinecount":"13029","fullMediacount":"1336266","playcount":"1780817","sharecount":"36","xiaicount":"70359"}
             * status : 2
             */

            private String CoaxSleep;
            private String Downloadurl;
            private boolean EduAny;
            private int HowManyPeopleSing;
            private String ID;
            private boolean IsCategory;
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
            private StatisticsBeanX statistics;
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

            public boolean isIsCategory() {
                return IsCategory;
            }

            public void setIsCategory(boolean IsCategory) {
                this.IsCategory = IsCategory;
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

            public StatisticsBeanX getStatistics() {
                return statistics;
            }

            public void setStatistics(StatisticsBeanX statistics) {
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

            public static class StatisticsBeanX {
                /**
                 * buycount : 396451
                 * clickcount : 612380
                 * downLoadcount : 406233
                 * enshrinecount : 13029
                 * fullMediacount : 1336266
                 * playcount : 1780817
                 * sharecount : 36
                 * xiaicount : 70359
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

    public static class S1088Bean {
        private List<ListsBean> lists;

        public List<ListsBean> getLists() {
            return lists;
        }

        public void setLists(List<ListsBean> lists) {
            this.lists = lists;
        }

        public static class ListsBean {
            /**
             * count : 0
             * index : 1
             * list : []
             * name : 引导页
             * status : false
             */

            private String count;
            private String index;
            private String name;
            private String status;
            private List<?> list;

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public String getIndex() {
                return index;
            }

            public void setIndex(String index) {
                this.index = index;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }
    }

    public static class S1094Bean {
        /**
         * 360cookies : test_cookie_enable=null; count=2; __guid=200722236.68751497832660420.1470811345237.5774; Q=u%3D%25P8%25N5%25P4%25RN%25P2%25S2%25P1%25PO%25O8%25S6%25O1%25NQ%26n%3D%26le%3DAQR3ZQt1BQRkWGDjpKRhL29g%26m%3D%26qid%3D52458154%26im%3D1_t016b0cc32399655921%26src%3Dpcw_cloud%26t%3D1; T=s%3Dcb0f693eb5f1629ba796f4179d2d2c5e%26t%3D1470811362%26lm%3D%26lf%3D1%26sk%3D2344a9d88970f127c762c2d113344102%26mt%3D1470811362%26rc%3D%26v%3D2.0%26a%3D0; token=3663232296.23.e28a82ae.52458154.1470811364
         * ActivityButtonWwitch : 1
         * AdDoYouJumpVIP : 1
         * AdvertisingDays : 3
         * AdvertisingInt : 3
         * AdvertisingInterval : 1
         * AdvertisingRotationChannel : Xiaomi
         * AdvertisingSource : 1
         * AdvertisingTime : 5
         * BaiduBannerAdvType : 1
         * CacheCleanupTime : 2019/6/5 14:38:13
         * CacheTime : 1
         * ClarityControl : 2
         * DeviceCount : 5
         * EduPrice : 0.1
         * EffectiveTime : -1
         * ForcedTimeout : 20
         * GoldShareCountMax : 3
         * GroupNickname : 兔兔儿歌,阿布故事,风再起时,2月4呺,圈圈,诠释
         * HomeTotal : 10
         * HomeTotal1 : 15
         * HomepageAdsType : 1
         * IOSPlusQQGroupLink : PlusQQGroupLink
         * IntroductionButtonText : 分享二维码给好友
         * IntroductionPrompt : ，关注阿布睡前故事公众号，可控制孩子APP使用时长
         * IntroductionQRCode : http://abugushiimg-1251889355.costj.myqcloud.com/abugongzonghao.png
         * IntroductionQRCodeDisplay : 1
         * IntroductionShareDesc : 三只小猪盖房子的故事《三只小猪》是一则英国著名的童话故事,讲述了三只小猪在长大后，学好了本领，各自盖了不同的房子，却遭遇大灰狼的故事。这个故事构思简洁，主题鲜明，教育孩子做人要勤劳肯干、聪明机智、乐于助人。
         * IntroductionShareImgurl : http://mmbiz.qpic.cn/mmbiz_jpg/av8DIiaaAImdb8C9sHTAHxteHRjvWAiaLwV5p25ChY9d3NLRSFdlXBkODGqhcZv23COdkohB76ODmDsRmFibuLNwA/640?wx_fmt=jpeg&tp=webp&wxfrom=5
         * IntroductionShareTitle : 英国经典童话故事《三只小猪》
         * IntroductionShareType : 1
         * IntroductionShareUrl : http://mp.weixin.qq.com/s/ExAiAOWaMr7bvVae-DwHAA
         * IsAdRotationChannel : false
         * IsNoAdProcessingRecommend : 0
         * IsShowRecommend : 1
         * LeisureForcedTimeout : 10
         * ListenSwitch : 1
         * MediaPrice : 0.01
         * NoAdProcessingChannel : Jinli,Anzhi
         * NoAdProcessingInterval : 3
         * NoAdProcessingLink : https://imtt.dd.qq.com/16891/13F3A3509290735D879F79DC9E1D250B.apk?fsname=com.android.abustory_1.2.2.6_29.apk&csr=1bbd
         * NowVersion : 1.2.3.1
         * OfflineDownloadSwitch : 1
         * OwnHomepageAdsType : 1
         * PayHostHead : pay.abustory.com
         * PlusQQGroup : 589180450
         * PlusQQGroupImage : http://abugushiimg-1251889355.file.myqcloud.com/5a793fb9efa914df09694e1cd5da867fcc5542f8.png
         * PlusQQGroupLink : nNYMpXkdCEIPh_Zd5tN4XR6xyiulbM9z
         * RedEnvelopeSwitchIos : 1
         * ReinstallWhetherTheNewUser : 0
         * RushHour : 19,20,21,22
         * ShareCountMax : 3
         * ShareLink : https://e.eqxiu.com/s/4wqDQEVv
         * SharePicture : http://www.tutuerge.com/images/2017-8-29-abu-128.png
         * ShareRestrict : 1
         * ShareTheDescription : 阿布故事，我最近在用的哄娃神器，看到的朋友进来给宝宝送朵小红花吧
         * ShareType : 2
         * ShareUnlock : 1
         * ShareUrl : http://h5.abustory.com/Home/Share
         * ShareUrl2 : http://www.tutuerge.com/abustory.html
         * ShowRecommendInterval : 1
         * StorageJudgment : 10
         * adinterval_TransformationInterval : 4
         * adinterval_buffer : 0
         * adinterval_download : 0
         * adinterval_guide : 0
         * adinterval_list : 0
         * adinterval_listtop : 0
         * adinterval_setup : 0
         * adinterval_suspend : 0
         * adtime_buffer : 8
         * adtime_download : 60
         * adtime_guide : 10
         * adtime_list : 5
         * adtime_listtop : 60
         * adtime_setup : 0
         * adtime_suspend : 0
         * adv_compatible : 0
         * adv_loadinterval : 11
         * adv_notshow : 5
         * adv_viewinterval : 5
         * advb_viewtime : 22
         * aftershare : 100000
         * aiqiyiinter : http://wscctcdn.inter.qiyi.com/
         * aiqiyikey : 4a1caba4b4465345366f28da7c117d20
         * bufferswitch : 1
         * dianzancount : 1
         * dianzandays : 3
         * displayshare : 0
         * displayshare2 : 1
         * fxDate : 2016/10/31
         * haopingDays : 2
         * haopingSwitch : 1
         * intervalshare : 10000000
         * intervalshare2 : 3
         * isjiexi : 2
         * lepancookies : sso_tk=10218fa53dkAxQxyAxB7kqYgb9m1m2uV1Kh8i5tQpRFjRTuhSCCiSlJFj81r4bBDrFOQ26Aem1A;ssouid=103734902;
         * mm3price : 15
         * mmprice : 5
         * qiandaojiangli : 10
         * shareUrl :
         * shareid : 7
         * ssotk : 102c46b007gZ4Ecm1MvJKT4jm36OZQbRWlfQOFLdMD9EzXr11xRrz9GfQ4RbiYB4hg3rKbx6
         * time_lun : 5
         * tjDate : 2016/7/31
         * videoAnalysisMd5 : ea29490977b49c422789d7b75f0a5465
         * videoAnalysisUrl : http://abustoryvideo-1251889355.file.myqcloud.com/videoAnalysis/abugushijiexi20190108.jar
         * videoAnalysisVer : 7
         * xingbi_dui_huiyuan : 70
         */

        @SerializedName("360cookies")
        private String _$360cookies;
        private String ActivityButtonWwitch;
        private String AdDoYouJumpVIP;
        private String AdvertisingDays;
        private String AdvertisingInt;
        private String AdvertisingInterval;
        private String AdvertisingRotationChannel;
        private String AdvertisingSource;
        private String AdvertisingTime;
        private String BaiduBannerAdvType;
        private String CacheCleanupTime;
        private String CacheTime;
        private String ClarityControl;
        private String DeviceCount;
        private String EduPrice;
        private int EffectiveTime;
        private String ForcedTimeout;
        private String GoldShareCountMax;
        private String GroupNickname;
        private String HomeTotal;
        private String HomeTotal1;
        private String HomepageAdsType;
        private String IOSPlusQQGroupLink;
        private String IntroductionButtonText;
        private String IntroductionPrompt;
        private String IntroductionQRCode;
        private String IntroductionQRCodeDisplay;
        private String IntroductionShareDesc;
        private String IntroductionShareImgurl;
        private String IntroductionShareTitle;
        private String IntroductionShareType;
        private String IntroductionShareUrl;
        private boolean IsAdRotationChannel;
        private String IsNoAdProcessingRecommend;
        private String IsShowRecommend;
        private String LeisureForcedTimeout;
        private String ListenSwitch;
        private String MediaPrice;
        private String NoAdProcessingChannel;
        private String NoAdProcessingInterval;
        private String NoAdProcessingLink;
        private String NowVersion;
        private String OfflineDownloadSwitch;
        private String OwnHomepageAdsType;
        private String PayHostHead;
        private String PlusQQGroup;
        private String PlusQQGroupImage;
        private String PlusQQGroupLink;
        private String RedEnvelopeSwitchIos;
        private String ReinstallWhetherTheNewUser;
        private String RushHour;
        private String ShareCountMax;
        private String ShareLink;
        private String SharePicture;
        private String ShareRestrict;
        private String ShareTheDescription;
        private String ShareType;
        private String ShareUnlock;
        private String ShareUrl;
        private String ShareUrl2;
        private String ShowRecommendInterval;
        private String StorageJudgment;
        private String adinterval_TransformationInterval;
        private String adinterval_buffer;
        private String adinterval_download;
        private String adinterval_guide;
        private String adinterval_list;
        private String adinterval_listtop;
        private String adinterval_setup;
        private String adinterval_suspend;
        private String adtime_buffer;
        private String adtime_download;
        private String adtime_guide;
        private String adtime_list;
        private String adtime_listtop;
        private String adtime_setup;
        private String adtime_suspend;
        private String adv_compatible;
        private String adv_loadinterval;
        private String adv_notshow;
        private String adv_viewinterval;
        private String advb_viewtime;
        private String aftershare;
        private String aiqiyiinter;
        private String aiqiyikey;
        private String bufferswitch;
        private String dianzancount;
        private String dianzandays;
        private String displayshare;
        private String displayshare2;
        private String fxDate;
        private String haopingDays;
        private String haopingSwitch;
        private String intervalshare;
        private String intervalshare2;
        private String isjiexi;
        private String lepancookies;
        private String mm3price;
        private String mmprice;
        private String qiandaojiangli;
        private String shareid;
        private String ssotk;
        private String time_lun;
        private String tjDate;
        private String videoAnalysisMd5;
        private String videoAnalysisUrl;
        private String videoAnalysisVer;
        private String xingbi_dui_huiyuan;

        public String get_$360cookies() {
            return _$360cookies;
        }

        public void set_$360cookies(String _$360cookies) {
            this._$360cookies = _$360cookies;
        }

        public String getActivityButtonWwitch() {
            return ActivityButtonWwitch;
        }

        public void setActivityButtonWwitch(String ActivityButtonWwitch) {
            this.ActivityButtonWwitch = ActivityButtonWwitch;
        }

        public String getAdDoYouJumpVIP() {
            return AdDoYouJumpVIP;
        }

        public void setAdDoYouJumpVIP(String AdDoYouJumpVIP) {
            this.AdDoYouJumpVIP = AdDoYouJumpVIP;
        }

        public String getAdvertisingDays() {
            return AdvertisingDays;
        }

        public void setAdvertisingDays(String AdvertisingDays) {
            this.AdvertisingDays = AdvertisingDays;
        }

        public String getAdvertisingInt() {
            return AdvertisingInt;
        }

        public void setAdvertisingInt(String AdvertisingInt) {
            this.AdvertisingInt = AdvertisingInt;
        }

        public String getAdvertisingInterval() {
            return AdvertisingInterval;
        }

        public void setAdvertisingInterval(String AdvertisingInterval) {
            this.AdvertisingInterval = AdvertisingInterval;
        }

        public String getAdvertisingRotationChannel() {
            return AdvertisingRotationChannel;
        }

        public void setAdvertisingRotationChannel(String AdvertisingRotationChannel) {
            this.AdvertisingRotationChannel = AdvertisingRotationChannel;
        }

        public String getAdvertisingSource() {
            return AdvertisingSource;
        }

        public void setAdvertisingSource(String AdvertisingSource) {
            this.AdvertisingSource = AdvertisingSource;
        }

        public String getAdvertisingTime() {
            return AdvertisingTime;
        }

        public void setAdvertisingTime(String AdvertisingTime) {
            this.AdvertisingTime = AdvertisingTime;
        }

        public String getBaiduBannerAdvType() {
            return BaiduBannerAdvType;
        }

        public void setBaiduBannerAdvType(String BaiduBannerAdvType) {
            this.BaiduBannerAdvType = BaiduBannerAdvType;
        }

        public String getCacheCleanupTime() {
            return CacheCleanupTime;
        }

        public void setCacheCleanupTime(String CacheCleanupTime) {
            this.CacheCleanupTime = CacheCleanupTime;
        }

        public String getCacheTime() {
            return CacheTime;
        }

        public void setCacheTime(String CacheTime) {
            this.CacheTime = CacheTime;
        }

        public String getClarityControl() {
            return ClarityControl;
        }

        public void setClarityControl(String ClarityControl) {
            this.ClarityControl = ClarityControl;
        }

        public String getDeviceCount() {
            return DeviceCount;
        }

        public void setDeviceCount(String DeviceCount) {
            this.DeviceCount = DeviceCount;
        }

        public String getEduPrice() {
            return EduPrice;
        }

        public void setEduPrice(String EduPrice) {
            this.EduPrice = EduPrice;
        }

        public int getEffectiveTime() {
            return EffectiveTime;
        }

        public void setEffectiveTime(int EffectiveTime) {
            this.EffectiveTime = EffectiveTime;
        }

        public String getForcedTimeout() {
            return ForcedTimeout;
        }

        public void setForcedTimeout(String ForcedTimeout) {
            this.ForcedTimeout = ForcedTimeout;
        }

        public String getGoldShareCountMax() {
            return GoldShareCountMax;
        }

        public void setGoldShareCountMax(String GoldShareCountMax) {
            this.GoldShareCountMax = GoldShareCountMax;
        }

        public String getGroupNickname() {
            return GroupNickname;
        }

        public void setGroupNickname(String GroupNickname) {
            this.GroupNickname = GroupNickname;
        }

        public String getHomeTotal() {
            return HomeTotal;
        }

        public void setHomeTotal(String HomeTotal) {
            this.HomeTotal = HomeTotal;
        }

        public String getHomeTotal1() {
            return HomeTotal1;
        }

        public void setHomeTotal1(String HomeTotal1) {
            this.HomeTotal1 = HomeTotal1;
        }

        public String getHomepageAdsType() {
            return HomepageAdsType;
        }

        public void setHomepageAdsType(String HomepageAdsType) {
            this.HomepageAdsType = HomepageAdsType;
        }

        public String getIOSPlusQQGroupLink() {
            return IOSPlusQQGroupLink;
        }

        public void setIOSPlusQQGroupLink(String IOSPlusQQGroupLink) {
            this.IOSPlusQQGroupLink = IOSPlusQQGroupLink;
        }

        public String getIntroductionButtonText() {
            return IntroductionButtonText;
        }

        public void setIntroductionButtonText(String IntroductionButtonText) {
            this.IntroductionButtonText = IntroductionButtonText;
        }

        public String getIntroductionPrompt() {
            return IntroductionPrompt;
        }

        public void setIntroductionPrompt(String IntroductionPrompt) {
            this.IntroductionPrompt = IntroductionPrompt;
        }

        public String getIntroductionQRCode() {
            return IntroductionQRCode;
        }

        public void setIntroductionQRCode(String IntroductionQRCode) {
            this.IntroductionQRCode = IntroductionQRCode;
        }

        public String getIntroductionQRCodeDisplay() {
            return IntroductionQRCodeDisplay;
        }

        public void setIntroductionQRCodeDisplay(String IntroductionQRCodeDisplay) {
            this.IntroductionQRCodeDisplay = IntroductionQRCodeDisplay;
        }

        public String getIntroductionShareDesc() {
            return IntroductionShareDesc;
        }

        public void setIntroductionShareDesc(String IntroductionShareDesc) {
            this.IntroductionShareDesc = IntroductionShareDesc;
        }

        public String getIntroductionShareImgurl() {
            return IntroductionShareImgurl;
        }

        public void setIntroductionShareImgurl(String IntroductionShareImgurl) {
            this.IntroductionShareImgurl = IntroductionShareImgurl;
        }

        public String getIntroductionShareTitle() {
            return IntroductionShareTitle;
        }

        public void setIntroductionShareTitle(String IntroductionShareTitle) {
            this.IntroductionShareTitle = IntroductionShareTitle;
        }

        public String getIntroductionShareType() {
            return IntroductionShareType;
        }

        public void setIntroductionShareType(String IntroductionShareType) {
            this.IntroductionShareType = IntroductionShareType;
        }

        public String getIntroductionShareUrl() {
            return IntroductionShareUrl;
        }

        public void setIntroductionShareUrl(String IntroductionShareUrl) {
            this.IntroductionShareUrl = IntroductionShareUrl;
        }

        public boolean isIsAdRotationChannel() {
            return IsAdRotationChannel;
        }

        public void setIsAdRotationChannel(boolean IsAdRotationChannel) {
            this.IsAdRotationChannel = IsAdRotationChannel;
        }

        public String getIsNoAdProcessingRecommend() {
            return IsNoAdProcessingRecommend;
        }

        public void setIsNoAdProcessingRecommend(String IsNoAdProcessingRecommend) {
            this.IsNoAdProcessingRecommend = IsNoAdProcessingRecommend;
        }

        public String getIsShowRecommend() {
            return IsShowRecommend;
        }

        public void setIsShowRecommend(String IsShowRecommend) {
            this.IsShowRecommend = IsShowRecommend;
        }

        public String getLeisureForcedTimeout() {
            return LeisureForcedTimeout;
        }

        public void setLeisureForcedTimeout(String LeisureForcedTimeout) {
            this.LeisureForcedTimeout = LeisureForcedTimeout;
        }

        public String getListenSwitch() {
            return ListenSwitch;
        }

        public void setListenSwitch(String ListenSwitch) {
            this.ListenSwitch = ListenSwitch;
        }

        public String getMediaPrice() {
            return MediaPrice;
        }

        public void setMediaPrice(String MediaPrice) {
            this.MediaPrice = MediaPrice;
        }

        public String getNoAdProcessingChannel() {
            return NoAdProcessingChannel;
        }

        public void setNoAdProcessingChannel(String NoAdProcessingChannel) {
            this.NoAdProcessingChannel = NoAdProcessingChannel;
        }

        public String getNoAdProcessingInterval() {
            return NoAdProcessingInterval;
        }

        public void setNoAdProcessingInterval(String NoAdProcessingInterval) {
            this.NoAdProcessingInterval = NoAdProcessingInterval;
        }

        public String getNoAdProcessingLink() {
            return NoAdProcessingLink;
        }

        public void setNoAdProcessingLink(String NoAdProcessingLink) {
            this.NoAdProcessingLink = NoAdProcessingLink;
        }

        public String getNowVersion() {
            return NowVersion;
        }

        public void setNowVersion(String NowVersion) {
            this.NowVersion = NowVersion;
        }

        public String getOfflineDownloadSwitch() {
            return OfflineDownloadSwitch;
        }

        public void setOfflineDownloadSwitch(String OfflineDownloadSwitch) {
            this.OfflineDownloadSwitch = OfflineDownloadSwitch;
        }

        public String getOwnHomepageAdsType() {
            return OwnHomepageAdsType;
        }

        public void setOwnHomepageAdsType(String OwnHomepageAdsType) {
            this.OwnHomepageAdsType = OwnHomepageAdsType;
        }

        public String getPayHostHead() {
            return PayHostHead;
        }

        public void setPayHostHead(String PayHostHead) {
            this.PayHostHead = PayHostHead;
        }

        public String getPlusQQGroup() {
            return PlusQQGroup;
        }

        public void setPlusQQGroup(String PlusQQGroup) {
            this.PlusQQGroup = PlusQQGroup;
        }

        public String getPlusQQGroupImage() {
            return PlusQQGroupImage;
        }

        public void setPlusQQGroupImage(String PlusQQGroupImage) {
            this.PlusQQGroupImage = PlusQQGroupImage;
        }

        public String getPlusQQGroupLink() {
            return PlusQQGroupLink;
        }

        public void setPlusQQGroupLink(String PlusQQGroupLink) {
            this.PlusQQGroupLink = PlusQQGroupLink;
        }

        public String getRedEnvelopeSwitchIos() {
            return RedEnvelopeSwitchIos;
        }

        public void setRedEnvelopeSwitchIos(String RedEnvelopeSwitchIos) {
            this.RedEnvelopeSwitchIos = RedEnvelopeSwitchIos;
        }

        public String getReinstallWhetherTheNewUser() {
            return ReinstallWhetherTheNewUser;
        }

        public void setReinstallWhetherTheNewUser(String ReinstallWhetherTheNewUser) {
            this.ReinstallWhetherTheNewUser = ReinstallWhetherTheNewUser;
        }

        public String getRushHour() {
            return RushHour;
        }

        public void setRushHour(String RushHour) {
            this.RushHour = RushHour;
        }

        public String getShareCountMax() {
            return ShareCountMax;
        }

        public void setShareCountMax(String ShareCountMax) {
            this.ShareCountMax = ShareCountMax;
        }

        public String getShareLink() {
            return ShareLink;
        }

        public void setShareLink(String ShareLink) {
            this.ShareLink = ShareLink;
        }

        public String getSharePicture() {
            return SharePicture;
        }

        public void setSharePicture(String SharePicture) {
            this.SharePicture = SharePicture;
        }

        public String getShareRestrict() {
            return ShareRestrict;
        }

        public void setShareRestrict(String ShareRestrict) {
            this.ShareRestrict = ShareRestrict;
        }

        public String getShareTheDescription() {
            return ShareTheDescription;
        }

        public void setShareTheDescription(String ShareTheDescription) {
            this.ShareTheDescription = ShareTheDescription;
        }

        public String getShareType() {
            return ShareType;
        }

        public void setShareType(String ShareType) {
            this.ShareType = ShareType;
        }

        public String getShareUnlock() {
            return ShareUnlock;
        }

        public void setShareUnlock(String ShareUnlock) {
            this.ShareUnlock = ShareUnlock;
        }


        public String getShareUrl2() {
            return ShareUrl2;
        }

        public void setShareUrl2(String ShareUrl2) {
            this.ShareUrl2 = ShareUrl2;
        }

        public String getShowRecommendInterval() {
            return ShowRecommendInterval;
        }

        public void setShowRecommendInterval(String ShowRecommendInterval) {
            this.ShowRecommendInterval = ShowRecommendInterval;
        }

        public String getStorageJudgment() {
            return StorageJudgment;
        }

        public void setStorageJudgment(String StorageJudgment) {
            this.StorageJudgment = StorageJudgment;
        }

        public String getAdinterval_TransformationInterval() {
            return adinterval_TransformationInterval;
        }

        public void setAdinterval_TransformationInterval(String adinterval_TransformationInterval) {
            this.adinterval_TransformationInterval = adinterval_TransformationInterval;
        }

        public String getAdinterval_buffer() {
            return adinterval_buffer;
        }

        public void setAdinterval_buffer(String adinterval_buffer) {
            this.adinterval_buffer = adinterval_buffer;
        }

        public String getAdinterval_download() {
            return adinterval_download;
        }

        public void setAdinterval_download(String adinterval_download) {
            this.adinterval_download = adinterval_download;
        }

        public String getAdinterval_guide() {
            return adinterval_guide;
        }

        public void setAdinterval_guide(String adinterval_guide) {
            this.adinterval_guide = adinterval_guide;
        }

        public String getAdinterval_list() {
            return adinterval_list;
        }

        public void setAdinterval_list(String adinterval_list) {
            this.adinterval_list = adinterval_list;
        }

        public String getAdinterval_listtop() {
            return adinterval_listtop;
        }

        public void setAdinterval_listtop(String adinterval_listtop) {
            this.adinterval_listtop = adinterval_listtop;
        }

        public String getAdinterval_setup() {
            return adinterval_setup;
        }

        public void setAdinterval_setup(String adinterval_setup) {
            this.adinterval_setup = adinterval_setup;
        }

        public String getAdinterval_suspend() {
            return adinterval_suspend;
        }

        public void setAdinterval_suspend(String adinterval_suspend) {
            this.adinterval_suspend = adinterval_suspend;
        }

        public String getAdtime_buffer() {
            return adtime_buffer;
        }

        public void setAdtime_buffer(String adtime_buffer) {
            this.adtime_buffer = adtime_buffer;
        }

        public String getAdtime_download() {
            return adtime_download;
        }

        public void setAdtime_download(String adtime_download) {
            this.adtime_download = adtime_download;
        }

        public String getAdtime_guide() {
            return adtime_guide;
        }

        public void setAdtime_guide(String adtime_guide) {
            this.adtime_guide = adtime_guide;
        }

        public String getAdtime_list() {
            return adtime_list;
        }

        public void setAdtime_list(String adtime_list) {
            this.adtime_list = adtime_list;
        }

        public String getAdtime_listtop() {
            return adtime_listtop;
        }

        public void setAdtime_listtop(String adtime_listtop) {
            this.adtime_listtop = adtime_listtop;
        }

        public String getAdtime_setup() {
            return adtime_setup;
        }

        public void setAdtime_setup(String adtime_setup) {
            this.adtime_setup = adtime_setup;
        }

        public String getAdtime_suspend() {
            return adtime_suspend;
        }

        public void setAdtime_suspend(String adtime_suspend) {
            this.adtime_suspend = adtime_suspend;
        }

        public String getAdv_compatible() {
            return adv_compatible;
        }

        public void setAdv_compatible(String adv_compatible) {
            this.adv_compatible = adv_compatible;
        }

        public String getAdv_loadinterval() {
            return adv_loadinterval;
        }

        public void setAdv_loadinterval(String adv_loadinterval) {
            this.adv_loadinterval = adv_loadinterval;
        }

        public String getAdv_notshow() {
            return adv_notshow;
        }

        public void setAdv_notshow(String adv_notshow) {
            this.adv_notshow = adv_notshow;
        }

        public String getAdv_viewinterval() {
            return adv_viewinterval;
        }

        public void setAdv_viewinterval(String adv_viewinterval) {
            this.adv_viewinterval = adv_viewinterval;
        }

        public String getAdvb_viewtime() {
            return advb_viewtime;
        }

        public void setAdvb_viewtime(String advb_viewtime) {
            this.advb_viewtime = advb_viewtime;
        }

        public String getAftershare() {
            return aftershare;
        }

        public void setAftershare(String aftershare) {
            this.aftershare = aftershare;
        }

        public String getAiqiyiinter() {
            return aiqiyiinter;
        }

        public void setAiqiyiinter(String aiqiyiinter) {
            this.aiqiyiinter = aiqiyiinter;
        }

        public String getAiqiyikey() {
            return aiqiyikey;
        }

        public void setAiqiyikey(String aiqiyikey) {
            this.aiqiyikey = aiqiyikey;
        }

        public String getBufferswitch() {
            return bufferswitch;
        }

        public void setBufferswitch(String bufferswitch) {
            this.bufferswitch = bufferswitch;
        }

        public String getDianzancount() {
            return dianzancount;
        }

        public void setDianzancount(String dianzancount) {
            this.dianzancount = dianzancount;
        }

        public String getDianzandays() {
            return dianzandays;
        }

        public void setDianzandays(String dianzandays) {
            this.dianzandays = dianzandays;
        }

        public String getDisplayshare() {
            return displayshare;
        }

        public void setDisplayshare(String displayshare) {
            this.displayshare = displayshare;
        }

        public String getDisplayshare2() {
            return displayshare2;
        }

        public void setDisplayshare2(String displayshare2) {
            this.displayshare2 = displayshare2;
        }

        public String getFxDate() {
            return fxDate;
        }

        public void setFxDate(String fxDate) {
            this.fxDate = fxDate;
        }

        public String getHaopingDays() {
            return haopingDays;
        }

        public void setHaopingDays(String haopingDays) {
            this.haopingDays = haopingDays;
        }

        public String getHaopingSwitch() {
            return haopingSwitch;
        }

        public void setHaopingSwitch(String haopingSwitch) {
            this.haopingSwitch = haopingSwitch;
        }

        public String getIntervalshare() {
            return intervalshare;
        }

        public void setIntervalshare(String intervalshare) {
            this.intervalshare = intervalshare;
        }

        public String getIntervalshare2() {
            return intervalshare2;
        }

        public void setIntervalshare2(String intervalshare2) {
            this.intervalshare2 = intervalshare2;
        }

        public String getIsjiexi() {
            return isjiexi;
        }

        public void setIsjiexi(String isjiexi) {
            this.isjiexi = isjiexi;
        }

        public String getLepancookies() {
            return lepancookies;
        }

        public void setLepancookies(String lepancookies) {
            this.lepancookies = lepancookies;
        }

        public String getMm3price() {
            return mm3price;
        }

        public void setMm3price(String mm3price) {
            this.mm3price = mm3price;
        }

        public String getMmprice() {
            return mmprice;
        }

        public void setMmprice(String mmprice) {
            this.mmprice = mmprice;
        }

        public String getQiandaojiangli() {
            return qiandaojiangli;
        }

        public void setQiandaojiangli(String qiandaojiangli) {
            this.qiandaojiangli = qiandaojiangli;
        }


        public String getShareid() {
            return shareid;
        }

        public void setShareid(String shareid) {
            this.shareid = shareid;
        }

        public String getSsotk() {
            return ssotk;
        }

        public void setSsotk(String ssotk) {
            this.ssotk = ssotk;
        }

        public String getTime_lun() {
            return time_lun;
        }

        public void setTime_lun(String time_lun) {
            this.time_lun = time_lun;
        }

        public String getTjDate() {
            return tjDate;
        }

        public void setTjDate(String tjDate) {
            this.tjDate = tjDate;
        }

        public String getVideoAnalysisMd5() {
            return videoAnalysisMd5;
        }

        public void setVideoAnalysisMd5(String videoAnalysisMd5) {
            this.videoAnalysisMd5 = videoAnalysisMd5;
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

        public String getXingbi_dui_huiyuan() {
            return xingbi_dui_huiyuan;
        }

        public void setXingbi_dui_huiyuan(String xingbi_dui_huiyuan) {
            this.xingbi_dui_huiyuan = xingbi_dui_huiyuan;
        }
    }
}
