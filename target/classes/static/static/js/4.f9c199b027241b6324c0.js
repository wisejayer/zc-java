webpackJsonp([4],{"N/0g":function(e,t,a){var n={"./man_grade.vue":"NK+8","./man_user.vue":"W9PT"};function i(e){return a(l(e))}function l(e){var t=n[e];if(!(t+1))throw new Error("Cannot find module '"+e+"'.");return t}i.keys=function(){return Object.keys(n)},i.resolve=l,e.exports=i,i.id="N/0g"},"NK+8":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"view"},[a("el-row",[a("el-col",{attrs:{span:1}},[a("el-button",{attrs:{type:"primary",size:"mini"},on:{click:e.showAddView}},[e._v("添加班级")])],1)],1),e._v(" "),a("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData,border:"",stripe:"",height:"500",width:"500"}},[a("el-table-column",{attrs:{fixed:"",sortable:"",prop:"gradeid",label:"班级编号",width:"150"}}),e._v(" "),a("el-table-column",{attrs:{prop:"gradename",label:"班级名字",width:"120"}}),e._v(" "),a("el-table-column",{attrs:{label:"操作",width:"80"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{type:"danger",size:"small"},on:{click:function(a){return e.removegrade(t.row)}}},[e._v("删除")])]}}])})],1),e._v(" "),a("el-dialog",{attrs:{title:"添加班级",visible:e.dialogVisible,width:"30%","before-close":e.handleClose},on:{"update:visible":function(t){e.dialogVisible=t}}},[a("section",[a("el-form",{ref:"form",attrs:{model:e.form,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"班级编号"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-edit"},model:{value:e.form.gradeid,callback:function(t){e.$set(e.form,"gradeid",t)},expression:"form.gradeid"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"班级名称"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-edit-outline"},model:{value:e.form.gradename,callback:function(t){e.$set(e.form,"gradename",t)},expression:"form.gradename"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"系别名称"}},[a("el-select",{staticStyle:{width:"100%"},attrs:{placeholder:"请选择系别"},model:{value:e.form.deptid,callback:function(t){e.$set(e.form,"deptid",t)},expression:"form.deptid"}},[a("el-option",{attrs:{label:"网络技术系",value:"2"}}),e._v(" "),a("el-option",{attrs:{label:"软件工程系",value:"1"}})],1)],1)],1)],1),e._v(" "),a("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(t){e.dialogVisible=!1}}},[e._v("取 消")]),e._v(" "),a("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.addgrade()}}},[e._v("确 定")])],1)])],1)},staticRenderFns:[]},i=a("C7Lr")({data:function(){return{tableData:[],loading:!1,dialogVisible:!1,form:{gradeid:"",gradename:"",deptid:""}}},methods:{handleClose:function(e){this.$confirm("确认关闭？").then(function(t){e()}).catch(function(e){})},showAddView:function(){this.dialogVisible=!0},addgrade:function(){this.dialogVisible=!1,this.postRequest("/manage/grade",this.form).then(function(e){e&&e.status})},removegrade:function(e){var t=this;this.$confirm("此操作将永久删除是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){t.deleteRequest("/manage/grade/"+e.gradeid).then(function(e){e&&200==e.status&&t.getList()})}).catch(function(){})},getgarde:function(){var e=this;this.loading=!0,this.getRequest("/monitor/grade").then(function(t){t&&200==t.status&&(e.loading=!1,e.tableData=t.data)})}},mounted:function(){this.getgarde()}},n,!1,null,null,null);t.default=i.exports},W9PT:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=a("ZLEe"),i=a.n(n),l={data:function(){return{activeName:"teacher",tableData:[],currentPage:1,pageSize:5,search:"",loading:!1,dialogVisible:!1,form:{userid:"",username:"",gradeid:"",perms:""},gradeinfo:[]}},methods:{handleClick:function(e,t){"student"==e.name?this.getstudent():this.getteacher()},formatter:function(e,t){return e.addname},handleCurrentChange:function(e){console.log("当前页: "+e),this.currentPage=e},handleClose:function(e){this.$confirm("确认关闭？").then(function(t){e()}).catch(function(e){})},showAddView:function(){this.dialogVisible=!0,this.getgarde()},adduser:function(){this.dialogVisible=!1,this.postRequest("/manage/user",this.form).then(function(e){e&&e.status})},removeuser:function(e){var t=this;this.$confirm("此操作将永久删除是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){t.deleteRequest("/manage/user/"+e.userid).then(function(e){e&&e.status})}).catch(function(){})},getstudent:function(){var e=this;this.loading=!0,this.getRequest("/manage/student").then(function(t){t&&200==t.status&&(e.loading=!1,e.tableData=t.data)})},getteacher:function(){var e=this;this.loading=!0,this.getRequest("/manage/teacher").then(function(t){t&&200==t.status&&(e.loading=!1,e.tableData=t.data)})},getgarde:function(){var e=this;this.getRequest("/monitor/grade").then(function(t){t&&200==t.status&&(e.gradeinfo=t.data)})},fileUploadError:function(e,t,a){this.$message({type:"error",message:"导入失败!"})},fileUploadSuccess:function(e,t,a){this.$message({type:"success",message:"导入成功!"})}},mounted:function(){this.getteacher()},computed:{tables:function(){var e=this.search;return e?this.tableData.filter(function(t){return i()(t).some(function(a){return String(t[a]).toLowerCase().indexOf(e)>-1})}):this.tableData}}},r={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"view"},[a("el-tabs",{on:{"tab-click":e.handleClick},model:{value:e.activeName,callback:function(t){e.activeName=t},expression:"activeName"}},[a("el-tab-pane",{attrs:{label:"教师管理",name:"teacher"}}),e._v(" "),a("el-tab-pane",{attrs:{label:"学生管理",name:"student"}})],1),e._v(" "),a("el-row",[a("el-col",{attrs:{span:3}},[a("el-input",{staticStyle:{width:"300px",margin:"0px",padding:"0px"},attrs:{placeholder:"输入关键字进行过滤","prefix-icon":"el-icon-search",size:"small"},model:{value:e.search,callback:function(t){e.search=t},expression:"search"}})],1),e._v(" "),a("el-col",{attrs:{span:15,push:8}},[a("el-button",{attrs:{type:"primary",size:"mini",icon:"el-icon-plus"},on:{click:e.showAddView}},[e._v("添加用户")])],1),e._v(" "),a("el-col",{attrs:{span:3,push:1}},[a("el-upload",{attrs:{"show-file-list":!1,accept:"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.ms-excel",action:"/manage/import","on-success":e.fileUploadSuccess,"on-error":e.fileUploadError}},[a("el-button",{attrs:{type:"success",size:"small"}},[e._v("导入用户")])],1)],1)],1),e._v(" "),a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticStyle:{width:"100%"},attrs:{data:e.tables.slice((e.currentPage-1)*e.pageSize,e.currentPage*e.pageSize),"default-sort":{prop:"date"}}},[a("el-table-column",{attrs:{prop:"userid",label:"账号",sortable:"",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"username",label:"姓名",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"gradename",label:"班级"}}),e._v(" "),a("el-table-column",{attrs:{label:"操作",fixed:"right",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{type:"danger",size:"small"},on:{click:function(a){return e.removeuser(t.row)}}},[e._v("删除")])]}}])})],1),e._v(" "),a("el-dialog",{attrs:{title:"添加用户",visible:e.dialogVisible,width:"22%","before-close":e.handleClose},on:{"update:visible":function(t){e.dialogVisible=t}}},[a("section",[a("el-form",{ref:"form",attrs:{model:e.form,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"账号"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-edit"},model:{value:e.form.userid,callback:function(t){e.$set(e.form,"userid",t)},expression:"form.userid"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"姓名"}},[a("el-input",{attrs:{"prefix-icon":"el-icon-edit-outline"},model:{value:e.form.username,callback:function(t){e.$set(e.form,"username",t)},expression:"form.username"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"班级"}},[a("el-select",{attrs:{filterable:"",placeholder:"请选择",size:"medium"},model:{value:e.form.gradeid,callback:function(t){e.$set(e.form,"gradeid",t)},expression:"form.gradeid"}},e._l(e.gradeinfo,function(e){return a("el-option",{key:e.gradeid,attrs:{label:e.gradename,value:e.gradeid}})}),1)],1),e._v(" "),a("el-form-item",{attrs:{label:"类型"}},[a("el-select",{staticStyle:{width:"100%"},attrs:{placeholder:"用户类型"},model:{value:e.form.perms,callback:function(t){e.$set(e.form,"perms",t)},expression:"form.perms"}},[a("el-option",{attrs:{label:"学生",value:"0"}}),e._v(" "),a("el-option",{attrs:{label:"教师",value:"10"}})],1)],1)],1)],1),e._v(" "),a("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(t){e.dialogVisible=!1}}},[e._v("取 消")]),e._v(" "),a("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.adduser()}}},[e._v("确 定")])],1)]),e._v(" "),a("div",{staticClass:"block",staticStyle:{"margin-top":"15px"}},[a("el-pagination",{attrs:{align:"center","current-page":e.currentPage,"page-size":e.pageSize,layout:"total, prev, pager, next, jumper",total:e.tableData.length},on:{"current-change":e.handleCurrentChange}})],1)],1)},staticRenderFns:[]},o=a("C7Lr")(l,r,!1,null,null,null);t.default=o.exports}});
//# sourceMappingURL=4.f9c199b027241b6324c0.js.map