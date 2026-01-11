<template>
<div :style='{"width":"100%","padding":"30px 10% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"0px solid #e9e9e9","width":"100%","padding":"0px","margin":"0px 0","position":"relative","background":"#fff"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="菜品名称" prop="caipinmingcheng">
            <el-input  v-model="ruleForm.caipinmingcheng" 
                placeholder="菜品名称" clearable :readonly=" false  ||ro.caipinmingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="菜品类型" prop="caipinleixing">
            <el-select v-model="ruleForm.caipinleixing" placeholder="请选择菜品类型"  >
              <el-option
                  v-for="(item,index) in caipinleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="菜品图片" v-if="type!='cross' || (type=='cross' && !ro.caipintupian)" prop="caipintupian">
            <file-upload
            tip="点击上传菜品图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.caipintupian?ruleForm.caipintupian:''"
            @change="caipintupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="菜品图片" prop="caipintupian">
                <img v-if="ruleForm.caipintupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.caipintupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.caipintupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="菜品食材" prop="caipinshicai">
            <el-input  v-model="ruleForm.caipinshicai" 
                placeholder="菜品食材" clearable :readonly=" false  ||ro.caipinshicai"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="店铺账号" prop="dianpuzhanghao">
            <el-input  v-model="ruleForm.dianpuzhanghao" 
                placeholder="店铺账号" clearable :readonly=" false  ||ro.dianpuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="店铺名称" prop="dianpumingcheng">
            <el-input  v-model="ruleForm.dianpumingcheng" 
                placeholder="店铺名称" clearable :readonly=" false  ||ro.dianpumingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="店铺地址" prop="dianpudizhi">
            <el-input  v-model="ruleForm.dianpudizhi" 
                placeholder="店铺地址" clearable :readonly=" false  ||ro.dianpudizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="联系方式" prop="lianxifangshi">
            <el-input  v-model="ruleForm.lianxifangshi" 
                placeholder="联系方式" clearable :readonly=" false  ||ro.lianxifangshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="单限" prop="onelimittimes">
            <el-input  v-model.number="ruleForm.onelimittimes" 
                placeholder="单限" clearable :readonly=" false  ||ro.onelimittimes"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="库存" prop="alllimittimes">
            <el-input  v-model.number="ruleForm.alllimittimes" 
                placeholder="库存" clearable :readonly=" false  ||ro.alllimittimes"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="价格" prop="price">
            <el-input type="number" v-model.number="ruleForm.price" 
                placeholder="价格" clearable :readonly=" false  ||ro.price"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="菜品介绍" prop="caipinjieshao">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="菜品介绍"
              v-model="ruleForm.caipinjieshao">
            </el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"0px","background":"#b4ebcc","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"none","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            caipinmingcheng : false,
            caipinleixing : false,
            caipintupian : false,
            caipinshicai : false,
            caipinjieshao : false,
            dianpuzhanghao : false,
            dianpumingcheng : false,
            dianpudizhi : false,
            lianxifangshi : false,
            onelimittimes : false,
            alllimittimes : false,
            clicktime : false,
            discussnum : false,
            price : false,
            storeupnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          caipinmingcheng: '',
          caipinleixing: '',
          caipintupian: '',
          caipinshicai: '',
          caipinjieshao: '',
          dianpuzhanghao: '',
          dianpumingcheng: '',
          dianpudizhi: '',
          lianxifangshi: '',
          onelimittimes: '-1',
          alllimittimes: '-1',
          clicktime: '',
          discussnum: '',
          price: '',
          storeupnum: '',
        },
        caipinleixingOptions: [],


        rules: {
          caipinmingcheng: [
          ],
          caipinleixing: [
          ],
          caipintupian: [
          ],
          caipinshicai: [
          ],
          caipinjieshao: [
          ],
          dianpuzhanghao: [
          ],
          dianpumingcheng: [
          ],
          dianpudizhi: [
          ],
          lianxifangshi: [
          ],
          onelimittimes: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          alllimittimes: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          clicktime: [
          ],
          discussnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          price: [
            { required: true, message: '价格不能为空', trigger: 'blur' },
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          storeupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='caipinmingcheng'){
              this.ruleForm.caipinmingcheng = obj[o];
              this.ro.caipinmingcheng = true;
              continue;
            }
            if(o=='caipinleixing'){
              this.ruleForm.caipinleixing = obj[o];
              this.ro.caipinleixing = true;
              continue;
            }
            if(o=='caipintupian'){
              this.ruleForm.caipintupian = obj[o].split(",")[0];
              this.ro.caipintupian = true;
              continue;
            }
            if(o=='caipinshicai'){
              this.ruleForm.caipinshicai = obj[o];
              this.ro.caipinshicai = true;
              continue;
            }
            if(o=='caipinjieshao'){
              this.ruleForm.caipinjieshao = obj[o];
              this.ro.caipinjieshao = true;
              continue;
            }
            if(o=='dianpuzhanghao'){
              this.ruleForm.dianpuzhanghao = obj[o];
              this.ro.dianpuzhanghao = true;
              continue;
            }
            if(o=='dianpumingcheng'){
              this.ruleForm.dianpumingcheng = obj[o];
              this.ro.dianpumingcheng = true;
              continue;
            }
            if(o=='dianpudizhi'){
              this.ruleForm.dianpudizhi = obj[o];
              this.ro.dianpudizhi = true;
              continue;
            }
            if(o=='lianxifangshi'){
              this.ruleForm.lianxifangshi = obj[o];
              this.ro.lianxifangshi = true;
              continue;
            }
            if(o=='onelimittimes'){
              this.ruleForm.onelimittimes = obj[o];
              this.ro.onelimittimes = true;
              continue;
            }
            if(o=='alllimittimes'){
              this.ruleForm.alllimittimes = obj[o];
              this.ro.alllimittimes = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='discussnum'){
              this.ruleForm.discussnum = obj[o];
              this.ro.discussnum = true;
              continue;
            }
            if(o=='price'){
              this.ruleForm.price = obj[o];
              this.ro.price = true;
              continue;
            }
            if(o=='storeupnum'){
              this.ruleForm.storeupnum = obj[o];
              this.ro.storeupnum = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.dianpuzhanghao!=''&&json.dianpuzhanghao) || json.dianpuzhanghao==0){
                this.ruleForm.dianpuzhanghao = json.dianpuzhanghao
            }
            if((json.dianpumingcheng!=''&&json.dianpumingcheng) || json.dianpumingcheng==0){
                this.ruleForm.dianpumingcheng = json.dianpumingcheng
            }
            if((json.dianpudizhi!=''&&json.dianpudizhi) || json.dianpudizhi==0){
                this.ruleForm.dianpudizhi = json.dianpudizhi
            }
            if((json.lianxifangshi!=''&&json.lianxifangshi) || json.lianxifangshi==0){
                this.ruleForm.lianxifangshi = json.lianxifangshi
            }
          }
        });
        this.$http.get('option/caipinleixing/caipinleixing', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.caipinleixingOptions = res.data.data;
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`caipinxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

		if(this.ruleForm.price<0){
			this.$message.error("价格不能输入负数");
			return
		}
		if(this.ruleForm.alllimittimes<0){
			this.$message.error("库存不能输入负数");
			return
		}
		if(this.ruleForm.onelimittimes<0){
			this.$message.error("单次购买不能输入负数");
			return
		}
        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('caipinxinxi/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post(`caipinxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post(`caipinxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      caipintupianUploadChange(fileUrls) {
          this.ruleForm.caipintupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: none;
	  width: 600px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
