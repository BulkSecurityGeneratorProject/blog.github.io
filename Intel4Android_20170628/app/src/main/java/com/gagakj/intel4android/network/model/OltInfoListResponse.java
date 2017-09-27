package com.gagakj.intel4android.network.model;

import java.io.Serializable;
import java.util.List;

/**
 * 当前类注释:OLT信息列表
 * 项目名：Intel4Android
 * 包名：com.gagakj.intel4android.network.model
 * 作者：江清清 on 2017/6/15 16:12
 * 邮箱：jiangqq@gagakj.com
 * QQ： 781931404
 * 公司：南通嘎嘎软件科技有限公司
 * 站点:<a href="http://www.gagakj.com">www.gagakj.com</a>
 */


public class OltInfoListResponse implements IModel ,Serializable{

    /**
     * results : [{"bizEponOltUpdocList":[],"bizOltGcInfoList":[{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470614,"obd":"obd8","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470613,"obd":"obd7","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470612,"obd":"obd6","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470611,"obd":"obd5","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470610,"obd":"obd4","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470609,"obd":"obd3","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470608,"obd":"obd2","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470607,"obd":"obd1","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470606,"obd":"obd8","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470605,"obd":"obd7","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470604,"obd":"obd6","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470603,"obd":"obd5","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470602,"obd":"obd4","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470601,"obd":"obd3","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470600,"obd":"obd2","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470599,"obd":"obd1","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"}],"bizOltInfoSubList":[],"bizOltUpinfoList":[],"bizOltWebserviceLogList":[],"bzywcssftg":"","createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"csjl":"","csrq":"2017-06-21","dkodfwz1":"","dkodfwz2":"","docname":"","docnameObjects":[],"docnameRk":"","docnameRkObjects":[],"docstuts":"","docstutsRk":"","dypdfwz":"","fax":"","fggl1":"","fggl2":"","gclx":"新建","geDkNum":"","gipsfkd":"","gllbh1":"","gllbh2":"","id":10000010470598,"ifdown":"","ifdownRk":"","iptv":"","issave":"","isstart":"","jjnsfyl":"","kycwdksfpz":"","lxdh":"","nfzctjwy":"","oltAddress":"1","oltBz":"","oltCname":"高东T1-HW5800-OLT20","oltGipAddress":"","oltNipAddress":"10.4.24.113","oltSjiptvslfx":"","oltYyslfx":"","oltrjbb":"","oltzs":"HW5800","pingcssfzc":"","ponBkcwh":"1/19/n/01,1/19/n/03","ponBkxh":"","ponDkNum":"","ponJsKrNum":"","proId":10000010470004,"prosn":"OLT002","savedname":"","savednameRk":"","savepath":"","sbazsffh":"","sbbzsffh":"","sfzdqh1":"","sfzdqh2":"","sggl1":"","sggl2":"","sjpzsfwc":"","slBkcwh":"","slBkxh":"","slJsKrNum":"","sljhjcdk1":"","sljhjcdk2":"","sljhjdkodf1":"","sljhjdkodf2":"","sn":"1","swyw":"","tdm":"","updateBy":0,"updateby":0,"updatetime":null,"vpn":"","wWlan":"132","wfname":"","xlfssfgf":"","xmlxr":"","yhlx":"A类普通型OLT","yjyw":"","zbrq":"2017-06-20"}]
     * totalCounts : 1
     */

