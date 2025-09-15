import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
import Exam03UseUIComponent from '@/views/Ch02ComponentRouting/Exam03UseUIComponent'


const routes = [
  {
    path: '/Ch02ComponentRouting/Exam01SingleFileComponent',
    name: 'Exam01SingleFileComponent',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam01SingleFileComponent.vue')
  }
  
  ,

  {
    path: '/Ch02ComponentRouting/Exam02FolderComponent',
    name: 'Exam02FolderComponent',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam02FolderComponent')
  }
  
  ,

  {
    path: '/Ch02ComponentRouting/Exam03UseUIComponent',
    name: 'Exam03UseUIComponent',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam03UseUIComponent')
  }

  ,

  {
    path: '/Ch02ComponentRouting/Exam04ViewNavigation',
    name: 'Exam04ViewNavigation',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam04ViewNavigation')
  }

  ,

  {
    path: '/Ch02ComponentRouting/Exam05NestedRoute',
    name: 'Exam05NestedRoute',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam05NestedRoute'),
    redirect: '/Ch02ComponentRouting/Exam05NestedRoute/UIComponentA',
    children: [
      {
        path: 'UIComponentA',
        component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../components/Ch02ComponentRouting/UIComponentA.vue')
      }
      ,
      {
        path: 'UIComponentB',
        component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../components/Ch02ComponentRouting/UIComponentB.vue')
      }
    ]
  }

  ,

  {
    path: '/Ch02ComponentRouting/Exam06URLDataSend',
    name: 'Exam06URLDataSend',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam06URLDataSend')
  }

  ,

  {
    path: '/Ch02ComponentRouting/Exam06URLDataRecieve/:userName?/:userAge?',
    name: 'Exam06URLDataRecieve',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "Ch02ComponentRouting" */ '../views/Ch02ComponentRouting/Exam06URLDataRecieve')
  }
]




export default routes;