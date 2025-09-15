<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
        <UIComponent class="bg-info" style="color:red" @click="handleClick()"/>
    </div>
    
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
  import UIComponent from './UIComponent.vue';

  function handleClick() {
    console.log("handleClick() 실행");
  }

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>