<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
홈뷰
    </div>
    <div class="card-body">
      홈뷰 컴포넌트의 UI
      <HelloWorld/>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
import HelloWorld from '@/views/HomeView/HelloWorld.vue';
</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>