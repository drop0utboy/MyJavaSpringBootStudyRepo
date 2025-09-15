<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
URL data recieve
    </div>
    <div class="card-body">
      <p>userName:{{ route.params.userName }}</p>
      <p>userAge:{{ route.params.userAge }}</p>

      <p>bno:{{ route.query.bno }}</p>
      <p>bkind:{{ route.query.bkind }}</p>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
import {useRoute} from "vue-router";
const route = useRoute();

// Path Variable로 데이터 얻기
console.log("userName", route.params.userName);
console.log("userAge", route.params.userAge);

//Qeury String으로 부터 전달 데이터 얻기
console.log("bno", route.query.bno);
console.log("bkind", route.query.bkind);
</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>