<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      If Show
    </div>
    <div class="card-body">
      <div v-show="isPhoto" class="me-2">
        <img src='/image/photo1.jpg' height='250'/>
      </div>

      <div v-if="isShow" class="me-2">
        <img src='/image/photo2.jpg' height='250'/>
      </div>

      <button class="btn btn-info btn-sm" @click="changeState1()">if</button>
      <button class="btn btn-info btn-sm" @click="changeState2()">show</button>
      <button class="btn btn-info btn-sm" @click="changeStateToggle()">show</button>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';

  // 자바스크립트를 작성
  const isPhoto = ref(true);
  const isShow = ref(true);

  function changeState1() {
    isPhoto.value = false;
  }

   function changeState2() {
    isShow.value = false;
  }

  const toggle = ref(true);

  function changeStateToggle() {
    if(toggle.value) {
      isPhoto.value = false;
    } else {
      isPhoto.value = true;
    }
    toggle.value = !toggle.value;
  }

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>