//页面逻辑

//获取应用实例

var app = getApp()
//App 和 Page 方法，进行程序和页面的注册。
//getApp 和 getCurrentPages 方法，分别用来获取 App 实例和当前页面栈。
// 通过 getApp() 获取实例之后，不要私自调用生命周期函数。
//提供模块化能力。
console.log(app)
console.log(app.globalData);
console.log(getCurrentPages())
//Page() 函数用来注册一个页面。接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
Page(
  {
    //页面的初始数据
    data: {
      //数据字段
      name: '辩论是思维提升最快的方法之一',
      age: 10,
      userInfo: {},
      objectArray: [
        { id: 5, unique: 'unique_5' },
        { id: 4, unique: 'unique_4' },
        { id: 3, unique: 'unique_3' },
        { id: 2, unique: 'unique_2' },
        { id: 1, unique: 'unique_1' },
        { id: 0, unique: 'unique_0' },
      ],
      numberArray: [1, 2, 3, 4],
      array_list_zs: [
        {
          comment: "10", id: 1,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299294437&di=522b0e8d677f7322a341f5bfa540492e&imgtype=0&src=http%3A%2F%2Fwww.muu.com.cn%2Fimg%2Fdd%2F3a24ac9c8b247deddbc8542bc6dc899914dd720373d6efbf94d2ebe65dd2d2016a13677576e00280.jpg",
          content: "如何进行ajax 请求/下拉刷新，上拉加载/暂无数据/暂无网络处理"
        },
        {
          comment: "10", id:1,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299294436&di=e43499e6f29a2aea35c19f240dec646f&imgtype=0&src=http%3A%2F%2Fimg0.ph.126.net%2FA425OToTHzGGZ5uZ9UdGpQ%3D%3D%2F6598068123216434607.jpg",
          content: "写出你认为你最为经典的正能量语句"
        }
        , {
          comment: "10", id:2,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201287&di=67506a8df35e357f33dbec88cdfe2f73&imgtype=0&src=http%3A%2F%2Fs14.sinaimg.cn%2Fmw690%2F001owXWugy6I7Twv8gR1d%26690",
          content: "名言警句.鸡汤.哲学.小故事"
        }
        , {
          comment: "10", id:3,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201287&di=5b22cd2bfc80168eec643f0f45e073fc&imgtype=0&src=http%3A%2F%2Fs6.sinaimg.cn%2Fmw690%2F002kr5oTgy6GK4xYtnN67%26690",
          content: "每天用户只能看三个，每天用户只能写一篇.不需要登录，主测，想要看到更多，下载app"
        }
        , {
          comment: "10", id:4,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201285&di=ab62cf439e70accebf3d31b74b6bfe27&imgtype=0&src=http%3A%2F%2Fwww.hlj.xinhuanet.com%2Fxw%2F2005-10%2F02%2Fxin_301002021035578745217.jpg",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:5,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201284&di=61cd052f3be99ded938025e9d28398e9&imgtype=0&src=http%3A%2F%2Fwww.chinappzw.com%2Fuploadfile%2F2014%2F0815%2F20140815060358325.jpg",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:6,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201284&di=e3f450e93e2ce310467a420c9c16c1cc&imgtype=0&src=http%3A%2F%2Fwww.manhua365.com%2Fattachments%2Ftopic%2F1509%2Fe247cd355a360baf7cebf5f9ed322cba.jpg",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:7,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201281&di=8d0ea2c065eaa9d3340847f6878a6e34&imgtype=0&src=http%3A%2F%2Fimg.ph.126.net%2Fgr55akFdZTK5J388atlv1g%3D%3D%2F878483402413983294.jpg",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:8,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299201279&di=bbb8d23ad26bddb3fa1b611a6a425b77&imgtype=0&src=http%3A%2F%2Fs11.sinaimg.cn%2Fmiddle%2F0e6b3a8bg863e8a04aa6a%26690",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:9,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299294444&di=d35a8a2a6e51be527ecdc527ba073fac&imgtype=0&src=http%3A%2F%2Fimg.bimg.126.net%2Fphoto%2F0NX3eWJhHGNrWFrFdfNfCg%3D%3D%2F3459045988814218764.jpg",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:10,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299294442&di=e8a1af6bcba070ebe861921380ca9476&imgtype=0&src=http%3A%2F%2Fwww.ce.cn%2Fztpd%2Fxwzt%2Fguonei%2F2006%2Fydsy%2Fliu%2F200605%2F04%2FW020060504307255066445.jpg",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        , {
          comment: "10", id:11,
          point_agree: "12",
          point_oppose: "25",
          avatarUrl: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498299294441&di=1c6e4fd57952e520904d19d3af4cbf5e&imgtype=0&src=http%3A%2F%2Fs2.sinaimg.cn%2Fmiddle%2F4c091e66gc48c18232791%26690",
          content: "评论数量最多的.认同数量最多的，将排行榜.话题的评论列表"
        }
        
      ]
    },
    onLoad: function () {
      //监听页面加载
      console.log('onLoad')
      var that = this;
      app.getUserInfo(function (userInfo) {
        that.setData({
          userInfo: userInfo
        })
      })
    },
    onReady: function () {
      //生命周期函数--监听页面初次渲染完成

    },
    onShow: function () {
      // 生命周期函数--监听页面显示
    },
    onHide: function () {
      // 生命周期函数--监听页面隐藏
    },
    onUnload: function () {
      // 生命周期函数--监听页面卸载
    }
    , onPullDownRefresh: function () {
      // 页面相关事件处理函数--监听用户下拉动作
    }
    , onReachBottom: function () {
      // 页面上拉触底事件的处理函数
    }
    , onShareAppMessage: function () {
      // 用户点击右上角转发
    }
    , route: ""
    //事件处理函数
    , bindviewtap: function () {
      wx.navigateTo({
        url: '../logs/logs'
      })
    }
    , refreshdata:function(){
      this.data.array_list_zs =  [{
        comment: "10", id: 12,
        point_agree: "12",
        point_oppose: "25",
        avatarUrl: "../img/logo.jpg",
        content: "加入一条数据"
      }].concat(this.data.array_list_zs);
      this.setData({
        array_list_zs: this.data.array_list_zs
      })
    }
    , godetail:function(){
      wx.navigateTo({
        url: '../writingthink/writingthink'
      })
    
    }
    ,  ajaxrefreshdata:function(){

      // wx.request({
      //   url: 'http:ggbxcwx.ydm01.top/api/ydm_xc_new/home_page_new', //仅为示例，并非真实的接口地址
      //   data: {
      //     MERCHANTID_C:81136,
      //     appCode:11,
      //     latitude:0,
      //     longitude:0,
      //     merchantId:81137,
      //     shopId:'',
      //     userId:''
      //   },
      //   header: {
      //     'content-type': 'application/json'
      //   },
      //   success: function (res) {
      //     console.log(res.data)
      //     this.setData({
      //       array_list_zs: res.data
      //     })
      //   }
      // })

     
    }
    

  }
)