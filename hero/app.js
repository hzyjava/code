////小程序逻辑
//app.js
//函数用来注册一个小程序。接受一个 object 参数，其指定小程序的生命周期函数等。
////App() 必须在 app.js 中注册，且不能注册多个。
//不要在定义于 App() 内的函数中调用 getApp() ，使用 this 就可以拿到 app 实例。
App({
  onLaunch: function (event) {
    //生命周期函数--监听小程序初始化,当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
    //调用API从本地缓存中获取数据
    // 不要在 onLaunch 的时候调用 getCurrentPages() ，此时 page 还没有生成。
    // 参数
    console.log(event.path)
    console.log(event.query)
    console.log(event.scene)
    console.log(event.shareTicket)
    // console.log(event.referrerInfo.appId)
    // console.log(event.referrerInfo.extraData)
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)
  },
  onShow: function (event) {
    //参数
    //生命周期函数--监听小程序显示 	当小程序启动，或从后台进入前台显示，会触发 onShow
    //当用户点击左上角关闭，或者按了设备 Home 键离开微信，小程序并没有直接销毁，而是进入了后台；当再次进入微信或再次打开小程序，又会从后台进入前台。需要注意的是：只有当小程序进入后台一定时间，或者系统资源占用过高，才会被真正的销毁。
    console.log(event.path)
    console.log(event.query)
    console.log(event.scene)
    console.log(event.shareTicket)
    // console.log(event.referrerInfo.appId)
    // console.log(event.referrerInfo.extraData)
  },
  onHide: function () {
    //生命周期函数--监听小程序隐藏,当小程序从前台进入后台，会触发 onHide
  },
  onError: function () {
    //错误监听函数 	当小程序发生脚本错误，或者 api 调用失败时，会触发 onError 并带上错误信息
  },
  getUserInfo: function (cb) {
    //添加任意的函数或数据到 Object 参数中，用 this 可以访问
    var that = this
    if (this.globalData.userInfo) {
      typeof cb == "function" && cb(this.globalData.userInfo)
    } else {
      //调用登录接口
      wx.login({
        success: function () {
          wx.getUserInfo({
            success: function (res) {
              that.globalData.userInfo = res.userInfo
              console.log(res.userInfo)
              typeof cb == "function" && cb(that.globalData.userInfo)
            }
          })
        }
      })
    }
  },
  globalData: {
    userInfo: null
  }
})