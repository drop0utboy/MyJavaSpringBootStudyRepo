// import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
// import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
// import Exam03UseUIComponent from '@/views/Ch02ComponentRouting/Exam03UseUIComponent'


const routes = [
  {
    path: '/Ch06LifecycleHook/Exam01LifeCycleHooks',
    component: () => import(/* webpackChunkName: "Ch06LifecycleHook" */ 
      '@/views/Ch06LifecycleHook/Exam01LifeCycleHooks'
    )
  }
]



export default routes;