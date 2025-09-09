<!-- 컴포넌트의 UI -->

<template>
  <div class="d-flex flex-column vh-100 bg-warning">

    <AppHeader/>

    <div class="flex-glow-1 bg-warning container-fluid">
      <div class="row">
        <div class="col-md-4 py-3">
          <AppMenu/>
        </div>
        <div class="col-md-8 py-2 ">
          <RouterView/>
        </div>
      </div>
    </div>


  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
// 자바스크립트를 작성
import AppHeader from './components/AppHeader.vue'
import AppMenu from './components/AppMenu.vue';

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>