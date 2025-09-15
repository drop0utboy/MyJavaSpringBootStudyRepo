<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      ex03 event emit
    </div>
    <div class="card-body">
      <button class='btn btn-info btn-sm be-2' @click="handleBtn1">커스텀 이벤트1 버튼</button>
      <button class='btn btn-info btn-sm be-2' @click="handleBtn2">커스텀 이벤트2 버튼</button>

      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
// 자바스크립트를 작성
import { defineEmits } from 'vue';
const emit = defineEmits(["customeEvent1", "customEvent2"]);

function handleBtn1() {
  emit("customEvent1");
}

function handleBtn2() {
  emit("customEvent2", "data1", "data2");
}


</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>