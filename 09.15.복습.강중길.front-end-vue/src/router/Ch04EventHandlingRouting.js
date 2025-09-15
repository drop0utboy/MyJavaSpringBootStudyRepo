// import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
// import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
// import Exam03UseUIComponent from '@/views/Ch02ComponentRouting/Exam03UseUIComponent'


const routes = [
  {
    path: '/Ch04EventHandlingWatch/Exam01EventHandling',
    component: () => import(/* webpackChunkName: "Ch04EventHandlingWatch" */ 
      '@/views/Ch04EventHandlingWatch/Exam01EventHandling.vue'
    )
  }

  ,

  {
    path: '/Ch04EventHandlingWatch/Exam02Watch',
    component: () => import(/* webpackChunkName: "Ch04EventHandlingWatch" */ 
      '@/views/Ch04EventHandlingWatch/Exam02Watch.vue'
    )
  }
]

export default routes;