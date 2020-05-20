import Vue from 'vue'
import Router from 'vue-router'
import Join from '../components/member/Join'
import Login from '../components/member/Login'
import Calculator from "../components/common/Calculator"
import Register from "../components/member/Register"
import List from "../components/member/List"
import Search from "../components/member/Search"
import Update from "../components/member/Update"
import Delete from "../components/member/Delete"
import Counter from "../components/common/Counter"
import VuexCounter from '../components/common/VuexCounter'

Vue.use(Router)

export default new Router({
        mode:'history',
        routes: [
            {path:'/join', component:Join},
            {path:'/login', component:Login},
            {path:'/calculator', component:Calculator},
            {path: '/register', component: Register},
            {path: '/list', component: List},
            {path: '/search', component: Search},
            {path: '/update', component: Update},
            {path: '/delete', component: Delete},
            {path: '/counter', component: Counter},
            {path: '/vuexcounter', component: VuexCounter}
    ]
})