    private int totalCounts;
    private List<ResultsBean> results;

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Serializable {
        /**
         * bizEponOltUpdocList : []
         * bizOltGcInfoList : [{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470614,"obd":"obd8","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470613,"obd":"obd7","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470612,"obd":"obd6","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470611,"obd":"obd5","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470610,"obd":"obd4","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470609,"obd":"obd3","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470608,"obd":"obd2","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470607,"obd":"obd1","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/03","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470606,"obd":"obd8","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470605,"obd":"obd7","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470604,"obd":"obd6","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470603,"obd":"obd5","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470602,"obd":"obd4","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470601,"obd":"obd3","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470600,"obd":"obd2","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"},{"createBy":1,"createby":0,"createtime":{"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117},"id":10000010470599,"obd":"obd1","oltCname":"高东T1-HW5800-OLT20","oltFggl":"","oltId":10000010470598,"oltIp":"10.4.24.113","oltSggl":"","onuFggl":"","onuSggl":"","ponPort":"1/19/n/01","pvcWWlan":"","result":"未挂测","updateBy":0,"updateby":0,"updatetime":null,"wWlan":"132"}]
         * bizOltInfoSubList : []
         * bizOltUpinfoList : []
         * bizOltWebserviceLogList : []
         * bzywcssftg :
         * createBy : 1
         * createby : 0
         * createtime : {"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117}
         * csjl :
         * csrq : 2017-06-21
         * dkodfwz1 :
         * dkodfwz2 :
         * docname :
         * docnameObjects : []
         * docnameRk :
         * docnameRkObjects : []
         * docstuts :
         * docstutsRk :
         * dypdfwz :
         * fax :
         * fggl1 :
         * fggl2 :
         * gclx : 新建
         * geDkNum :
         * gipsfkd :
         * gllbh1 :
         * gllbh2 :
         * id : 10000010470598
         * ifdown :
         * ifdownRk :
         * iptv :
         * issave :
         * isstart :
         * jjnsfyl :
         * kycwdksfpz :
         * lxdh :
         * nfzctjwy :
         * oltAddress : 1
         * oltBz :
         * oltCname : 高东T1-HW5800-OLT20
         * oltGipAddress :
         * oltNipAddress : 10.4.24.113
         * oltSjiptvslfx :
         * oltYyslfx :
         * oltrjbb :
         * oltzs : HW5800
         * pingcssfzc :
         * ponBkcwh : 1/19/n/01,1/19/n/03
         * ponBkxh :
         * ponDkNum :
         * ponJsKrNum :
         * proId : 10000010470004
         * prosn : OLT002
         * savedname :
         * savednameRk :
         * savepath :
         * sbazsffh :
         * sbbzsffh :
         * sfzdqh1 :
         * sfzdqh2 :
         * sggl1 :
         * sggl2 :
         * sjpzsfwc :
         * slBkcwh :
         * slBkxh :
         * slJsKrNum :
         * sljhjcdk1 :
         * sljhjcdk2 :
         * sljhjdkodf1 :
         * sljhjdkodf2 :
         * sn : 1
         * swyw :
         * tdm :
         * updateBy : 0
         * updateby : 0
         * updatetime : null
         * vpn :
         * wWlan : 132
         * wfname :
         * xlfssfgf :
         * xmlxr :
         * yhlx : A类普通型OLT
         * yjyw :
         * zbrq : 2017-06-20
         */

        private String bzywcssftg;
        private int createBy;
        private int createby;
        private CreatetimeBean createtime;
        private String csjl;
        private String csrq;
        private String dkodfwz1;
        private String dkodfwz2;
        private String docname;
        private String docnameRk;
        private String docstuts;
        private String docstutsRk;
        private String dypdfwz;
        private String fax;
        private String fggl1;
        private String fggl2;
        private String gclx;
        private String geDkNum;
        private String gipsfkd;
        private String gllbh1;
        private String gllbh2;
        private long id;
        private String ifdown;
        private String ifdownRk;
        private String iptv;
        private String issave;
        private String isstart;
        private String jjnsfyl;
        private String kycwdksfpz;
        private String lxdh;
        private String nfzctjwy;
        private String oltAddress;
        private String oltBz;
        private String oltCname;
        private String oltGipAddress;
        private String oltNipAddress;
        private String oltSjiptvslfx;
        private String oltYyslfx;
        private String oltrjbb;
        private String oltzs;
        private String pingcssfzc;
        private String ponBkcwh;
        private String ponBkxh;
        private String ponDkNum;
        private String ponJsKrNum;
        private long proId;
        private String prosn;
        private String savedname;
        private String savednameRk;
        private String savepath;
        private String sbazsffh;
        private String sbbzsffh;
        private String sfzdqh1;
        private String sfzdqh2;
        private String sggl1;
        private String sggl2;
        private String sjpzsfwc;
        private String slBkcwh;
        private String slBkxh;
        private String slJsKrNum;
        private String sljhjcdk1;
        private String sljhjcdk2;
        private String sljhjdkodf1;
        private String sljhjdkodf2;
        private String sn;
        private String swyw;
        private String tdm;
        private int updateBy;
        private int updateby;
        private Object updatetime;
        private String vpn;
        private String wWlan;
        private String wfname;
        private String xlfssfgf;
        private String xmlxr;
        private String yhlx;
        private String yjyw;
        private String zbrq;
        private List<?> bizEponOltUpdocList;
        private List<BizOltGcInfoListBean> bizOltGcInfoList;
        private List<?> bizOltInfoSubList;
        private List<?> bizOltUpinfoList;
        private List<?> bizOltWebserviceLogList;
        private List<?> docnameObjects;
        private List<?> docnameRkObjects;

        public String getBzywcssftg() {
            return bzywcssftg;
        }

        public void setBzywcssftg(String bzywcssftg) {
            this.bzywcssftg = bzywcssftg;
        }

        public int getCreateBy() {
            return createBy;
        }

        public void setCreateBy(int createBy) {
            this.createBy = createBy;
        }

        public int getCreateby() {
            return createby;
        }

        public void setCreateby(int createby) {
            this.createby = createby;
        }

        public CreatetimeBean getCreatetime() {
            return createtime;
        }

        public void setCreatetime(CreatetimeBean createtime) {
            this.createtime = createtime;
        }

        public String getCsjl() {
            return csjl;
        }

        public void setCsjl(String csjl) {
            this.csjl = csjl;
        }

        public String getCsrq() {
            return csrq;
        }

        public void setCsrq(String csrq) {
            this.csrq = csrq;
        }

        public String getDkodfwz1() {
            return dkodfwz1;
        }

        public void setDkodfwz1(String dkodfwz1) {
            this.dkodfwz1 = dkodfwz1;
        }

        public String getDkodfwz2() {
            return dkodfwz2;
        }

        public void setDkodfwz2(String dkodfwz2) {
            this.dkodfwz2 = dkodfwz2;
        }

        public String getDocname() {
            return docname;
        }

        public void setDocname(String docname) {
            this.docname = docname;
        }

        public String getDocnameRk() {
            return docnameRk;
        }

        public void setDocnameRk(String docnameRk) {
            this.docnameRk = docnameRk;
        }

        public String getDocstuts() {
            return docstuts;
        }

        public void setDocstuts(String docstuts) {
            this.docstuts = docstuts;
        }

        public String getDocstutsRk() {
            return docstutsRk;
        }

        public void setDocstutsRk(String docstutsRk) {
            this.docstutsRk = docstutsRk;
        }

        public String getDypdfwz() {
            return dypdfwz;
        }

        public void setDypdfwz(String dypdfwz) {
            this.dypdfwz = dypdfwz;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getFggl1() {
            return fggl1;
        }

        public void setFggl1(String fggl1) {
            this.fggl1 = fggl1;
        }

        public String getFggl2() {
            return fggl2;
        }

        public void setFggl2(String fggl2) {
            this.fggl2 = fggl2;
        }

        public String getGclx() {
            return gclx;
        }

        public void setGclx(String gclx) {
            this.gclx = gclx;
        }

        public String getGeDkNum() {
            return geDkNum;
        }

        public void setGeDkNum(String geDkNum) {
            this.geDkNum = geDkNum;
        }

        public String getGipsfkd() {
            return gipsfkd;
        }

        public void setGipsfkd(String gipsfkd) {
            this.gipsfkd = gipsfkd;
        }

        public String getGllbh1() {
            return gllbh1;
        }

        public void setGllbh1(String gllbh1) {
            this.gllbh1 = gllbh1;
        }

        public String getGllbh2() {
            return gllbh2;
        }

        public void setGllbh2(String gllbh2) {
            this.gllbh2 = gllbh2;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getIfdown() {
            return ifdown;
        }

        public void setIfdown(String ifdown) {
            this.ifdown = ifdown;
        }

        public String getIfdownRk() {
            return ifdownRk;
        }

        public void setIfdownRk(String ifdownRk) {
            this.ifdownRk = ifdownRk;
        }

        public String getIptv() {
            return iptv;
        }

        public void setIptv(String iptv) {
            this.iptv = iptv;
        }

        public String getIssave() {
            return issave;
        }

        public void setIssave(String issave) {
            this.issave = issave;
        }

        public String getIsstart() {
            return isstart;
        }

        public void setIsstart(String isstart) {
            this.isstart = isstart;
        }

        public String getJjnsfyl() {
            return jjnsfyl;
        }

        public void setJjnsfyl(String jjnsfyl) {
            this.jjnsfyl = jjnsfyl;
        }

        public String getKycwdksfpz() {
            return kycwdksfpz;
        }

        public void setKycwdksfpz(String kycwdksfpz) {
            this.kycwdksfpz = kycwdksfpz;
        }

        public String getLxdh() {
            return lxdh;
        }

        public void setLxdh(String lxdh) {
            this.lxdh = lxdh;
        }

        public String getNfzctjwy() {
            return nfzctjwy;
        }

        public void setNfzctjwy(String nfzctjwy) {
            this.nfzctjwy = nfzctjwy;
        }

        public String getOltAddress() {
            return oltAddress;
        }

        public void setOltAddress(String oltAddress) {
            this.oltAddress = oltAddress;
        }

        public String getOltBz() {
            return oltBz;
        }

        public void setOltBz(String oltBz) {
            this.oltBz = oltBz;
        }

        public String getOltCname() {
            return oltCname;
        }

        public void setOltCname(String oltCname) {
            this.oltCname = oltCname;
        }

        public String getOltGipAddress() {
            return oltGipAddress;
        }

        public void setOltGipAddress(String oltGipAddress) {
            this.oltGipAddress = oltGipAddress;
        }

        public String getOltNipAddress() {
            return oltNipAddress;
        }

        public void setOltNipAddress(String oltNipAddress) {
            this.oltNipAddress = oltNipAddress;
        }

        public String getOltSjiptvslfx() {
            return oltSjiptvslfx;
        }

        public void setOltSjiptvslfx(String oltSjiptvslfx) {
            this.oltSjiptvslfx = oltSjiptvslfx;
        }

        public String getOltYyslfx() {
            return oltYyslfx;
        }

        public void setOltYyslfx(String oltYyslfx) {
            this.oltYyslfx = oltYyslfx;
        }

        public String getOltrjbb() {
            return oltrjbb;
        }

        public void setOltrjbb(String oltrjbb) {
            this.oltrjbb = oltrjbb;
        }

        public String getOltzs() {
            return oltzs;
        }

        public void setOltzs(String oltzs) {
            this.oltzs = oltzs;
        }

        public String getPingcssfzc() {
            return pingcssfzc;
        }

        public void setPingcssfzc(String pingcssfzc) {
            this.pingcssfzc = pingcssfzc;
        }

        public String getPonBkcwh() {
            return ponBkcwh;
        }

        public void setPonBkcwh(String ponBkcwh) {
            this.ponBkcwh = ponBkcwh;
        }

        public String getPonBkxh() {
            return ponBkxh;
        }

        public void setPonBkxh(String ponBkxh) {
            this.ponBkxh = ponBkxh;
        }

        public String getPonDkNum() {
            return ponDkNum;
        }

        public void setPonDkNum(String ponDkNum) {
            this.ponDkNum = ponDkNum;
        }

        public String getPonJsKrNum() {
            return ponJsKrNum;
        }

        public void setPonJsKrNum(String ponJsKrNum) {
            this.ponJsKrNum = ponJsKrNum;
        }

        public long getProId() {
            return proId;
        }

        public void setProId(long proId) {
            this.proId = proId;
        }

        public String getProsn() {
            return prosn;
        }

        public void setProsn(String prosn) {
            this.prosn = prosn;
        }

        public String getSavedname() {
            return savedname;
        }

        public void setSavedname(String savedname) {
            this.savedname = savedname;
        }

        public String getSavednameRk() {
            return savednameRk;
        }

        public void setSavednameRk(String savednameRk) {
            this.savednameRk = savednameRk;
        }

        public String getSavepath() {
            return savepath;
        }

        public void setSavepath(String savepath) {
            this.savepath = savepath;
        }

        public String getSbazsffh() {
            return sbazsffh;
        }

        public void setSbazsffh(String sbazsffh) {
            this.sbazsffh = sbazsffh;
        }

        public String getSbbzsffh() {
            return sbbzsffh;
        }

        public void setSbbzsffh(String sbbzsffh) {
            this.sbbzsffh = sbbzsffh;
        }

        public String getSfzdqh1() {
            return sfzdqh1;
        }

        public void setSfzdqh1(String sfzdqh1) {
            this.sfzdqh1 = sfzdqh1;
        }

        public String getSfzdqh2() {
            return sfzdqh2;
        }

        public void setSfzdqh2(String sfzdqh2) {
            this.sfzdqh2 = sfzdqh2;
        }

        public String getSggl1() {
            return sggl1;
        }

        public void setSggl1(String sggl1) {
            this.sggl1 = sggl1;
        }

        public String getSggl2() {
            return sggl2;
        }

        public void setSggl2(String sggl2) {
            this.sggl2 = sggl2;
        }

        public String getSjpzsfwc() {
            return sjpzsfwc;
        }

        public void setSjpzsfwc(String sjpzsfwc) {
            this.sjpzsfwc = sjpzsfwc;
        }

        public String getSlBkcwh() {
            return slBkcwh;
        }

        public void setSlBkcwh(String slBkcwh) {
            this.slBkcwh = slBkcwh;
        }

        public String getSlBkxh() {
            return slBkxh;
        }

        public void setSlBkxh(String slBkxh) {
            this.slBkxh = slBkxh;
        }

        public String getSlJsKrNum() {
            return slJsKrNum;
        }

        public void setSlJsKrNum(String slJsKrNum) {
            this.slJsKrNum = slJsKrNum;
        }

        public String getSljhjcdk1() {
            return sljhjcdk1;
        }

        public void setSljhjcdk1(String sljhjcdk1) {
            this.sljhjcdk1 = sljhjcdk1;
        }

        public String getSljhjcdk2() {
            return sljhjcdk2;
        }

        public void setSljhjcdk2(String sljhjcdk2) {
            this.sljhjcdk2 = sljhjcdk2;
        }

        public String getSljhjdkodf1() {
            return sljhjdkodf1;
        }

        public void setSljhjdkodf1(String sljhjdkodf1) {
            this.sljhjdkodf1 = sljhjdkodf1;
        }

        public String getSljhjdkodf2() {
            return sljhjdkodf2;
        }

        public void setSljhjdkodf2(String sljhjdkodf2) {
            this.sljhjdkodf2 = sljhjdkodf2;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String getSwyw() {
            return swyw;
        }

        public void setSwyw(String swyw) {
            this.swyw = swyw;
        }

        public String getTdm() {
            return tdm;
        }

        public void setTdm(String tdm) {
            this.tdm = tdm;
        }

        public int getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(int updateBy) {
            this.updateBy = updateBy;
        }

        public int getUpdateby() {
            return updateby;
        }

        public void setUpdateby(int updateby) {
            this.updateby = updateby;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public String getVpn() {
            return vpn;
        }

        public void setVpn(String vpn) {
            this.vpn = vpn;
        }

        public String getWWlan() {
            return wWlan;
        }

        public void setWWlan(String wWlan) {
            this.wWlan = wWlan;
        }

        public String getWfname() {
            return wfname;
        }

        public void setWfname(String wfname) {
            this.wfname = wfname;
        }

        public String getXlfssfgf() {
            return xlfssfgf;
        }

        public void setXlfssfgf(String xlfssfgf) {
            this.xlfssfgf = xlfssfgf;
        }

        public String getXmlxr() {
            return xmlxr;
        }

        public void setXmlxr(String xmlxr) {
            this.xmlxr = xmlxr;
        }

        public String getYhlx() {
            return yhlx;
        }

        public void setYhlx(String yhlx) {
            this.yhlx = yhlx;
        }

        public String getYjyw() {
            return yjyw;
        }

        public void setYjyw(String yjyw) {
            this.yjyw = yjyw;
        }

        public String getZbrq() {
            return zbrq;
        }

        public void setZbrq(String zbrq) {
            this.zbrq = zbrq;
        }

        public List<?> getBizEponOltUpdocList() {
            return bizEponOltUpdocList;
        }

        public void setBizEponOltUpdocList(List<?> bizEponOltUpdocList) {
            this.bizEponOltUpdocList = bizEponOltUpdocList;
        }

        public List<BizOltGcInfoListBean> getBizOltGcInfoList() {
            return bizOltGcInfoList;
        }

        public void setBizOltGcInfoList(List<BizOltGcInfoListBean> bizOltGcInfoList) {
            this.bizOltGcInfoList = bizOltGcInfoList;
        }

        public List<?> getBizOltInfoSubList() {
            return bizOltInfoSubList;
        }

        public void setBizOltInfoSubList(List<?> bizOltInfoSubList) {
            this.bizOltInfoSubList = bizOltInfoSubList;
        }

        public List<?> getBizOltUpinfoList() {
            return bizOltUpinfoList;
        }

        public void setBizOltUpinfoList(List<?> bizOltUpinfoList) {
            this.bizOltUpinfoList = bizOltUpinfoList;
        }

        public List<?> getBizOltWebserviceLogList() {
            return bizOltWebserviceLogList;
        }

        public void setBizOltWebserviceLogList(List<?> bizOltWebserviceLogList) {
            this.bizOltWebserviceLogList = bizOltWebserviceLogList;
        }

        public List<?> getDocnameObjects() {
            return docnameObjects;
        }

        public void setDocnameObjects(List<?> docnameObjects) {
            this.docnameObjects = docnameObjects;
        }

        public List<?> getDocnameRkObjects() {
            return docnameRkObjects;
        }

        public void setDocnameRkObjects(List<?> docnameRkObjects) {
            this.docnameRkObjects = docnameRkObjects;
        }

        public static class CreatetimeBean {
            /**
             * date : 20
             * day : 2
             * hours : 13
             * minutes : 44
             * month : 5
             * seconds : 30
             * time : 1497937470000
             * timezoneOffset : -480
             * year : 117
             */

            private int date;
            private int day;
            private int hours;
            private int minutes;
            private int month;
            private int seconds;
            private long time;
            private int timezoneOffset;
            private int year;

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getTimezoneOffset() {
                return timezoneOffset;
            }

            public void setTimezoneOffset(int timezoneOffset) {
                this.timezoneOffset = timezoneOffset;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }

        public static class BizOltGcInfoListBean implements Serializable{
            /**
             * createBy : 1
             * createby : 0
             * createtime : {"date":20,"day":2,"hours":13,"minutes":44,"month":5,"seconds":30,"time":1497937470000,"timezoneOffset":-480,"year":117}
             * id : 10000010470614
             * obd : obd8
             * oltCname : 高东T1-HW5800-OLT20
             * oltFggl :
             * oltId : 10000010470598
             * oltIp : 10.4.24.113
             * oltSggl :
             * onuFggl :
             * onuSggl :
             * ponPort : 1/19/n/03
             * pvcWWlan :
             * result : 未挂测
             * updateBy : 0
             * updateby : 0
             * updatetime : null
             * wWlan : 132
             */

            private int createBy;
            private int createby;
            private CreatetimeBeanX createtime;
            private long id;
            private String obd;
            private String oltCname;
            private String oltFggl;
            private long oltId;
            private String oltIp;
            private String oltSggl;
            private String onuFggl;
            private String onuSggl;
            private String ponPort;
            private String pvcWWlan;
            private String result;
            private int updateBy;
            private int updateby;
            private Object updatetime;
            private String wWlan;

            public int getCreateBy() {
                return createBy;
            }

            public void setCreateBy(int createBy) {
                this.createBy = createBy;
            }

            public int getCreateby() {
                return createby;
            }

            public void setCreateby(int createby) {
                this.createby = createby;
            }

            public CreatetimeBeanX getCreatetime() {
                return createtime;
            }

            public void setCreatetime(CreatetimeBeanX createtime) {
                this.createtime = createtime;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getObd() {
                return obd;
            }

            public void setObd(String obd) {
                this.obd = obd;
            }

            public String getOltCname() {
                return oltCname;
            }

            public void setOltCname(String oltCname) {
                this.oltCname = oltCname;
            }

            public String getOltFggl() {
                return oltFggl;
            }

            public void setOltFggl(String oltFggl) {
                this.oltFggl = oltFggl;
            }

            public long getOltId() {
                return oltId;
            }

            public void setOltId(long oltId) {
                this.oltId = oltId;
            }

            public String getOltIp() {
                return oltIp;
            }

            public void setOltIp(String oltIp) {
                this.oltIp = oltIp;
            }

            public String getOltSggl() {
                return oltSggl;
            }

            public void setOltSggl(String oltSggl) {
                this.oltSggl = oltSggl;
            }

            public String getOnuFggl() {
                return onuFggl;
            }

            public void setOnuFggl(String onuFggl) {
                this.onuFggl = onuFggl;
            }

            public String getOnuSggl() {
                return onuSggl;
            }

            public void setOnuSggl(String onuSggl) {
                this.onuSggl = onuSggl;
            }

            public String getPonPort() {
                return ponPort;
            }

            public void setPonPort(String ponPort) {
                this.ponPort = ponPort;
            }

            public String getPvcWWlan() {
                return pvcWWlan;
            }

            public void setPvcWWlan(String pvcWWlan) {
                this.pvcWWlan = pvcWWlan;
            }

            public String getResult() {
                return result;
            }

            public void setResult(String result) {
                this.result = result;
            }

            public int getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(int updateBy) {
                this.updateBy = updateBy;
            }

            public int getUpdateby() {
                return updateby;
            }

            public void setUpdateby(int updateby) {
                this.updateby = updateby;
            }

            public Object getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(Object updatetime) {
                this.updatetime = updatetime;
            }

            public String getWWlan() {
                return wWlan;
            }

            public void setWWlan(String wWlan) {
                this.wWlan = wWlan;
            }

            public static class CreatetimeBeanX implements Serializable{
                /**
                 * date : 20
                 * day : 2
                 * hours : 13
                 * minutes : 44
                 * month : 5
                 * seconds : 30
                 * time : 1497937470000
                 * timezoneOffset : -480
                 * year : 117
                 */

                private int date;
                private int day;
                private int hours;
                private int minutes;
                private int month;
                private int seconds;
                private long time;
                private int timezoneOffset;
                private int year;

                public int getDate() {
                    return date;
                }

                public void setDate(int date) {
                    this.date = date;
                }

                public int getDay() {
                    return day;
                }

                public void setDay(int day) {
                    this.day = day;
                }

                public int getHours() {
                    return hours;
                }

                public void setHours(int hours) {
                    this.hours = hours;
                }

                public int getMinutes() {
                    return minutes;
                }

                public void setMinutes(int minutes) {
                    this.minutes = minutes;
                }

                public int getMonth() {
                    return month;
                }

                public void setMonth(int month) {
                    this.month = month;
                }

                public int getSeconds() {
                    return seconds;
                }

                public void setSeconds(int seconds) {
                    this.seconds = seconds;
                }

                public long getTime() {
                    return time;
                }

                public void setTime(long time) {
                    this.time = time;
                }

                public int getTimezoneOffset() {
                    return timezoneOffset;
                }

                public void setTimezoneOffset(int timezoneOffset) {
                    this.timezoneOffset = timezoneOffset;
                }

                public int getYear() {
                    return year;
                }

                public void setYear(int year) {
                    this.year = year;
                }
            }
        }
    }
}
