import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView/index.vue'
// import Exam01SingleFileComponent from '@/views/Ch02ComponentRouting/Exam01SingleFileComponent.vue'
// import Exam02FolderComponent from '@/views/Ch02ComponentRouting/Exam02FolderComponent'
import Ch02ComponentRouting from "./Ch02ComponentRouting";
import Ch03DataBindingRouting from "./Ch03DataBindingRouting";
import Ch04EventHandlingWatch from "./Ch04EventHandlingRouting";
import Ch05DataDelivery from "./Ch05DataDeliveryRouting";
import Ch06LifecycleHook from "./Ch06LifecycleHookRouting";
import Ch07GlobalState from "./Ch07GlobalStateRouting";
import Ch08RestApi from "./Ch08RestApiRouting"

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },

  {
    path: '/about',
    name: 'about',
    component: ()=> import('../views/AboutView.vue')
  },
  // ...하면 배열의 값들을 가지고 쓰는것
  ...Ch02ComponentRouting,
  ...Ch03DataBindingRouting,
  ...Ch04EventHandlingWatch,
  ...Ch05DataDelivery,
  ...Ch06LifecycleHook,
  ...Ch07GlobalState,
  ...Ch08RestApi
  



  // {
  //   path: '/Ch02ComponentRouting/Exam01SingleFileComponent',
  //   name: 'Exam01SingleFileComponent',
  //   component: Exam01SingleFileComponent
  // },

  //   {
  //   path: '/Ch02ComponentRouting/Exam02FolderComponent',
  //   name: 'Exam02FolderComponent',
  //   component: Exam02FolderComponent
  // }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
});

export default router
