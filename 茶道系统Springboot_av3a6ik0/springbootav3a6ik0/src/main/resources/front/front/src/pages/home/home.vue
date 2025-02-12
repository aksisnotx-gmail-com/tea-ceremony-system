<template>
<div class="home-preview" :style='{"padding":"0 10%","margin":"64px auto 0","alignItems":"flex-start","flexWrap":"wrap","background":"#F6F6F6","display":"flex","width":"100%"}'>




		


<!-- 商品推荐 -->
<div id="animate_recommendchayexinxi" class="recommend animate__animated" :style='{"width":"100%","margin":"0 0 10px","position":"relative","background":"none","order":"5"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"margin":"10px auto","borderColor":"#5FE3EB","textAlign":"left","background":"none","borderWidth":"0 0 5px","width":"calc(100% - 20px)","lineHeight":"54px","borderStyle":"solid","height":"54px"}'>
		<span :style='{"padding":"0 20px","margin":"0 0 0 -10px","color":"#fff","borderRadius":"10px 10px 0 10px","background":"#5FE3EB","display":"inline-block","fontSize":"18px"}'>茶叶信息推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	







		<div v-if="chayexinxiRecommend.length" class="list list16 index-pv1" :style='{"padding":"0 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		  <div v-for="item,index in chayexinxiRecommend" :key="index"  @click="toDetail('chayexinxiDetail', item)" class="list-item animation-box">
		    <div :style='{"border":"1px solid #5FE3EB","width":"300px","padding":"10px","overflow":"hidden","borderRadius":"10px","height":"220px"}' class="img-box">
				<img class="image" :style='{"width":"100%","objectFit":"cover","borderRadius":"10px","display":"block","height":"100%"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
				<img class="image" :style='{"width":"100%","objectFit":"cover","borderRadius":"10px","display":"block","height":"100%"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			</div>
		    <div :style='{"padding":"0 10px","overflow":"hidden","flex":"1","display":"flex","height":"auto"}' class="item-info">
		      <div :style='{"width":"110px","padding":"0 10px 0 0","flex":"1"}'>
				<div class="title">{{item.chayemingcheng}}</div>
				<div class="title">{{item.chayefenlei}}</div>
		        <div :style='{"padding":"0 10px","borderColor":"#5FE3EB","borderStyle":"solid","borderWidth":"0 0 1px 0"}' class="time">
		          <span class="icon iconfont icon-shijian21"></span>
		          <span class="text">{{item.addtime}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","borderColor":"#5FE3EB","borderStyle":"solid","borderWidth":"0 0 1px 0"}' class="collect">
		          <span class="icon iconfont icon-shoucang10"></span>
		          <span class="text">{{item.storeupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","borderColor":"#5FE3EB","borderStyle":"solid","borderWidth":"0 0 1px"}' class="view">
		          <span class="icon iconfont icon-chakan9"></span>
		          <span class="text">{{item.clicknum}}</span>
		        </div>
		      </div>
		      <div class="desc" v-html="item.chayexiangqing"></div>
		    </div>
		  </div>
		</div>
	
	<div @click="moreBtn('chayexinxi')" :style='{"border":"0","padding":"0 15px","margin":"10px auto","alignItems":"center","textAlign":"center","display":"flex","right":"0","top":"10px","borderRadius":"10px","background":"linear-gradient(90deg, #5FE3EB 0%, #FFDFA6 100%)","width":"auto","lineHeight":"32px","position":"absolute","height":"32px"}'>
		<span :style='{"color":"#000","fontSize":"12px"}'>更多</span>
		<i :style='{"margin":"0 0 0 4px","color":"#ffff","borderRadius":"50%","background":"#000","width":"16px","fontSize":"10px","lineHeight":"16px","height":"16px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

<!-- 商品推荐 -->
<div id="animate_recommendchadaozhishiku" class="recommend animate__animated" :style='{"width":"100%","margin":"0 0 10px","position":"relative","background":"none","order":"5"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"margin":"10px auto","borderColor":"#5FE3EB","textAlign":"left","background":"none","borderWidth":"0 0 5px","width":"calc(100% - 20px)","lineHeight":"54px","borderStyle":"solid","height":"54px"}'>
		<span :style='{"padding":"0 20px","margin":"0 0 0 -10px","color":"#fff","borderRadius":"10px 10px 0 10px","background":"#5FE3EB","display":"inline-block","fontSize":"18px"}'>茶道知识库推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	







		<div v-if="chadaozhishikuRecommend.length" class="list list16 index-pv1" :style='{"padding":"0 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		  <div v-for="item,index in chadaozhishikuRecommend" :key="index"  @click="toDetail('chadaozhishikuDetail', item)" class="list-item animation-box">
		    <div :style='{"border":"1px solid #5FE3EB","width":"300px","padding":"10px","overflow":"hidden","borderRadius":"10px","height":"220px"}' class="img-box">
				<img class="image" :style='{"width":"100%","objectFit":"cover","borderRadius":"10px","display":"block","height":"100%"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
				<img class="image" :style='{"width":"100%","objectFit":"cover","borderRadius":"10px","display":"block","height":"100%"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
			</div>
		    <div :style='{"padding":"0 10px","overflow":"hidden","flex":"1","display":"flex","height":"auto"}' class="item-info">
		      <div :style='{"width":"110px","padding":"0 10px 0 0","flex":"1"}'>
				<div class="title">{{item.biaoti}}</div>
				<div class="title">{{item.zhishifenlei}}</div>
				<div class="title">{{item.fabushijian}}</div>
		        <div :style='{"padding":"0 10px","borderColor":"#5FE3EB","borderStyle":"solid","borderWidth":"0 0 1px 0"}' class="time">
		          <span class="icon iconfont icon-shijian21"></span>
		          <span class="text">{{item.addtime}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","borderColor":"#5FE3EB","borderStyle":"solid","borderWidth":"0 0 1px 0"}' class="collect">
		          <span class="icon iconfont icon-shoucang10"></span>
		          <span class="text">{{item.storeupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","borderColor":"#5FE3EB","borderStyle":"solid","borderWidth":"0 0 1px"}' class="view">
		          <span class="icon iconfont icon-chakan9"></span>
		          <span class="text">{{item.clicknum}}</span>
		        </div>
		      </div>
		      <div class="desc" v-html="item.neirong"></div>
		    </div>
		  </div>
		</div>
	
	<div @click="moreBtn('chadaozhishiku')" :style='{"border":"0","padding":"0 15px","margin":"10px auto","alignItems":"center","textAlign":"center","display":"flex","right":"0","top":"10px","borderRadius":"10px","background":"linear-gradient(90deg, #5FE3EB 0%, #FFDFA6 100%)","width":"auto","lineHeight":"32px","position":"absolute","height":"32px"}'>
		<span :style='{"color":"#000","fontSize":"12px"}'>更多</span>
		<i :style='{"margin":"0 0 0 4px","color":"#ffff","borderRadius":"50%","background":"#000","width":"16px","fontSize":"10px","lineHeight":"16px","height":"16px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        chayexinxiRecommend: [],
        chadaozhishikuRecommend: [],





      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getList();
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},

		listIndexClick12(index, name) {
			this['listIndex12' + name] = index
			this.getList()
			
			document.querySelectorAll('.lists .list12' + name + ' .list .item').forEach(el => {
			  el.classList.remove("active")
			})
			setTimeout(() => {
			  document.querySelectorAll('.lists .list12' + name + ' .list .item').forEach(el => {
			    el.classList.add("active")
			  })
			}, 1);
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__rubberBand'},
				{id:'about',css:'animate__backInRight'},
				{id:'system',css:'animate__bounceIn'},
				{id:'animate_recommendchayexinxi',css:'animate__flash'},
				{id:'animate_recommendchadaozhishiku',css:'animate__flash'},
				{id:'msgs',css:'animate__rotateIn'},
				{id:'friendly',css:'animate__rotateInDownLeft'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "chayexinxi/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "chayexinxi/autoSort2";
          }
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chayexinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "chadaozhishiku/autoSort";
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chadaozhishikuRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 1px solid #16292E;
			border-radius: 0;
			padding: 0 30px 0 10px;
			box-shadow: none;
			color: #000;
			background: none;
			width: 180px;
			font-size: 16px;
			border-width: 0 1px 0 0;
			height: 50px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 0;
			border-radius: 4px;
			padding: 0 20px;
			box-shadow: none;
			color: #000;
			background: none;
			width: 100%;
			font-size: 16px;
			height: 50px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: #5EE4EC;
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: #5EE4EC;
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				box-shadow: 0 4px 8px rgba(0,0,0,.3) !important;
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				background: #EFFEFF !important;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	








	.home-preview .recommend .list16 .list-item {
				border-radius: 10px;
				padding: 10px;
				margin: 0 0 20px;
				background: #fff;
				display: flex;
				width: 49%;
				font-size: 0;
				position: relative;
				height: auto;
			}
	
	.home-preview .recommend .list16 .list-item:hover {
				box-shadow: 0 4px 8px rgba(0,0,0,.3);
				background: #EFFEFF;
			}
	
	.home-preview .recommend .list16 .list-item .title {
				padding: 0 10px;
				color: #000;
				font-size: 14px;
				border-color: #5FE3EB;
				border-width: 0 0 1px 0;
				line-height: 36px;
				border-style: solid;
			}
	
	.home-preview .recommend .list16 .list-item:hover .title {
				color: #000;
			}
	
	.home-preview .recommend .list16 .list-item .time .icon {
				margin: 0 2px 0 0;
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .time .icon {
				color: #000;
			}
	.home-preview .recommend .list16 .list-item .time .text {
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .time .text {
				color: #000;
			}
	
	.home-preview .recommend .list16 .list-item .publisher .icon {
				margin: 0 2px 0 0;
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .publisher .icon {
				color: #000;
			}
	.home-preview .recommend .list16 .list-item .publisher .text {
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .publisher .text {
				color: #000;
			}
	
	.home-preview .recommend .list16 .list-item .like .icon {
				margin: 0 2px 0 0;
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .like .icon {
				color: #000;
			}
	.home-preview .recommend .list16 .list-item .like .text {
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .like .text {
				color: #000;
			}
	
	.home-preview .recommend .list16 .list-item .collect .icon {
				margin: 0 2px 0 0;
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .collect .icon {
				color: #000;
			}
	.home-preview .recommend .list16 .list-item .collect .text {
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .collect .text {
				color: #000;
			}
	
	.home-preview .recommend .list16 .list-item .view .icon {
				margin: 0 2px 0 0;
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .view .icon {
				color: #000;
			}
	.home-preview .recommend .list16 .list-item .view .text {
				color: #000;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .recommend .list16 .list-item:hover .view .text {
				color: #000;
			}
	
	.home-preview .recommend .list16 .list-item .desc {
				padding: 0 10px;
				color: #9E9E9E;
				flex: 2;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .recommend .list16 .list-item:hover .desc {
				color: #9E9E9E;
			}


	.home-preview .lists .list12 .tab .item {
				cursor: pointer;
				border: 0;
				padding: 0 20px;
				margin: 0 10px;
				color: #000;
				background: url(http://codegen.caihongy.cn/20240203/5d6df7c836c44555b9ca2c0030463466.png) center center/100% 100% no-repeat;
				display: flex;
				width: auto;
				font-size: 16px;
				line-height: 44px;
				align-items: center;
			}
	
	.home-preview .lists .list12 .tab .item:hover {
				color: #5FE3EB;
			}
	
	.home-preview .lists .list12 .tab .item.active {
				color: #5FE3EB;
				border-color: #999;
				border-width: 0;
				border-style: solid;
			}
	
	.home-preview .lists .list12 .tab .more {
				cursor: pointer;
				padding: 5px 10px;
				margin: 0 10px;
				color: #000;
				background: none;
				display: flex;
				line-height: 44px;
				align-items: center;
			}
	
	.home-preview .lists .list12 .tab .more:hover {
				color: red;
			}
	
	.home-preview .lists .list12 .item.active {
	  animation-name: mymove;
	
	  &:nth-of-type(1) {
	    animation-duration: 1s;
	  }
	  &:nth-of-type(2) {
	    animation-duration: 1.2s;
	  }
	  &:nth-of-type(3) {
	    animation-duration: 1.4s;
	  }
	  &:nth-of-type(4) {
	    animation-duration: 1.6s;
	  }
	  &:nth-of-type(5) {
	    animation-duration: 1.8s;
	  }
	  &:nth-of-type(6) {
	    animation-duration: 2s;
	  }
	}
	
	@keyframes mymove
	{
		from {top: 320px;}
		to {top: 0;}
	}
</style>
