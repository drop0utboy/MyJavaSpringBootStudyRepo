<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      EX05 Nested Route
    </div>
    <div class="card-body">
      <RouterLink to="UIComponentA" class="btn btn-info btn-sm me-3">UIComponentA</RouterLink>
      <RouterLink to="UIComponentB" class="btn btn-info btn-sm me-3">UIComponentB</RouterLink>
      <hr/>
      <RouterView/>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>