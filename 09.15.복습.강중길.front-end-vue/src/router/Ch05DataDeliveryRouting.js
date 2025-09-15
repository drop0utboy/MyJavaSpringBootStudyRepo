// import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
// import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
// import Exam03UseUIComponent from '@/views/Ch02ComponentRouting/Exam03UseUIComponent'


const routes = [
  {
    path: '/Ch05DataDelivery/Exam01FallthroughAttr',
    component: () => import(/* webpackChunkName: "Ch05DataDelivery" */ 
      '@/views/Ch05DataDelivery/Exam01FallthroughAttr'
    )
  }

  ,

  {
    path: '/Ch05DataDelivery/Exam02Props',
    component: () => import(/* webpackChunkName: "Ch05DataDelivery" */ 
      '@/views/Ch05DataDelivery/Exam02Props'
    )
  }

  ,

  {
    path: '/Ch05DataDelivery/Exam03EventEmit',
    component: () => import(/* webpackChunkName: "Ch05DataDelivery" */ 
      '@/views/Ch05DataDelivery/Exam03EventEmit'
    )
  }

  ,

  {
    path: '/Ch05DataDelivery/Exam04UseAttr',
    component: () => import(/* webpackChunkName: "Ch05DataDelivery" */ 
      '@/views/Ch05DataDelivery/Exam04UseAttr'
    )
  }

  ,

  {
    path: '/Ch05DataDelivery/Exam05ProvideInject',
    component: () => import(/* webpackChunkName: "Ch05DataDelivery" */ 
      '@/views/Ch05DataDelivery/Exam05ProvideInject'
    )
  }

]



export default routes;