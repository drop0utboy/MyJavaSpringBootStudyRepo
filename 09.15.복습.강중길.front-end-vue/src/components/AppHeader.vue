<!-- 컴포넌트의 UI -->

<template>
  <nav class="navbar bg-dark">
    <RouterLink class="navbar-brand ms-2" to="/about">
      <img src="@/assets/logo.png" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
      <span class="text-white">Vue.js</span>
    </RouterLink>
    <div v-if="$store.state.user === ''">
      <!-- <span class="text-white me-2">User: {{ $store.state.user }}</span> -->
      <button class="btn btn-success btn-sm me-2" @click="handleLogin"> 로그인</button>
    </div>

    <div v-if="$store.state.user !== ''">
      <span class="text-white me-2">User: {{ $store.state.user }}</span>
      <button class="btn btn-success btn-sm me-2" @click="handleLogout">로그아웃</button>
    </div>
  </nav>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { RouterLink, useRouter } from 'vue-router';
import { useStore } from 'vuex';

const store = useStore();
const router = useRouter();

async function handleLogin() {
  await router.push("/Ch08RestAPI/Exam02Login");
}

async function handleLogout() {
  store.dispatch("removeAuth")
  // await router.push("/");
}


// 자바스크립트를 작성

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>