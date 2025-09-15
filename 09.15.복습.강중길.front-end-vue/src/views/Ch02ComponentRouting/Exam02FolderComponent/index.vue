<template>
  <div class="card">
    <div class="card-header">
      Exam02FolderComponent
    </div>
    <div class="card-body my-background">
      <img src="@/assets/logo.png" width="100">
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
  console.log("Exam02 출력")
</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 
  .my-background {
    background-color: chocolate;
  }
</style>