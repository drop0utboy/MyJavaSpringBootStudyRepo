<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      UIC
    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
        <p>counter: {{ counter }}</p>
        <button class='btn btn-info btn-sm' @click='addCount()'>카운트 증가</button>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { onMounted, onUnmounted, onUpdated, ref } from 'vue';

const counter = ref(0);

function addCount() {
  counter.value += 1;
}

  // 자바스크립트를 작성
  onMounted( ()=> {
    console.log("UIComponent 마운트됨");
  }  );

  onUnmounted( ()=> {
    console.log("UIComponent 언마운트됨");
  } );

  onUpdated( ()=> {
    console.log("UIComponent가 리렌더링됨");
    
  });

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>