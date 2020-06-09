webpackJsonp([3],{"/uMS":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var l=a("ZLEe"),n=a.n(l),r={data:function(){return{tableData:[],form:{no:"",addname:"",addtype:"",addmark:"",adddesc:""},currentPage:1,pageSize:5,dialogVisible:!1,search:"",loading:!1}},methods:{handleCurrentChange:function(t){console.log("当前页: "+t),this.currentPage=t},pass:function(t){var e=this;this.$confirm("此操作将表示加分有效是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"success"}).then(function(){e.getRequest("/monitor/pass/"+t.no).then(function(t){t&&200==t.status&&e.getList()})}).catch(function(){})},remove:function(t){var e=this;this.$confirm("此操作将永久删除是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){e.deleteRequest("/monitor/delete/"+t.no).then(function(t){t&&200==t.status&&e.getList()})}).catch(function(){})},getList:function(){var t=this;this.loading=!0,this.getRequest("/monitor/list").then(function(e){e&&200==e.status&&(t.loading=!1,t.tableData=e.data)})},handleClose:function(t){this.$confirm("确认关闭？").then(function(e){t()}).catch(function(t){})},showEditView:function(t){this.dialogVisible=!0,this.form.no=t.no,this.form.addname=t.addname,this.form.addtype=t.addtype,this.form.adddesc=t.adddesc,this.form.addmark=t.addmark},update:function(){var t=this;this.putRequest("/monitor/update",this.form).then(function(e){t.dialogVisible=!1,e&&200==e.status&&t.getList()})}},mounted:function(){this.getList()},computed:{tables:function(){var t=this.search;return t?this.tableData.filter(function(e){return n()(e).some(function(a){return String(e[a]).toLowerCase().indexOf(t)>-1})}):this.tableData}}},i={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{directives:[{name:"loading",rawName:"v-loading",value:t.loading,expression:"loading"}],staticClass:"view"},[a("el-input",{attrs:{placeholder:"输入关键字进行过滤","prefix-icon":"el-icon-search"},model:{value:t.search,callback:function(e){t.search=e},expression:"search"}}),t._v(" "),a("el-table",{staticStyle:{width:"100%"},attrs:{data:t.tables.slice((t.currentPage-1)*t.pageSize,t.currentPage*t.pageSize),"default-sort":{prop:"adddata"}}},[a("el-table-column",{attrs:{prop:"adddate",label:"日期",sortable:"",width:"180"}}),t._v(" "),a("el-table-column",{attrs:{prop:"userid",label:"学号",sortable:"",width:"180"}}),t._v(" "),a("el-table-column",{attrs:{prop:"username",sortable:"",label:"姓名",width:"180"}}),t._v(" "),a("el-table-column",{attrs:{prop:"addname",label:"加分名称",width:"180"}}),t._v(" "),a("el-table-column",{attrs:{prop:"addtype",label:"加分类型",width:"180"}}),t._v(" "),a("el-table-column",{attrs:{prop:"addmark",label:"分值",width:"100"}}),t._v(" "),a("el-table-column",{attrs:{prop:"adddesc",label:"加分说明",width:"300"}}),t._v(" "),a("el-table-column",{attrs:{prop:"tag",label:"是否审批",align:"center"}}),t._v(" "),a("el-table-column",{attrs:{prop:"addpath",label:"加分证明",width:"150"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("el-popover",{attrs:{placement:"left",trigger:"click"}},[a("el-image",{staticStyle:{width:"100px",height:"100px"},attrs:{slot:"reference",src:e.row.addpath},slot:"reference"}),t._v(" "),a("el-image",{staticStyle:{width:"700px",height:"700px"},attrs:{src:e.row.addpath}})],1)]}}])}),t._v(" "),a("el-table-column",{attrs:{fixed:"right",label:"操作",width:"220"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("el-button",{attrs:{type:"primary",size:"small"},on:{click:function(a){return t.showEditView(e.row)}}},[t._v("编辑")]),t._v(" "),a("el-button",{attrs:{type:"success",size:"small"},on:{click:function(a){return t.pass(e.row)}}},[t._v("通过")]),t._v(" "),a("el-button",{attrs:{type:"danger",size:"small"},on:{click:function(a){return t.remove(e.row)}}},[t._v("删除")])]}}])})],1),t._v(" "),a("el-dialog",{attrs:{title:"编辑",visible:t.dialogVisible,width:"30%","before-close":t.handleClose},on:{"update:visible":function(e){t.dialogVisible=e}}},[a("section",{staticClass:"update"},[a("el-form",{ref:"form",attrs:{model:t.form,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"加分名称"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-edit"},model:{value:t.form.addname,callback:function(e){t.$set(t.form,"addname",e)},expression:"form.addname"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"加分类型"}},[a("el-select",{staticStyle:{width:"100%"},attrs:{placeholder:"加分类型"},model:{value:t.form.addtype,callback:function(e){t.$set(t.form,"addtype",e)},expression:"form.addtype"}},[a("el-option",{attrs:{label:"专业技能",value:"专业技能"}}),t._v(" "),a("el-option",{attrs:{label:"创造能力",value:"创造能力"}}),t._v(" "),a("el-option",{attrs:{label:"组织管理能力",value:"组织管理能力"}}),t._v(" "),a("el-option",{attrs:{label:"文体能力",value:"文体能力"}}),t._v(" "),a("el-option",{attrs:{label:"社会实践能力",value:"社会实践能力"}})],1)],1),t._v(" "),a("el-form-item",{attrs:{label:"分值"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-s-data"},model:{value:t.form.addmark,callback:function(e){t.$set(t.form,"addmark",e)},expression:"form.addmark"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"加分说明"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-edit-outline"},model:{value:t.form.adddesc,callback:function(e){t.$set(t.form,"adddesc",e)},expression:"form.adddesc"}})],1)],1)],1),t._v(" "),a("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(e){t.dialogVisible=!1}}},[t._v("取 消")]),t._v(" "),a("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.update()}}},[t._v("确 定")])],1)]),t._v(" "),a("div",{staticClass:"block",staticStyle:{"margin-top":"15px"}},[a("el-pagination",{attrs:{align:"center","current-page":t.currentPage,"page-size":t.pageSize,layout:"total, prev, pager, next, jumper",total:t.tableData.length},on:{"current-change":t.handleCurrentChange}})],1)],1)},staticRenderFns:[]};var o=a("C7Lr")(r,i,!1,function(t){a("ir5O")},null,null);e.default=o.exports},FaNa:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var l={data:function(){return{gradeinfo:[],gradeid:"",tableData:[],able:!1}},methods:{getgarde:function(){var t=this;this.getRequest("/monitor/grade").then(function(e){e&&200==e.status&&(t.gradeinfo=e.data)})},getmark:function(){var t=this;this.tableData=[],this.getRequest("/monitor/mark/"+this.gradeid).then(function(e){e&&200==e.status&&(t.able=!0,t.tableData=e.data)})},exportmark:function(){window.open("/monitor/export/"+this.gradeid,"_parent")}},mounted:function(){this.getgarde()}},n={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"view"},[a("div",{staticStyle:{"text-align":"left"}},[a("el-tag",{staticClass:"el-icon-caret-right",staticStyle:{"font-size":"15px"}},[t._v("根据班级进行查看成绩：")]),t._v(" "),a("el-select",{attrs:{filterable:"",placeholder:"请选择",size:"small"},model:{value:t.gradeid,callback:function(e){t.gradeid=e},expression:"gradeid"}},t._l(t.gradeinfo,function(t){return a("el-option",{key:t.gradeid,attrs:{label:t.gradename,value:t.gradeid}})}),1),t._v(" "),a("el-button",{attrs:{type:"primary",icon:"el-icon-search",size:"small"},on:{click:t.getmark}},[t._v("搜索")]),t._v(" "),this.able?a("el-button",{attrs:{type:"success",size:"small"},on:{click:function(e){return t.exportmark()}}},[t._v("导出数据\n  ")]):t._e()],1),t._v(" "),a("el-table",{staticStyle:{width:"100%"},attrs:{data:t.tableData,stripe:"",height:"450"}},[a("el-table-column",{attrs:{prop:"username",label:"姓名",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"userid",label:"学号",sortable:"",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"type1",label:"专业技能",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"type2",label:"创造能力",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"type3",label:"文体能力",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"type4",label:"组织管理能力",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"type5",label:"社会实践能力",width:"150"}}),t._v(" "),a("el-table-column",{attrs:{prop:"mark",label:"总分",sortable:"",width:"150"}})],1)],1)},staticRenderFns:[]},r=a("C7Lr")(l,n,!1,null,null,null);e.default=r.exports},I9gv:function(t,e,a){var l={"./mon_addcount.vue":"FaNa","./mon_addlist.vue":"/uMS"};function n(t){return a(r(t))}function r(t){var e=l[t];if(!(e+1))throw new Error("Cannot find module '"+t+"'.");return e}n.keys=function(){return Object.keys(l)},n.resolve=r,t.exports=n,n.id="I9gv"},ir5O:function(t,e){}});
//# sourceMappingURL=3.75540c281bdc60ef1b9a.js.map