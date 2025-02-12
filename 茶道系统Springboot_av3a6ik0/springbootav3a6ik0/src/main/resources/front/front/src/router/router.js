import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import chayexinxiList from '../pages/chayexinxi/list'
import chayexinxiDetail from '../pages/chayexinxi/detail'
import chayexinxiAdd from '../pages/chayexinxi/add'
import chayefenleiList from '../pages/chayefenlei/list'
import chayefenleiDetail from '../pages/chayefenlei/detail'
import chayefenleiAdd from '../pages/chayefenlei/add'
import zhishifenleiList from '../pages/zhishifenlei/list'
import zhishifenleiDetail from '../pages/zhishifenlei/detail'
import zhishifenleiAdd from '../pages/zhishifenlei/add'
import chadaozhishikuList from '../pages/chadaozhishiku/list'
import chadaozhishikuDetail from '../pages/chadaozhishiku/detail'
import chadaozhishikuAdd from '../pages/chadaozhishiku/add'
import daohuorukuList from '../pages/daohuoruku/list'
import daohuorukuDetail from '../pages/daohuoruku/detail'
import daohuorukuAdd from '../pages/daohuoruku/add'
import discusschayexinxiList from '../pages/discusschayexinxi/list'
import discusschayexinxiDetail from '../pages/discusschayexinxi/detail'
import discusschayexinxiAdd from '../pages/discusschayexinxi/add'
import discusschadaozhishikuList from '../pages/discusschadaozhishiku/list'
import discusschadaozhishikuDetail from '../pages/discusschadaozhishiku/detail'
import discusschadaozhishikuAdd from '../pages/discusschadaozhishiku/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'chayexinxi',
					component: chayexinxiList
				},
				{
					path: 'chayexinxiDetail',
					component: chayexinxiDetail
				},
				{
					path: 'chayexinxiAdd',
					component: chayexinxiAdd
				},
				{
					path: 'chayefenlei',
					component: chayefenleiList
				},
				{
					path: 'chayefenleiDetail',
					component: chayefenleiDetail
				},
				{
					path: 'chayefenleiAdd',
					component: chayefenleiAdd
				},
				{
					path: 'zhishifenlei',
					component: zhishifenleiList
				},
				{
					path: 'zhishifenleiDetail',
					component: zhishifenleiDetail
				},
				{
					path: 'zhishifenleiAdd',
					component: zhishifenleiAdd
				},
				{
					path: 'chadaozhishiku',
					component: chadaozhishikuList
				},
				{
					path: 'chadaozhishikuDetail',
					component: chadaozhishikuDetail
				},
				{
					path: 'chadaozhishikuAdd',
					component: chadaozhishikuAdd
				},
				{
					path: 'daohuoruku',
					component: daohuorukuList
				},
				{
					path: 'daohuorukuDetail',
					component: daohuorukuDetail
				},
				{
					path: 'daohuorukuAdd',
					component: daohuorukuAdd
				},
				{
					path: 'discusschayexinxi',
					component: discusschayexinxiList
				},
				{
					path: 'discusschayexinxiDetail',
					component: discusschayexinxiDetail
				},
				{
					path: 'discusschayexinxiAdd',
					component: discusschayexinxiAdd
				},
				{
					path: 'discusschadaozhishiku',
					component: discusschadaozhishikuList
				},
				{
					path: 'discusschadaozhishikuDetail',
					component: discusschadaozhishikuDetail
				},
				{
					path: 'discusschadaozhishikuAdd',
					component: discusschadaozhishikuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
