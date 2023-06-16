<template>
  <el-card class="main-card">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <!-- 修改信息 -->
      <el-tab-pane label="网站信息" name="info">
        <el-form
            :model="websiteConfigForm"
            label-position="left"
            label-width="100px"
        >
          <el-form-item label="网站头像">
            <el-upload
                :on-success="handleWebsiteAvatarSuccess"
                :show-file-list="false"
                action="/api/admin/image/upload"
                class="avatar-uploader"
            >
              <img
                  v-if="websiteConfigForm.websiteAvatar"
                  :src="websiteConfigForm.websiteAvatar"
                  class="avatar"
              />
              <i v-else class="el-icon-plus avatar-uploader-icon"/>
            </el-upload>
          </el-form-item>
          <el-form-item label="网站名称">
            <el-input
                v-model="websiteConfigForm.websiteName"
                size="small"
                style="width:400px"
            />
          </el-form-item>
          <el-form-item label="网站作者">
            <el-input
                v-model="websiteConfigForm.websiteAuthor"
                size="small"
                style="width:400px"
            />
          </el-form-item>
          <el-form-item label="网站简介">
            <el-input
                v-model="websiteConfigForm.websiteIntro"
                size="small"
                style="width:400px"
            />
          </el-form-item>
          <el-form-item label="网站创建日期">
            <el-date-picker
                v-model="websiteConfigForm.websiteCreateTime"
                placeholder="选择日期"
                style="width:400px"
                type="date"
                value-format="yyyy-MM-dd"
            />
          </el-form-item>
          <el-form-item label="网站公告">
            <el-input
                v-model="websiteConfigForm.websiteNotice"
                :rows="5"
                placeholder="请输入公告内容"
                style="width:400px"
                type="textarea"
            />
          </el-form-item>
          <el-form-item label="备案号">
            <el-input
                v-model="websiteConfigForm.websiteRecordNo"
                size="small"
                style="width:400px"
            />
          </el-form-item>
          <el-button
              size="medium"
              style="margin-left:6.3rem"
              type="primary"
              @click="updateWebsiteConfig"
          >
            修改
          </el-button>
        </el-form>
      </el-tab-pane>
    </el-tabs>
  </el-card>
</template>

<script>
export default {
  created() {
    this.getWebsiteConfig();
  },
  data: function () {
    return {
      websiteConfigForm: {
        websiteAvatar: "",
        websiteName: "",
        websiteAuthor: "",
        websiteIntro: "",
        websiteNotice: "",
        websiteCreateTime: null,
        websiteRecordNo: "",
        socialLoginList: [],
        socialUrlList: [],
        qq: "",
        github: "",
        gitee: "",
        touristAvatar: "",
        isReward: 1,
        weiXinQRCode: "",
        alipayQRCode: "",
        isChatRoom: 1,
        websocketUrl: "",
        isMusicPlayer: 1,
        isEmailNotice: 1,
        isCommentReview: 0,
        isMessageReview: 0
      },
      activeName: "info"
    };
  },
  methods: {
    getWebsiteConfig() {
      this.axios.get("/api/admin/website/config").then(({data}) => {
        this.websiteConfigForm = data.data;
      });
    },
    handleClick(tab) {
      console.log(tab);
    },
    handleWebsiteAvatarSuccess(response) {
      this.websiteConfigForm.websiteAvatar = response.data;
    },
    handleTouristAvatarSuccess(response) {
      this.websiteConfigForm.touristAvatar = response.data;
    },
    handleWeiXinSuccess(response) {
      this.websiteConfigForm.weiXinQRCode = response.data;
    },
    handleAlipaySuccess(response) {
      this.websiteConfigForm.alipayQRCode = response.data;
    },
    updateWebsiteConfig() {
      this.axios
          .put("/api/admin/website/config", this.websiteConfigForm)
          .then(({data}) => {
            if (data.flag) {
              this.$notify.success({
                title: "成功",
                message: data.message
              });
            } else {
              this.$notify.error({
                title: "失败",
                message: data.message
              });
            }
          });
    }
  }
};
</script>

<style>
.avatar-uploader .el-upload {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}

.avatar-uploader .el-upload:hover {
  border-color: #409eff;
}

.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 120px;
  height: 120px;
  line-height: 120px;
  text-align: center;
}

.avatar {
  width: 120px;
  height: 120px;
  display: block;
}
</style>
