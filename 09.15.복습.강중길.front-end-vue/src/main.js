import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js'
import store from './store'

// local 스토리지에 저장된 user와 jwt를 읽고 전역 상태 저장
store.dispatch("loadAuth")

createApp(App).use(store).use(router).mount('#app')