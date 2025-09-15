// import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
// import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
// import Exam03UseUIComponent from '@/views/Ch02ComponentRouting/Exam03UseUIComponent'


const routes = [
  {
    path: '/Ch07GlobalState/Exam01RootState',
    component: () => import(/* webpackChunkName: "Ch07GlobalState" */ 
      '@/views/Ch07GlobalState/Exam01RootState.vue'
    )
  }

  ,

  {
    path: '/Ch07GlobalState/Exam02CounterState',
    component: () => import(/* webpackChunkName: "Ch07GlobalState" */ 
      '@/views/Ch07GlobalState/Exam02CounterState.vue'
    )
  }

  
]



export default routes;