(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/dongmanshipin/add-or-update"],{"2e44":function(e,n,t){"use strict";t.r(n);var r=t("8dd2"),i=t.n(r);for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);n["default"]=i.a},"82d8":function(e,n,t){"use strict";var r=t("9132"),i=t.n(r);i.a},"8dd2":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=i(t("a34a"));function i(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,r,i,a,u){try{var o=e[a](u),c=o.value}catch(s){return void t(s)}o.done?n(c):Promise.resolve(c).then(r,i)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(r,i){var u=e.apply(n,t);function o(e){a(u,r,i,o,c,"next",e)}function c(e){a(u,r,i,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("efdb"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{cross:"",ruleForm:{dongmanmingcheng:"",dongmanfenlei:"",zhangjie:"",biaoqian:"",tupian:"",zhuangtai:"",zuozhe:"",shipin:"",gengxinriqi:"",neirongjieshao:""},dongmanfenleiOptions:[],dongmanfenleiIndex:0,zhuangtaiOptions:[],zhuangtaiIndex:0,user:{},ro:{dongmanmingcheng:!1,dongmanfenlei:!1,zhangjie:!1,biaoqian:!1,tupian:!1,zhuangtai:!1,zuozhe:!1,shipin:!1,gengxinriqi:!1,neirongjieshao:!1,clicktime:!1,clicknum:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var t=this;return u(r.default.mark((function i(){var a,u,o,c;return r.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return t.ruleForm.gengxinriqi=t.$utils.getCurDateTime(),a=e.getStorageSync("nowTable"),i.next=4,t.$api.session(a);case 4:return u=i.sent,t.user=u.data,i.next=8,t.$api.option("dongmanfenlei","dongmanfenlei",{});case 8:if(u=i.sent,t.dongmanfenleiOptions=u.data,t.zhuangtaiOptions="更新中,已完结".split(","),t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){i.next=19;break}return t.ruleForm.id=n.id,i.next=17,t.$api.info("dongmanshipin",t.ruleForm.id);case 17:u=i.sent,t.ruleForm=u.data;case 19:if(t.cross=n.cross,!n.cross){i.next=75;break}o=e.getStorageSync("crossObj"),i.t0=r.default.keys(o);case 23:if((i.t1=i.t0()).done){i.next=75;break}if(c=i.t1.value,"dongmanmingcheng"!=c){i.next=29;break}return t.ruleForm.dongmanmingcheng=o[c],t.ro.dongmanmingcheng=!0,i.abrupt("continue",23);case 29:if("dongmanfenlei"!=c){i.next=33;break}return t.ruleForm.dongmanfenlei=o[c],t.ro.dongmanfenlei=!0,i.abrupt("continue",23);case 33:if("zhangjie"!=c){i.next=37;break}return t.ruleForm.zhangjie=o[c],t.ro.zhangjie=!0,i.abrupt("continue",23);case 37:if("biaoqian"!=c){i.next=41;break}return t.ruleForm.biaoqian=o[c],t.ro.biaoqian=!0,i.abrupt("continue",23);case 41:if("tupian"!=c){i.next=45;break}return t.ruleForm.tupian=o[c],t.ro.tupian=!0,i.abrupt("continue",23);case 45:if("zhuangtai"!=c){i.next=49;break}return t.ruleForm.zhuangtai=o[c],t.ro.zhuangtai=!0,i.abrupt("continue",23);case 49:if("zuozhe"!=c){i.next=53;break}return t.ruleForm.zuozhe=o[c],t.ro.zuozhe=!0,i.abrupt("continue",23);case 53:if("shipin"!=c){i.next=57;break}return t.ruleForm.shipin=o[c],t.ro.shipin=!0,i.abrupt("continue",23);case 57:if("gengxinriqi"!=c){i.next=61;break}return t.ruleForm.gengxinriqi=o[c],t.ro.gengxinriqi=!0,i.abrupt("continue",23);case 61:if("neirongjieshao"!=c){i.next=65;break}return t.ruleForm.neirongjieshao=o[c],t.ro.neirongjieshao=!0,i.abrupt("continue",23);case 65:if("clicktime"!=c){i.next=69;break}return t.ruleForm.clicktime=o[c],t.ro.clicktime=!0,i.abrupt("continue",23);case 69:if("clicknum"!=c){i.next=73;break}return t.ruleForm.clicknum=o[c],t.ro.clicknum=!0,i.abrupt("continue",23);case 73:i.next=23;break;case 75:t.styleChange();case 76:case"end":return i.stop()}}),i)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},gengxinriqiConfirm:function(e){console.log(e),this.ruleForm.gengxinriqi=e.result,this.$forceUpdate()},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},dongmanfenleiChange:function(e){this.dongmanfenleiIndex=e.target.value,this.ruleForm.dongmanfenlei=this.dongmanfenleiOptions[this.dongmanfenleiIndex]},zhuangtaiChange:function(e){this.zhuangtaiIndex=e.target.value,this.ruleForm.zhuangtai=this.zhuangtaiOptions[this.zhuangtaiIndex]},tupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.tupian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},shipinTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.shipin="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(r.default.mark((function t(){var i,a,u,o,c,s,l,f,g,d;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n.ruleForm.dongmanmingcheng){t.next=3;break}return n.$utils.msg("动漫名称不能为空"),t.abrupt("return");case 3:if(n.ruleForm.dongmanfenlei){t.next=6;break}return n.$utils.msg("动漫分类不能为空"),t.abrupt("return");case 6:if(n.ruleForm.biaoqian){t.next=9;break}return n.$utils.msg("标签不能为空"),t.abrupt("return");case 9:if(!n.ruleForm.clicknum||n.$validate.isIntNumer(n.ruleForm.clicknum)){t.next=12;break}return n.$utils.msg("点击次数应输入整数"),t.abrupt("return");case 12:if(!n.cross){t.next=28;break}if(o=e.getStorageSync("statusColumnName"),c=e.getStorageSync("statusColumnValue"),""==o){t.next=28;break}if(s=e.getStorageSync("crossObj"),o.startsWith("[")){t.next=24;break}for(l in s)l==o&&(s[l]=c);return f=e.getStorageSync("crossTable"),t.next=22,n.$api.update("".concat(f),s);case 22:t.next=28;break;case 24:i=Number(e.getStorageSync("userid")),a=s["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 28:if(!a||!i){t.next=50;break}return n.ruleForm.crossuserid=i,n.ruleForm.crossrefid=a,g={page:1,limit:10,crossuserid:i,crossrefid:a},t.next=34,n.$api.list("dongmanshipin",g);case 34:if(d=t.sent,!(d.data.total>=u)){t.next=40;break}return n.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 40:if(!n.ruleForm.id){t.next=45;break}return t.next=43,n.$api.update("dongmanshipin",n.ruleForm);case 43:t.next=47;break;case 45:return t.next=47,n.$api.add("dongmanshipin",n.ruleForm);case 47:n.$utils.msgBack("提交成功");case 48:t.next=58;break;case 50:if(!n.ruleForm.id){t.next=55;break}return t.next=53,n.$api.update("dongmanshipin",n.ruleForm);case 53:t.next=57;break;case 55:return t.next=57,n.$api.add("dongmanshipin",n.ruleForm);case 57:n.$utils.msgBack("提交成功");case 58:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,i=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,i=i>9?i:"0"+i,"".concat(t,"-").concat(r,"-").concat(i)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},9132:function(e,n,t){},"9b51":function(e,n,t){"use strict";t.r(n);var r=t("c4c1"),i=t("2e44");for(var a in i)"default"!==a&&function(e){t.d(n,e,(function(){return i[e]}))}(a);t("82d8");var u,o=t("f0c5"),c=Object(o["a"])(i["default"],r["b"],r["c"],!1,null,"13c756f2",null,!1,r["a"],u);n["default"]=c.exports},c4c1:function(e,n,t){"use strict";t.d(n,"b",(function(){return i})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return r}));var r={wPicker:function(){return Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(t.bind(null,"efdb"))}},i=function(){var e=this,n=e.$createElement;e._self._c},a=[]},e11c:function(e,n,t){"use strict";(function(e){t("21f6");r(t("66fd"));var n=r(t("9b51"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])}},[["e11c","common/runtime","common/vendor"]]]);