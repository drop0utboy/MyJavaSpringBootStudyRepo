<!-- 컴포넌트의 UI -->

<template>
  <nav class="navbar bg-dark">
      <RouterLink class="navbar-brand ms-2" to="/about">
        <img src="@/assets/logo.png" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
        <span class="text-white">Vue.js</span>
      </RouterLink>

      <button class="btn btn-success btn-sm me-2">로그인</button>
  </nav>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { RouterLink } from 'vue-router';

// 자바스크립트를 작성

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>