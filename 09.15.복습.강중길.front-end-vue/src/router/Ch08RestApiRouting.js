// import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
// import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
// import Exam03UseUIComponent from '@/views/Ch02ComponentRouting/Exam03UseUIComponent'


const routes = [
  {
    path: '/Ch08RestApi/Exam01Join',
    component: () => import(/* webpackChunkName: "Ch08RestApi" */ 
      '@/views/Ch08RestApi/Exam01Join'
    )
  }

  ,

  {
    path: '/Ch08RestApi/Exam02Login',
    component: () => import(/* webpackChunkName: "Ch08RestApi" */ 
      '@/views/Ch08RestApi/Exam02Login'
    )
  }
  ,

  {
    path: '/Ch08RestApi/Exam03Board/BoardList',
    component: () => import(/* webpackChunkName: "Ch08RestApi" */ 
      '@/views/Ch08RestApi/Exam03Board/BoardList.vue'
    )
  }
  // ,

  // {
  //   path: '/Ch08RestApi/Exam03Board/BoardWrite',
  //   component: () => import(/* webpackChunkName: "Ch08RestApi" */ 
  //     '@/views/Ch08RestApi/Exam03Board/BoardWrite.vue'
  //   )
  // }

  
];



export default routes;