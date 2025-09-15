<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      UIC B
    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
       <button class='btn btn-info btn-sm be-2' @click="handleBtn1">커스텀 이벤트1 버튼</button>
      <button class='btn btn-info btn-sm be-2' @click="handleBtn2">커스텀 이벤트2 버튼</button>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
  import { defineOptions, useAttrs, defineEmits } from 'vue';

  defineOptions({
    //Fallthrough 기능을 비활성화
    inheritAttrs: false
  });

  const attrs = useAttrs();



function handleBtn1() {
  attrs.onCustomEvent1();
}

function handleBtn2() {
  attrs.onCustomEvent2("data1", "data2");
}

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>